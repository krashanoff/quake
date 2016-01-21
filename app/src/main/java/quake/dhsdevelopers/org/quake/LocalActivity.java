package quake.dhsdevelopers.org.quake;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.LocationListener;
import android.location.LocationManager;
import android.content.Context;

//Async
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

//JSON Imports
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//IO and HTTP Imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;

public class LocalActivity extends AppCompatActivity {

    public TextView apiText;
    private LocationListener locationListener;
    double longitude;
    double latitude;

    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        setTitle("Local Data");

        apiText = (TextView) findViewById(R.id.apiText);

        // Acquire a reference to the system Location Manager
        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

        // Define a listener that responds to location updates
        LocationListener locationListener = new LocationListener() {
            public void onLocationChanged(Location location) {
                // Called when a new location is found by the network location provider.
                makeUseOfNewLocation(location);
            }

            public void onStatusChanged(String provider, int status, Bundle extras) {
            }

            public void onProviderEnabled(String provider) {
            }

            public void onProviderDisabled(String provider) {
                System.out.println("Provider Disable");
            }
        };

        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);

        //JSONTask task = new JSONTask();
        //task.doInBackground();

    }

    public void makeUseOfNewLocation(Location location) {
        latitude = location.getLatitude();
        longitude = location.getLongitude();
    }


     /*public class JSONTask extends AsyncTask<String, String, String>{

        @Override
        protected String doInBackground(String... params) {


            //HTTP Request Stuff

            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                //Leave out end time because default is present time
                URL url = new URL("\"http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2016-01-01&endtime=2016-01-19&latitude=40&longitude=120&maxradius=10\"");

                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();

                String line = "";

                while((line  = reader.readLine()) != null){
                    buffer.append(line + "");
                }

                //If HTTP request is succesful return string
                String finalJson = buffer.toString();
                System.out.println(finalJson);

                JSONObject parentObject = new JSONObject(finalJson);
                JSONArray parentArray = parentObject.getJSONArray("features");
                //JSONObject finalObject = new parentArray.getJSONObject(0);

                //int magnitude = finalObject.getInt("mag");

                return buffer.toString();


            } catch (MalformedURLException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally {
                if(connection != null) {
                    connection.disconnect();
                }

                try {
                    if(reader != null){reader.close();}
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //JSON Parsing

                //Define strJson as the file retrieved from the HTTP request
                String strJson = "";
                try {
                    JSONObject jsonObject = new JSONObject(strJson);
                } catch (JSONException e){
                    e.printStackTrace();
                }

            }


            //If not succesful return null
            return null;
        }

        @Override
        //This is the main thread
        protected void onPostExecute(String result) {
            //Return null does not need to be called here for the task to complete
            apiText.setText(result);
            super.onPostExecute(result);
        }
    } */

}



