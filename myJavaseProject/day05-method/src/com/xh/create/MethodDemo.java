package com.xh.create;

public class MethodDemo {
    public static void main(String[] args) {
        //打印最大值
        System.out.println(getMax(10,20));

        //打印数组内容
        int[] arr1 = {11,22,33,44,55};
        int[] arr2 = {};
        int[] arr3 = null;
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);

    }
    //获取最大值方法
    public static int getMax(int a,int b) {
        return a>b?a:b;
    }
    //打印数组内容方法
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println(arr);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }

}
