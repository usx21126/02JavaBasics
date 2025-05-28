package com.xh.arrayList;

import java.util.ArrayList;

//用arrayList完成菜品数据管理
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Food> list = new ArrayList<>();
        FoodOperator foodOperator = new FoodOperator();
        foodOperator.start();
    }
}
