package org.practice.java8;

import java.time.LocalDate;
import java.time.Month;
import java.util.Base64;

public class Practise {

    public static void getEncodedValue(){
        String val =  Base64.getEncoder().encodeToString("Bye".getBytes());
        System.out.println(val);
    }

    public static void getDate(){
        LocalDate date = LocalDate.now();
        LocalDate date1 =  LocalDate.of(2002,12,12);
        LocalDate date2;
        try {
             date2 = LocalDate.of(2024, Month.AUGUST, 133);
        }catch (Exception e){
            date2 = null;
        }

        System.out.println(date + " " + date1 + " " + date2);
    }

}
