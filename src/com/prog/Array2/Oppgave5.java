package com.prog.Array2;

public class Oppgave5 {
    public static void main(String[] args) {
        int[][] scores = new int[4][3];
        int[] scoreOfFilm1 = {4, 7, 6};
        int[] scoreOfFilm2 = {6, 9, 9};
        int[] scoreOfFilm3 = {2, 4, 3};
        int[] scoreOfFilm4 = {5, 8, 7};
        for(int j = 0; j < scores[0].length; j++){
            scores[0][j] = scoreOfFilm1[j];
            scores[1][j] = scoreOfFilm2[j];
            scores[2][j] = scoreOfFilm3[j];
            scores[3][j] = scoreOfFilm4[j];
        }

        int sum = 0;
        double snitt;
        for(int[] score : scores){
            for(int total : score){
                sum += total;
            }
            System.out.println("Summen er : " + sum);
            snitt = (double) sum / score.length;
            System.out.println("Gjennomsnittlig score for film " + String.format("%.2f", snitt));
            sum = 0;   //每次循环过后sum清零，确保sum不积累上一层数组的合计！！
        }



        for(int i = 0; i < scores.length; i++){
            for(int j = 0; j < scores[i].length; j++){
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
}
