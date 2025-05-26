package com.xh.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            System.out.println("Hello World");
        }
        //0.1mm厚的纸张折叠多少次高于珠穆朗玛峰？
        double peekHeight = 8848860;
        double paperHeight = 0.1;
        int count = 0;
        while(peekHeight>paperHeight) {
            paperHeight *= 2;
            count++;
        }
        System.out.println("需要折叠"+ count + "次");
        System.out.println("折叠后高度：" + paperHeight);
    }
}
