package com.caixiaobao.demo.dao;

import com.caixiaobao.demo.vo.AppList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppListMapper {

  /*
  * 批量插入
  * */
  public void InsertAppList(List<AppList> applist);
  /*
  * 根据 deviceId phoneId查询APP列表
  * */
  public List<AppList> getAppListBy(AppList applist);
}
