package com.example.payne.simpletestapp.deviceStorage.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;

import com.example.payne.simpletestapp.R;

public class SingleAlertPreference extends Preference {

    public SingleAlertPreference(Context context, AttributeSet attrs) {
        super(context, attrs);

        setLayoutResource(R.layout.singlealert_card);

    }





}
