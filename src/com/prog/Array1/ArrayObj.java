package com.prog.Array1;

import javax.swing.*;

class Film{
    private String navn;
    private double pris;
    public String getNavn(){
        return navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }
    public double getPris(){
        return pris;
    }
    public void setPris(double pris){
        if(pris > 0){
            this.pris = pris;
        }
    }
    public Film(String navn, double pris){
        this.navn = navn;
        this.pris = pris;
    }
}

public class ArrayObj {
    public static void main(String[] args) {
        Film[] filmer = new Film[100];
        int antall = 0;   //通过antall这个变量来充当object array的index！！
        String innNavn = JOptionPane.showInputDialog("Skriv inn navn til filmen");
        double innPris = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen til filmen"));
        while (antall < filmer.length && innPris > 0){  //通过innPris > 0这个条件，来终止while循环
            Film filmEn = new Film(innNavn, innPris);
            filmer[antall] = filmEn;
            //filmer[antall] = new Film(innNavn, innPris);  也可以这样写成一步
            antall++;
            innNavn = JOptionPane.showInputDialog("Skriv inn navn til filmen");
            innPris = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn prisen til filmen"));
        }
        int i = 0;  //因为是while循环，所以要把i设置在外面
        String ut = "";
        while (filmer[i] != null){  //因为object array设置了100个item，所以没有添加的item就是null
            ut += "Navn: " + filmer[i].getNavn() + " Pris: " + filmer[i].getPris() + "\n";
            i++;
        }

        JOptionPane.showMessageDialog(null, ut);

    }

}
