package com.adlafrica.inteladata.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.adlafrica.inteladata.service.LocationService;


/**
 * Created by Jude on 24-Oct-16.
 */

public class MyReceiver extends BroadcastReceiver {
    private double latitude,longitude;

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equalsIgnoreCase("android.intent.action.BOOT_COMPLETED")){
            intent = new Intent(context, LocationService.class);
            context.startService(intent);
        }

        latitude = intent.getDoubleExtra(LocationService.COORDS_LAT, 0.0);
        longitude = intent.getDoubleExtra(LocationService.COORDS_LON, 0.0);
        setLatitude(latitude);
        setLongitude(longitude);
        Log.d("Coords: ", "Lat: " + String.valueOf(latitude) + "\n"
                + "Lon: " + String.valueOf(longitude));
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
