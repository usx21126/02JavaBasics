package com.xh.constructor;

public class Test2 {
    public static void main(String[] args) {
        Girl g1 = new Girl();
        g1.name = "林志玲";
        g1.height = 172.5;
        g1.weight = 54;
        g1.color = "白色";
        System.out.println(g1.name);
        System.out.println(g1.height);
        System.out.println(g1.weight);
        System.out.println(g1.color);

        Girl g2 = new Girl("王菲",168.5,50,"肤白");
        System.out.println(g2.name);
        System.out.println(g2.height);
        System.out.println(g2.weight);
        System.out.println(g2.color);
    }
}
