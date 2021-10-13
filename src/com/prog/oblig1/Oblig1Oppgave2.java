package com.prog.oblig1;

import javax.swing.*;

class Vare{
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        setAntall(antall);
        setPris(pris);
    }

    public String getNavn(){
        return navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }
    public int getAntall(){
        return antall;
    }
    public void setAntall(int antall){
        if(antall > 0){
            this.antall = antall;
        }
    }
    public double getPris(){
        return pris;
    }
    public void setPris(double pris){
        if(pris > 0){
            this.pris = pris;
        }
    }
    /*public double totalPris (int antall, double pris){
        double total = antall * pris;
        return total;
    }*/
    public double totalPris (){
        double total = antall * pris;
        return total;
    }

}

public class Oblig1Oppgave2 {
    public static void main(String[] args) {
        String navn1 = JOptionPane.showInputDialog("Skriv navet for vare1");
        String innAntall1 = JOptionPane.showInputDialog("Skriv antall for vare1");
        String innPris1 = JOptionPane.showInputDialog("Skriv prisen for vare1");
        String navn2 = JOptionPane.showInputDialog("Skriv navet for vare2");
        String innAntall2 = JOptionPane.showInputDialog("Skriv antall for vare2");
        String innPris2 = JOptionPane.showInputDialog("Skriv prisen for vare2");
        int antall1, antall2;
        double pris1, pris2;
        try{
            antall1 = Integer.parseInt(innAntall1);
            antall2 = Integer.parseInt(innAntall2);
            pris1 = Double.parseDouble(innPris1);
            pris2 = Double.parseDouble(innPris2);
        }
        catch (Exception e){
            antall1 = antall2 = -1;
            pris1 = pris2 = -1;
        }
        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);
        int antallVare1 = vare1.getAntall();
        int antallVare2 = vare2.getAntall();
        double prisVare1 = vare1.getPris();
        double prisVare2 = vare2.getPris();
        /*double totalPrisVare1 = vare1.totalPris(antallVare1, prisVare1);
        double totalPrisVare2 = vare2.totalPris(antallVare2, prisVare2);*/
        double totalPrisVare1 = vare1.totalPris();
        double totalPrisVare2 = vare2.totalPris();
        double totalPrisen = totalPrisVare1 + totalPrisVare2;
        String ut = "Vare 1 er " + navn1 + ", antall er " + antallVare1 + ", pris er " + prisVare1 +
                ", totalprisen for vare 1 ble " + totalPrisVare1 +
                "\nVare 2 er " + navn2 + ", antall er " + antallVare2 + ", pris er " + prisVare2 +
                ", totalprisen for vare 2 ble " + totalPrisVare2 +
                "\nTotalprisen for begge varer ble " + totalPrisen;
        System.out.println(ut);
    }
}
