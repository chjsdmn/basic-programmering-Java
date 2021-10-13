package com.prog.kontrollstrukturer;

import javax.swing.*;

public class WhileLøkk {
    public static void main(String[] args) {
        //summen();
        gjennomsnitt();
    }
    static void summen(){
        int sum = 0;
        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et heltall og slutt med 0"));
        while (tall > 0){
            sum += tall;
            tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et heltall og slutt med 0"));
        }
        JOptionPane.showMessageDialog(null, sum);
    }
    static void gjennomsnitt(){
        int antall = 0;
        int sum = 0;
        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et heltall og slutt med 0"));
        while (tall > 0){
            sum += tall;
            antall++;
            tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv et heltall og slutt med 0"));
        }
        double snitt = (double) sum / (double) antall;  //kasting type av sum og antall til double
        //double snitt = sum / antall;   uten kasting: (8 + 7) / 2 = 7.0
        JOptionPane.showMessageDialog(null, "Summen: " + sum + "\nAntall: " + antall + "\nGjennomsnitt: " + snitt);
    }
}
