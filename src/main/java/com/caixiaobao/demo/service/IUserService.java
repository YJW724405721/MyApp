package com.caixiaobao.demo.service;
import com.caixiaobao.demo.vo.UserVO;
import java.util.List;
public interface IUserService {
    public void insertUser(UserVO userVO);
    public List selectUser();
    public List selectUserByCondition(UserVO uservo);
    public void deleteUser();
    public void updateUser(String userid);
}
