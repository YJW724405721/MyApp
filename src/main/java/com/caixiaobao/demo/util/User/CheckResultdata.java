package com.caixiaobao.demo.util.User;
import lombok.Data;

import java.io.Serializable;

/*
* 验证返回
* */
@Data
public class CheckResultdata  implements Serializable {
    private String authFlag;
    private String contactFlag;
    private String gxbFlag;
    private String idNumber;
    private String identityFlag;
    private String jobFlag;
    private String mobileFlag;
    private String onlineBankFlag;
    private String preAuditFlag;
    private String stepScore;
    private String tbFlag;
    private String userId;
    private String userName;
    private String whetherLoan;
    private String whetherScore;
    private String zmxyFlag;



}
