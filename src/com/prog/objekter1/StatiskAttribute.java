package com.prog.objekter1;

/**静态字段
 * 静态字段并不属于实例!!! 所以当一个实例修改了idNr（如下），其他实例的idNr都被修改了。。。。
 * 要用类名来调用！！！
 */
class Person{
    public String name;  //实例字段在每个实例中都有自己的一个独立“空间”
    public int age;      //实例字段在每个实例中都有自己的一个独立“空间”
    public static int idNr;  //静态字段只有一个共享“空间”，所有实例都会共享该字段，可以更改
    //但是 如果用final的话，就要赋值，且之后不能改变，是一个常量
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class StatiskAttribute {
    public static void main(String[] args){
        Person person1 = new Person("Lee", 28);
        Person person2 = new Person("Lucy", 32);
        person1.idNr = 101;  //不推荐
        System.out.println(person2.idNr);  //101, 静态字段只有一个共享“空间”，所有实例都会共享该字段
        person2.idNr = 202;  //不推荐
        System.out.println(person1.idNr);  //202, 静态字段只有一个共享“空间”，所有实例都会共享该字段
        Person.idNr = 303;   //推荐用类名来访问静态字段!!!
        System.out.println(Person.idNr);   //303
        System.out.println(person1.idNr);  //303
    }
}


