package com.murphy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author murphy
 */
public class DateFormatUtil {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String format(Date date){
        return format.format(date);
    }
}