package com.javacto;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;

public class Yesterday {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,-1);

        System.out.println("-----------LocalDate---------");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());
        System.out.println(sdf.format(cal.getTime()));

        System.out.println("--------------------");

        LocalDate localDate1 = LocalDate.of(2018, Month.JANUARY,1);
        System.out.println(localDate1);

        System.out.println("--------------------");

        //2014年的二月没有29号，出现异常
        //LocalDate localDate2 = LocalDate.of(2014, Month.FEBRUARY, 29);
        //System.out.println(localDate2);

        LocalDate localDate2 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(localDate2);

        System.out.println("--------------------");

        LocalDate localDate3 = LocalDate.ofEpochDay(365);
        System.out.println(localDate3);

        System.out.println("--------------------");

        LocalDate localDate4 = LocalDate.ofYearDay(2018,100);
        System.out.println(localDate4);

        System.out.println("-----------LocalTime---------");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println("--------------------");

        LocalTime localTime1 = LocalTime.of(23,12,12,0);
        System.out.println(localTime1);

        System.out.println("--------------------");

        LocalTime localTime2 = LocalTime.ofSecondOfDay(3601);
        System.out.println(localTime2);

        System.out.println("-----------LocalDateTime---------");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("--------------------");

        localDateTime = LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println(localDateTime);

        System.out.println("--------------------");

        LocalDateTime localDateTime1 = LocalDateTime.of(2020,10,31,13,46,0);
        System.out.println(localDateTime1);

        System.out.println("-----------Instant---------");

        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
