package com.example.payne.simpletestapp.map.pins;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.payne.simpletestapp.R;
import com.example.payne.simpletestapp.alerts.BasicAlert;

import org.osmdroid.views.MapView;

public class BasicPin extends Pin {

    BasicPin(@NonNull MapView mapView, @NonNull BasicAlert alerte) {
        super(mapView, alerte);
    }


    @Override
    public void setPinIcon(Context ctx) {

        if (alerte.getEnumType() == null) {
            alerte.initType();
        }

        switch (alerte.getEnumType()){
            case TERRAIN:
                setIcon(ctx.getResources().getDrawable(R.drawable.pin_seisme));
                break;
            case FEU:
                setIcon(ctx.getResources().getDrawable(R.drawable.pin_feu));
                break;
            case EAU:
                setIcon(ctx.getResources().getDrawable(R.drawable.pin_goutte));
                break;
            case METEO: default:
                setIcon(ctx.getResources().getDrawable(R.drawable.pin_vent));
                break;

        }

    }
}
