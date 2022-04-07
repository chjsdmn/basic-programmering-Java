package com.prog.iterator;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *Iterable接口里有一个方法iterator
 * Iterator里面有hasNext（）和next（）方法
 * 参考下列实例，如果一个类implements Iterable，除了要更新public Iterator<T> iterator()方法，
 * 里面还要有一个private class 用来 implements Iterator接口。。。。
 *
 * 迭代（iterable）linkedlist要比遍历（for loop，.get()）快很多！
 * 因为遍历每次都要从第一个node开始走起
 * 但是迭代是如果hasNext，就next，不需要每次都从第一个开始
 *
 */

class IterTest<T> implements Iterable<T>{

    //经常这样定义 private final，也不知道为啥。。。
    private final LinkedList<T> linkedList;

    public IterTest(){
        this.linkedList = new LinkedList<>();
    }

    public LinkedList<T> leggTil(T str){
        linkedList.add(str);
        return linkedList;
    }

    public String toString(){
        String ut = "";
        for(int i=0; i < linkedList.size(); i++){
            ut += linkedList.get(i) + " ";
        }
        return ut;
    }


    @Override
    //倒序遍历集合
    public Iterator<T> iterator() {
        return new IterTestIterator(linkedList.size());
    }

    private class IterTestIterator implements Iterator<T>{
        int index;

        public IterTestIterator(int index) {
            this.index = index;
        }

        public boolean hasNext(){
            return index > 0;
        }

        public T next(){
            index--;
            return IterTest.this.linkedList.get(index);
        }

    }
}

public class IteratorLinkedList {
    public static void main(String[] args) {
        IterTest<String> test = new IterTest<>();
        test.leggTil("apple");
        test.leggTil("banana");
        test.leggTil("kiwi");
        test.leggTil("pear");

        Iterator<String> it = test.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }



}
