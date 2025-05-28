package com.xh.String;

import java.util.Random;

//创建验证码
public class StringDemo4 {

    public static void main(String[] args) {
        System.out.println(creat(4));
        System.out.println(creat(5));
    }
    public static String creat(int n) {
        String code ="";
        String data = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            code += data.charAt(r.nextInt(data.length()));
        }
        return code;
    }
}
