package com.prog.Array2;

public class Array2Dim {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        a[0][0] = 23;
        a[1][0] = 24;
        a[2][3] = 25;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] liste : a){   //merker at type er int[] !!!!
            for(int tall : liste){
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }
}
