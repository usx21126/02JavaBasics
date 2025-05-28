package com.xh.String;


public class StringDemo {
    public static void main(String[] args) {
        String name = "小黑";
        String schoolName = "学校名称";

        String s1 = new String();
        System.out.println("s1:"+s1);

        char[] ch = {'a', 'b', 'c'};
        String s2 = new String(ch);
        System.out.println("s2:"+s2);

        byte[] bytes = {97,98,99,65,66,67};
        String s3 = new String(bytes);
        System.out.println("s3:"+s3);

        
    }
}
