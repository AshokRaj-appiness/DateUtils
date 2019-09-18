package com.example.dateut;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateUtils {
    public static String getTime(Date date) {
        SimpleDateFormat timeFormatter = new SimpleDateFormat("kk:mm");
        return timeFormatter.format(date);
    }
}
