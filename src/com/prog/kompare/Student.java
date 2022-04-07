package com.prog.kompare;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Collections;
import java.util.List;

/**
 * Comparator位于java.util包下，而Comparable位于java.lang包下
 *
 * Comparable接口的实现是在类的内部（如 String、Integer已经实现了Comparable接口，自己就可以完成比较大小操作），
 * Comparator接口的实现是在类的外部
 * 可以理解为Comparable是自已完成比较，Comparator是外部程序实现比较
 *
 * 实现Comparable接口要重写compareTo方法, 在compareTo方法里面实现比较, 只需传入一个参数
 * 实现Comparator接口要重写compare方法, 在compare方法里面实现比较, 需传入两个个参数
 *
 * 如果比较的方法只要用在一个类中，用该类实现Comparable接口就可以。
 * 如果比较的方法在很多类中需要用到，就自己写个类实现Comparator接口，
 * 这样当要比较的时候把实现了Comparator接口的类传过去就可以，省得重复造轮子。
 * 这也是为什么Comparator会在java.util包下的原因。
 * 使用Comparator的优点是：1.与实体类分离 2.方便应对多变的排序规则
 *
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(Student o){
        //先按照名字排序
        int i = this.getName().compareTo(o.getName());
        //如果同名，再按照年龄排序
        if (i == 0){
            return this.getAge() - o.getAge();
        }
        else {
            return i;
        }
        // Only按照名字排序
        // return this.getName().compareTo(o.getName());
    }

    public String toString(){
        return this.getName() + "_" + this.getAge();
    }
}
