package quake.dhsdevelopers.org.quake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MedicalActivity extends AppCompatActivity {

    public int medicalThing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        setTitle("Medical");

    }

    public void bones(View v){
        medicalThing = 1;
        Intent intent = new Intent(this, MedicalInfoActivity.class);
        startActivity(intent);
    }

    public void cuts(View v){
        medicalThing = 2;
        Intent intent = new Intent(this, MedicalInfoActivity.class);
        startActivity(intent);
    }

    public void spine(View v){
        medicalThing = 3;
        Intent intent = new Intent(this, MedicalInfoActivity.class);
        startActivity(intent);
    }
}
