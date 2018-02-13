package com.sayson.narl.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Created by Lran on 2/9/2018.
 */

class Receiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent!!.action.equals("com.tester.stopalarm")){
            var b =intent.extras

            val notifyMe=Notif()
            notifyMe.Notify(context!!,b.getString("message"),10)
        }
        else if(intent!!.action.equals("android.intent.action.BOOT_COMPLETED")){

            val saveData=RememberData(context!!)
            saveData.setAlarm()
        }
    }

}
