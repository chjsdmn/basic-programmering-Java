package com.prog.kontrollstrukturer;

public class VanskeligOppgaver {
    public static void main(String[] args) {
        pi();
    }
    static void pi(){
        //Pi=4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11+....
        double pi = 0;
        String piString = pi + "";
        int siffer = piString.length() - (piString.indexOf(".") + 1);
        double n = 1;
        while (siffer < 7 ) {
            for (int i = 0; i < 6; i++) {
                pi += (-4 / n) * (-1);
                n += 2;
            }
        }
        System.out.println(pi);
    }
}
