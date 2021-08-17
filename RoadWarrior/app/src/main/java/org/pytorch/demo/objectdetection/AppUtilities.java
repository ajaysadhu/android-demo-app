package org.pytorch.demo.objectdetection;

import android.content.Context;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class AppUtilities {

    public static String OUTPUTFILE = "road-damage-details.txt";

    public static int LOG_OUTPUT_FREQ = 3;

    public static String MODEL_NAME = "best_lite.torchscript_5Aug_100epoch.ptl";

    public static boolean verifyGoogleAPIAvailable(Context context) throws Exception {

        if( GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == ConnectionResult.SUCCESS) {
            return true;
        } else {
            new Exception("Google API Service Unavailable");
        }
        return  false;
    }


}
