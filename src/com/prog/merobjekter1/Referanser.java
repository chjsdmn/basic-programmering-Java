package com.prog.merobjekter1;

class Person{
    String navn;
}
public class Referanser {
    /**
     *
     * @param enPerson   objekt, objekt比较大，如果直接copy objekt，会比较花时间
     * @param navn   String，String比较小，所以copy string比较节省时间
     * 所以这个方法没有返回Person，而是返回了String navn
     */
    static void endreNavn(Person enPerson, String navn){
        enPerson.navn = navn;
    }
    public static void main(String[] args) {
        Person enPerson = new Person();
        enPerson.navn = "Lee";
        System.out.println(enPerson.navn);
        endreNavn(enPerson, "Kari");   //这里的参数enPerson不是copy了一个Person的实例，而是一个referanse，即地址，perker，这也是之所以写这个方法的原因
        System.out.println(enPerson.navn);
    }
}
