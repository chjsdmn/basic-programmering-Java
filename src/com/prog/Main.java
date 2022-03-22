package com.prog;

import java.util.ArrayList;

class Person{
    private String navn;
    private String adresse;
    private String telefonnr;
    public Person(String navn, String adresse, String telefonnr){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }
    public String toString(){
        String ut = "Navn: " + navn + "\nAdresse: " + adresse + "\nTelefonnr: " + telefonnr;
        return ut;
    }
}
class Student extends Person{
    private String studentnr;
    private String studienavn;
    public Student(String navn, String adresse, String telefonnr, String studentnr, String studienavn){
        super(navn, adresse, telefonnr);
        this.studentnr = studentnr;
        this.studienavn = studienavn;
    }
    public String toString(){
        String ut = "Student: \n" + super.toString();
        ut += "\nStudentnr: " + studentnr + "\nStudienavn: " + studienavn;
        return ut;
    }
}
class Ansatt extends Person{
    private String intituttnavn;
    private double lonn;
    public Ansatt(String navn, String adresse, String telefonnr, String intituttnavn, double lonn){
        super(navn, adresse, telefonnr);
        this.intituttnavn = intituttnavn;
        this.lonn = lonn;
    }
    public String toString(){
        String ut = "Ansattt: \n" + super.toString();
        ut += "\nIntituttnavn: " + intituttnavn + "\nLonn: " + lonn;
        return ut;
    }
}
public class Main{
    public static void main(String[] args){
        Student student = new Student("Per", "Osloveien 50", "98756311", "s95578", "IT");
        Ansatt ansatt = new Ansatt("Kari", "Bergenveien 29c", "86745723", "UIO", 60000.0);
        ArrayList<Person> list = new ArrayList<>();
        list.add(student);
        list.add(ansatt);
        for(Person en : list){
            System.out.println(en);
        }
    }
}

