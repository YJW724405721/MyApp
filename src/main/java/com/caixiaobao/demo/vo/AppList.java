package com.caixiaobao.demo.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AppList implements Serializable {
    private String appName;
    private String appPkg;
    private String phoneId;
    private String deviceId;
}
