package quake.dhsdevelopers.org.quake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MedicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        setTitle("Medical");
    }

    public void bones(View v){
        Intent intent = new Intent(this, MedicalInfoActivity.class);
        startActivity(intent);
    }

    public void cuts(View v){
        Intent intent = new Intent(this, MedicalInfoActivity.class);
        startActivity(intent);
    }

    public void spine(View v){
        Intent intent = new Intent(this, MedicalInfoActivity.class);
        startActivity(intent);
    }
}
