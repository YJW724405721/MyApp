package com.caixiaobao.demo.service;

import com.caixiaobao.demo.util.Token;
import com.caixiaobao.demo.vo.UserVO;

public interface ITokenService {

    /*
     * token加密
     * */
    public String  EncodeToken(UserVO token);

    /*
     * token解密
     * */
    public Token decodeToken(String tokenstring);
}
