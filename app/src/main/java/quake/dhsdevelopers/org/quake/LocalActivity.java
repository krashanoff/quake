package quake.dhsdevelopers.org.quake;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.LocationListener;
import android.location.LocationManager;
import android.content.Context;
import android.content.Intent;

//Async
import android.os.AsyncTask;
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

    private TextView apiText;
    private LocationListener locationListener;
    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        setTitle("Local Data");

        apiText = (TextView) findViewById(R.id.apiText);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        /* locationListener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {

            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(String[]{
                Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.INTERNET
            }; 10)
            return;
        } else{
            configureButton(new String);
        } */
    }

    /* private void configureButton() {
        locationManager.requestLocationUpdates("gps", 5000, 5, locationListener);
    } */

}
