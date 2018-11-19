package com.caixiaobao.demo.util.User;

import lombok.Data;

import java.io.Serializable;

@Data
public class BankListdata implements Serializable {
    private String bankCode = "";
    private String bankName = "";
    private String bankPhone = "";
}
