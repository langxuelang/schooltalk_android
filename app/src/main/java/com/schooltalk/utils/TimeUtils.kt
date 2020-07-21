package com.schooltalk.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by gaoteng on 2020/6/27.
 */
object TimeUtils {
    @JvmStatic
    fun getHomeListTimeFormat(timeStamp: String): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        val weekDays = arrayOf("周日", "周一", "周二", "周三", "周四", "周五", "周六")
        val cal = Calendar.getInstance()
        val date = Date(timeStamp.toLong() * 1000)
        val time = sdf.format(date)
        cal.time = date
        var w = cal[Calendar.DAY_OF_WEEK] - 1 // 指示一个星期中的某天。
        if (w < 0) w = 0
        val week = weekDays[w]
        return "$time $week"
    }
}