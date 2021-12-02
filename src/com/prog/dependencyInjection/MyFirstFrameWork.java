package com.prog.dependencyInjection;

/**
 * 依赖注入(Dependency Injection, DI)是一种设计模式，也是Spring框架的核心概念之一。
 * 其作用是去除Java类之间的依赖关系，实现松耦合，以便于开发测试。
 * 耦合(couple): 相互绑定就是耦合
 * 松耦合，并不是不要耦合。A类依赖B类，A类和B类之间存在紧密耦合，
 * 如果把依赖关系变为A类依赖B的父类B0类，在A类与B0类的依赖关系下，
 * A类可使用B0类的任意子类，A类与B0类的子类之间的依赖关系是松耦合的。
 */
public class MyFirstFrameWork {
    public static void main(String[] args) {
        Developer developer = new Developer("Lee", "Java");
        developer.ongoing(); //Lee jobber på Java
    }
}
