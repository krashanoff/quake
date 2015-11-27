package org.dhsdevelopers.quake;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("Quake");
        setSupportActionBar(toolbar);

        //Before button
        Button before = (Button) findViewById(R.id.before);

        before.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent before = new Intent(MainActivity.this, beforeActivity.class);
                startActivity(before);
            }
        });

        //After button
        Button after = (Button) findViewById(R.id.after);

        after.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent after = new Intent(MainActivity.this, afterActivity.class);
                startActivity(after);
            }
        });

        /*Buttons for each corresponding page.  If we make a tabhost, these buttons will become obsolete.  This is why they have been commented out.
        //Maps button
        Button maps = (Button) findViewById(R.id.after);

        after.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, mapsActivity.class);
                startActivity(intent);
            }
        });

        //After button
        Button shelters = (Button) findViewById(R.id.after);

        after.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, sheltersActivity.class);
                startActivity(intent);
            }
        });

        //After button
        Button kits = (Button) findViewById(R.id.after);

        after.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, kitsActivity.class);
                startActivity(intent);
            }
        });
        */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void before(View view){

    }
}
