package com.caixiaobao.demo.util.Application;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductList implements Serializable{
    private String actionDescription;
    private String fileUrl;
    private String linkKey;
    private String linkUrl;
    private String loanDay;
    private String pointContent;
    private String principal;
    private String productCode;
    private String productName;
    private String recommendFlag;


}
