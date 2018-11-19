package com.caixiaobao.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.caixiaobao.demo.dao.AppListMapper;
import com.caixiaobao.demo.service.IAppListService;
import com.caixiaobao.demo.util.Product.IBankproduct1;
import com.caixiaobao.demo.vo.AppList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("AppQuery")
public class AppInfoController {
    @Autowired
    IAppListService appListService;

    @RequestMapping("AppListInsert")
    @ResponseBody
    public String getAppList(@RequestParam("id") String id) {
        String sd = "{\n" +
                "\t\"appName\": [{\n" +
                "\t\t\"appName\": \"Boss直聘\",\n" +
                "\t\t\"appPkg\": \"com.hpbr.bosszhipin\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"远程协助\",\n" +
                "\t\t\"appPkg\": \"com.mi.misupport\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"微信\",\n" +
                "\t\t\"appPkg\": \"com.tencent.mm\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"小米金融\",\n" +
                "\t\t\"appPkg\": \"com.xiaomi.jr\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"侬要贷\",\n" +
                "\t\t\"appPkg\": \"com.creativearts.nyd\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"银码头\",\n" +
                "\t\t\"appPkg\": \"com.creativearts.ymt\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"小米商城\",\n" +
                "\t\t\"appPkg\": \"com.xiaomi.shop\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"WiFi万能钥匙\",\n" +
                "\t\t\"appPkg\": \"com.snda.wifilocating\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"小米生活\",\n" +
                "\t\t\"appPkg\": \"com.xiaomi.o2o\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"碰碰贴\",\n" +
                "\t\t\"appPkg\": \"com.xiaomi.tag\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"喜马拉雅\",\n" +
                "\t\t\"appPkg\": \"com.ximalaya.ting.android\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"迎多多\",\n" +
                "\t\t\"appPkg\": \"com.hys.yyqp\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"小米直播\",\n" +
                "\t\t\"appPkg\": \"com.wali.live\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"知乎\",\n" +
                "\t\t\"appPkg\": \"com.zhihu.android\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"中国建设银行\",\n" +
                "\t\t\"appPkg\": \"com.chinamworld.main\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"一点资讯\",\n" +
                "\t\t\"appPkg\": \"com.yidian.xiaomi\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"空放家\",\n" +
                "\t\t\"appPkg\": \"com.hnhyw.kongfangj\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"长沙棋牌\",\n" +
                "\t\t\"appPkg\": \"com.yqp.changsha\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"米家\",\n" +
                "\t\t\"appPkg\": \"com.xiaomi.smarthome\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"视频电话\",\n" +
                "\t\t\"appPkg\": \"com.mi.vtalk\"\n" +
                "\t}, {\n" +
                "\t\t\"appName\": \"神奇手机管家\",\n" +
                "\t\t\"appPkg\": \"com.mobikeeper.sjgj\"\n" +
                "\t}],\n" +
                "\t\"phoneNo\": \"15121184040\",\n" +
                "\t\"deviceId\": \"ffffffff-d6e6-7554-ffff-ffffc17fe157\",\n" +
                "\t\"phoneOs\": \"android\",\n" +
                "\t\"versionName\": \"2.2.1\",\n" +
                "\t\"appCount\": 21,\n" +
                "\t\"appSelf\": \"nyd\"\n" +
                "}\n";
/*        List<AppList> list =new ArrayList<AppList>();
        JSONArray appNameList = APPList.getJSONArray("appName");
        String phoneNo = APPList.getString("phoneNo");
        String deviceId = APPList.getString("deviceId");
        String phoneOs = APPList.getString("phoneOs");
        String versionName = APPList.getString("versionName");
        String appCount = APPList.getString("appCount");
        String appSelf = APPList.getString("appSelf");

        Iterator iterator = appNameList.iterator();
        while (iterator.hasNext()) {
            JSONObject jo = (JSONObject) iterator.next();
            jo.get("appPkg");
            AppList applist = new AppList();
            applist.setAppName((String) jo.get("appName"));
            applist.setAppPkg((String) jo.get("appPkg"));
        }*/
        JSONObject json = JSONObject.parseObject(sd);
        String phoneNo = (String) json.get("phoneNo");//==getString
        String deviceId = (String) json.get("deviceId");
        JSONArray jsonArray = json.getJSONArray("appName");
        Iterator iterator = jsonArray.iterator();
        List<AppList> appLists=new ArrayList<AppList>();
        while (iterator.hasNext()) {
            AppList app = new AppList();
            JSONObject jsonObject = (JSONObject) iterator.next();
            app = jsonObject.toJavaObject(AppList.class);
            app.setPhoneId(phoneNo);
            app.setDeviceId(deviceId);
            appLists.add(app);
/*           app.setDeviceId(deviceId);
            app.setAppName( ((JSONObject)iterator.next()).getString("appName"));
            app.setAppPkg( ((JSONObject)iterator.next()).getString("appPkg"));
            app.setPhoneId(phoneNo);*/
        }
        appListService.InsertAppList(appLists);
        return "323";
    }
/*    @RequestMapping("AppListInsert")
    @ResponseBody
    public void getArrayList*/
}






