package org.dhsdevelopers.quake;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.*;

import android.widget.Button;
import android.widget.TextView;
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

        //API STUFF

        //JSON Parsing
        TextView apiTest = (TextView) findViewById(R.id.apiTest);
        Button apiButton = (Button) findViewById(R.id.apiButton);

        //Define strJson as the file retrieved from the HTTP request
        String strJson = "";
        try {
            JSONObject jsonObject = new JSONObject(strJson);
        } catch (JSONException e){
            e.printStackTrace();
        }

    }

    //START ASYNC PROTOCOL

    //ASYNC CLASS
    public class JSONTask extends AsyncTask<URL, String, String>{

        @Override
        protected String doInBackground(URL... params) {

            /*
            So this is where the URL and API stuff should go!  Please code here if you need to.
            On a side note, I've left out the buttons and stuff from farther up since I thought they were a little unnecessary.
            I'm pretty sure that the stuff I left out actually belongs in the Async-onPostExecute task, as it will run on the main thread.
             */
            //HTTP Request Stuff

            HttpURLConnection connection = null;
            BufferedReader reader = null;
            try {
                URL url = new URL("http://earthquake.usgs.gov/fdsnws/event/1/application.json");
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();

                String line = "";

                while((line  = reader.readLine()) != null){
                    buffer.append(line + "");
                }

            } catch (MalformedURLException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            } finally {
                if(connection != null) {
                    connection.disconnect();
                }

                try {
                    if(reader != null){reader.close();}
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            //This must be called in order for the Async-doInBackground task to complete
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //Before Method
    public void before(View view){

    }
}
