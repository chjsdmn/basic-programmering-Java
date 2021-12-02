package com.prog;


public class Main {
    public static void main(String[] args) {
        int[] tab = {1};
        int a = 2;
        minProsedyre(tab, a);
        System.out.println(tab[0]);  //3
        System.out.println(a);  //2

        int[] x = {2,4,6,8,10};
        ukjent(x[4]);
        System.out.println(x[4]);  //10

        int m = 0;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++)  {
                m++;
            }
        }
        System.out.println(m);
    }

    public static void minProsedyre(int[] tab, int a) {
        tab[0] = 3;
        a = 4;
    }

    public static void ukjent(int x) {
        x *= x;
    }
}

