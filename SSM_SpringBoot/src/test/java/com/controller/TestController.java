package com.controller;

import com.dao.UserMapper;
import com.enitiy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Name:ZhangDing
 * Data:2022/3/14 15:33
 * Explain :测试用控制器
 */
@Controller
public class TestController {

    //自动装配 直接就可以使用了
    @Autowired
    private UserMapper userMapper;
    //url
    @RequestMapping("/findAll")
    public  String findAll(){
        System.out.println("Welcome");
        List<User> userList=userMapper.selectAllUsers();
        for (User user:userList
        ) {
            System.out.println(user.getUsername());
        }
        return "";
    }
    //url  有参数的url可以使用后面拼接的方式来执行相应的方法
    //localhost:8080/finduserbyid?id=1
    @RequestMapping("/findUserByID")
    public  String findUserByID(int id){
        User user=userMapper.selectUserByID(id);
        System.out.println(user.getUsername());
        return "";
    }

    //url  有参数的url可以使用后面拼接的方式来执行相应的方法
    //localhost:8080/addUser?name=xxx&password=xxx
    @RequestMapping("/addUser")
    public  String addUser(String name,String password){
//        userMapper.addUser(name,password);

        return "";
    }
}
