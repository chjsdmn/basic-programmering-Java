package com.prog.generics;

import java.util.ArrayList;
import java.util.List;

/** wildcard/jokertegn/通配符
 * 类型通配符一般是使用 ? 代替具体的类型参数。
 * 例如 List<?> 在逻辑上是 List<String>,List<Integer> 等所有 List<具体类型实参> 的父类。
 *
 * 通配符上限:
 * 类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型。
 *  List<? extends Number> parameter
 *
 *  通配符下限:
 *  类型通配符下限通过形如 List<? super Number> 来定义，
 *  表示类型只能接受 Number 及其上层父类类型，如 Object 类型的实例。
 */
public class Wildcard {

    public static void getData(List<?> data){
        System.out.println(data.get(0));
    }

    //参数已经限定了参数泛型上限为 Number，所以泛型为 String 是不在这个范围之内，所以会报错。
    public static void getNumber(List<? extends Number> data){
        System.out.println(data.get(0));
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();

        name.add("Cathy");
        age.add(28);
        number.add(101);

        getData(name);  //Cathy
        getData(age);   //28
        getData(number);  //101

        //getNumber(name); ERROR!!!
        getNumber(age);  //28
        getNumber(number);  //101
    }
}
