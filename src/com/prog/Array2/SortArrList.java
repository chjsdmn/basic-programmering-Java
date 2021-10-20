package com.prog.Array2;

import java.util.*;

/**
 * Integer ArrayList
 * .remove(index); !!!!
 * Collections.sort(list);
 * imort java.util.*; !!!!
 */
public class SortArrList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(22);
        a.add(16);
        a.add(-35);
        int indeks = a.indexOf(22);
        a.remove(indeks);
        Collections.sort(a);
        System.out.println(a); //[-35, 5, 16]

        ArrayList<String> s = new ArrayList<>();
        s.add("hei");
        s.add("god");
        s.add("new");
        s.add("bye");
        System.out.println("Before sort: " + s);

        /** String ArrayList
         * 引入Comparator - 顺序方式
         * Comparator.naturalOrder() 元素进行升序排列（自然顺序）
         * Comparator.reverselOrder() 元素进行降序排列
         */
        s.sort(Comparator.naturalOrder());
        System.out.println("After naturalOrder sort: " + s);  //[bye, god, hei, new]
        s.sort(Comparator.reverseOrder());
        System.out.println("After reverseOrder sort: " + s);  //[new, hei, god, bye]
    }
}
