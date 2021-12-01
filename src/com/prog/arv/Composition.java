package com.prog.arv;

/**
 * Composition组合比arv继承更普遍被应用（在我们开发的这个level）
 * arv更常用于底层架构时
 * Composition er kanskje den vanligste måten å løse disse problemstillingene i koden som vi selv utvikler.
 * Arv blir absolutt også brukt, men da som oftest i bakenforliggende arkitekturer
 */

class Folk{
    public String navn;
    public String adresse;
    public String telefonnr;
}

//arv
class Student extends Folk{
    public String sNummer;
    public String studieNavn;

    public String toString(){
        return this.navn + " " + this.telefonnr + " " + this.studieNavn;
    }
}

class Lærer extends Folk{
    public String institutt;

    public String toString(){
        return this.navn + " " + this.telefonnr + " " + this.institutt;
    }
}

//composition
class Student2{
    public String sNummer;
    public String studieNavn;
    public Folk folk;

    Student2(){
        this.folk = new Folk(); //这个Folk的实例一定要叫, 否则这个类的实例无法使用folk这个属性!!!!
    }
    public String toString(){
        return folk.navn + " " + folk.telefonnr + " " + this.studieNavn;
    }
}

class Lærer2{
    public String institutt;
    public Folk folk;

    Lærer2(){
        this.folk = new Folk();  //这个Folk的实例一定要叫, 否则这个类的实例无法使用folk这个属性!!!!
    }

    public String toString(){
        return folk.navn + " " + folk.telefonnr + " " + this.institutt;
    }
}

public class Composition {
    public static void main(String[] args) {
        //arv
        Student student = new Student();
        student.navn = "Ole";
        student.studieNavn = "IT";
        Lærer lærer = new Lærer();
        lærer.telefonnr = "1234567";
        lærer.institutt = "UIO";
        System.out.println(student); //Ole null IT
        System.out.println(lærer);   //null 1234567 UIO

        //composition
        Student2 student2 = new Student2();
        student2.folk.navn = "Kari"; //如果在Student2的构造函数里不叫Folk的实例，那么这里就会报错，说student2.folk是null！！！！
        student2.studieNavn = "UX Desigen";
        Lærer2 lærer2 = new Lærer2();
        lærer2.folk.telefonnr = "7654321"; //如果在Lærer2的构造函数里不叫Folk的实例，那么这里就会报错，说lærer2.folk是null！！！！
        lærer2.institutt = "OsloMet";
        System.out.println(student2); //Kari null UX Desigen
        System.out.println(lærer2);   //null 7654321 OsloMet
    }
}
