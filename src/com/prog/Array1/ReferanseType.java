package com.prog.Array1;

/**
 * 引用类型Reference是一种对象类型,它的值是指向内存空间的引用，就是地址
 */
public class ReferanseType {
    public static void main(String[] args) {
        /**
         * 都变了，相当于KlassenArray.java里面的 list3 = list2，是copy的地址
         */
        char[] x = {'A', 'B', 'C'};
        char[] y = x;
        x[1] = 'b';
        System.out.println(x); //AbC
        System.out.println(y); //AbC

        int[] a = {1,2,3,4};
        a[1] = 200;
        priting(a); //1 200 3 4
        endring(a); //因为传进去的是引用类型，指针指向同一地址，所以int数组a被函数endring改变了
        priting(a); //100 200 3 4
    }
    static void endring(int[] a){
        a[0] = 100;
    }
    static void priting(int[] a){
        for(int item : a){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
