package com.prog.Array1;

public class Oppgave7 {
    public static void main(String[] args) {
        int[] a = {45, 34, 5, 8, 10, 2, 13};
        int[] b = {45, 34, 5, 8, 10, 2, 13,20};
        int[] c = {8, 10, 2, 14};
        int[] d = {45,43,21,9};
        antallPartallOddetall(a);
        antallPartallOddetall(b);
        antallPartallOddetall(c);
        antallPartallOddetall(d);
    }
    static void antallPartallOddetall(int[] a){
        int tellPar = 0;
        int tellOdd = 0;
        for(int tall : a){
            if(tall % 2 == 0){
                tellPar++;
            }
            else{
                tellOdd++;
            }
        }
        System.out.println("Antall partall er " + tellPar + " og antall oddetall er " + tellOdd);
    }
}
