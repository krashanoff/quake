package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.LocationListener;
import android.location.LocationManager;
import android.content.Context;
import android.content.Intent;

public class LocalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        setTitle("Local Data");

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
    }

    /* locationListener = new LocationListener(){ 
        @Override 
        public void onLocationChanged(Location location) { 
            text.append("\n"+location.getLatitude() + " " + location.getLatitude()); 
        }  

        @Override 
        public void onStatusChanged(String provider, int status, Bundle extras) {  
        }  

        @Override 
        public void onProviderEnabled(String provider) {  
        }  

        @Override 
        public void onProviderDisabled(String provider) { 
            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS); 
            startActivity(intent); 
        } 
    };  */

}
