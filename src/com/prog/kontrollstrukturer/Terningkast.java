package com.prog.kontrollstrukturer;

import java.security.SecureRandom;

/** SecureRandom class
 * SecureRandom tilfeldigTall = new SecureRandom();
 * tilfeldigTall.nextInt(n) -> return [0, n-1]
 */
public class Terningkast {
    public static void main(String[] args) {
        terningkast();
        terningkast2();
    }
    public static void terningkast(){
        int kastGanger = 10;
        int kast;
        int terning1 = 0;
        int terning2 = 0;
        int terning3 = 0;
        int terning4 = 0;
        int terning5 = 0;
        int terning6 = 0;
        SecureRandom tilfeldigTall = new SecureRandom();
        for(int i  = 0; i < kastGanger; i++){
            kast = tilfeldigTall.nextInt(6); // 0 - 5
            kast++;
            if(kast == 1){
                terning1 ++;
            }
            else if(kast == 2){
                terning2 ++;
            }
            else if(kast == 3){
                terning3 ++;
            }
            else if(kast == 4){
                terning4 ++;
            }
            else if(kast == 5){
                terning5 ++;
            }
            else{
                terning6 ++;
            }
        }
        System.out.println("terning1 = " + terning1);
        System.out.println("terning2 = " + terning2);
        System.out.println("terning3 = " + terning3);
        System.out.println("terning4 = " + terning4);
        System.out.println("terning5 = " + terning5);
        System.out.println("terning6 = " + terning6);
    }
    public static void terningkast2(){
        int kastGanger = 10;
        int kast;
        int terning1 = 0;
        int terning2 = 0;
        int terning3 = 0;
        int terning4 = 0;
        int terning5 = 0;
        int terning6 = 0;
        SecureRandom tilfeldigTall = new SecureRandom();
        for(int i  = 0; i < kastGanger; i++){
            kast = tilfeldigTall.nextInt(6); // 0 - 5
            kast++;
            switch (kast) {
                case 1:
                    terning1++;
                    break;
                case 2:
                    terning2++;
                    break;
                case 3:
                    terning3++;
                    break;
                case 4:
                    terning4++;
                    break;
                case 5:
                    terning5++;
                    break;
                default:
                    terning6++;
                    break;
            }
        }
        System.out.println("terning1 = " + terning1);
        System.out.println("terning2 = " + terning2);
        System.out.println("terning3 = " + terning3);
        System.out.println("terning4 = " + terning4);
        System.out.println("terning5 = " + terning5);
        System.out.println("terning6 = " + terning6);
    }
}
