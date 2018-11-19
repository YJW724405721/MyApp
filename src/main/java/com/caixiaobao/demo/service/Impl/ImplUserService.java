package com.caixiaobao.demo.service.Impl;

import com.caixiaobao.demo.dao.UserMapper;
import com.caixiaobao.demo.service.IUserService;
import com.caixiaobao.demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ImplUserService implements IUserService {
@Autowired
    UserMapper usermapper;
    @Override
    @Transactional
    public void insertUser(UserVO userVO) {
         usermapper.insertUser(userVO);
    }

    @Override
    @Transactional
    public List selectUser() {
       return usermapper.selectUser();
    }
    @Override
    public List selectUserByCondition(UserVO uservo){return null;};

    @Override
    @Transactional
    public void deleteUser() {
        usermapper.deleteUser();
    }

    @Override
    @Transactional(readOnly = true)
    public void updateUser(String userid) {
        usermapper.deleteUser();
    }

}
