package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class BeforeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before);
        setTitle("Get Prepared");
    }

    public void kits(View v){
        Intent intent = new Intent(this, KitsActivity.class);
        startActivity(intent);
    }

    public void shelters(View v){
        Intent intent = new Intent(this, SheltersActivity.class);
        startActivity(intent);
    }

    public void basics(View v){
        Intent intent = new Intent(this, BasicsActivity.class);
        startActivity(intent);
    }

    /*locationManager = (LocationManager) getSystemService(LOCATION_SERVICE); 

    locationListener = new LocationListener(){ 
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
    }; 
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) { 
            if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) { 
            requestPermissions(new String[]{ 
                    Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION, 
                    Manifest.permission.INTERNET 
            }, 10); 
            return; 
        } 
    }else{ 
        configureButton(); 
    }
  }
      public void onRequestPermissionResult(int requestCode, String[] permissions, int[] grantResults){ 
        switch (requestCode){ 
        case 10: 
        if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) 
        configureButton(); 
        return; 
        }
         }
           public void configureButton(){ 
        getLocation.setOnClickListener(new View.OnClickListener() { 

        @Override 
        public void onClick(View v) { 
        locationManager.requestLocationUpdates("gps", 5000, 3000, locationListener); 
        } 
    });*/
}
