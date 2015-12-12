package org.dhsdevelopers.quake;

//GUI Imports
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

//JSON Parsing Imports
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.*;

//IO and HTTP Imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.*;

//Widget Imports
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private TextView apiTest;

    //Parameters for API Data
    String dataParameterStart = "2015-12-10";
    int dataParameterMinMagnitude = 3;
    int dataParameterMaxMagnitude = 9;

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

        apiTest = (TextView)findViewById(R.id.apiTest);
        Button apiButton = (Button) findViewById(R.id.apiButton);



        apiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Fill in parameter variables after testing is done
                new JSONTask().execute("http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2015-12-10&minmagnitude=3&maxmagnitude=9");
            }
        });

    }

    //Before Method
    public void before(View view){

    }

    //START ASYNC PROTOCOL

    //ASYNC CLASS
    public class JSONTask extends AsyncTask<String, String, String>{

        @Override
        protected String doInBackground(String... params) {

            /*
            So this is where the URL and API stuff should go!  Please code here if you need to.
            On a side note, I've left out the buttons and stuff from farther up since I thought they were a little unnecessary.
            I'm pretty sure that the stuff I left out actually belongs in the Async-onPostExecute task, as it will run on the main thread.
             */
            //HTTP Request Stuff

            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                //Leave out end time because default is present time
                URL url = new URL(params[0]);

                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));
                StringBuffer buffer = new StringBuffer();

                String line = "";

                while((line  = reader.readLine()) != null){
                    buffer.append(line + "");
                }

                //If HTTP request is succesful return string

                String finalJson = buffer.toString();
                JSONObject parentObject = new JSONObject(finalJson);
                JSONArray parentArray = parentObject.getJSONArray("features");

                JSONObject finalObject = parentArray.getJSONObject(0);

                int magnitude = finalObject.getInt("mag");

                return buffer.toString();

            } catch (MalformedURLException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            } catch (JSONException e) {
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

                //JSON Parsing

                //Define strJson as the file retrieved from the HTTP request
                String strJson = "";
                try {
                    JSONObject jsonObject = new JSONObject(strJson);
                } catch (JSONException e){
                    e.printStackTrace();
                }

            }

            //If not succesful return null
            return null;
        }

        @Override
        //This is the main thread
        protected void onPostExecute(String result) {
            //Return null does not need to be called here for the task to complete
            apiTest.setText(result);
            super.onPostExecute(result);
        }
    }
    //END OF ASYNC TASK

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
