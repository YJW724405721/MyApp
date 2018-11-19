package com.caixiaobao.demo.service.Impl;

import com.caixiaobao.demo.dao.AppListMapper;
import com.caixiaobao.demo.service.IAppListService;
import com.caixiaobao.demo.vo.AppList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IAppListServiceImpl implements IAppListService {
    @Autowired
    AppListMapper appListMapper;

    @Override
    @Transactional(readOnly = true)
    public void InsertAppList(List<AppList> list) {
        appListMapper.InsertAppList(list);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AppList> getAppListBy(AppList applist) {
       return appListMapper.getAppListBy(applist);
    }
}
