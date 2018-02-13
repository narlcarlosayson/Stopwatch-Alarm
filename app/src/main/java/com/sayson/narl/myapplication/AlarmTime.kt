package com.sayson.narl.myapplication

import android.app.DialogFragment
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TimePicker
import kotlinx.android.synthetic.main.alarmtime.view.*

/**
 * Created by Lran on 2/9/2018.
 */
class AlarmTime:DialogFragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var myView = inflater!!.inflate(R.layout.alarmtime, container, false)

        var btnGo = myView.btnGo as Button
        var t1 = myView.t1 as TimePicker
        btnGo.setOnClickListener({
            val mx = activity as MainActivity
            if (Build.VERSION.SDK_INT >= 23){
                mx.setBtn(t1.hour, t1.minute)
        }else{
            mx.setBtn(t1.currentHour, t1.currentMinute)
        }
            this.dismiss()
    })


        return myView
    }

}