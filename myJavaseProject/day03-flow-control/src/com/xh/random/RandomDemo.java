package com.xh.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(1,11); // 1-10
        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        int luckNumber = r.nextInt(100)+1; //1-100
        while(true) {
            System.out.println("请输入猜测数字");
            int guessNumber = sc.nextInt();
            if(guessNumber == luckNumber) {
                System.out.println("猜中了！");
                break;
            }else if (guessNumber > luckNumber) {
                System.out.println("猜大了");
            }else if (guessNumber < luckNumber) {
                System.out.println("猜小了");
            }
        }
    }
}
