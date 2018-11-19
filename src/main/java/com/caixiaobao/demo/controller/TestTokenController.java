package com.caixiaobao.demo.controller;

import com.caixiaobao.demo.service.ITokenService;
import com.caixiaobao.demo.util.Token;
import com.caixiaobao.demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("testtoken")
public class TestTokenController {
@Autowired
    ITokenService tokenService;
@RequestMapping("test")
@ResponseBody
    public String testtoken(){
    UserVO user=new UserVO();
    user.setUser_name("姚嘉威");
    user.setUser_id("724405721");
    user.setDeviceId("12321323");
    user.setUser_phone_no("12321");
    user.setPassword("724405721");
    user.setUser_type("2");
    String token=tokenService.EncodeToken(user);
    Token token1=tokenService.decodeToken(token);
    System.out.println(token);


    return token;
}

}
