package com.prog.kompare;

import java.util.Comparator;

/**
 * Comparator接口的实现是在类的外部
 * 要重写compare方法, 在compare方法里面实现比较, 需传入两个个参数
 * 如果比较的方法在很多类中需要用到，就自己写个类实现Comparator接口，
 * 这样当要比较的时候把实现了Comparator接口的类传过去就可以，省得重复造轮子。
 * 这也是为什么Comparator会在java.util包下的原因。
 * 使用Comparator的优点是：1.与实体类分离 2.方便应对多变的排序规则
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    //先按照名字排序，如果同名，再按照年龄排序
    public int compare(Student o1, Student o2) {
        int i = o1.getName().compareTo(o2.getName());
        if (i == 0){
            return o1.getAge() - o2.getAge();
        }
        else {
            return i;
        }
    }
}
