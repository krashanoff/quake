package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.LocationListener;
import android.location.LocationManager;
import android.content.Context;

public class LocalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        setTitle("Local Data");
    }

    LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

}
