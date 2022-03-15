package com;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Name:ZhangDing
 * Data:2022/3/14 15:54
 * Explain :初始化类
 */
@SpringBootApplication
public class Init {
    public static void main(String[] args) {
        SpringApplication.run(Init.class,args);
        System.out.println("Init SpringBoot Project....");
    }
}
