package com.prog.oblig2;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
        String innNedreGrense = JOptionPane.showInputDialog("skirv et tall som nedre grense");
        String innØvreGrense = JOptionPane.showInputDialog("skriv et tall som øvre grense");
        int nedreGrense, øvreGrense;
        try {
            nedreGrense = Integer.parseInt(innNedreGrense);
            øvreGrense = Integer.parseInt(innØvreGrense);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Det er ikke tall");
            nedreGrense = øvreGrense = 0;
        }
        while (nedreGrense >= øvreGrense) {
            JOptionPane.showMessageDialog(null, "OBS! Øvre grense er mindre enn eller lik nedre grense");
            innNedreGrense = JOptionPane.showInputDialog("skirv et tall som nedre grense");
            innØvreGrense = JOptionPane.showInputDialog("skriv et tall som øvre grense");
            try {
                nedreGrense = Integer.parseInt(innNedreGrense);
                øvreGrense = Integer.parseInt(innØvreGrense);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Det er ikke tall");
                nedreGrense = øvreGrense = 0;
            }
        }
        int summen = 0;
        //int antall = 1;
        String ut = "";
        for(int i = nedreGrense; i <=øvreGrense; i++){
            if(i == øvreGrense){
                ut += i;
            }
            else {
                ut += i + " + ";
                if (i % 10 == 0){
                    ut += "\n";
                    //antall = 0;
                }
            }
            summen += i;
            //antall++;
        }
        System.out.println(ut + " = " + summen);
    }
}

