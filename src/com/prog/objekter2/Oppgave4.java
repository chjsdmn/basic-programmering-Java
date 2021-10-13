package com.prog.objekter2;

import javax.swing.*;

class Klokke{
    private int time;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder) {
        /*if(0 <= time && time <= 24) {
            this.time = time;
        }
        if(0 <= minutter && minutter <= 59) {
            this.minutter = minutter;
        }
        if(0 <= sekunder && sekunder <= 59) {
            this.sekunder = sekunder;
        }*/
        setTime(time);
        setMinutter(minutter);
        setSekunder(sekunder);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        if(0 <= time && time <= 24) {
            this.time = time;
        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if(0 <= minutter && minutter <= 59) {
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if(0 <= sekunder && sekunder <= 59) {
            this.sekunder = sekunder;
        }
    }

    public void visTiden(){
        System.out.println(time + " : " + minutter + " : " + sekunder);
        JOptionPane.showMessageDialog(null, time + " : " + minutter + " : " + sekunder);
    }
}

public class Oppgave4 {
    public static void main(String[] args) {
        Klokke myKlokke = new Klokke(2, 12, 599);
        myKlokke.visTiden();
    }
}
