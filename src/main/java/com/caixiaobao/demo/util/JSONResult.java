package com.caixiaobao.demo.util;

import java.io.Serializable;

/*
 *
 * 通用JSON封装
 *
 * */
public class JSONResult implements Serializable {
    String msg="";
    String status="";
    /*
     * 封装data信息
     * */
    Object data=null;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() { return data; }

    public void setData(Object data) { this.data = data; }
}
