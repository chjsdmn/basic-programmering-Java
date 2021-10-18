package com.prog.Array1;

import javax.swing.*;

public class Oppgave8 {
    public static void main(String[] args) {
        System.out.println(snitt());
    }
    static double snitt(){
        String innAntall = JOptionPane.showInputDialog("Skriv antall av poengsummer");
        int antall;
        try{
            antall = Integer.parseInt(innAntall);
        }catch(Exception e){
            antall = 0;
            JOptionPane.showMessageDialog(null, "Det er ikke et integer tall");
        }

        String innPoeng;
        int poeng;
        int[] a = new int[antall];
        while(antall > 0){
            innPoeng = JOptionPane.showInputDialog("Skriv poeng");
            try{    //老师把逻辑写在了try里面
                poeng = Integer.parseInt(innPoeng);
                a[antall - 1] = poeng;  // antall - 1 !!!
                antall--;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "det er ikke integer");
            }
        }
        /*for(int i = 0; i < a.length; i++){
            innPoeng = JOptionPane.showInputDialog("Skriv poeng");
            try{
                poeng = Integer.parseInt(innPoeng);
                a[i] = poeng;
                lengde++;
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "det er ikke integer");
            }
            /*if(poeng >= 0 && poeng <=100) {
                a[i] = poeng;
                lengde++;
            }

        }*/
        double snitt = 0;
        int sum = 0;
        /*while (lengde > 0) {
            sum += a[lengde - 1];
            lengde--;
        }*/
        for(int item : a){
            sum += item;
        }
        if(a.length > 0){
            snitt = (double)sum / a.length;
        }
        return snitt;
    }
}
