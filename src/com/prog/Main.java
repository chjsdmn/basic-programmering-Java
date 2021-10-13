package com.prog;

import javax.swing.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {
        //JOptionPane.showInputDialog() method
        String forNavn = JOptionPane.showInputDialog("Hva heter du?");

        //showInputDialog() method
        String etter_navn = showInputDialog("Hva er etternavn din?");

        //showMessageDialog(null, ) method
        showMessageDialog(null, forNavn + " " +etter_navn );

        //nylinje "\n"
        System.out.println(forNavn+"\n"+etter_navn);
        System.out.println("Jeg heter HJ.\nJeg er 23 år gamel.");

    }
}

