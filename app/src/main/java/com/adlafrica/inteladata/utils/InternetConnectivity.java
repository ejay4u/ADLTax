package com.adlafrica.inteladata.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class InternetConnectivity {
	
	//Checking internet connectivity for device.
	public static boolean isNetworkConnected(Context context) {
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(
		        Context.CONNECTIVITY_SERVICE);

		//NetworkInfo wifiNetwork = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
		NetworkInfo activeNetwork  = cm.getActiveNetworkInfo();
		if (activeNetwork != null) { // connected to the internet
			if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
				// connected to wifi
				return  true;
			} else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
				// connected to the mobile provider's data plan
				return  true;
			} else if (activeNetwork.getType() == ConnectivityManager.TYPE_WIMAX){
                return  true;
            }else  if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE_DUN){
                return  true;
            }
		}

        return false;
	}
}
