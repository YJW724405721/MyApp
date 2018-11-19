package com.caixiaobao.demo.service;

import com.caixiaobao.demo.vo.AppList;

import java.util.List;

public interface IAppListService {
    public void InsertAppList(List<AppList> list);

    public List<AppList> getAppListBy (AppList appList);
}
