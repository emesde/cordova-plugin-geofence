package com.cowbell.cordova.geofence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class TransitionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("com.cowbell.cordova.geofence", "Received Transition!!!!!!!!!!!!!!!!!!!!!!!!");
        final PendingResult pendingPostRequest = goAsync();

        AsyncTask<String, Integer, String> postRequest = new AsyncTask<String, Integer, String>() {
            URL url;
            @Override
            protected String doInBackground(String... params) {
                try {
                    try {
                        url = new URL("http://76.102.204.168:9004");
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("WHOA WHOA WHOA");

                    HttpURLConnection serverConnection = (HttpURLConnection) url.openConnection();
                    serverConnection.setRequestMethod("GET");
                    // int httpResponse = serverConnection.getResponseCode();
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(serverConnection.getInputStream()));
                    String inputLine;
                    StringBuffer response = new StringBuffer();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                    in.close();

                    System.out.println(response.toString());
                    pendingPostRequest.finish();
                    return response.toString();
                } catch (Exception e) {
                    System.out.println(e);
                    return "500";
                }
            }
        };
    }
}
