package com.prog.merobjekter2;

/**
 * overloading
 * har flere metoder med samme navn, 很多方法同名，但是里面参数的个数不同，或者参数的类型不同
 * men de har forskjellige antall parameterer
 * eller at parameterende har forskjellig typer.
 * 函数的返回值类型也要相同！！！
 */
public class Overloading {
    public static void main(String[] args) {
        summen(2,3,5);   //10
        summen(2,3);     //5
        summen("2", "3", "5");  //235
        summen("a", "b", "c");  //abc
        System.out.println(summen(19));   //19 这个不是overloading，因为他的返回值与其他方法不同！！！
    }

    public static void summen(int tall1, int tall2, int tall3){
        System.out.println(tall1 + tall2 + tall3);
    }

    public static void summen(int tall1, int tall2){
        System.out.println(tall1 + tall2);
    }

    public static void summen(String tall1, String tall2, String tall3){
        System.out.println(tall1 + tall2 + tall3);
    }

    public static int summen(int tall){
        return tall;
    }
}
