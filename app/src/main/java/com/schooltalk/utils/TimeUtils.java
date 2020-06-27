package com.schooltalk.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by gaoteng on 2020/6/27.
 */
public class TimeUtils {

    public static String getHomeListTimeFormat(String timeStamp){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = { "周日", "周一", "周二", "周三", "周四", "周五", "周六" };
        Calendar cal = Calendar.getInstance();
        Date date = new Date(Long.parseLong(timeStamp) * 1000);
        String time = sdf.format(date);
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
        if (w < 0)
            w = 0;
        String week = weekDays[w];
        return time.concat(" "+ week);
    }
}
