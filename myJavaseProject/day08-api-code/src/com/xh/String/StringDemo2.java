package com.xh.String;

public class StringDemo2 {
    public static void main(String[] args) {
        String name = "abdbwheoi666";
        //1.字符串长度
        System.out.println(name.length());
        //2.第i个字符
        System.out.println(name.charAt(2));
        //3.字符串遍历
        System.out.println("-------------------");
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            System.out.println(c);
        }
        //4.转数组
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println("-------------------");
        //5.字符大小

        //5.1
        System.out.println("**5.1");
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        //5.2
        System.out.println("**5.2");
        String s4 = new String("abcd");
        String s5 ="abcd";
        System.out.println(s4 == s5);

        //5.3
        System.out.println("**5.3");
        String s6 = "ggg";
        String s7 = "gg";
        String s8 = s7 + "g";
        System.out.println(s6 == s8);

        //5.4
        System.out.println("**5.4");
        String s9 = "qwe";
        String s10 = "q"+"w"+"e";
        System.out.println(s9 == s10);

    }
}
