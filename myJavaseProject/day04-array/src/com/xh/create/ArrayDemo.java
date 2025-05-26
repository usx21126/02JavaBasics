package com.xh.create;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //静态初始化数组
        int[] args1 = new int[]{1, 2, 3, 4, 5};
        int[] args2 = {1, 2, 3, 4, 5};
        System.out.println(args1);
        //输入args1.fori自动补全
        for (int i = 0; i < args1.length; i++) {
            System.out.println(args1[i]);
        }

        //动态初始化数组   实现求和/求平均
        double[] args3 = new double[6];
        Scanner sc = new Scanner(System.in);
        double totalScore = 0;
        double avgScore = 0;
        for (int i = 0; i < args3.length; i++) {
            System.out.println("输入第" + (i + 1) + "个评委的打分");
            args3[i] = sc.nextDouble();
            totalScore += args3[i];
        }
        avgScore = totalScore / args3.length;
        System.out.println("总分：" + totalScore);
        System.out.println("平均分：" + avgScore);

        //多个变量指向同一数组对象
        int[] arr1 = {11, 22, 33};
        int[] arr2 = arr1;
        System.out.println(arr1);
        System.out.println(arr2); //多个变量指向同一数组对象
        arr1[2] = 99;
        System.out.println(arr2[2]);
        arr2 = null;
        System.out.println(arr1);
        System.out.println(arr2);

        //随机排名
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("输入第" + (i + 1) + "个工号：");
            a[i] = sc.nextInt();
        }
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            int j = r.nextInt(a.length);
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("第" + (i + 1) + "位的工号为" + a[i]);
        }
    }
}
