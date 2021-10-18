package com.prog.Array1;

public class Oppgave6 {
    public static void main(String[] args) {
        int[] a = {45, 34, 5, 8, 10, 2, 13, 25};
        int[] b = {45, 34, 5, 8, 10, 2, 13, 25};
        int[] c = {45, 34, 15, 8, 10, 2, 13, 25};
        int[] d = {45, 34, 5, 8, 10, 2, 13};
        sjekkeTwoArrays(a,b);
        sjekkeTwoArrays(a,c);
        sjekkeTwoArrays(a,d);
        sjekkeTwoArrays(c,b);
        System.out.println(sjekkeToArray(a,b));
        System.out.println(sjekkeToArray(a,c));
        System.out.println(sjekkeToArray(a,d));
        System.out.println(sjekkeToArray(b,c));
    }
    static void sjekkeTwoArrays(int[] a, int[] b){
        if(a.length != b.length){
            System.out.println("Tow arrays are not same");;
        }
        else{
            boolean lik = true;
            for(int i = 0; i < a.length; i++){
                if(a[i] != b[i]){
                    lik = false;
                }
            }
            if(lik){
                System.out.println("Tow arrays are the same");
            }
            else {
                System.out.println("Tow arrays are not same");
            }
        }
    }
    static boolean sjekkeToArray(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length;){
            if(a[i] == b[i]){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
