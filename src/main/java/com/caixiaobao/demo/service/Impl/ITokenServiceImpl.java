package com.caixiaobao.demo.service.Impl;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.caixiaobao.demo.config.KeyProperty;
import com.caixiaobao.demo.service.ITokenService;
import com.caixiaobao.demo.util.Token;
import com.caixiaobao.demo.vo.UserVO;
import com.github.pagehelper.util.StringUtil;
import com.sun.deploy.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

/*
iss:            该JWT的签发者
sub:            该JWT所面向的用户(不同不同身份 的用户标签  JWT自带属性)
aud:            接收该JWT的一方（与user绑定）
exp(expires):   什么时候过期，这里是一个Unix时间戳
iat(issued at): 在什么时候签发的 发放时间戳
*/
@Slf4j
@Service
public class ITokenServiceImpl implements ITokenService {
    String SECRET="RfuUZH7SnjvXbwen7joNmbLKCdfEFbDZBRKxldBfZIcuZ";
    @Autowired
    KeyProperty keyProperty;
    @Override
    public String EncodeToken(UserVO usertoken) {

        String token = null;
        Map<String,String> headmap=new HashMap<String,String>();
        headmap.put("typ", "JWT");
        headmap.put("alg", "RSA");
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + keyProperty.getExpiryTime() * 1000L);//过期时间30秒
            token = JWT.create()
                    .withHeader(headmap)
                    .withIssuer("Caixiaobao")
                    .withClaim("isVip", usertoken.getUser_type())//关联加密字段  jwt主要作用：封装加密解密过程
                    .withClaim("username", usertoken.getUser_name())
                    .withIssuedAt(new Date())//现在时间
                    .withExpiresAt(expiresAt)//过期时间
                    // 使用了HMAC256加密算法。
                    // mysecret是用来加密数字签名的密钥。
                    .sign(Algorithm.HMAC256("mysecret"));
        } catch (JWTCreationException exception) {
            exception.printStackTrace();
            log.error("加密失败！");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            log.error("加密失败！ token："+ "类型转化失败 !"+this.getClass().getName());
        }
        System.out.println(token);
        return token;
    }

    @Override
    public Token decodeToken(String tokenstring) {
        if(StringUtil.isEmpty(tokenstring)) {
            log.error("token 不存在!");
        }else {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();//解码器
            DecodedJWT jwt = null;
            try {
                jwt = verifier.verify(tokenstring);//解码
            } catch (TokenExpiredException e) {
                log.error("token 过期", e);
                // throw new HmException(TOKEN_EXPIRED);
            } catch (JWTDecodeException e) {
                log.error("token 验证失败, tokenSign: " + tokenstring);
                // throw new HmException(TOKEN_INVALID);
            }
        }
        return null;
    }


}
