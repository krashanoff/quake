package quake.dhsdevelopers.org.quake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BasicsActivity extends AppCompatActivity {

    public static int basicInfoDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);
        setTitle("Basics");
    }
    public void at_home(View v) {
        basicInfoDisplay = 1;
        Intent intent = new Intent(this, BasicsInfo.class);
        startActivity(intent);
    }
    public void in_car(View v) {
        basicInfoDisplay = 2;
        Intent intent = new Intent(this, BasicsInfo.class);
        startActivity(intent);
    }
}
