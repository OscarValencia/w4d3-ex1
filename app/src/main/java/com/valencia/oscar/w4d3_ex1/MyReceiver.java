package com.valencia.oscar.w4d3_ex1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver{
    private static final String TAG = MyReceiver.class.getSimpleName()+"_TAG";

    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        //I can handle multiple actions
        switch(intent.getAction()){
            case "android.intent.action.AIRPLANE_MODE":
                Log.d(TAG,"onReceive: Airplane mode changed");
                break;
            case "com.example.ROSS_EXAMPLE":
                Log.d(TAG,"onReceive: Ross's broadcast");
                break;
        }
        // DONTS
        // Dont do long operations
        // Dont do worker threads
        // This is executed on the main thread
        // ANR is trigger after 10 seconds
        Log.d(TAG,"onReceive: Airplane mode changed");

    }
}
