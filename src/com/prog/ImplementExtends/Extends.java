package com.prog.ImplementExtends;

/**
 * 关于Extends和Implements
 * Extends可以理解为全盘继承了父类的功能。
 * Implements可以理解为为这个类附加一些额外的功能；
 * interface定义一些方法,并没有实现,需要implements来实现才可用。
 * extend可以继承一个接口,但仍是一个接口,也需要implements之后才可用。
 * 对于class而言，Extends用于(单)继承一个类（class），而implements用于实现一个接口(interface)。
 * extends 是继承某个类, 继承之后可以使用父类的方法, 也可以重写父类的方法;
 * implements 是实现多个接口, 接口的方法一般为空的, 必须重写才能使用.
 */

/**
 * JAVA中不支持多重继承，但是可以用接口来实现，这样就要用到implements，继承只能继承一个类，
 * 但implements可以实现多个接口，用逗号分开就行了
 * class A extends B implements C, D, E
 */
class A{
    int a = 1;
    void aFun(){
        System.out.println("dette er class A");
    }
}

/**
 * class 子类名 extends 父类名 implenments 接口名{...
 * }
 */

class B extends A{  //class B extends A 继承过后通常会定义一些父类没有的成员或者方法
    int a = 11;
    int b = 2;  //定义新成员
    void aFun(){   //重新父class的方法
        System.out.println("dette metoden er overrides");
    }
    void bFun(){  //定义新方法
        System.out.println("dette er class B");
    }
}

/**
 * 扩展
 * A a1 = new B();
 * A a2 = new C();
 * a1,a2两个虽然都是A类对象，但aFun（）分别在B类和C类里面重新了，那么a1和a2各自的aFun()不同。这正是的多态性的体现。
 */
public class Extends {
    public static void main(String[] args) {
        A a1 = new A();  //a1是一个A类的实例，只能访问A中的方法
        System.out.println(a1.a);  //  1
        a1.aFun();  //dette er class A
        //System.out.println(a1.b);   Error
        //a1.bFun();    Error

        A a2 = new B();  //a2是一个A类的实例，只能访问A中的方法, 但是因为 B类继承了A类，所以a2执行B类重新的方法aFun()
        System.out.println(a2.a);  //  1  貌似只是执行了B中被重新的方法， 而B中被重新赋值的a并没有改变！！！
        a2.aFun();  //dette metoden er overrides
        //System.out.println(a2.b);   Error
        //a2.bFun();   Error

        B b1 = new B();  //b1是一个B类的实例，并且B类继承了A类，所以b1既能访问A中也可以访问B，但是执行B类重新的方法aFun()
        System.out.println(b1.a);  // 11
        b1.aFun();      //dette metoden er overrides
        System.out.println(b1.b);  //  2
        b1.bFun();
    }
}
