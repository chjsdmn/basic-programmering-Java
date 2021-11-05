package com.prog.kontrollstrukturer;

/**
 * 基本数据类型的比较，应该使用 ==，比较的是他们的值
 * 当引用数据类型用 == 进行比较，比较的是他们在内存中的存放地址。
 * 当复合数据类型之间进行equals比较时，这个方法的初始行为是比较对象在堆内存中的地址。
 * 但在一些诸如String,Integer,Date类中把Object中的这个方法覆盖了，作用被覆盖为比较内容是否相同。
 */
public class Equals {
    public static void main(String[] args) {
        /**
         * int 是一个基本类型，所以 == 是比较值的大小
         * Integer是一个类，它缓存了从-128到127之间的所有的整数对象。所以超过127的整数 == 比较后为不等
         */
        int a = 100;
        int b = 100;
        System.out.println(a == b);  //true
        int c = 1000;
        int d = 1000;
        System.out.println(c == d);  //true
        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);  //true
        Integer z = 128;
        Integer u = 128;
        System.out.println(z == u);  //false
        /**
         * String是类，复合数据类型，== 比较的是内存中的存放地址
         * 基本数据类型没有equal方法，只有复合数据类型才能用equal方法，
         */
        String m = "hello";
        String n = "hello";
        System.out.println(m == n);  //true  ==比较的是内存中的存放地址，所以为true
        String p = "hello";
        String q = new String("hello");
        System.out.println(p == q);  //false  因为q是new出来的，系统给他开辟了一个新的位置，所以p,q分别引用了两个对象，地址不同，所以是false
        System.out.println(p.equals(q)); //true  equal比较的是内容，所以是true
    }
}
