package com.jin.eureka.server;

/**
 * @author wu.jinqing
 * @date 2019年12月24日
 */
public class Test1 {
    public static void main(String[] args) {
//        double d = Math.random();
//        System.out.println((int)(d * 10000 + 1000));
//        System.out.println((int)(d * 1000));
//        System.out.println(d);

        String s = String.valueOf(Math.random());

        System.out.println(s);
        if(s.length() >= 6)
        {
            s = s.substring(2, 6);
        }

        System.out.println(s);

    }
}
