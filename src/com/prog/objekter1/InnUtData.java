package com.prog.objekter1;

/**private
 * 声明为 private 的方法、变量和构造方法只能被所属类访问, 类和接口不能声明为 private.
 * farge为私有变量，所以其他类不能直接得到和设置该变量的值,
 *为了使其他类能够操作该变量，定义了两个 public 方法：setFarge() 和 hentFarge()
 */
class Car{
    //private 只在这个class里面才能使用，之外就不可以
    private String farge;   //因为有了set和hent的方法，所以变量可以变成private，main方法中不能用newCar.farge给定颜色了
    public void visFarge(){
        System.out.println("Farge av bilen er " + farge);
    }
    /*public void setFarge(String fargen){
        farge = fargen;
    }*/
    public void setFarge(String farge){   //如果parameter的名字和Car类attribute的名字相同，就无法写成farge=farge，因为系统分不清是哪个，所以要在attribute前加this
        this.farge = farge;
    }
    public String hentFarge(){
        return farge;
    }
}

public class InnUtData {
    public static void main(String[] args){
        Car newCar = new Car();   //没有用constructor，所以没有带入参数！
        newCar.setFarge("rød");
        String color = newCar.hentFarge();
        System.out.println("Farge av bilen er " + color);
        //newCar.farge = “red”;  因为farge是private变量，所以不能在这里直接给定颜色，要通过public方法setFarge而给定
    }
}
