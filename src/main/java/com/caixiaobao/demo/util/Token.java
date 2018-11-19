package com.caixiaobao.demo.util;

import lombok.Data;

import java.util.Date;

@Data
public class Token {
    private String UserId;
    private String UserName;
    private Date  expiration;

}
