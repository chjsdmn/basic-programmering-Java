package com.prog.kontrollstrukturer;

import java.security.SecureRandom;
import java.util.Random;

public class Ramdom {
    public static void main(String[] args) {
        ran();
        secRan();
    }
    public static void ran(){
        Random a = new Random();
        Random b = new Random();
        Random c = new Random(10);
        Random d = new Random(10);
        for(int i = 0; i < 10; i++){
            System.out.println(a.nextInt() + " != " + b.nextInt());
            System.out.println(c.nextInt() + " == " + d.nextInt());  //种子相同，所以每次c和d都相等
        }
    }
    public static void secRan(){
        SecureRandom a = new SecureRandom();
        SecureRandom b = new SecureRandom();
        for(int i = 0; i < 10; i++){
            System.out.println(a.nextInt() + " != " + b.nextInt());
        }
    }
}
