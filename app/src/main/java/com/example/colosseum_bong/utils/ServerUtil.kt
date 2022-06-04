package com.example.colosseum_bong.utils

import okhttp3.FormBody
import okhttp3.OkHttpClient
import okhttp3.Request

class ServerUtil {

    companion object {

        val BASE_URL = "http://54.180.52.26"

        fun postRequestLogin(email : String, pw : String){

            val urlString = "${BASE_URL}/user"

            val formData = FormBody.Builder().add("email", email)
                .add("password", pw)
                .build()

            val request = Request.Builder()
                .url(urlString)
                .post(formData)
                .build()

            val client = OkHttpClient()
            client.newCall(request)

        }

    }
}