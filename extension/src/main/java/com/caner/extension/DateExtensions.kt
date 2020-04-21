package com.caner.extension

import android.content.Context
import android.widget.Toast


fun toast(c: Context?, message: String?) {
    Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
}