package com.prog.pakker.pakker1;

//import com.prog.pakker.pakker2.Klass3;
import com.prog.pakker.pakker2.*;

class Klass2 {

}
public class Klass1 {
    public static void main(String[] args) {
        Klass2 o1 = new Klass2();
        Klass3 o2 = new Klass3();
        //Klass4 o3 = new Klass4(); ERROR!!! Klass4 在另外一个包里，并且不是public，所以即使上面import了pakker2的所有pakker2.*， 也不能在这里用
        //并且一个包中只能有一个public class，所以Klass4不可以设置成public，这也是包对类的保护

    }
}
