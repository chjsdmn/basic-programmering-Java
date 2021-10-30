package com.prog.Array2;

import java.util.ArrayList;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        arrayConvertArrayList(a);
        System.out.println();
        arrayListConvertArray(al);

    }

    static void arrayConvertArrayList(int[] a){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            al.add(a[i]);
        }
        for(int tall : al){
            System.out.print(tall + " ");
        }
    }

    static void arrayListConvertArray(ArrayList<Integer> al){
        int[] a = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            a[i] = al.get(i);
        }
        for(int tall : a){
            System.out.print(tall + " ");
        }
    }
}
