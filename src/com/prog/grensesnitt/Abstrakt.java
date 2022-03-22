package com.prog.grensesnitt;

/**抽象类
 * 在Java中被abstract关键字修饰的类称为抽象类，被abstract关键字修饰的方法称为抽象方法，
 * 抽象方法只有方法的声明，没有方法体。特点：
 * a、抽象类不能被实例化只能被继承；
 * b、包含抽象方法的一定是抽象类，但是抽象类不一定含有抽象方法；
 * c、抽象类中的抽象方法的修饰符只能为public或者protected，默认为public；
 * d、一个子类继承一个抽象类，则子类必须实现父类抽象方法，否则子类也必须定义为抽象类；
 * e、抽象类可以包含属性、方法、构造方法，但是构造方法不能用于实例化，主要用途是被子类调用。
 */
abstract class Kjøretøy{
    protected String farge;
    protected int antallHjul;

    /**
     * 构造器，但是抽象函数不能建立实例！
     * 可以在继承的类的构造器里的第一行用super来叫
     */
    public Kjøretøy(String farge, int antallHjul){
        this.farge = farge;
        this.antallHjul = antallHjul;
    }

    /**
     * 抽象方法，不写方法体，让继承的非抽象类必须实现！即写方法体在继承的非抽象子类里
     * @return
     */
    abstract public int getAntallDører();
}

/**
 * 因为也是抽象类，所以即使继承了抽象类，也不需要override父类的抽象方法!
 * 用extends可以理解为全盘继承了父类的功能。
 */
abstract class Flytøy extends Kjøretøy{
    protected int tankVolum;

    public Flytøy(String farge, int antallHjul, int tankVolum){
        //子类通过super（）来叫父类的构造器
        super(farge, antallHjul);
        this.tankVolum = tankVolum;
    }
}

class Bil extends Kjøretøy{
    protected int antallDører;
    public Bil(String farge, int antallHjul, int antallDører){
        //子类通过super（）来叫父类的构造器
        super(farge, antallHjul);
        this.antallDører = antallDører;
    }

    public int getAntallDører(){  //Må override method til abstract class!
        return this.antallDører;
    }
}

class Motor extends Kjøretøy{
    public Motor(String farge, int antallHjul){
        super(farge, antallHjul);
    }

    public int getAntallDører(){  //Må override method til abstract class!
        return 0;
    }
}

public class Abstrakt {
    public static void main(String[] args) {
        //Kjøretøy tøy = new Kjøretøy("rød", 4);  ERROR!!! 抽象类无法实例！！！！
        Kjøretøy enBil = new Bil("rød", 4, 4);
        Kjøretøy enMotor = new Motor("blå", 2);
        Bil toBil = new Bil("hvit", 4, 4);
        Motor toMotor = new Motor("gull", 2);
        Kjøretøy[] liste = new Kjøretøy[10];
        liste[0] = enBil;
        liste[1] = toBil;
        liste[2] = enMotor;
        liste[3] = toMotor;
        /**
         * 这里的item类型只能是Kjøretøy！！
         */
        for(Kjøretøy itme : liste){
            if(itme != null) {
                System.out.println(itme.farge + " " + itme.antallHjul + " " + itme.getAntallDører());
                //rød 4 4
                //hvit 4 4
                //blå 2 0
                //gull 2 0
            }
        }
    }
}
