package com.prog.objekter1;

import java.text.DecimalFormat;

/**
 * 因为是static metode，所以在main里，通过类名。方法名的方法直接用！
 */

class Kalkulator{
    public static double addisjon(double x, double y){
        double total = x + y;
        return total;
    }
    public static double subtraksjon(double x, double y){
        double differanse = x - y;
        return differanse;
    }
    public static double multiplikasjon(double x, double y){
        double res = x * y;
        return res;
    }
    public static double inndeling(double x, double y){
        double kvotient = x / y;
        return kvotient;
    }
}

public class Oppgave5 {
    public static void main(String[] args) {
        double x = 8.8;
        double y = 2.3;
        double total = Kalkulator.addisjon(x,y);   //static方法，所以类名.方法名，直接用
        double differance = Kalkulator.subtraksjon(x,y);
        double res =Kalkulator.multiplikasjon(x,y);
        double kvotient = Kalkulator.inndeling(x,y);
        String t = String.format("%.2f", total);
        String d = String.format("%.2f", differance);
        String r = String.format("%.2f", res);
        String k = String.format("%.2f", kvotient);
        String ut = x  + " + " + y + " = " + t + "\n" +
                    x  + " - " + y + " = " + d+ "\n" +
                    x  + " * " + y + " = " + r + "\n" +
                    x  + " / " + y + " = " + k;
        System.out.println(ut);
    }
}
