package com.caixiaobao.demo.util.Order;

import lombok.Data;

import java.io.Serializable;

/*
 * 借款验证2
 * */

@Data
public class Validatedata2 implements Serializable {
    private String borrowTime="";
    private String interestRate="";
    private String loanAmount="";
    private String productCode="";
    private String recommendFlag="";


}
