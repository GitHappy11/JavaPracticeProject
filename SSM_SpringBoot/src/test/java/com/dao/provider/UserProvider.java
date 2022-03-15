package com.dao.provider;

import com.enitiy.User;

/**
 * Name:ZhangDing
 * Data:2022/3/15 9:50
 * Explain :Nothing
 */
public class UserProvider {
    public  String saveUser(User user){
        if (user.getId()==0){return "不想写了，这个是个sql语句，返回回去执行";}
        else return "还是用XML吧，这个也太麻烦了";
    }
}
