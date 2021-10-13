package com.prog.aritmetikk;

public class Aritmetikk {
    public static void main(String[] args){
        /*
        * Det blir ingen endringer i typen til tall1 og tall2 etter dette,
        * de vil fortsatt være int
        * (det er ikke mulig å endre en variabels type i Java).
        * */
        int tall1=1;
        int tall2=5;
        double tall3=40_000;  //40000可以写成40_000
        double res=(double)tall1/(double) tall2; //omgjøres tall1 og tall 2 til double før divisjonen
        double res2=tall1/tall2;
        int res3=tall1/tall2;
        double res4=tall3/tall2;
       // int res5=tall3/tall2;  feil!
        System.out.println(res);   //0.2
        System.out.println(res2);  //0.0
        System.out.println(res3);  //0 因为都是整数type，所以结果显示也是取整（向下取整）
        System.out.println(res4);  //8000.0 即使其中tall2是整数，返回值也是小数
    }
}
