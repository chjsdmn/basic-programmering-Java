package com.prog.Array1;
/**
 * 泛型排序  public static <T> void sort(T[] a, Comparator<? super T> c)
 * public static <T> void sort(T[] a, int fromIndex, int toIndex,  Comparator<? super T> c) 给出指定范围
 * 默认是升序排序，但是对其排序内部的比较函数compare()进行重写，可以自己自定义成降序排序
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays.sort(arr)  按照从小到大的顺序排列
 * Arrays.sort(int[] a, int fromIndex, int toIndex) [fromIndex, toIndex) halvåpent array
 */
public class ArraySort {
    public static void main(String[] args) {
        Integer[] a = {8,3,0,-1,45,100,-20,42,78,-2};  //int要写成Integer！
        Arrays.sort(a, a.length -3, a.length);  //只排了后三位，[fromIndex, toIndex)
        printing(a);   //8 3 0 -1 45 100 -20 -2 42 78
        Arrays.sort(a);  //从小到大依次排列
        printing(a);   //-20 -2 -1 0 3 8 42 45 78 100
        Comparator<Integer> cmp = new myComparator();  //创建一个自定义类myComparator的对象
        Arrays.sort(a, cmp);  //降序排列
        printing(a);  //100 78 45 42 8 3 0 -1 -2 -20
    }
    static void printing(Integer[] a){
        for(int item : a){
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
/**
 * Arrays.sort()只能升序排列,
 * 如果要降序排列就要加一个Comparator类型的参数
 */
class myComparator implements Comparator<Integer>{  //让自定义的类实现Comparator这个接口
    @Override  //重写这个方法
    public int compare(Integer o1, Integer o2){
        //通过颠倒大小，实现降序排列
        if(o1 < o2){
            return 1;
        }
        else if(o1 > o2){
            return -1;
        }
        else{
            return 0;
        }
    }
}