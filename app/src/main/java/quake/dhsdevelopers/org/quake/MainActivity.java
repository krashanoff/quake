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

    /* Parameters for API Data String dataParameterStart = "2015-12-10";
    //int dataParameterMinMagnitude = 3; 
    //int dataParameterMaxMagnitude = 9;
     int intLocation; */

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

    /* //START ASYNC PROTOCOL  
    //ASYNC CLASS
     public class JSONTask extends AsyncTask<String, String, String>{  

        protected String doInBackground(String... params) {  
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
                }              try { 
                    if(reader != null){reader.close();} 
                } catch (IOException e) { 
                    e.printStackTrace();            }  
                    //JSON Parsing  
                    // Define strJson as the file retrieved from the HTTP request 
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

        //This is the main thread 
        protected void onPostExecute(String result) { 

        //Return null does not need to be called here for the task to complete 
        apiTest.setText(result); 
        super.onPostExecute(result); 

        } 
    } 
    //END OF ASYNC TASK */

}
