package com.prog.merobjekter1;

class Dato{
    private  int dag, måned, år;
    public Dato(int dag, int måned, int år){
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }
    private static String månedNavn(int mnd){
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if(mnd > 0 && mnd < 13){
            return navn[mnd - 1];
        }
        else{
            return "ukjent måned";
        }
    }

    public String toString(){
        String monthNavn = månedNavn(this.måned);
        String ut = dag + " " + monthNavn + " " + this.år;
        return ut;
    }
}

class Car{
    private String typeBetegnelse, kjennetegn;
    private Dato førstegangsRegistert;
    Car(String typeBetegnelse, Dato førstegangsRegistert, String kjennetegn){
        this.typeBetegnelse = typeBetegnelse;
        this.førstegangsRegistert = førstegangsRegistert;
        this.kjennetegn = kjennetegn;
    }
    public String toString(){
        return "Bilen type er " + typeBetegnelse + ", registert " + førstegangsRegistert + ", kjennetegn er " + kjennetegn;
    }
}

public class MotorvognReg {
    public static void main(String[] args) {
        Dato dato1 = new Dato(14, 2, 2021);
        Dato dato2 = new Dato(6, 1, 2019);
        Dato dato3 = new Dato(16, 10, 2020);
        //System.out.println(dato1);

        Car[] biler = new Car[100];  //建立Car array
        biler[0] = new Car("Audi 6", dato1, "A28193");
        biler[1] = new Car("Toyota X8", dato2, "A20063");
        biler[2] = new Car("BMW XS", dato3, "A79281");

        for(Car item : biler){
            if(item != null) {   //因为设置了Car array有100个item，但是只赋值了3个item，所以只打印不为null的item
                System.out.println(item);
            }
        }
    }
}
