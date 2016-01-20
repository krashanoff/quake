package quake.dhsdevelopers.org.quake;

//GUI
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//Async
import android.os.AsyncTask;

//JSON Imports
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//IO and HTTP Imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;

//NOTE: We need to move the ASYNC and JSON parsing to it's own class

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Quake");
    }

    //Create Buttons this way
    public void before(View v){
        Intent intent = new Intent(this, BeforeActivity.class);
        startActivity(intent);
    }

    public void after(View v){
        Intent intent = new Intent(this, AfterActivity.class);
        startActivity(intent);
    }

}
