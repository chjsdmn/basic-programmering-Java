package com.prog.objekter2;

class Car{
    private String farge;
    private int HK;
    public void setFarge(String farge){   //因为上面的attribute是private，所以建立set和get方法来给attribute赋值
        this.farge = farge;
    }
    public String getFarge(){
        return farge;
    }
    public void setHK(int HK){
        if(HK > 0) {             //通过set赋值的好处之一是可以控制赋值的范围，这里如果小于0，就不会被处理，返回0
            this.HK = HK;
        }
    }
    public int getHK(){
        return HK;
    }
}
public class BilMainPrivate {

    public static void main(String[] args) {
        Car car1 = new Car();
        //car1.farge = "blå";  因为farge是private，所以不能这样直接赋值。
        car1.setFarge("rød");
        car1.setHK(123);
        System.out.println("Car1 farge er " + car1.getFarge());
        System.out.println("Car1 HK er " + car1.getHK());
    }
}
