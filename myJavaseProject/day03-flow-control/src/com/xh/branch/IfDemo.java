package com.xh.branch;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String weekDay = sc.next();
        switch (weekDay) {
            case "周1":
                System.out.println("埋头苦干，解决Bug");
                break;
            case "周2":
                System.out.println("请大牛帮忙");
                break;
            case "周3":
                System.out.println("今晚啤酒龙虾小烧烤");
                break;
            case "周4":
                System.out.println("主动帮新来的女生解决bug");
                break;
            case "周5":
                System.out.println("今晚吃鸡");
                break;
            case "周6":
                System.out.println("与王婆介绍的小芳相亲！");
                break;
            case "周7":
                System.out.println("郁郁寡欢，准备上班");
                break;
            default:
                System.out.println("星期是瞎搞的");
        }
    }
}
