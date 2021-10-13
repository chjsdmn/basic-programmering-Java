package com.prog.kontrollstrukturer;

public class IfSetning {
    public static void main(String[] args) {
        boolean myndig = false;
        boolean myndig2 = true;

        if(myndig){  //myndig == true
            System.out.println("if(myndig) = if(Myndig == true)");
        }
        else{
            System.out.println("if(!myndig) = if(Myndig == false)");
        }
        if(!myndig2){  //myndig == false
            System.out.println("if(!myndig2) = if(Myndig2 == false)");
        }
        else{
            System.out.println("if(myndig2) = if(Myndig2 == true)");
        }
    }
}
