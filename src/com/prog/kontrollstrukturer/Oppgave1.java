package com.prog.kontrollstrukturer;

public class Oppgave1 {
    public static void main(String[] args) {
        teller();
        sum();
        partall();
        snitt();
    }
    static void teller(){
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void sum(){
        int summen = 0;
        for(int i = 0; i < 10; i++){
            summen += i;
        }

        System.out.println(summen);
    }
    static void partall(){
        for(int i = 0; i < 20; i++){
            /*if(i % 2 == 0) {
                System.out.print(i + " ");
            }*/
            System.out.println(i + " ");
            i += 2;
        }
        System.out.println();
    }
    static void snitt(){
        int sum = 0;
        int antall = 0;
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0) {
                sum += i;
                antall++;
            }
        }
        int snitt = sum / antall;
        System.out.println(snitt + " = " + sum + "/" + antall);
    }
}
