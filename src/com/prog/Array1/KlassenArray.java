package com.prog.Array1;

import java.util.Arrays;

public class KlassenArray {
    public static void main(String[] args) {

        int[] list = {8,3,0,-1,45,100,-20};
        System.out.println(Arrays.binarySearch(list, 9));  //-5，没有sort就binarySearch，结果不对！！
        /**
         * Arrays.sort(arr)  按照从小到大的顺序排列
         * Arrays.sort(int[] a, int fromIndex, int toIndex) [fromIndex, toIndex) halvåpent array
         */
        Arrays.sort(list); //按照从小到大的顺序排列
        System.out.println("Adressen av list: " + list);
        printing(list);
        /**
         * Arrays.copyOf(需要被copy的arr, 需要copy这个arr的长度，如果新数组的长度超过原数组的长度，则写成0，-20 -1 0 3 8 45 100 0 0 0 0 0 0 )
         */
        int[] list2 = Arrays.copyOf(list, list.length);  //list2的地址和list不同，Arrays.copyOf只是copy了值/内容
        System.out.println("Adressen av list2: " + list2);
        printing(list2);
        /**
         * arr1 = arr2
         * char[] char1 = char2....
         * 指向同一地址，一个变，另一个也变
         */
        int[] list3 = list2; //list3的地址和list2相同，因为两个list指针指向了同一个地址！！
        System.out.println("Adressen av list3: " + list3);
        printing(list3);
        list2[0] = -10;
        printing(list2); //两个list的第一项都变成了0，因为指针指向同一地址，所以一个变，另外一个也变
        printing(list3);
        /**
         * 需要用sort()方法将数组排序，如果数组没有排序，则结果是不确定的!!
         * Arrays.binarySearch(arr，arr中的值)
         * 存在返回这个值在arr中的index，不存在返回-1或者”-“+插入点(从1开始算，不是从0！!)
         * 不存在时由1开始计数；存在时由0开始计数。
         * 所以调用binarySearch()方法前要先调用sort方法对数组进行排序，否则得出的返回值不定，这时二分搜索算法决定的！！
         */
        int indeks = Arrays.binarySearch(list, 100);
        System.out.println("Indeksen til 100 i list er: " + indeks);  //6
        int indeks2 = Arrays.binarySearch(list, 1100); //-8，不存在就返回-1或者”-“+插入点(从1开始算，不是从0！！！！)
        System.out.println("Indeksen til -100 i list er: " + indeks2); //-1
        /**
         * Arrays.equals(arr1，arr2)
         * 比较两个array中的值/内容是否相同
         */
        boolean boo = Arrays.equals(list2, list);  //比较两个array的内容！
        System.out.println(boo);  //false

    }
    /**
     * for each loop，但是取不到index
     */
    static void printing(int[] a){
        for(int item : a){
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
