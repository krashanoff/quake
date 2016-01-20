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

    public void local(View v){
        Intent intent = new Intent(this, LocalActivity.class);
        startActivity(intent);
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
}
