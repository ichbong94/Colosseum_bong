package com.example.colosseum_bong.utils

import android.content.Context

class ContextUtil {

    companion object{

        private val prefName = "ColosseumPref"
        private val TOKEN = "TOKEN"

        fun setToken(context: Context, token: String){
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

        }
    }
}