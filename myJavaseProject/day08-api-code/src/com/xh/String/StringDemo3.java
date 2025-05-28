package com.xh.String;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("第"+(i+1)+"次登录");
            System.out.println("请输入登录名称：");
            String loginName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            String result = login(loginName, password);
            System.out.println(result);
            if(result.equals("登录成功")){
                break;
            }
        }
    }
    public static String login(String loginName, String password) {
        String okLoginName = "itheima";
        String okPassword = "123456";
        if (okLoginName.equals(loginName) && okPassword.equals(password)) {
            return "登录成功";
        }
        return "登录名或密码错误！";
    }
}
