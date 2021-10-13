package com.prog.objekter2;

import javax.swing.*;

class Person{
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getFornavn(){
        return getFornavn();
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public void personInfo(){
        String ut = "Fornavn:" + fornavn +
                    "\nEtternavn: " + etternavn +
                    "\nAdresse: " + adresse +
                    "\nTelefonnr: " + telefonnr;
        JOptionPane.showMessageDialog(null, ut);
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Skriv fornavn");
        String etternavn = JOptionPane.showInputDialog("Skriv etternavn");
        String adresse = JOptionPane.showInputDialog("Skriv adresse");
        String telefonnr = JOptionPane.showInputDialog("Skriv telefonnr");
        Person person1 = new Person(fornavn, etternavn, adresse, telefonnr);
        person1.personInfo();
    }

}
