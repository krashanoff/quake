package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MedicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        setTitle("Medical");

        WebView webview = new WebView(this);
        webview.loadUrl("http://lifehacker.com/8-basic-life-saving-skills-everyone-should-know-1469632767");
    }
}
