package com.prog.objekter1;

import javax.swing.*;

class Persona{
    public String navn;
    public String adresse;
    public String telefonnr;
    public int fødselsår;
    public int alder(){
        int alder = 2021 - fødselsår;
        return alder;
    }
    public void info(){  // 可以在print里直接call方法！
        System.out.println(navn + " " + adresse + " " + telefonnr + " " + fødselsår + " " +alder() + " år");
    }
    public String info2(){  // 可以在return里直接call方法！
        return "Navn: "+ navn +
                "\nAdresse: " + adresse +
                "\nTelefonnr " + telefonnr +
                "\nAlder " + alder() + " år";
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.navn = "Lee";
        person1.adresse = "kirkeveien 2";
        person1.telefonnr = "23456789";
        person1.fødselsår =1989;
        //person1.alder();  不用叫这个method，因为在下面叫info方法的时候，info方法内部叫了alder方法
        person1.info();

        Persona person2 = new Persona();
        person2.navn = "Per Hansen";
        person2.adresse = "Osloveien 82";
        person2.telefonnr = "22124512";
        person2.fødselsår =2000;
        //person2.alder();
        person2.info();

        Persona person3 = new Persona();
        person3.navn = JOptionPane.showInputDialog("Skriv navn");
        person3.adresse = JOptionPane.showInputDialog("Skriv adresse");
        person3.telefonnr =JOptionPane.showInputDialog("Skriv telefonnr");
        String innFødselsår =JOptionPane.showInputDialog("Skriv fødselsår");
        person3.fødselsår = Integer.parseInt(innFødselsår);
        JOptionPane.showMessageDialog(null, person3.info2());

    }
}
