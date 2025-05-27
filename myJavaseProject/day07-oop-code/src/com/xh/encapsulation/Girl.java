package com.xh.encapsulation;

public class Girl {
    private String name;
    private int age;
    private double chinese;
    private double math;
    public void printAllScore(){
        System.out.println(name + "总成绩是" + (chinese + math));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<150){
            this.age = age;
        }else{
            System.out.println("您的年龄数据有毛病~~");
        }

    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void printAverageScore(){
        System.out.println(name + "平均成绩" + (chinese+math)/2);
    }

}
