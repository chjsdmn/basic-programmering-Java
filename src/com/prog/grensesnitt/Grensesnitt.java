package com.prog.grensesnitt;
/**接口
 * Java中接口使用interface关键字修饰，特点为:
 * a、接口可以包含变量、方法；变量被隐士指定为public static final，方法被隐士指定为public abstract（JDK1.8之前）；
 * b、接口支持多继承，即一个接口可以extends多个接口，间接的解决了Java中类的单继承问题；
 * c、一个类可以实现多个接口；
 * d、JDK1.8中对接口增加了新的特性：
 * （1）、默认方法（default method）：JDK 1.8允许给接口添加非抽象的方法实现，但必须使用default关键字修饰；
 * 定义了default的方法可以不被实现子类所实现，但只能被实现子类的对象调用；如果子类实现了多个接口，并且这些接口包含一样的默认方法，则子类必须重写默认方法；
 * （2）、静态方法（static method）：JDK 1.8中允许使用static关键字修饰一个方法，并提供实现，称为接口静态方法。
 * 接口静态方法只能通过接口调用（接口名.静态方法名）。
 */

/**接口与抽象类的区别
 * 相同点
 * （1）都不能被实例化
 * （2）接口的实现类或抽象类的子类都只有实现了接口或抽象类中的方法后才能实例化。
 * 不同点
 * （1）接口只有定义，不能有方法的实现，java 1.8中可以定义default方法体，而抽象类可以有定义与实现，方法可在抽象类中实现。
 * （2）实现接口的关键字为implements，继承抽象类的关键字为extends。一个类可以实现多个接口，但一个类只能继承一个抽象类。所以，使用接口可以间接地实现多重继承。
 * （3）接口强调特定功能的实现，而抽象类强调所属关系。
 * （4）接口成员变量默认为public static final，必须赋初值，不能被修改；其所有的成员方法都是public、abstract的。
 * 抽象类中成员变量默认default，可在子类中被重新定义，也可被重新赋值；
 * 抽象方法被abstract修饰，不能被private、static、synchronized和native等修饰，必须以分号结尾，不带花括号。
 *
 * 选择父类还是接口,主要看里是否有很多共用的逻辑代码,如果是,就选择父类
 */
interface Ansatt{  //interface里的方法为空，这些空方法通过类来实现，在类中重写implement这些方法
    String ID = "024";  //应该是隐式的public static final type!
    String getNavn();  //接口中的方法都是隐式public abstract，所以定义的时候不用写public
    public double getLønn(); //接口中的方法都是隐式public abstract，所以定义的时候不用写public
}

class Selger implements Ansatt{  //通过类来实现接口中的方法，用implements
    private String navn;
    private double lønn;
    private static final double bonus = 10_000;

    public Selger(String navn, double lønn){
        this.navn = navn;
        this.lønn = lønn;
    }

    public String getNavn(){  //override接口中的方法
        return this.navn;
    }

    public double getLønn(){  //override接口中的方法
        return this.lønn + bonus;
    }
}

class Montør implements Ansatt{  //通过类来实现接口中的方法，用implements
    private String navn;
    private double lønn;

    public Montør(String navn, double lønn){
        this.navn = navn;
        this.lønn = lønn;
    }

    public String getNavn(){
        return this.navn;
    }

    public double getLønn(){
        return this.lønn;
    }

    public void sayHey(){
        System.out.println("Hei");
    }
}

public class Grensesnitt {
    public static void main(String[] args) {
        //interface也可以作为数据类型来创建实例和array，但是new的时候要new class，不可以new interface
        Ansatt en = new Selger("Ole", 30_000);
        Ansatt to = new Montør("Kari", 35_000);
        //这样居然也可以！多态！！！！！
        Selger tre = new Selger("Oli", 30_000);
        Montør fire = new Montør("Kathy", 35_000);

        //liste的类型是interface的类型Ansatt
        Ansatt[] liste = new Ansatt[10];
        liste[0] = en;
        liste[1] = to;
        liste[2] = tre;
        liste[3] = fire;

        for(Ansatt ansatt : liste){
            if(ansatt != null){
                System.out.println(ansatt.getNavn() + " " + ansatt.getLønn());
                //Ole 40000.0      Kari 35000.0      Oli 40000.0      Kathy 35000.0
            }
        }
        //alternitiv
        for(int i  = 0; i < liste.length; i++){
            if(liste[i] != null){
                System.out.println(liste[i].getNavn() + " " + liste[i].getLønn());
                //Ole 40000.0      Kari 35000.0      Oli 40000.0      Kathy 35000.0
            }
        }
        System.out.println(en.ID);  //024
        System.out.println(fire.ID);  //024
        fire.sayHey();  //Hei
    }
}
