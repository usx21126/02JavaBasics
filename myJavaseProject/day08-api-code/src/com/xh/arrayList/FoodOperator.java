package com.xh.arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    private ArrayList<Food> foodList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void start(){
        boolean flag = true;
        while (flag) {
            System.out.println("****商家管理系统****");
            System.out.println("1.上架菜品");
            System.out.println("2.下架菜品");
            System.out.println("3.展示菜品");
            System.out.println("4.退出系统");
            System.out.println("请输入操作功能：");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    addFood();
                    break;
                case 2:
                    removeFood();
                    break;
                case 3:
                    showFood();
                    break;
                case 4:
                    flag = exit();
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }
    }

    private boolean exit() {
        System.out.println("您已退出系统！");
        return false;
    }

    private void addFood() {
        System.out.println("****上架菜品****");

        Food food = new Food();
        System.out.println("菜品名称：");
        food.setName(scanner.next());
        System.out.println("菜品价格：");
        food.setPrice(scanner.nextDouble());
        System.out.println("菜品描述：");
        food.setDescription(scanner.next());

        this.foodList.add(food);

        System.out.println("菜品上架成功！");
    }
    private void removeFood() {
        System.out.println("****下架菜品****");
        System.out.println("输入下架编号：");
        int choice;
        while(true){
            choice = scanner.nextInt();
            if(choice>foodList.size()||choice<1){
                System.out.println("非法编号！");
            }else{
                break;
            }
        }
        foodList.remove(choice-1);
        System.out.println(choice+"号菜品删除成功！");
    }
    public void showFood(){
        System.out.println("****所有菜品****");
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
                System.out.println("第" + (i+1) + "个菜品：" + food.getName() + "\t" + food.getPrice() + "\t" +food.getDescription());
        }
    }
}
