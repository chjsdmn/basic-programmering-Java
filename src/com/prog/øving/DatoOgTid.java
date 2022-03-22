package com.prog.øving;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatoOgTid {
    public static void main(String[] args) {
        Date nå = new Date();
        System.out.println(nå);  //Fri Dec 03 10:40:12 CET 2021

        String now = new SimpleDateFormat("dd.MM.YYYY HH:mm").format(nå);
        System.out.println(now);  //03.12.2021 10:42

        long varighet = nå.getTime();  //millisekunder

        System.out.println(varighet);  //Det er 3 600 000 millisekunder i en time.

    }
}
