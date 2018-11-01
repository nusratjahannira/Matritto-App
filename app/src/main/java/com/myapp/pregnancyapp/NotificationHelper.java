package com.myapp.pregnancyapp;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

/**
 * Created by User on 2018-08-02.
 */

public class NotificationHelper extends ContextWrapper {
    public static final String channelID = "channelID";
    public static final String channelName = "channel_1";



    private static NotificationManager mManager;

    public NotificationHelper(Context base) {
        super(base);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            createChannels();
        }
    }


    Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);  // ringtone



    long[] v = {500,1000}; // vibration


    @TargetApi(Build.VERSION_CODES.O)
    public void createChannels(){
        NotificationChannel channel = new NotificationChannel(channelID,channelName, NotificationManager.IMPORTANCE_DEFAULT);
        channel.enableLights(true);
        channel.enableVibration(true);
        channel.setLightColor(R.color.colorPrimary);
        channel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getManager().createNotificationChannel(channel);
    }

    public NotificationManager getManager(){

        if(mManager == null){
            mManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

        }
        return mManager;
    }


    public NotificationCompat.Builder getchannel1Notification(String tittle, String message){

        return new NotificationCompat.Builder(getApplicationContext(),channelID)
                .setAutoCancel(true)
                .setContentTitle(tittle)
                .setContentText(message)
                .setSmallIcon(R.drawable.add_button)
                .setVibrate(v)
                .setSound(uri);

    }
}
