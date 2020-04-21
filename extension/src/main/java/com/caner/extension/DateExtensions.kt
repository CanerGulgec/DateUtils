package com.caner.extension

import android.text.format.DateUtils.HOUR_IN_MILLIS
import android.text.format.DateUtils.MINUTE_IN_MILLIS
import java.text.SimpleDateFormat
import java.util.*


const val SECOND_IN_MILLIS: Long = 1000
const val MINUTE_IN_MILLIS = SECOND_IN_MILLIS * 60
const val HOUR_IN_MILLIS = MINUTE_IN_MILLIS * 60
const val DAY_IN_MILLIS = HOUR_IN_MILLIS * 24

val YMDHMS = "yyyy-MM-dd HH:mm:ss"
val YMDHM = "yyyy-MM-dd HH:mm"
val YMD = "yyyy-MM-dd"


private lateinit var DATE_FORMAT: SimpleDateFormat

/**
 * This method returns formatted time to display in selected format
 */
fun fromMillisToTimeString(millis: Long, pattern: String = YMDHM): String {
    DATE_FORMAT = SimpleDateFormat(pattern, Locale.getDefault())
    return DATE_FORMAT.format(millis)
}
