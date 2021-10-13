package com.prog.oblig1;

class Sirkel{
    static String diameter(double radius){
        double diameter = 2 * radius;
        String diameterMedToDesimaler = String.format("%.2f", diameter);
        return diameterMedToDesimaler;
    }
    static String omkrets(double radius){
        double omkrets = 2 * Math.PI * radius;
        String omkretsMedToDesimaler = String.format("%.2f", omkrets);
        return omkretsMedToDesimaler;
    }
    static String areal(double radius){
        double areal = Math.PI * Math.pow(radius, 2);
        String arealMedToDesimaler = String.format("%.2f", areal);
        return arealMedToDesimaler;
    }
}

public class Oblig1Oppgave1 {
    public static void main(String[] args) {
        double radius = 23.5;
        String diameter = Sirkel.diameter(radius);
        String omkrets = Sirkel.omkrets(radius);
        String areal = Sirkel.areal(radius);
        String ut = "Arealet av sirkelen med radius " +
                radius + " er " + areal +
                "\nOmkretsen av sirkelen med radius " +
                radius + " er " + omkrets +
                "\nDiameteren til sirkelen er med radius " +
                radius + " er " + diameter;
        System.out.println(ut);
    }

}
