package com.caixiaobao.demo.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User_app {
    public void insert_applist();
    public void  query_applist();//查询applist
}
