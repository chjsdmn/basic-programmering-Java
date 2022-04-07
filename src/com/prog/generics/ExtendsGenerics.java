package com.prog.generics;

/** 泛型方法
 * 有界的类型参数:
 * 可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围。
 * 例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的.
 * 要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。
 */

/** 声明泛型
 *
 * <T extends Comparable<T>>
 *
 * 在class里声明的时候，写在class名字的后面：
 * class extendsGenerics <T extends Comparable<T>> {...}
 * 注意：如果class里有static方法，那么就不能在class里声明。因为静态方法在内存中有一个固定的地址（具体我也不知道有什么直接联系。。。）
 *
 * 在方法里声明的时候，写在方法名的前面：
 * <T extends Comparable<T>> T maximum(){...}
 *
 */
public class ExtendsGenerics {
    // 比较三个值并返回最大值
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;  //假设x是初始最大值
        if(y.compareTo(max) > 0){
            max = y; //y 更大
        }
        if(z.compareTo(max) > 0){
            max = z;  //现在 z 更大
        }
        return max;  //返回最大对象
    }

    public static void main(String[] args) {
        System.out.println(maximum(5,9, 2));
        System.out.println(maximum("hello", "bye", "aha"));
        System.out.println(maximum(2.6, 7.9, 9.1));
    }
}
