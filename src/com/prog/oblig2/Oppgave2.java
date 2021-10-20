package com.prog.oblig2;

import javax.swing.*;

class Tallspill{
    String melding = "Jeg tenker på et tall mellom 0 og 200.\nPrøv å gjette på tallet:";
    int målNummer;
    int antall;

    public int nyttTall(){
        this.målNummer = (int) (Math.random() * 201);
        return this.målNummer;
    }
    public String visMelding(String melding){
        //this.melding = melding;
        return JOptionPane.showInputDialog(melding);
    }
    public void forLite(int tall){
        if(tall < this.målNummer){
            JOptionPane.showMessageDialog(null, tall + " er for lite! Prøv igjen!");
            this.antall++;
        }
    }
    public void forStort(int tall){
        if(tall > this.målNummer){
            JOptionPane.showMessageDialog(null, tall + " er for stort! Prøv igjen!");
            this.antall++;
        }
    }
    public void avsluttRunde(int antall, int gjetning){
        JOptionPane.showMessageDialog(null, gjetning + " er riktig!\nDu gjettet riktig på " + antall + " forsøk.");
    }
    public void kjørSpill(){
        this.målNummer = nyttTall();
        String innGjetning = visMelding(this.melding);
        int gjetning;
        try{
            gjetning = Integer.parseInt(innGjetning);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Det er ikke et heltall");
            gjetning = -1;
        }
        while (gjetning != målNummer){
            forLite(gjetning);
            forStort(gjetning);
            innGjetning = visMelding(this.melding);
            try{
                gjetning = Integer.parseInt(innGjetning);
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Det er ikke et heltall");
                gjetning = -1;
            }
        }
        avsluttRunde(this.antall, gjetning);
    }
}
public class Oppgave2 {
    public static void main(String[] args) {
        Tallspill tallSpill1 = new Tallspill();
        tallSpill1.kjørSpill();
    }
}

