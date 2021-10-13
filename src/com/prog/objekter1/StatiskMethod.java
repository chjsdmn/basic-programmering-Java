package com.prog.objekter1;

/***静态方法
 * 静态方法属于class, 不属于实例，因此，静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段
 * 调用静态方法不需要实例变量，通过类名就可以调用
 */
class Vare{
    public static int number;
    public static void settNr(int value){
        number = value;
    }
}
public class StatiskMethod {
    public static void main(String[] args){
        Vare.settNr(27);  //调用实例方法必须通过一个实例变量, 调用静态方法则不需要实例变量，通过类名就可以调用
        System.out.println(Vare.number);
    }
}
/**
 * 总结
 * 静态字段和静态方法都不属于实例，而属于class，所以要用类名来调用！！！
 */