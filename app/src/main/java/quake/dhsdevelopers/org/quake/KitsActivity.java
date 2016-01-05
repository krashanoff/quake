package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.view.View;

public class KitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kits);
        setTitle("Kits");
    }

    private void goToUrl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void basic(View v){
        goToUrl("http://www.emergencykits.com/residential-emergency-kits/emergency-kits-5-person/home-base-emergency-kit-5-person/");
    }

    public void medium(View v){
        goToUrl ("http://www.emergencykits.com/office-emergency-kits/ready-to-roll-emergency-kit/");
    }

    public void ultimate(View v){
        goToUrl ("http://www.emergencykits.com/emergency-kits/residential-emergency-kits/homestead-emergency-kit-ultimate/");
    }
}
