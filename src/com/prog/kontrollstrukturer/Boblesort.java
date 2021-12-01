package com.prog.kontrollstrukturer;

public class Boblesort {
    public static void boblesort(int[] liste) {
        int k;
        for (int n = liste.length; n >0; n--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (liste[i] > liste[k]) {
                    swapNummer(i, k, liste);
                }
            }
            skrivNummer(liste);
        }
    }

    private static void swapNummer(int i, int j, int[] liste) {

        int temp;
        temp = liste[i];
        liste[i] = liste[j];
        liste[j] = temp;
    }

    private static void skrivNummer(int[] liste) {

        for (int tall: liste) {
            System.out.print(tall + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] input = { 1, 3, 5, 2, 4, 0};
        boblesort(input);
    }
}
