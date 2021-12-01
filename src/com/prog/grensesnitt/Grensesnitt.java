package com.prog.grensesnitt;

interface Ansatt{  //interface里的方法为空，这些空方法通过类来实现，在类中重写override这些方法
    String ID = "024";  //应该是隐式的public static final type!
    String getNavn();  //接口中的方法都是饮食public abstract，所以定义的时候不用写public
    public double getLønn(); //接口中的方法都是饮食public abstract，所以定义的时候不用写public
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
        Ansatt en = new Selger("Ole", 30_000);  //interface也可以作为数据类型来创建实例和array，但是new的时候要new class，不可以new interface
        Ansatt to = new Montør("Kari", 35_000);
        Selger tre = new Selger("Oli", 30_000);  //这样居然也可以！多态！！！！！
        Montør fire = new Montør("Kathy", 35_000);
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
