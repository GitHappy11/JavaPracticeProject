package com.service;

import com.enitiy.User;

/**
 * Name:ZhangDing
 * Data:2022/3/15 14:59
 * Explain :业务层接口
 */
public interface UserService {
    public User loginUser(String name, String password);
    public void insertUser(String name,String password);
    public boolean insertUser(User user);
}
