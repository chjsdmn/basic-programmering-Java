package com.prog.arv;

class Jente{
    public String navn;
}

class Elev extends Jente{
    public String karakter;
}

class Klassepresident extends Elev{
    public String emne;
}

public class Hierarkier {
    public static void main(String[] args) {
        Klassepresident enElev = new Klassepresident();
        enElev.navn = "Lily";
        System.out.println(enElev.navn); //Lily
    }
}
