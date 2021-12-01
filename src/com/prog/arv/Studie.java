package com.prog.arv;

class Perso{
    public String navn;
    public String adresse;
    public String telefonnr;
}

//arv

class Studen extends Perso{

    public String sNummer;
    public String studieNavn;

    public String toString(){
        return this.navn + " " + this.telefonnr + " " + this.studieNavn;
    }


}

class Ansat extends Perso {
    public String ansattVedInstitutt;

    public String toString(){
        return this.navn + " " + this.telefonnr + " " + this.ansattVedInstitutt;
    }
}

// composition

class Student1 {

    public String sNummer;
    public String studieNavn;
    public Perso person;

    public Student1(String sNummer, String studieNavn) {
        this.sNummer = sNummer;
        this.studieNavn = studieNavn;
        this.person = new Perso();  //这个Perso的实例一定要叫，否则后面如果要用到Ansatt1的实例的.person会报错，说实例.person is null!!!!!
    }

    public String toString(){
        return person.navn + " " + person.telefonnr + " " + this.studieNavn;
    }
}

class Ansatt1 {
    public String ansattVedInstitutt;
    public Perso person;

    public Ansatt1(String ansattVedInstitutt){
        this.ansattVedInstitutt = ansattVedInstitutt;
        this.person = new Perso(); //这个Perso的实例一定要叫，否则后面如果要用到Ansatt1的实例的.person会报错，说实例.person is null!!!!!
    }
    public String toString(){
        return person.navn + " " + person.telefonnr + " " + this.ansattVedInstitutt;
    }
}

public class Studie {

    public static void main(String[] args) {
        //arv
        Studen enStudent = new Studen();
        enStudent.navn = "Ole";
        enStudent.studieNavn = "UX designer";
        Ansat enAnsatt = new Ansat();
        enAnsatt.navn = "Kari";
        enAnsatt.ansattVedInstitutt="OsloMet";
        System.out.println(enStudent);  //Ole null UX designer
        System.out.println(enAnsatt);   //Kari null OsloMet

        //composition
        Student1 enAnnenStudent = new Student1("123", "IT");
        Ansatt1 enAnnenAnsatt = new Ansatt1("UIO");
        System.out.println(enAnnenStudent);  //null null IT
        System.out.println(enAnnenAnsatt);   //null null UIO

        enAnnenStudent.person.navn = "Per";
        enAnnenAnsatt.person.navn = "Line";
        System.out.println(enAnnenStudent);  //Per null IT
        System.out.println(enAnnenAnsatt);   //Line null UIO

    }

}
