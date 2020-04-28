package com.caner.extension

import android.text.format.DateUtils
import java.text.SimpleDateFormat
import java.util.*


//TODO RETURN WITH UTC

/**
 * This method returns current date in specified pattern
 */
fun getCurrentDate(pattern: String = DATE_FORMAT_3): String =
    SimpleDateFormat(pattern, Locale.getDefault()).format(Date())

/**
 * This method returns formatted time to display in specified pattern
 */
fun getDateString(timeInMillis: Long, pattern: String = DATE_FORMAT_3): String {
    val dateFormat = SimpleDateFormat(pattern, Locale.getDefault())
    return dateFormat.format(timeInMillis)
}

fun getDateStringWithSpecificMessage(timeInMillis: Long, pattern: String = DATE_FORMAT_3): String {
    val dateFormat = SimpleDateFormat(pattern, Locale.getDefault())

    return when {
        isToday(timeInMillis) -> "Today"
        isTomorrow(timeInMillis) -> "Tomorrow"
        isYesterday(timeInMillis) -> "Yesterday"
        else -> dateFormat.format(timeInMillis)
    }
}

fun getMilliSecondsFromDateString(dateString: String, pattern: String): Long? {
    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
    val mDate = sdf.parse(dateString)
    return mDate?.time
}

private fun isYesterday(whenInMillis: Long): Boolean {
    return DateUtils.isToday(whenInMillis + DateUtils.DAY_IN_MILLIS)
}

fun isTomorrow(whenInMillis: Long): Boolean {
    return DateUtils.isToday(whenInMillis - DateUtils.DAY_IN_MILLIS)
}

private fun isToday(whenInMillis: Long): Boolean {
    return DateUtils.isToday(whenInMillis)
}