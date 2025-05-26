package com.xh.demo;

public class Test1 {
    public static void main(String[] args) {
        //输出101-200之间的素数
        int[] a = new int[201];
        a[0] = a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            for (int j = i*i; j < 201; j+=i) {
                a[j] = 1;
            }

        }
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.print(flag?i:","+i);
                flag =false;
            }
        }
    }
}
