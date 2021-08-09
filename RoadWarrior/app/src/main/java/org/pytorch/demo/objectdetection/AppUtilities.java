package org.pytorch.demo.objectdetection;

import android.content.Context;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class AppUtilities {

    public static boolean verifyGoogleAPIAvailable(Context context) throws Exception {

        if( GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == ConnectionResult.SUCCESS) {
            return true;
        } else {
            new Exception("Google API Service Unavailable");
        }
        return  false;
    }

}
