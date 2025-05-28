package com.xh.arrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //1.创建
        ArrayList<String> list = new ArrayList();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        System.out.println(list);
        //2.插入数据
        list.add(0,"java4");
        System.out.println(list);
        //3.索引获取数据
        System.out.println(list.get(0));
        //4.集合大小
        System.out.println(list.size());
        //5.索引删除数据
        System.out.println(list.remove(0));
        System.out.println(list);
        //6.直接删除数据
        list.add("java3");
        System.out.println(list);
        System.out.println(list.remove("java3"));
        System.out.println(list);
        //7.修改索引数据
        list.set(0,"java5");
        System.out.println(list);
    }
}
