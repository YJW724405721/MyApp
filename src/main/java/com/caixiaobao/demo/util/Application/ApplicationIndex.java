package com.caixiaobao.demo.util.Application;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ApplicationIndex {
    private Activity activity;
    private ArrayList<String> adList;
    private ArrayList<BannerList> bannerList;
    private String ifRed;
    private String masterVersion;
    private String maxCredit;
    private ArrayList<ProductList> productList;
    private String showCopyRight;

}
