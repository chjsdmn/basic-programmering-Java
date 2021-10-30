package com.prog.Array1;

public class Oppgave4 {
    public static void main(String[] args) {
        int[] a = {45, 34, 5, 8, 10, 2, 13, 25};
        for(int i = a.length - 1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        maksMinst(a);
        System.out.println(maks(a));
        System.out.println(minst(a));
    }

    /**Så smart!!!
     * @param a
     * ved å bruke forenklet for-løkke blir lettere enn vanlig for-løkke!!!
     */

    static void maksMinst(int[] a){
        int maks = a[0];
        int minst = a[0];
        for(int tall : a){
            if(tall > maks){
                maks = tall;
            }
            if(tall < minst){
                minst = tall;
            }
        }
        System.out.println("Maks er " + maks);
        System.out.println("Minst er " + minst);
    }
    static int maks(int[] a){
        //int maks_indeks = 0;
        int maks = a[0];
        for(int i = 1; i < a.length; i++){
            if(maks < a[i]){
                maks =a[i];
                //maks_indeks = i;
            }
        }
        return maks;
    }
    static int minst(int[] a){
        int minst = a[0];
        for(int i = 1; i < a.length; i++){
            if(minst > a[i]){
                minst = a[i];
            }
        }
        return minst;
    }

}
