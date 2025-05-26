package com.xh.overload;
//方法重载
public class MethodOverloadDemo {
    public static void main(String[] args) {
        test();
        test(10);
        test("10");
    }
    public static void test() {
        System.out.println("调用了第一个重载方法");
    }
    public static void test(int a) {
        System.out.println("调用了第二个重载方法");
    }
    public static void test(String a) {
        System.out.println("调用了第三个重载方法");
    }

}
