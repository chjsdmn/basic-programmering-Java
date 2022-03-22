package com.prog.arv;

/**
 * super（参数）：调用基/父类中的某一个构造函数（应该为构造函数中的第一条语句）
 * this（参数）：调用本类中另一种形成的构造函数（应该为构造函数中的第一条语句）
 * this和super不能同时出现在一个构造函数里面
 * this()和super()都指的是对象，所以，均不可以在static环境中使用。包括：static变量,static方法，static语句块。
 * 从本质上讲，this是一个指向本对象的指针, 然而super是一个Java关键字。
 */
class Person {
    public static void prt(String s) {
        System.out.println(s);
    }

    Person() {
        prt("父类·无参数构造方法： " + "A Person.");
    }//构造方法(1)

    Person(String name) {
        prt("父类·含一个参数的构造方法： " + "A person's name is " + name);
    }//构造方法(2)
}

public class ArvThisSuper extends Person {
    ArvThisSuper() {
        super(); // 调用父类构造方法（1）
        prt("子类·调用父类”无参数构造方法“： " + "A chinese coder.");
    }

    ArvThisSuper(String name) {
        super(name);// 调用父类具有相同形参的构造方法（2）
        prt("子类·调用父类”含一个参数的构造方法“： " + "his name is " + name);
    }

    /**
     * 第三种构造方法调用的是本类中第二种构造方法，
     * 而第二种构造方法是调用父类的，
     * 因此也要先调用父类的构造方法，再调用本类中第二种，最后是重写第三种构造方法。
     * @param name
     * @param age
     */
    ArvThisSuper(String name, int age) {
        this(name);// 调用具有相同形参的构造方法（3），即调用的是本类中第二种构造方法，即调用父类构造方法
        prt("子类：调用子类具有相同形参的构造方法：his age is " + age);
    }

    public static void main(String[] args) {
        ArvThisSuper cn = new ArvThisSuper();
        //父类·无参数构造方法： A Person.
        //子类·调用父类”无参数构造方法“： A chinese coder.

        cn = new ArvThisSuper("codersai");
        //父类·含一个参数的构造方法： A person's name is codersai
        //子类·调用父类”含一个参数的构造方法“： his name is codersai

        cn = new ArvThisSuper("codersai", 18);
        //父类·含一个参数的构造方法： A person's name is codersai
        //子类·调用父类”含一个参数的构造方法“： his name is codersai
        //子类：调用子类具有相同形参的构造方法：his age is 18
    }
}
