package com.caixiaobao.demo.util.Application;

import lombok.Data;

import java.io.Serializable;

@Data
public class Activity implements Serializable {
    private String appName;
    private String btnName;
    private String display;
    private String imgUrl;
    private String linkUrl;
    private String title;

}
