package com.prog.Array2;

import java.util.ArrayList;  //import ArrayList 类
/**
 * ArrayList 类是一个可以动态修改的数组，与普通数组的区别就是它是没有固定大小的限制，我们可以添加或删除元素.
 * ArrayList<E> objectName =new ArrayList<可写可不写>();　 // 初始化
 * E: 泛型数据类型，用于设置 objectName 的数据类型，只能为引用数据类型, 比如类名，或者Integer，String等
 * ArrayList er en type av collection wom er en samling objekter lagret på en strukturt måte
 */
class Bil{
    public String farge;
    public int[] priser = new int[5];
}

public class ArrayListe {
    public static void main(String[] args) {
        ArrayList<Bil> biler = new ArrayList<>();  //create an ArrayList, datatype is Bil

        Bil toyota = new Bil();
        toyota.farge = "hvite";
        toyota.priser[0] = 300_000;
        toyota.priser[1] = 380_000;

        Bil honda = new Bil();
        honda.farge = "rød";
        honda.priser[0] = 200_000;
        honda.priser[1] = 280_000;
        /** Add
         * .add(verdi);
         */
        biler.add(toyota);    //ArrayList 自带方法，向末尾添加元素
        biler.add(honda);

        for(Bil en : biler){
            System.out.println(en.farge);
            System.out.println(en.priser[0]);
            System.out.println(en.priser[1]);
            System.out.println("--------------------");
        }

        for (int i = 0; i < biler.size(); i++){
            System.out.println(biler.get(i).farge + " " + biler.get(i).priser[0] + " " + biler.get(i).priser[1]);
        }
        System.out.println("--------------------");

        /** Delete
         * .remove(index/verdi);
         * 如果是Integer的ArrayList就只能用.remove(index),
         * 所以要先用.indexOf(verdi), 得到index，再remove
         */
        biler.remove(toyota);   // == biler.remove(0)
        biler.add(honda);

        for(Bil en : biler){
            System.out.println(en.farge);
            System.out.println(en.priser[0]);
            System.out.println(en.priser[1]);
            System.out.println("--------------------");
        }
        /** Length
         * .size();
         */
        System.out.println(biler.size());

        /** Delete all
         * .clear();
         */
        biler.clear();
        System.out.println(biler.size());

//-----------Andre eksampel----------------------------------------------------------------------------------------------------
        ArrayList<String> names= new ArrayList<String>();
        names.add("Jacky");
        names.add("Lee");
        names.add("Jessy");
        names.add("Ole");
        /** search data
         * .get(index);
         */
        System.out.println(names.get(1));   //Lee
        /** modify data
         * .set(index, newData);
         */
        names.set(2, "Lucy");   // Jessy is changed into Lucy'
        for(String name : names) {
            System.out.print(name + " ");  // Jacky Lee Lucy Ole
        }
        System.out.println();

        /** delete data
         * .remove(verdi);
         */
        names.remove("Lucy");
        for(String name : names) {
            System.out.print(name + " ");  // Jacky Lee Ole
        }
        System.out.println();
        /** delete data
         * .remove(index);
         */
        names.remove(0);
        for(String name : names) {
            System.out.print(name + " ");  // Lee Ole
        }
        System.out.println();
        /** check if data exists
         * .contains(verdi);
         * return false/true
         */
        System.out.println(names.contains("Lee"));  //true
        /** return index
         * .indexOf(verdi);
         * -1 betyr finnes ikke!
         */
        System.out.println(names.indexOf("Lee"));   //0
        System.out.println(names.indexOf("Lily"));  //-1
        /** 将动态数组中的容量调整为数组中的元素个数, 即删除后优化内存
         * 没有返回值，仅更改 arraylist 的容量。
         * .trimToSize();
         */
        names.trimToSize();
        System.out.println(names);  // [Lee, Ole]
    }

}
