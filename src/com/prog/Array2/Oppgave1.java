package com.prog.Array2;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> helTall = new ArrayList<>();
        helTall.add(1);
        helTall.add(2);
        helTall.add(3);
        helTall.add(4);
        helTall.add(5);
        helTall.add(6);
        helTall.add(7);
        helTall.add(8);
        helTall.add(9);
        helTall.add(10);
        helTall.add(11);
        System.out.println(helTall.get(2));
        System.out.println(helTall.get(5));
        int index1 = helTall.indexOf(2);
        helTall.remove(index1);  //注意！！remove的时候不要写在一起，因为在删除一个之后index会发生变化！
        int index2 = helTall.indexOf(3);
        helTall.remove(index2);
        for(int i = 0; i < helTall.size(); i++){
            System.out.print(helTall.get(i) + " ");   //用.get()来分别获取每一个元素
        }
    }
}
