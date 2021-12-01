package com.prog.arv;

/**
 * Java的继承性 Inheritance
 */
class Ansatt {
    private String navn;
    protected double lønn;  //protected修饰符 变量可以在子类中使用
    //private double lønn;

    //Konstruktør
    Ansatt(String navn, double lønn){
        this.navn = navn;
        this.lønn = lønn;
    }

    String getNavn(){
        return this.navn;
    }

    double getLønn(){
        return this.lønn;
    }
}
 //extends 继承了父类
class Selger extends Ansatt{
    private double bonus;

    //Konstruktør
    Selger(String navn, double lønn, double bonus){
        //叫super的时候，super即父类也要有相应的构造函数，否则叫不了super
        super(navn, lønn);  //必须放在构造函数中的放在第一行，调用父类中的构造函数
        this.bonus = bonus;
    }
    double getLønn(){
        return this.lønn + this.bonus; //覆写父类中的函数，因为lønn是protected类型，所以可以直接用this来调用
        //return super.getLønn() + this.bonus;  如果lønn是private的话，不能通过this来获取lønn
    }
}

//extends 继承了父类
class Montør extends Ansatt{
    private String bil;

    //Konstruktør
    Montør(String navn, double lønn, String bil){
        super(navn, lønn); //必须放在构造函数中的放在第一行，调用父类中的构造函数
        this.bil = bil;
    }
}

public class Arv {
    public static void main(String[] args) {
        Selger selger = new Selger("Ole", 65000, 10000);
        Montør montør = new Montør("Kari", 45000, "Honda");
        System.out.println(selger.getNavn() + " har i lønn " + selger.getLønn());  //Ole har i lønn 75000.0
        System.out.println(montør.getNavn() + " har i lønn " + montør.getLønn());  //Kari har i lønn 45000.0
    }
}
