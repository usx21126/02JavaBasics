package com.xh.javabean;

public class Student {
    private String name;
    private char sex;
    private double height;
    private double score;
    public Student() {
    }

    public Student(String name, char sex, double height, double score) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.score = score;
    }

    public Student(String name, char sex, double height) {
        this.name = name;
        this.sex = sex;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
