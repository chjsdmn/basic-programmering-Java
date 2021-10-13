package com.prog.objekter2;

class Bil{
    public String farge;
    public int HP;
    public Bil(String farge, int HP){   //constructor，首字母大写，与class完全同名
        this.farge = farge;
        if(HP > 0) {  //如果set方法里check了输入值，则constructor里也要check， 否则set的check不起作用了。。。
            this.HP = HP;
        }
    }
    public void setFarge(String farge){
        this.farge = farge;
    }
    public String getFarge(){
        return farge;
    }
    public void setHP(int HP){
        if(HP > 0) {
            this.HP = HP;
        }
    }
    public int getHP(){
        return HP;
    }
}

public class BilMain {
    public static void main(String[] args) {
        Bil bil1 = new Bil("rød", -123);
        String bil1Farge = bil1.getFarge();
        int bil1HP = bil1.getHP();
        System.out.println("Bil1 farge er " + bil1Farge + "\nBil1 HP er " + bil1HP);
    }
}
