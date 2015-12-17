package org.dhsdevelopers.quake;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class afterActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after);
        setTitle("What's Next");

        //create toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button maps = (Button) findViewById(R.id.maps);
        Button shelters = (Button) findViewById(R.id.shelters);
        Button friends = (Button) findViewById(R.id.friends);
        Button medical = (Button) findViewById(R.id.medical);

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent before = new Intent(afterActivity.this, MapsActivity.class);
                startActivity(before);
            }
        });


    }

}
