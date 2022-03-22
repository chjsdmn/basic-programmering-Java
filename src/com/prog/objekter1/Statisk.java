package com.prog.objekter1;

import java.text.DecimalFormat;

public class Statisk {
    /**总结
     * 静态字段和静态方法都不属于实例，而属于class，所以要用类名来调用！！！
     *
     *static的方法是一种无需创建或实例化该方法所在的对象即可调用的方法。所以静态方法中也没有attribute
     *静态方法不与外部数据建立联系，只处理进入方法内部的数据，如main 和 System.out.println()都是静态方法
     * 大多数情况下，静态方法会返回一些数据。
     * 静态方法中，只允许引用也出现关键字static 的类的数据字段，比如下方，main引用了beregnAreal这个方法，所以这个方法必须是static，否则会报错
     */
    private static double beregnAreal(double radiu){  //这里的private是因为这个方法被在同一class的main方法调用
        double areal = Math.PI * Math.pow(radiu,2);   //Math.pow(data, 几次幂)
        return areal;
    }
    public static void main(String[] args){
        double radiu = 23.23;
        double areal = beregnAreal(radiu);
        DecimalFormat df = new DecimalFormat(".##");  //四舍五入, ONLY保留小数点后面不为0的两位小数，这种写法不能保证保留2为小数
        String arealMedToDecimal =df.format(areal);
        System.out.println(arealMedToDecimal);
    }
}