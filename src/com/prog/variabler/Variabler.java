package com.prog.variabler;

import javax.swing.*;

public class Variabler {
    public static void main(String[] args){
        //将user输入的内容存入变量
        String text1= JOptionPane.showInputDialog("Skriv inn et heltall: ");
        String text2=JOptionPane.showInputDialog("Skriv inn et heltall: ");
        String text3=JOptionPane.showInputDialog("Skriv inn et desimal tall");
        String text4=JOptionPane.showInputDialog("Skriv inn et desimal tall");

        //Integer.parseInt(String) 将string转换为int
        int tall1=Integer.parseInt(text1);
        int tall2=Integer.parseInt(text2);
        double tall5=Double.parseDouble(text2);
        double div=tall1/tall2;
        double div2=tall1/tall5;
        System.out.println(tall1+" / "+tall2+" = "+div);  //resultat er int, fordi tall1 og tall2 er int.
        System.out.println(tall1+" / "+tall5+" = "+div2);  //resultat er double, fordi minst et tall1 er double.

        //Double.parseDouble(String) 将string转换为double
        double tall3=Double.parseDouble(text3);
        double tall4=Double.parseDouble(text4);
        double divisjon=tall3/tall4;
        JOptionPane.showMessageDialog(null, divisjon);   //først para er null!!!
        //tall();
    }

    public static void tall(){
        String x="2";
        System.out.println(x+1); //21
        int y=Integer.parseInt(x);
        double z= Double.parseDouble(x);
        System.out.println(y+1); //3
        System.out.println(z);   //2.0
    }
}
