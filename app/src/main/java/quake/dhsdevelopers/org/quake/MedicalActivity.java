package quake.dhsdevelopers.org.quake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MedicalActivity extends AppCompatActivity {

    public int medicalThing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        setTitle("Medical");

    }

    public void bones(){
        Intent intent = new Intent(this, MedicalInfoActivity.class);
        startActivity(intent);
    }
}
