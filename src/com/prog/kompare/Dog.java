package com.prog.kompare;

import java.util.Comparator;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
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

    public String toString(){
        return this.getName() + "_" + this.getAge();
    }
}

class SortDogAge implements Comparator<Dog> {

    //按照年纪升序排列  o1=object1, o2=object2, 返回值是int！
    public int compare(Dog o1, Dog o2){
        return o1.getAge() - o2.getAge();
    }

}

class SortDogName implements Comparator<Dog>{

    //按照名字升序排列
    //因为名字类型是String，所以不能像age一样用减号来表示
    public int compare(Dog o1, Dog o2){
        return o1.getName().compareTo(o2.getName());
    }
}
