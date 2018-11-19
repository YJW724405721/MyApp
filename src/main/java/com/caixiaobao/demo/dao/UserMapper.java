package com.caixiaobao.demo.dao;

import com.caixiaobao.demo.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public void insertUser(UserVO userVO);
    public List selectUser();
    public List selectUserByCondition();
    public void deleteUser();
    public void updateUser(String userid);
}
