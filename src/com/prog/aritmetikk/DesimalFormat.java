package com.prog.aritmetikk;

import java.text.DecimalFormat;

public class DesimalFormat {
    public static void main(String[] args){
        /*
        * 保留小数点后面的位数
        * 方法一
        * DecimalFormat df = new DecimalFormat("0.00");
        * df.format(要取位数的小数值)
        * */
        double a = 2.00003;  //2.00; 2; 2.00
        double b = 21.7666;  //21.77; 21.77; 21.77
        DecimalFormat df = new DecimalFormat("0.00");   //四舍五入
        DecimalFormat df2 = new DecimalFormat("#.##");   //四舍五入, ONLY保留小数点后面不为0的两位小数，这种写法不能保证保留2为小数
        String res = df.format(b);    //注意，返回值的类型是String！
        String res2 = df2.format(a);
        System.out.println(res);
        System.out.println(res2);
        /*
         * 保留小数点后面的位数
         * 方法二
         * String.format("%.2f", 要取位数的小数值);
         * */
        String res3 = String.format("%.2f", a);
        System.out.println(res3);   //四舍五入, 保留两位小数
    }


}
