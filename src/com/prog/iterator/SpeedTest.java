package com.prog.iterator;

import java.util.*;

public class SpeedTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        long startTid = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            arrayList.add(i);
        }
        for (int i=0; i<10000; i++){
            arrayList.get(i);
        }
        long endTid = System.currentTimeMillis();

        System.out.println("ArrayList: " + (endTid - startTid));

        LinkedList<Integer> linkedList = new LinkedList();
        long startTid2 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            linkedList.add(i);
        }
        for (int i=0; i<10000; i++){
            linkedList.get(i);
        }
        long endTid2 = System.currentTimeMillis();

        System.out.println("LinkedList: " + (endTid2 - startTid2));

        LinkedList<Integer> linkedList2 = new LinkedList();
        long startTid4 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            linkedList2.add(i);
        }
        Iterator<Integer> it = linkedList2.iterator();
        while (it.hasNext()){
            it.next();
        }
        long endTid4 = System.currentTimeMillis();

        System.out.println("LinkedList med iterator: " + (endTid4 - startTid4));

        Vector<Integer> vector = new Vector<>();
        long startTid3 = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            vector.add(i);
        }
        for (int i=0; i<10000; i++){
            vector.get(i);
        }
        long endTid3 = System.currentTimeMillis();

        System.out.println("Vector: " + (endTid3 - startTid3));
    }
}
