package com.xh.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("您今年："+ age + "岁");

        System.out.println("请输入名字");
        String name = sc.next();
        System.out.println("欢迎您" + name);
    }
}
