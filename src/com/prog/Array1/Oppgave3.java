package com.prog.Array1;

public class Oppgave3 {
    public static void main(String[] args) {
        String[] str = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};
        /*for(int i = 0; i < str.length;){
            for(int j = 0; j < 2; j++){
                if((i + j) < str.length) {
                    System.out.print(str[i + j] + " ");
                }
            }
            System.out.println();
            i+=2;
        }*/
        for(int i = 0; i < str.length; i+=2) {  //mye bedre enn ovenfor!!!!!
                    System.out.println(str[i] + " " + str[i+1]);   //i + 1!
                }
        }


}
