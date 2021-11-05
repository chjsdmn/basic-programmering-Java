package com.prog.merobjekter1;

/**
 * static attribute 在使用的时候都要有类名.+ attribute名的形式
 * 因为static attribute是属于class的，而不是属于某一个实例的！！！
 */
class Bil{
    String merke;
    /**当变量设置成static final的时候，这就是一个常量。
     * 1. 名称都用大写  STORE_BOKSTAVER
     * 2. 用的时候直接类名.+ 常量名(Bil.ANTALL_HJUL)，不需要用实例名.+常量名
     */
    static final int ANTALL_HJUL = 4; //当变量设置成static final的时候，这就是一个常量，名称都用大写
    /**
     * 没有final修饰符的static attribute可以更改，但是同static final一样，修改和使用的时候都用类名.+的方式
     *
     */
    static int antallHjul = 4;

    public String toString(){
        String ut = merke + " har ANTALL_HJUL: " + ANTALL_HJUL + ", og antallHjul: " + antallHjul;
        return ut;
    }
}
public class StatiskeVariabler {
    public static void main(String[] args) {
        Bil enBil = new Bil();
        enBil.merke = "Toyota";
        //Bil.ANTALL_HJUL = 4;  ERROR!!!因为常量不需要再赋值了
        System.out.println(enBil);  //Toyota har ANTALL_HJUL: 4, og antallHjul: 4

        enBil.merke = "Honda";
        //Bil.ANTALL_HJUL = 3;  ERROR!!!因为常量不需要再赋值了
        System.out.println(enBil);   //Honda har ANTALL_HJUL: 4, og antallHjul: 4

        enBil.merke = "Peng";
        Bil.antallHjul = 3;  //因为没有final，不是常量，所以可以更改 :)
        System.out.println(enBil);  //Peng har ANTALL_HJUL: 4, og antallHjul: 3

    }
}
