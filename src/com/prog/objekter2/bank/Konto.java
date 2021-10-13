package com.prog.objekter2.bank;

import javax.swing.*;

public class Konto {
    private String kontoNummer;
    private String navn;
    private double saldo;

    public Konto(String kontoNummer, String navn, double saldo) {
        this.kontoNummer = kontoNummer;
        this.navn = navn;
        this.saldo = saldo;
    }

    public void kontoInfo() {
        String ut = navn + " har " + saldo + " kr i konto " + kontoNummer;
        JOptionPane.showMessageDialog(null, ut);
    }

    public String setInn(double beløp) {
        saldo += beløp;
        return "Ny saldo er " + saldo;
    }

    public String taUt(double beløp) {
        String ut;
        if(saldo >= beløp){
            saldo -= beløp;
            ut = "Ny saldo er " + saldo;
        }
        else {
            ut = "Utilstrekkelig balanse";
        }
        return ut;
    }
}
