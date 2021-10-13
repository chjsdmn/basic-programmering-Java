package com.prog.objekter1;

import javax.swing.*;

class Bøker{
    public String tittle;
    public double pris;
    public String forfatter;
    public String iSBN_nummer;
    public void bokInfo(){
        System.out.println("Tittel: " + tittle);
        System.out.println("Pris: " + pris + "NOK");
        System.out.println("Forfatter: " + forfatter);
        System.out.println("ISBN-nummer: " + iSBN_nummer);
    }
    /*public String bokInfo2(){
        return "Tittel: " + tittle +
                "\nPris: " + pris + "NOK" +
                "\nForfatter: " + forfatter +
                "\nISBN-nummer: " + iSBN_nummer;
    }*/
    public void bokInfo2(){
        String ut = "Tittel: " + tittle +
                    "\nPris: " + pris + "NOK" +
                    "\nForfatter: " + forfatter +
                    "\nISBN-nummer: " + iSBN_nummer;
        JOptionPane.showMessageDialog(null, ut);
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        Bøker bok1 = new Bøker();
        bok1.tittle = "Java";
        bok1.pris = 500;
        bok1.forfatter = "Andre";
        bok1.iSBN_nummer = "OF127384959";
        bok1.bokInfo();
        Bøker bok2 = new Bøker();
        bok2.tittle = JOptionPane.showInputDialog("Skriv tittle");
        bok2.forfatter = JOptionPane.showInputDialog("Skriv forfatter");
        bok2.iSBN_nummer = JOptionPane.showInputDialog("Skriv iSBN-nummer");
        String innPris = JOptionPane.showInputDialog("Skriv pris");
        double pris;
        try{
            pris = Double.parseDouble(innPris);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Prisen er ikke et tall.");
            pris = 0;
        }
        bok2.pris = pris;
        bok2.bokInfo2();
    }
}
