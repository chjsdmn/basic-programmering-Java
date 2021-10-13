package com.prog.kontrollstrukturer;

public class Oppgave5 {
    public static void main(String[] args) {
        teller();
        sum();
        partall();
        snitt();
    }
    static void teller(){
        int i = 0;
        while (i < 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
    static void sum(){
        int i = 0;
        int summen = 0;
        while (i < 10){
            summen += i;
            i++;
        }
        System.out.println(summen);
    }
    static void partall(){
        int i = 0;
        while (i < 20){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
    static void snitt(){
        int i = 0;
        int antall = 0;
        int sum = 0;
        while (i < 100){
            /*if(i % 2 == 0){
                sum += i;
                antall++;
            }
            i++;*/
            sum += i;
            antall++;
            i+=2;
        }
        double snitt = (double) sum / (double) antall;
        System.out.println(snitt + " = " + sum + "/" + antall);
    }
}
