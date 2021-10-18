package com.prog.ImplementExtends;

/** 关于接口Interface
 * 在interface中，一般来说，只需声明方法头，而将方法体留给实现的class来做。
 * 这些实现的class的实例完全可以当作interface的实例来对待。
 * 在interface之间也可以声明为extends（多继承）的关系。
 * 注意一个interface可以extends多个其他interface。
 * extends是继承父类，只要那个类不是声明为final或者那个类定义为abstract的就能继承
 */

/**
 * JAVA中不支持多重继承，但是可以用接口来实现，这样就要用到implements，继承只能继承一个类，
 * 但implements可以实现多个接口，用逗号分开就行了
 * class A extends B implements C, D, E
 */

interface Creature{
    int ID = 1;
    void eat();
}

interface Animal extends Creature{  //接口Animal继承了接口Creature的方法
    void run();
}
/**
 * class 子类名 extends 父类名 implenments 接口名{...
 * }
 */
class Fish implements Animal{  //Fish类要把两个方法都重写，否则要在前面加上abstract，变成抽象类，我也不知道为啥。。。
    @Override
    public void eat(){
        System.out.println("Fish eat mud");
    }
    @Override
    public void run(){
        System.out.println("Fish swim");
    }
}

class LandAnimal implements Animal{  //类通过关键字implements声明自己使用一个或者多个接口
    @Override
    public void eat() {
        System.out.println("LandAnimal eat other animals");
    }

    @Override
    public void run() {
        System.out.println("LandAnimal run fast");
    }
}

interface Flyer{
    void fly();
}

class Bird implements Creature, Flyer{  //类通过关键字implements声明自己使用一个或者多个接口
    @Override
    public void eat() {
        System.out.println("Birds eat worm");
    }

    @Override
    public void fly() {
        System.out.println("Birds flies");
    }
}

public class OmInterface {
    public static void main(String[] args) {
        Fish aFish = new Fish();
        aFish.eat();
        LandAnimal aLandAnimal = new LandAnimal();
        aLandAnimal.eat();
        Bird aBird = new Bird();
        aBird.eat();
    }
}
