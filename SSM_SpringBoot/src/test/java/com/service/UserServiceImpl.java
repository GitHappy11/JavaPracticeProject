package com.service;

import com.dao.UserMapper;
import com.enitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Name:ZhangDing
 * Data:2022/3/15 15:08
 * Explain :Nothing
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //如果数据库中有重复数据（账户密码一致） 则会返回List User会报null
    //应该拆分登录步骤，注册也是一样，先得保证账户不重复  这边就不做测试了
    @Override
    public User loginUser(String name, String password) {
        return userMapper.selectUserByNameAndPassword(name,password);
    }

    @Override
    public void insertUser(String name, String password) {
//        userMapper.addUser(name,password);
    }

    @Override
    public boolean insertUser(User user) {
        int rows=userMapper.addUser(user);
        return rows>0?true:false;
    }
}
