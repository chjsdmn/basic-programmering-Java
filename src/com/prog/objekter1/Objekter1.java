package com.prog.objekter1;

/**default
 * （默认）, 声明时没有加修饰符，被视为友好
 * 同一包中的类可以访问,任何处于本包下的类、接口、异常等，都可以相互访问
 */

class Bil{    //在同一个包中不能同时有两个public的class！！！
    public String farge;    //参见default
    public void visFarge(){   //public是因为之后要取得这个方法，没有static是因为下面用new来建立这个类的对象，没有public结果也一样???
        System.out.println("Farge av bilen er " + farge);
    }
}

public class Objekter1 {
    public static void main(String[] args){
        Bil nyBil = new Bil();   //nyBil是这个Bil类型的object，他具有Bil类所有的属性和方法, 没有用constructor，所以没有带入参数！
        nyBil.farge = "rød";
        nyBil.visFarge();
    }
}
