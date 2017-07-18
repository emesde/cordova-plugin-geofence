import com.cowbell.cordova.geofence.Gson;
import com.cowbell.cordova.geofence.GeoNotification;o

import android.util.Log;
import android.os.AsyncTask;
import org.apache.cordova.LOG;

import java.net.HttpURLConnection;

final URL url = "localhost:5000";

public class GeofenceTransitionReceiver extends BroadcastReceiver {
    
    @Override
    public void onReceive(final Context context, final Intent intent) {
        String err = intent.getStringExtra("error");
        if (err != null) { Log.println(LOG.Error, error); return; }

        //
        final PendingResult pendingPostRequest = goAsync();

        AsyncTask<String, Integer, String> postRequest = new AsyncTask<String, Integer, String>() {
            @Override
            protected String doInBackground(String... params) {
                HttpURLConnection serverConnection = (HttpURLConnection) url.openConnection();

                serverConnection.setRequestMethod("GET");

            }
        }

    }
}
