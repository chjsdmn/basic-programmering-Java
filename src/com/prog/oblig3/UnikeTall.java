package com.prog.oblig3;

import javax.swing.*;

public class UnikeTall {
    public int[] values;
    public int lengde;

    //Konstruktør
    public UnikeTall(int lengde){
        int[] values = new int[lengde];   // int数组可以放在里面，不需要作为变量传入
        this.values = values;
        this.lengde = lengde;
    }

    //Undersøke om et gitt tall finnes i arrayet fra før
    private boolean sjekkeTallIArray(int tall){
        for(int item : values){
            if (tall == item){
                return true;    //找到相同的值后，不需要break！！！！！直接return就可以，跟break的作用相同，也是停止for-loop！！！！
            }
        }   //如果没找到就什么都不return，假装没我事啊
        return false;    //没找到，整个函数return false
    }

    //Fylle arrayet med tilfeldige forskjellige tall [100, 999]
    private void leggInn(){
        int i = 0;
        while (i < lengde) {
            int tall = (int) ((Math.random() * 900) + 100);
            if (!sjekkeTallIArray(tall)) {
                values[i] = tall;
                i++;   //i++要放在if条件里面，否则即使有相同的数字，数字没有推进array，i还是要增加1，这样的话数组会出现很多个0，即由于数值相同没有推进的任意数都成为了0，即空
            }
        }
    }

    //Finner og returnerer det minste tallet i arrayet
    private int minsteTall(){
        int minst = values[0];
        for(int tall : values){    //用没有i的for-loop更方便！！！
            if(tall < minst){
                minst = tall;
            }
        }
        return minst;
    }

    //Finner og returnerer det største tallet i arrayet
    private int maksTall(){
        int maks = values[0];
        for(int tall : values){   //用没有i的for-loop更方便！！！
            if(tall > maks){
                maks = tall;
            }
        }
        return maks;
    }

    //Beregner og returnerer den gjennomstnittlige verdien av tallene i arrayet
    private double gjennomsnitt(){
        double sum = 0;
        double snitt;
        for(int tall : values){
            sum +=tall;
        }
        snitt = sum / lengde;
        return snitt;
    }

    //Viser tallene i arrayet i en meldngsboks.
    public void skriveut(){
        leggInn();
        String tallene = "";
        int antall = 0;
        for(int tall : values){
            tallene += tall + " ";
            antall ++;
            if(lengde <= 100) {
                if (antall == 10) {
                    tallene += "\n";
                    antall = 0;
                }
            }
            else if(100 < lengde && lengde <=300) {
                if (antall == 20) {
                    tallene += "\n";
                    antall = 0;
                }
            }
            else {
                if (antall == 30) {
                    tallene += "\n";
                    antall = 0;
                }
            }
        }
        String snitt = String.format("%.2f", gjennomsnitt());
        String ut = tallene + "\n" +
                "Minste tall er " + minsteTall() + "\n" +
                "Største tall er " + maksTall() + "\n" +
                "Gjennomsnittsverdien er " + snitt;
        JOptionPane.showMessageDialog(null, ut);
    }

}

