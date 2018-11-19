package com.caixiaobao.demo.controller;
import com.caixiaobao.demo.service.IUserService;
import com.caixiaobao.demo.util.JSONResult;
import com.caixiaobao.demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

/*
 * 用户注册/登陆/校验
 *
 * */

@RestController
@RequestMapping("User")
public class UserScoreController {
    @Autowired
    IUserService userservice;


    @RequestMapping("login")
    @ResponseBody
    public String login(@RequestParam("id") String id)  {

/*      String versionName = (String) JSON.get("versionName");
        String deviceId = (String) JSON.get("deviceId");
        String userId = (String) JSON.get("userId");
        String accountNumber = (String) JSON.get("accountNumber");
        String version = (String) JSON.get("version");
        String phoneOs = (String) JSON.get("phoneOs");
        String appName = (String) JSON.get("appName");
        String os = (String) JSON.get("os");*/
        String string="{\"2\":\"efg\",\"1\":\"abc\"}";
        JSONObject js=JSONObject.parseObject(string);
        System.out.println(js.toString());
/*        CheckResultdata crd=new CheckResultdata();
        Validatedata2 validatedata2=new Validatedata2();*/
        JSONResult result=new JSONResult();
        ArrayList<UserVO> list=new ArrayList<UserVO>();
        UserVO user1=new UserVO(); user1.setUser_id("111");user1.setUser_name("yjw");
        UserVO user2=new UserVO(); user2.setUser_id("111");user2.setUser_name("yjw");
        UserVO user3=new UserVO(); user3.setUser_id("111");user3.setUser_name("yjw");
        UserVO user4=new UserVO(); user4.setUser_id("111");user4.setUser_name("yjw");
        list.add(user1);list.add(user2);list.add(user3);list.add(user4);
        result.setData(list);
        JSONObject.toJSON(result).toString();

        System.out.println(JSONObject.toJSON(result).toString());
        return "";
    }
}
