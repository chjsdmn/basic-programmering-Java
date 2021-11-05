package com.prog.merobjekter1;

class Person2{
    String personalNummer;
    String navn;
    String teleNummer;
    String adresse;

    //toString()是Object自带的metode，这里属于重写override了这个方法，打印的时候自动启用,不用写成enPerson.toString()
    //用于给类打印出来时规定格式
    public String toString(){
        String ut = "Personal Nummer er " + personalNummer +
                    "\nNavn er " + navn +
                    "\nteleNummer er " + teleNummer +
                    "\nadresse er " + adresse;
        return ut;
    }
}
public class toString {
    public static void main(String[] args) {
        Person2 enPerson = new Person2();
        enPerson.personalNummer = "21010320011214";
        enPerson.navn = "Lucy Liu";
        enPerson.teleNummer = "13979582001";
        enPerson.adresse = "varkert veien 50";
        //System.out.println(enPerson.toString());  如果没有重写toString方法，即使用里toString（）方法，打印出来的也是一个地址
        System.out.println(enPerson); // 如果没有重写toString方法，打印出来的是一个地址
        //Personal Nummer er 21010320011214
        //Navn er Lucy Liu
        //teleNummer er 13979582001
        //adresse er varkert veien 50

    }
}
