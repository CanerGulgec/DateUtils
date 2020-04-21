package com.caner.extension

import android.content.Context
import android.widget.Toast


fun toast(c: Context?, message: String?) {
    Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
}

/**
 * Returns a string describing the elapsed time since startTime.
 * @param startTime some time in the past.
 * @return a String object containing the elapsed time.
 * @see .getRelativeTimeSpanString
 */
fun getRelativeTimeSpanString(startTime: Long): CharSequence? {
    return getRelativeTimeSpanString(
        startTime
    )
}