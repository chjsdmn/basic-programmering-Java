package com.prog.aritmetikk;

import javax.swing.*;

public class IfSetninger {
    public static void main(String[] args){
        String innTall1= JOptionPane.showInputDialog("Skriv et tall:");
        String innTall2= JOptionPane.showInputDialog("Skriv et tall:");
        int tall1=Integer.parseInt(innTall1);
        int tall2=Integer.parseInt(innTall2);
        if(tall1 == tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er lik Tall2");
        }
        if(tall1 != tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er ikke lik Tall2");
        }
        if(tall1 > tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er større enn Tall2");
        }
        if(tall1 < tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er mindre enn Tall2");
        }
        if(tall1 >= tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er større eller lik Tall2");
        }
        if(tall1 <= tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er mindre eller lik Tall2");
        }
    }
}
