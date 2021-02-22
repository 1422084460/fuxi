package com.javacto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateMethods {

    public static void main(String[] args) {
        //设置时间格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获得实体类
        Calendar ca = Calendar.getInstance();
        //设置最后一天
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        //最后一天格式化
        String lastDay = format.format(ca.getTime());
        System.out.println(lastDay);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        Date date = new Date();
        System.out.println(date);
        System.out.println(localDate);
        System.out.println(dateTimeFormatter.format(localDate));
    }
}
