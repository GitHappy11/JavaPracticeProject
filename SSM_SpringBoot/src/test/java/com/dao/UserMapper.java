package com.dao;

import com.enitiy.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.security.Provider;
import java.util.List;

/**
 * Name:ZhangDing
 * Data:2022/3/14 15:34
 * Explain :UserMapper
 */
//说明它是Mapper
@Mapper
//代表它是持久层，可被自动装配，防止报错
@Repository
public interface UserMapper {

//    @方式写sql
    @Select("select * from User")
    List<User> selectAllUsers(); //直接就可以用了

    @Select("select * from user where id =#{id}")
    User selectUserByID(int id);

    @Select("Select * from user where name=#{username} and password=#{password}")
    User selectUserByNameAndPassword(String username,String password);

    //Mapper无法重载 在Service层重载吧
//   @Insert("insert into user (name,password) value (#{name},#{password})")
//   void  addUser(String name,String password);

    @Insert("insert into user (name,password) value (#{username},#{password})")
    int  addUser(User user);//返回值int  代表影响了多少行的数据

    //有些需求可能需要根据不同的情况输出不同的Sql语句 需要使用一个方法来返回对应的Sql语句
    //参数 类名 类中的方法名 返回一个String类型的sql语句 user也会被当成参数传过去
//    @InsertProvider(type = Provider.class,method = "saveUser")
//    void  addUser(User user);
}
