package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Name:ZhangDing
 * Data:2022/3/15 10:54
 * Explain :页面控制器
 */
@Controller
public class IndexController {

    //首页展示 URL为空说明是默认页
    @RequestMapping("")
    public  String defaultIndex(){
        return "loginEasy/index";
    }

    @RequestMapping("/indexEmail")
    public  String emailIndex(){
        return "loginEmail/index";
    }
    @RequestMapping("/loginEmail/registered")
    public  String emailRegistered(){
        System.out.println("111");
        return "/loginEmail/registered";
    }

    @RequestMapping("/indexPhone")
    public  String phoneIndex(){
        return "loginPhone/index";
    }


}
