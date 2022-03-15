package com.controller;

import com.enitiy.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Name:ZhangDing
 * Data:2022/3/15 14:19
 * Explain :用户控制器
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(User user, String repassword, Model model){
        //检验两次密码是否相同（这个应该在前端就检测完毕，不应该传到后端，这里只是测试）
        if (repassword.equals(user.getPassword())){
            //跳转至相应的成功页面
            boolean isSuccess=userService.insertUser(user);
            //偷懒写法 正规的还是用if
            model.addAttribute("SuccessMsg","数据库插入成功");
            model.addAttribute("errorMsg","数据库插入失败");
            return isSuccess? "login-success":"error";
        }
        else {
            //传递一些数据给前端
            model.addAttribute("errorMsg","不一致");
            //这里应该弹窗显示错误，不应该是跳转错误页面
            return  "error";
        }
    }

    @RequestMapping("/login")
    public String login(String username,String password){
        System.out.println(username);
        System.out.println(password);
        if (userService.loginUser(username,password)==null){
            return  "error";
        }
        else {
            return  "login-success";
        }
    }
}
