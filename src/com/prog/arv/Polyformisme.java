package com.prog.arv;

/**
 * Java的多态性 Polymorphism
 * 如下所示，可以让不同的subclass type的数据在一个array里面
 * 所以subklasse里面的属性和方法也都可以被使用了！
 */
class Ansatt2{
    private String navn;
    private double lønn;
    
    Ansatt2(String navn, double lønn){
        this.navn = navn;
        this.lønn = lønn;
    }
    
    String getNavn(){
        return this.navn;
    }
    
    double getLønn(){
        return this.lønn;
    }

    public String toString(){
        return this.navn;
    }
}

/**
 * class不能继承extends多个类，但是可以实现implements多个接口！！！
 */
/*class Xyz{
    int Id;
}
class Selger2 extends Xyz{

}*/

class Selger2 extends Ansatt2{
    private static final double bonus = 10_000;  //定义常量 不能更改
    public static final int qian = 20;
    Selger2(String navn, double lønn){
        super(navn, lønn);
    }
    double getLønn(){
        return super.getLønn() + this.bonus;  //lønn是private，所以这里用super.getLønn()获取数据
    }
}

class Montør2 extends Ansatt2{
    Montør2(String navn, double lønn){
        super(navn, lønn);
    }
}

public class Polyformisme {
    /**
     * 多态性，两个实例都是同一个类型，所以可以进而建立array
     * 但是当执行getLønn()函数的时候，系统就会自动分别根据实例的类型来call不同的getLønn()方法
     * @param args
     */
    public static void main(String[] args) {
        Ansatt2 selger2 = new Selger2("Ole", 65000);
        Ansatt2 montør2 = new Montør2("Kari", 45000);
        Selger2 selger3 = new Selger2("Oli", 60000);
        Montør2 montør3 = new Montør2("Kathy", 40000);
        Ansatt2[] ansattList = new Ansatt2[20];
        ansattList[0] = selger2;
        ansattList[1] = montør2;
        ansattList[2] = selger3;
        ansattList[3] = montør3;
        for(int i = 0; i < ansattList.length && ansattList[i] != null; i++){
            System.out.println(ansattList[i].getNavn() + " tjener " + ansattList[i].getLønn());
        }
        //Ole tjener 75000.0
        //Kari tjener 45000.0
        //Oli tjener 70000.0
        //Kathy tjener 40000.0

        System.out.println(selger2); //Ole, 因为覆写了toString（）在supercalss里
        System.out.println(montør2); //Kari
        System.out.println(selger3.qian);  //20
        //System.out.println(selger2.qian); ERROR!!!!
    }
}
