package com.sayson.narl.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class   MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun BtnSet(view:View){
         val alarmTime = AlarmTime()
        val fm = fragmentManager
        alarmTime.show(fm,"Time")
    }
    fun setBtn(Hours:Int,Minute:Int ){

        txtTimeShow.text = Hours.toString() + ":" + Minute.toString()
val rememberData=RememberData(applicationContext)
        rememberData.RememberData(Hours,Minute)
        rememberData.setAlarm();
    }
}
