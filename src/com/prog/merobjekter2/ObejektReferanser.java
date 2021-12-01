package com.prog.merobjekter2;

class Bil{
    String type;
    Bil(String type){
        this.type = type;
    }
}

public class ObejektReferanser {
    public static void main(String[] args) {
        Bil volvo = new Bil("volvo");   //330
        System.out.println("volvo: " + volvo);

        bytteType(volvo);
        System.out.println(volvo.type);   //audi!!!!!
        System.out.println("volvo: " + volvo);   //330
    }

    public static void bytteType(Bil enBil){
        //enBil copy了 volvo这个对象，所以是跟volvo指向同一地址
        System.out.println("enBil: " + enBil);  //330

        //因为是同一地址，当enBil的type改变的时候，volvo的type也改变了
        enBil.type = "audi";
        System.out.println("enBil: " + enBil);  //330

        //创建新的对象，指向新的地址
        Bil BMW = new Bil("BMW");

        //enBil于对象BMW指向同一地址，但是注意，volvo的地址并没有改变，仍然是047！！！！
        enBil = BMW;
        System.out.println("BMW: " + BMW);   //047
        System.out.println("enBil: " + enBil);   //047
    }
}
