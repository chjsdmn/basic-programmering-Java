package com.prog.objekter2;

class Vind {
    private double vindHastighet = 0.0;

    // her skal det inn en konstruktør for å sette vindhastigheten
    public Vind(double vindHastighet){
        this.vindHastighet = vindHastighet;
    }

    public double getVindhastighet() {
        return vindHastighet;
    }

    public boolean erOrkan() {
        if (vindHastighet >= 120){
            return true;
        }
        return false;
    }

    public boolean erVindstille() {
        if (vindHastighet <= 2){
            return true;
        }
        return false;
    }

    public double getKnop() {
        double knop = vindHastighet / 1.852;
        return knop;
    }

    public int getBeaufort() {
        int beaufort = (int)(Math.pow((vindHastighet / 3.01),0.6666) + 0.5);
        if(beaufort > 12){
            beaufort = 12;
        }
        return beaufort;
    }
}

public class Oppgave6 {
    public static void main(String[] args) {
        Vind test1 = new Vind(40);
        System.out.println(test1.getBeaufort());
        System.out.println(test1.getKnop());

    }
}
