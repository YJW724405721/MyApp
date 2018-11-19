package com.caixiaobao.demo.util.Order;

import lombok.Data;

/*
 * 借款详细查询
 * */
@Data
public class DebitDetailQuery {
    private String bankAccount;
    private String borrowTime;
    private String fundCode;
    private String ifNotice;
    private String ifSign;
    private String interest;
    private float loanAmount;
    private String loanTime;
    private float memberFee;
    private String orderNo;
    private String orderStatus;
    private float repayTotalAmount;
    private float syntheticalFee;

}
