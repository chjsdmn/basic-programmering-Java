package com.prog.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Collections 集合
 * Collection 接口又有 3 种子类型，List、Set 和 Queue，
 * 再下面是一些抽象类，最后是具体实现类，
 * 常用的有 ArrayList、LinkedList、HashSet、LinkedHashSet、HashMap、LinkedHashMap 等等。
 *
 * 以下仅以List为例，也同样适用于Set和Map
 * 0.Collections创建空集合，也可以创建单元素集合,
 *      List<String> list = Collections.emptyList();
 * 但使用List.of(T...)更方便，因为它既可以创建空集合，也可以创建单元素集合，还可以创建任意个元素的集合
 *
 * 1.Collections可以对List进行排序。因为排序会直接修改List元素的位置，因此必须传入可变List
 *      Collections.sort(list)
 *  排序的时候，如果type是class类型，要implements Comparable接口！！！！！
 *  因为Comparable 是在集合内部定义的方法实现的排序!!
 * 2.Collections提供了洗牌算法，即传入一个有序的List，可以随机打乱List内部元素的顺序
 *      Collections.shuffle(list)
 * 3.Collections还提供了一组方法把可变集合封装成不可变集合(详解见下面)
 *      Collections.unmodifiableList(list)
 * 4.Collections还提供了一组方法，可以把线程不安全的集合变为线程安全的集合
 *  因为从Java 5开始，引入了更高效的并发集合类，所以上述这几个同步方法已经没有什么用了。
 *      Collections.synchronizedList(List<T> list)
 * 还有很多很多用法，比如.reverse反转，.fill覆盖元素，.replaceAll替换元素，.copy拷贝list，.min最小值，.max最大值，。。。。
 */
class Frukt implements Comparable<Frukt>{
    public String navn;

    public Frukt(String navn){
        this.navn = navn;
    }

    public int compareTo(Frukt frukt){
        /*int comp = this.navn.compareTo(frukt.navn);
        if (comp == 0){
            return this.navn.compareTo(frukt.navn);
        }
        else return comp;*/
        //升序排列
        return this.navn.compareTo(frukt.navn);
    }

    public String toString(){
        return this.navn;
    }
}
public class Kollections {

    public static void main(String[] args) {
        //返回的集合是不可变集合，无法向其中添加或删除元素。
        List<String> list1 = List.of();
        List<String> list2 = List.of("a");
        List<String> list3 = List.of("c", "b", "a");
        List<String> list5 = Collections.emptyList();
        System.out.println(list1);  //[]
        System.out.println(list2);  //[a]
        System.out.println(list3);  //[c, b, a]
        System.out.println(list5);  //[]
        //报错！！因为list是不可变的
        //Collections.sort(list3);

        //1.Collections可以对List进行排序。
        // 因为排序会直接修改List元素的位置，因此必须传入可变List：!!!
        List<Frukt> list = new ArrayList<Frukt>();
        list.add(new Frukt("apple"));
        list.add(new Frukt("pear"));
        list.add(new Frukt("orange"));
        // 排序前: [apple, pear, orange]
        System.out.println(list);
        Collections.sort(list);
        // 排序后: [apple, orange, pear]
        System.out.println(list);

        //2.洗牌
        List <Integer> enlist = new ArrayList<>();
        for(int i=0; i < 10; i++){
            enlist.add(i);
        }
        //洗牌前：[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(enlist);
        Collections.shuffle(enlist);
        //洗牌后：[2, 6, 0, 5, 9, 1, 7, 8, 3, 4]
        System.out.println(enlist);

        /**3.Collections还提供了一组方法把可变集合封装成不可变集合：
         * immutable不能增删，
         * 对原始的list是可以增删的，但是会直接影响到封装后的“不可变”List
         * 解决方案： 立刻扔掉原始的mutable的引用: mutable=null
         */
        List<Frukt> immutable = Collections.unmodifiableList(list);
        System.out.println(immutable);  //[apple, orange, pear]
        list.add(new Frukt("kiwi"));
        // immutable.add("kiwi");       error! UnsupportedOperationException!
        System.out.println(list);  //[apple, orange, pear, kiwi]
        //immutable 变啦！！！
        //解决方案： 立刻扔掉原始的mutable的引用:
        //list = null;
        System.out.println(immutable);  //[apple, orange, pear, kiwi]
    }
}
