package com.prog.aritmetikk;

public class IfUtenElse {
    public static void main(String[] args) {
        ifUtenElse();   //8
        ifMedElse();    //6
    }
    static void ifUtenElse(){
        int x = 5;
        if(x != 0){  //因为没有else，所以走完这里，继续往下走
            x++;  //6
        }
        x += 2;  // 6 + 2 = 8
        System.out.println(x);
    }
    static void ifMedElse(){
        int x = 5;
        if(x != 0){  //因为有else，所以走完这里，就不走else了
            x++;  // 6
        }
        else {  //跳过
            x += 2;
        }
        System.out.println(x);  //打印x = 6
    }

}
