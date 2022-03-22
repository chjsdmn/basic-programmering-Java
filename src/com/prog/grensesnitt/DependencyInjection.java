package com.prog.grensesnitt;

/**
 * Dependency Injection
 * 依赖注入
 */
interface SendMelding{
    void send(String melding); //接口中的方法都是隐式public abstract，所以定义的时候不用写public
}

class Epost implements SendMelding{
    public void send(String melding){
        System.out.println("Epost har sendt melding: " + melding);
    }
}

class Sms implements SendMelding{
    public void send(String melding){
        System.out.println("SMS har sendt melding: " + melding);
    }
}

class Melding{  //这个相当于composition啊~~
    //貌似是松耦合?? 因为interface的type成为这个class的一个属性
    private final SendMelding meldingType;  //vet ikke hvorfor bruker final

    //constructor
    public Melding(SendMelding meldingType){
        this.meldingType = meldingType;
    }

    public void harSendt(String melding){
        meldingType.send(melding);
    }
}

public class DependencyInjection {
    public static void main(String[] args) {
        SendMelding epost = new Epost();
        SendMelding sms = new Sms();
        Melding en = new Melding(epost);
        Melding to = new Melding(sms);
        en.harSendt("Hello world.");  //Epost har sendt melding: Hello world.
        to.harSendt("Hey, dependency injection.");  //SMS har sendt melding: Hey, dependency injection.
    }
}
