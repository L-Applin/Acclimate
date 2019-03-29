package com.example.payne.simpletestapp.backgroundTask;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.PeriodicWorkRequest;
import androidx.work.Worker;

import static com.example.payne.simpletestapp.appUtils.AppTag.BACK_TASK;

public class BackgroundRequestWorker extends Worker {

    /**
     * todo : find a better way to keep track of the request
     */
    public static PeriodicWorkRequest backgroundRequest;

    @NonNull
    @Override
    public Result doWork() {
        Log.i(BACK_TASK, "doWork() called");
        return Result.SUCCESS;
    }

}
