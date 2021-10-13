package com.prog.aritmetikk;

import javax.swing.*;

public class Oppgave {
    public static void main(String[] args){
        //historie();
        //partall();
        //rektangelAreal();
        //omkretsen();
        //celsius();
        //delePizza();
        //aritmetikk();
        //førerkort();
          //summen();
        setAntall(-1);

    }
    static void setAntall(int antall) {
        if (antall <= 0) {
            return;
        }
        System.out.println(2*antall);
    }

    public static void historie(){
        String navn = JOptionPane.showInputDialog("Hva heter du?");
        String innAlder = JOptionPane.showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);
        int fødtÅr = 2021 - alder;
        int pensjonÅr = fødtÅr + 67;
        String ut = navn + " er i dag "+
                    alder + " år. Han er født i " +
                    fødtÅr + ". I " +
                    pensjonÅr + " er han 67 år og da vil han være pensjonist.";
        System.out.println(ut);
    }

    public static void partall(){
        int antall = 0;
        while (antall < 10){
            antall += 2;
            if(antall == 10) break;
            System.out.println(antall);
        }
    }

    public static void rektangelAreal(){
        String innBredde = JOptionPane.showInputDialog("Skriv et tall");
        String innLengde = JOptionPane.showInputDialog("Skriv et tall");
        double bredde = Double.parseDouble(innBredde);
        double lengde = Double.parseDouble(innLengde);
        double areal = bredde * lengde;
        String ut = "Et rektangel med bredde " +
                    bredde + " cm og lengde " +
                    lengde + " cm har et areal på " +
                    areal + " cm^2.";
        System.out.println(ut);
    }

    public static void omkretsen(){
        final double PI = 3.14;
        String innRadiusen = JOptionPane.showInputDialog("Skriv et tall");
        //double radiusen = Double.parseDouble(innRadiusen);
        double radiusen;
        try{
            radiusen = Double.parseDouble(innRadiusen);
        }
        catch (Exception e){
            radiusen = 0;
        }
        double omkretsen = 2 * PI * radiusen;
        String omkretsenMedToDesimaler = String.format("%.2f", omkretsen); //String.format("%.2f", double)
        String ut = "Omkretsen av en sirkel med " +
                    radiusen + " cm som radius blir " +
                    omkretsenMedToDesimaler + " cm.";
        System.out.println(ut);
    }

    public static void celsius(){
        String innFahrenheit = JOptionPane.showInputDialog("Skriv et tall");
        double fahrenheit = Double.parseDouble(innFahrenheit);
        double celsius = (fahrenheit - 32) / 1.8;
        String celsiusMedTreDesimaler = String.format("%.3f", celsius);
        System.out.println(celsiusMedTreDesimaler);
    }

    public static void delePizza(){
        String innPerson = JOptionPane.showInputDialog("Hvor mange personer?");
        String innPizza = JOptionPane.showInputDialog("Hvor mange pizza?");
        String innSlice = JOptionPane.showInputDialog("Hvor mange slices av en pizza?");
        int person = Integer.parseInt(innPerson);
        int pizza = Integer.parseInt(innPizza);
        int slice = Integer.parseInt(innSlice);
        int delePizza = pizza * slice / person;
        int overs = pizza * slice % person;
        String ut = "Dersom man er " +
                    person + " personer og har " +
                    pizza + " pizzaer får hver person " +
                    delePizza + " slices og " +
                    overs + " blir til overs";
        System.out.println(ut);
    }

    public static void aritmetikk(){
        double tall1=1;
        double tall2=2;
        double resultat;
        resultat = tall1 * 4 + (tall2 * 2 + tall1 ) / (tall2-tall1*3);
        System.out.println(resultat);  //-1.0
    }

    public static void førerkort(){
        String innAlder = JOptionPane.showInputDialog("Hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);
        if(alder < 18){
            System.out.println("Du er for ung til å ta førerkort for bil.");
        }
        else {
            System.out.println("Du kan ta førerkortet for bil da du er gammel nok.");
        }
    }

    public static void summen(){
        String innTall = JOptionPane.showInputDialog("Skriv et tall mellom 0 - 1000");
        int tall = Integer.parseInt(innTall);
        /*
        int siffer1= tall /100;  //百位
        int siffer = tall % 100;
        int siffer2 = siffer / 10; //十位
        */
        int siffer3 = tall % 10;  //个位
        tall /= 10;
        int siffer2 = tall / 10; //十位
        int siffer1= tall /10; //百位

        int sum = siffer1 + siffer2 + siffer3;
        System.out.println(sum);

    }

}
