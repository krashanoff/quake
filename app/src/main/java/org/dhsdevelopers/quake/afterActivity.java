package org.dhsdevelopers.quake;

import android.content.Intent;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class afterActivity extends AppCompatActivity {

    private Camera camera;

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

        camera = Camera.open();


        flashlight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Camera.Parameters cameraParams = camera.getParameters();
                cameraParams.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                camera.setParameters(cameraParams);
                camera.startPreview();
            }
        });

    }

}
