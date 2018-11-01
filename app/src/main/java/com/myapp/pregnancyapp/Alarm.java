package com.myapp.pregnancyapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by User on 2018-08-02.
 */

public class Alarm extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationHelper notificationHelper;
        notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getchannel1Notification("Its medicine time!!! ","please take your medicine timely.Don't be late!!!");
        notificationHelper.getManager().notify(1,nb.build());

    }
}
