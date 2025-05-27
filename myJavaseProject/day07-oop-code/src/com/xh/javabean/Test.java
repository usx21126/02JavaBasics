package com.xh.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("徐力宏",'男',175.5,99);
        System.out.println(s1.getName());
        System.out.println(s1.getSex());
        System.out.println(s1.getHeight());

        //实体类对象只负责数据的存和取，对于数据的业务逻辑处理应交给另一个类的对象来处理
        StudentOperator operator = new StudentOperator(s1);
        operator.printPass(); //业务操作
    }
}

