package com.prog.merobjekter2;

/**
 * ... 可变长度参数列表, 相当于一个没有给定长度的array
 * 接受的参数为0到多个Object类型的对象，但是类型要相同
 */
public class UlikeAntallParameter {
    public static void main(String[] args) {
        System.out.println(antallSek(24, 60, 3));   //90003
        System.out.println(antallSek(23, 59, 59));  //86399
        System.out.println(antallSek(2));           //7200
        System.out.println(antallSek(1,1));        //3660
        System.out.println(antallSek());           //0

        antallMat("ris", "noodle", "shusi");    //ris noodle shusi
        antallMat("ris", "noodle");             //ris noodle
        antallMat("ris");                       //ris
        antallMat();                            //
    }

    public static int antallSek(int ... tid){
        int total = 0;
        int faktor = 3600;
        for(int antall : tid){
            total += antall * faktor;
            faktor /= 60;
        }
        return total;
    }

    public static void antallMat(String ... mat){
        for(int i = 0; i < mat.length; i++){
            System.out.print(mat[i] + " ");
        }
        System.out.println();
    }
}
