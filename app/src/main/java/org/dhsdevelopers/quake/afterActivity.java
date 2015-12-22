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

        Button noise = (Button) findViewById(R.id.noise);
        Button flashlight = (Button) findViewById(R.id.flashlight);
        Button friends = (Button) findViewById(R.id.friends);
        Button medical = (Button) findViewById(R.id.medical);

    }

}
