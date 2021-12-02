package com.prog.øving;

public class SjekkArray {
    public static void main(String[] args) {
        int [] liste =  {2,4,6,12,78,45,3,42,5,-7};
        System.out.println(summer(liste, 8, 9));  //-2


        int [] liste2 =  {2,4,6,12,78,45,3,42,5,-7};
        int [] liste3 =  {2,4,6,12,78,45,3,42,5};
        int [] liste4 =  {2,4,6,12,78,45,3,42,5,7};
        int [] liste5 =  {-2,4,6,12,78,45,3,42,5,-7};
        System.out.println(arrayLike(liste, liste2));  //true
        System.out.println(arrayLike(liste, liste3));  //false
        System.out.println(arrayLike(liste, liste4));  //false
        System.out.println(arrayLike(liste, liste5));  //false

        System.out.println(arrayEksisterer(liste, 0));  //false
        System.out.println(arrayEksisterer(liste, 2));  //true
        System.out.println(arrayEksisterer(liste, -7)); //true
        System.out.println(arrayEksisterer(liste, 78)); //true
    }

    public static int summer(int[] a, int h, int v){
        int total = 0;
        if(v< a.length) {
            for (int i = h; i <= v; i++) {
                total += a[i];
            }
        }
        return total;
    }

    public static boolean arrayLike(int[] a, int[] b){
        if(a.length == b.length){
            for(int i = 0; i < a.length; ){
                if(a[i] == b[i]){
                    i++;
                }
                else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean arrayEksisterer(int[] a, int x){
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                return true;
            }
        }
        return false;
    }
}
