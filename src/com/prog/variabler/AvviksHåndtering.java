package com.prog.variabler;

import javax.swing.*;

public class AvviksHåndtering {
    //try catch可以让program不暂停，即使有Exception，也可以继续往下走
    public static void main(String[] args){
        String text= JOptionPane.showInputDialog("Skriv inn et heltall");
        int tall;  //将变量设置在外面是因为try和catch都要用到tall，所以不能在try或者catch里面设置
        try{    //先走这一模块
            tall=Integer.parseInt(text);
        }
        catch (Exception e){  //没问题就直接跳出这一模块向下走，如果有问题，则捕捉到e，即error
            tall=0;   //如果捕捉到e，tall就变成0， 如果这步不给tall赋值的话，在输入非int的情况下，tall是没有值的，所以会报错
            System.out.println(e);  //将捕捉到的e打印出来
        }
        System.out.println("Tall er "+tall);   //打印出最后的tall值，捕捉到e的话，就是tall=0
    }
}
