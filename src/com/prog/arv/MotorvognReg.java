package com.prog.arv;

class Dato{
    private int dag, måned, år;
    public Dato(int dag, int måned, int år){
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    public String month(int måned){
        String[] monthNavn = {"januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember"};
        if(måned > 0 && måned < 13){
            return monthNavn[måned - 1];
        }
        else {
            return "ukjent måned";
        }
    }

    public String toString(){
        return this.dag + "-" + this.month(this.måned) + "-" + this.år;  //可以这里这样直接带入，可以都不用写this.
    }
}

class Kjøretøy{
    protected int tankVolum;
    protected int antallHjul;
    protected String farge;

    public Kjøretøy(int tankVolum, int antallHjul, String farge) {
        this.tankVolum = tankVolum;
        this.antallHjul = antallHjul;
        this.farge = farge;
    }

    public String toString(){
        return this.tankVolum + " " + this.antallHjul + " " + this.farge;
    }
}

class Bil extends Kjøretøy{
    protected String typebetegnelse;
    protected Dato førstegangsregisterering;
    protected String kjennetegn;
    protected int lastekapasitet; //kg

    public Bil(int tankVolum, int antallHjul, String farge, String typebetegnelse, Dato førstegangsregisterering, String kjennetegn, int lastekapasitet){
        super(tankVolum, antallHjul, farge);
        this.typebetegnelse = typebetegnelse;
        this.førstegangsregisterering = førstegangsregisterering;
        this.kjennetegn = kjennetegn;
        this.lastekapasitet = lastekapasitet;
    }

    public String toString(){
        String ut = super.toString();  //也可以如此来定义toString()方法！！
        ut += this.førstegangsregisterering + " " + this.kjennetegn + " " + this.lastekapasitet;
        return ut;
    }
}

class Motorsykkel extends Kjøretøy{
    protected String typebetegnelse;
    protected Dato førstegangsregisterering;
    protected String kjennetegn;

    public Motorsykkel(int tankVolum, int antallHjul, String farge, String typebetegnelse, Dato førstegangsregisterering, String kjennetegn){
        super(tankVolum, antallHjul, farge);
        this.typebetegnelse = typebetegnelse;
        this.førstegangsregisterering = førstegangsregisterering;
        this.kjennetegn = kjennetegn;
    }

    public String toString(){  //也可以如此来定义toString()方法！！
        String ut = super.toString();
        ut += this.typebetegnelse + " " + this.førstegangsregisterering + " " + this.kjennetegn;
        return ut;
    }
}

public class MotorvognReg {
    public static void main(String[] args) {
        Dato datoTilBil = new Dato(14, 12, 1990);
        Dato datoTilMotor = new Dato(1, 1, 1991);
        Kjøretøy enBil = new Bil(100, 4, "rød", "Xpeng", datoTilBil, "4wd", 1000);
        Kjøretøy enMotorsykkel = new Motorsykkel(80, 2, "blå", "Honda", datoTilMotor, "4wd");
        Kjøretøy[] liste = new Kjøretøy[10];
        liste[0] = enBil;
        liste[1] = enMotorsykkel;
        for(int i = 0; i < liste.length; i++){
            if(liste[i] != null){
                System.out.println(liste[i]);
                //100 4 rød Xpeng 14-desember-1990 4wd 1000
                //80 2 blå Honda 1-januar-1991 4wd
            }
        }
    }
}
