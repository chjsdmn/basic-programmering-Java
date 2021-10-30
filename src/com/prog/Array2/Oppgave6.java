package com.prog.Array2;

import javax.swing.*;

public class Oppgave6 {
    public static void main(String[] args) {
        String innAnmeldere = JOptionPane.showInputDialog("Skriv antall anmeldere");
        String innFilmer = JOptionPane.showInputDialog("Skriv antall filmer");
        int anmeldere, filmer;
        try{
            anmeldere = Integer.parseInt(innAnmeldere);
            filmer = Integer.parseInt(innFilmer);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Det er ikke et heltall");
            anmeldere = filmer = -1;
        }
        int[][] reviews = new int[anmeldere][filmer];
        String innReview;
        int review;
        for(int i = 0; i < reviews.length; i++){
            for(int j = 0; j < reviews[i].length; j++){
                innReview = JOptionPane.showInputDialog("Skriv score av film" + i+1);
                try{
                    review = Integer.parseInt(innReview);
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Det er ikke et heltall");
                    review = -1;
                }
                if(review >= 0 && review <= 9){
                    reviews[i][j] = review;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Score må mellom 0 til og med 94");
                    j--;
                }
            }
        }
        for(int[] scores : reviews){
            for(int score : scores){
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }
}
