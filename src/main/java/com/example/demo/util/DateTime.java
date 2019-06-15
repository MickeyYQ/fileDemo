package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

    public String date(){
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        DateTime dt = new DateTime();
        dt.date();
        System.out.println(dt.date());
    }
}
