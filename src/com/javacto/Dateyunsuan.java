package com.javacto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Dateyunsuan {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        // isLeapYear()方法 判断是不是闰年
        System.out.println("is localDate leap?"+localDate.isLeapYear());

        //判断是不是今天比某一天迟或早
        System.out.println(localDate.isBefore(LocalDate.of(2020,11,1)));
        System.out.println(localDate.isAfter(LocalDate.of(2010,11,1)));

        //Create LocalDateTime from LocalDate
        System.out.println(localDate.atTime(LocalTime.now()));

        //十天之后,之前
        System.out.println(localDate.plusDays(10));
        System.out.println(localDate.minusDays(10));
    }
}
