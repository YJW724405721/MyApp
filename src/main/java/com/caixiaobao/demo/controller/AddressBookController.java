package com.caixiaobao.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.caixiaobao.demo.util.Application.AddressBook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;

@Controller
@RequestMapping("addressBook")
public class AddressBookController {

    @RequestMapping("infos")
    @ResponseBody
    public String addressBook(){
      //  JSONArray ja=JSONArray.parseArray(jsonObject.toString());
        String json="[{\n" +
                "\t\"appSelf\": \"nyd\",\n" +
                "\t\"deviceId\": \"ffffffff-d6e6-7554-ffff-ffffc17fe157\",\n" +
                "\t\"name\": \"陈泯羽\",\n" +
                "\t\"phoneNo\": \"15121184040\",\n" +
                "\t\"phoneOs\": \"android\",\n" +
                "\t\"tel\": \"13564884546\",\n" +
                "\t\"updatetime\": \"1525747877\",\n" +
                "\t\"versionName\": \"2.2.1\"\n" +
                "}, {\n" +
                "\t\"appSelf\": \"nyd\",\n" +
                "\t\"deviceId\": \"ffffffff-d6e6-7554-ffff-ffffc17fe157\",\n" +
                "\t\"name\": \"陈平凡 上海强盛包装材料有限公司\",\n" +
                "\t\"phoneNo\": \"15121184040\",\n" +
                "\t\"phoneOs\": \"android\",\n" +
                "\t\"tel\": \"136 1173 7248\",\n" +
                "\t\"updatetime\": \"1525747897\",\n" +
                "\t\"versionName\": \"2.2.1\"\n" +
                "}, {\n" +
                "\t\"appSelf\": \"nyd\",\n" +
                "\t\"deviceId\": \"ffffffff-d6e6-7554-ffff-ffffc17fe157\",\n" +
                "\t\"name\": \"长治人才中心\",\n" +
                "\t\"phoneNo\": \"15121184040\",\n" +
                "\t\"phoneOs\": \"android\",\n" +
                "\t\"tel\": \"0355 603 0992\",\n" +
                "\t\"updatetime\": \"1525747876\",\n" +
                "\t\"versionName\": \"2.2.1\"\n" +
                "}]\n";
     JSONArray ja= JSONArray.parseArray(json);
        Iterator it=ja.iterator();
       while(it.hasNext()){
       JSONObject jsonObject1=(JSONObject) it.next();
       AddressBook addressBook=jsonObject1.toJavaObject(AddressBook.class);
       System.out.println(addressBook.getAppSelf());
       }
        return  "";
    }


}
