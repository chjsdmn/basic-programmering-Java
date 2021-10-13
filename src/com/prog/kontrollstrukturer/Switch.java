package com.prog.kontrollstrukturer;

import javax.swing.*;

/**
 * switch 一般用于int和string类型的情况
 */
public class Switch {
    public static void main(String[] args) {
        String innTall1 = JOptionPane.showInputDialog("Skriv et tall");
        double tall1 = Double.parseDouble(innTall1);
        String innTall2 = JOptionPane.showInputDialog("Skriv et tall");
        double tall2 = Double.parseDouble(innTall2);
        regneart(tall1, tall2);
        ifSetning(tall1, tall2);
    }
    /**
     *没有break就会一直往下走，直到遇到break停止
     */
    static void regneart(double a, double b){
        String operasjon = JOptionPane.showInputDialog("+, -, *, /");
        double res;
        switch (operasjon){
            case "+":
                res = a + b;  //注意要使用break！
                break;
            case "-":
                res = a - b;
                break;
            case "ganger":  //case不写break的话，和下面的case一个结果
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:    //注意要使用default！
                res = 0;
                break;  //注意要使用break！
        }
        JOptionPane.showMessageDialog(null, a + " " + operasjon + " " +b + " = " + res);
    }
    static void ifSetning(double a, double b){
        /**
         * 这里要用equal而不是==，因为String是类，使用==比较的是地址，所以不对，
         * 使用equal比较的是内容，所以可以正确执行功能
         */
        String operasjon = JOptionPane.showInputDialog("+, -, *, /");
        double res = 0; // res should assign a value here!
        //if(operasjon == "+"){
        if(operasjon.equals("+")){
            res = a + b;
        }
        //if(operasjon == "-"){
        if(operasjon.equals("-")){
            res = a - b;
        }
        //if(operasjon == "*"){
        if(operasjon.equals("*")){
            res = a * b;
        }
        //if(operasjon == "/"){
        if(operasjon.equals("/")){
            res = a / b;
        }
        JOptionPane.showMessageDialog(null, a + " " + operasjon + " " +b + " = " + res);
    }
}
