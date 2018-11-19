package com.caixiaobao.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.caixiaobao.demo.service.IUserService;
import com.caixiaobao.demo.service.Impl.ImplUserService;
import com.caixiaobao.demo.util.JSONResult;
import com.caixiaobao.demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRegistController {
    @Autowired
    IUserService userService;

    /*
     * 注册demo
     * */
    @RequestMapping("registuser")
    @ResponseBody
    public JSONResult RegistUser(String userstring) {
        JSONObject jsonObject = JSONObject.parseObject(userstring);
        UserVO uservo = jsonObject.toJavaObject(UserVO.class);
        List<UserVO> userlist = userService.selectUserByCondition(uservo);
        JSONResult jsonResult = new JSONResult();
        if (null != userlist && userlist.size() >= 0) {
            jsonResult.setMsg("已存在该用户!");
            jsonResult.setStatus("0");
            return jsonResult;
        } else {
            jsonResult.setMsg("注册成功!");
            jsonResult.setStatus("0");
            userService.insertUser(uservo);
            return jsonResult;
        }

    }

    /*
     * 短信
     * */
    @RequestMapping("updatepassword")
    @ResponseBody
    public JSONResult updatepassword(String userstring) {
        JSONResult jsonResult = new JSONResult();
        JSONObject jsonObject = JSONObject.parseObject(userstring);
        UserVO uservo = jsonObject.toJavaObject(UserVO.class);
        List<UserVO> userlist = userService.selectUserByCondition(uservo);

        return jsonResult;
    }
}
