package com.prog.generics;

/** Generics泛型
 * 泛型方法
 * 写一个泛型方法，该方法在调用时可以接收不同类型的参数。
 * 根据传递给泛型方法的参数类型，编译器适当地处理每一个方法调用。
 * 参数只能代表引用型类型，不能是原始类型
 *
 * java 中泛型标记符：
 * E - Element (在集合中使用，因为集合中存放的是元素)
 * T - Type（Java 类）
 * K - Key（键）
 * V - Value（值）
 * N - Number（数值类型）
 * ? - 表示不确定的 java 类型
 */

// 泛型方法 printArray
public class Generiks {
    public static <E> void printArr(E[] arr){
        for(E element : arr){
            System.out.print(element +  " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[]  strArr = {"hello", "bye", "aha"};
        Double[] douArr = {1.1, 2.2, 3.3, 4.4};
        Character[] chaArr =  { 'H', 'E', 'L', 'L', 'O' };

        printArr(intArr);
        printArr(strArr);
        printArr(douArr);
        printArr(chaArr);
    }
}
