package com.example.yandexbanner

import android.app.Application
import android.util.Log
import com.yandex.mobile.ads.common.MobileAds

class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this){
            Log.d("MyLog", "Yandex Ads SDK initialized")
        }
    }
}