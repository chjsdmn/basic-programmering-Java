package com.prog.objekter2.bank;

public class Bank {
    public static void main(String[] args) {
        Konto konto1 = new Konto("101234", "Lee", 1000);
        konto1.kontoInfo();
        System.out.println(konto1.setInn(20));
        System.out.println(konto1.taUt(1000));
        System.out.println(konto1.taUt(2000));
        konto1.kontoInfo();

    }
}
