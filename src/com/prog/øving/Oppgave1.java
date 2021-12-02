package com.prog.øving;

public class Oppgave1 {
    public static void main(String[] args) {
        int [] liste =  {2,4,6,12,78,45,3,42,5,-7};
        System.out.println(summen(liste));   //190
        System.out.println(summen2(liste));  //190
    }

    public static int summen(int[] a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            total += a[i];
        }
        return total;
    }

    public static int summen2(int[] a){
        int total = 0;
        for(int tall : a){
            total += tall;
        }
        return total;
    }
}
