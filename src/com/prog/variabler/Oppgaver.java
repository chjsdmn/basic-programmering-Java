package com.prog.variabler;

import javax.swing.*;

public class Oppgaver {
    public static void main(String[] args){
        /*String text= JOptionPane.showInputDialog("Skriv inn alderen din:");
        int alder=Integer.parseInt(text);
        JOptionPane.showMessageDialog(null, "Min alder er "+alder+" år.");*/
        beregning();
    }

    /*public static void beregning(){
        String text1=JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String text2=JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String text3=JOptionPane.showInputDialog("Skriv inn et desimaltall");
        double tall1=Double.parseDouble(text1);
        double tall2=Double.parseDouble(text2);
        double tall3=Double.parseDouble(text3);
        double sum=tall1+tall2+tall3;
        double gjennomsnitt=sum/3;
        System.out.println(tall1+" + "+tall2+" + "+tall3+" = "+sum);
        JOptionPane.showMessageDialog(null, " ( "+tall1+" + "+tall2+" + "+tall3+" ) / 3 = "+gjennomsnitt);
        System.out.println("Gjennomsnitt av "+tall1+", "+tall2+", "+tall3+" er "+gjennomsnitt);
    }*/

    public static void beregning(){
        String text1=JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String text2=JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String text3=JOptionPane.showInputDialog("Skriv inn et desimaltall");
        double tall1;
        double tall2;
        double tall3;
        try{
            tall1=Double.parseDouble(text1);
            tall2=Double.parseDouble(text2);
            tall3=Double.parseDouble(text3);
        }
        catch (Exception e){
            System.out.println(e);
            tall1=tall2=tall3=0;
        }
        double sum=tall1+tall2+tall3;
        double gjennomsnitt=sum/3;
        System.out.println(tall1+" + "+tall2+" + "+tall3+" = "+sum);
        JOptionPane.showMessageDialog(null, " ( "+tall1+" + "+tall2+" + "+tall3+" ) / 3 = "+gjennomsnitt);
        System.out.println("Gjennomsnitt av "+tall1+", "+tall2+", "+tall3+" er "+gjennomsnitt);
    }

}

