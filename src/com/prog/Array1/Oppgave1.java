package com.prog.Array1;

public class Oppgave1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < a.length-1; i++){
            if(a[i] % 3 == 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Summen er " + summen(a));
        System.out.println("Snitt er " + snitt(a));
        System.out.println("Summen av større enn fem er " + summenStørreEnnFem(a));
        System.out.println("Snitt av summen som er større enn fem er " + summenStørreEnnFemSintt(a));
    }
    static int summen (int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    static int snitt (int[] a){
        int sum = 0;
        int antall = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
            antall++;
        }
        return sum / antall;
    }
    static int summenStørreEnnFem (int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > 5) {
                sum += a[i];
            }
        }
        return sum;
    }
    static double summenStørreEnnFemSintt (int[] a){
        int sum = 0;
        int antall = 0;
        for(int tall : a){
            if(tall > 5) {
                sum += tall;
                antall++;
            }
        }
        return (double) sum / antall;
    }
}
