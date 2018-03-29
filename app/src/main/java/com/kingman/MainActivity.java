package com.kingman;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by hdb on 2016/11/29.
 */

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickBtn(View view){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MyReactActivity.class);
        startActivity(intent);
//        sendEvent(,"fds",1);

    }

//    public  static void sendEvent(ReactContext reactContext, String eventName, int status)
//    {
//        System.out.println("reactContext="+reactContext);
//
//        reactContext
//                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
//                .emit(eventName,status);
//    }
}
