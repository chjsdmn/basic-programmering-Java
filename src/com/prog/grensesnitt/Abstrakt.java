package com.prog.grensesnitt;

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
 */
abstract class Flytøy extends Kjøretøy{
    protected int tankVolum;

    public Flytøy(String farge, int antallHjul, int tankVolum){
        super(farge, antallHjul);
        this.tankVolum = tankVolum;
    }
}

class Bil extends Kjøretøy{
    protected int antallDører;
    public Bil(String farge, int antallHjul, int antallDører){
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
