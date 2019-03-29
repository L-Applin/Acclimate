package com.example.payne.simpletestapp.backgroundTask;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.payne.simpletestapp.activities.main.BackgroundTaskPrefChangeListener;
import com.example.payne.simpletestapp.activities.main.MainActivity;
import com.example.payne.simpletestapp.appUtils.InternetCheck;

import androidx.work.PeriodicWorkRequest;
import lombok.NonNull;
import lombok.Setter;

public class WifiReceiver extends BroadcastReceiver {

    PeriodicWorkRequest backgroundRequest;
    @Setter
    MainActivity ctx;

    public WifiReceiver(@NonNull PeriodicWorkRequest backgroundRequest) {
        this.backgroundRequest = backgroundRequest;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if (ctx != null) {
            Toast.makeText(ctx,
                    "DEBUG : wifi is " + (InternetCheck.isWifiAvailable(ctx) ? "on":"off"),
                Toast.LENGTH_SHORT).show();
        }

        SharedPreferences sP = PreferenceManager.getDefaultSharedPreferences(context);
        new BackgroundTaskPrefChangeListener(ctx).updateWifiUsage(sP);

    }

}
