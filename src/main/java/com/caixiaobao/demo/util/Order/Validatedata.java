package com.caixiaobao.demo.util.Order;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
/*
借款验证 1
*/

@Data
public class Validatedata implements Serializable {
private String mobile="";
private List<Validatedata2> productList=null;
}
