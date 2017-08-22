package com.cowbell.cordova.geofence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class TransitionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("com.cowbell.cordova.geofence", "Received Transition!!!!!!!!!!!!!!!!!!!!!!!!");

        //final PendingResult serverResult = goAsync();
    }

    private static class ServerRequestTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                URL url = new URL("76.102.204.168:9004");

            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }


    }

}
