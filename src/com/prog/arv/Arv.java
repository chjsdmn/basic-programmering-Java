package com.prog.arv;

/**
 * Java的继承性 Inheritance
 * 超/父类构造器不应该调用任何可覆盖的方法。
 * 在超/父类的构造函数里对可覆盖的方法有依赖，那么在继承时就可能会出错。
 * 因为父类的构造函数会在子类的构造函数之前先运行，父类的构造函数里对可复写的方法有依赖/即构造器里要调用这个方法，同时这个方法被子类覆写，
 * 那么父类里调用的是子类里被覆写的方法，但是这时候子类还没被初始化，所以便会抛出空指针异常NullPointerException。
 *
 * 同样用来实现代码复用的还有复合Composition，如果使用继承和复合皆可(这是前提)，那么应该优先使用复合，
 * 因为复合可以保持超类对实现细节的屏蔽，上述关于继承的缺点都可以用复合来避免。
 * 这也是所谓的复合优先于继承。
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
