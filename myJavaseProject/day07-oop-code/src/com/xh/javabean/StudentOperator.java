package com.xh.javabean;

public class StudentOperator {
    private Student s;

    public StudentOperator(Student s) {
        this.s = s;
    }

    public void printPass() {
        if (s.getScore() >= 60) {
            System.out.println(s.getName() + "这哥们及格了！");
        }else {
            System.out.println(s.getName() + "挂科了~~~");
        }
    }
}
