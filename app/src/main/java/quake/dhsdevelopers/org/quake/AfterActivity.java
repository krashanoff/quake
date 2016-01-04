package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.hardware.Camera;

public class AfterActivity extends AppCompatActivity {

    private Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after);
        setTitle("What's Next");
    }

    /* camera = Camera.open();

       flashlight.setOnClickListener(new View.OnClickListener(){ 
        @Override 
        public void onClick(View v){ 
            Camera.Parameters cameraParams = camera.getParameters(); 
            cameraParams.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH); 
            camera.setParameters(cameraParams); 
            camera.startPreview(); 
        } 
    }); */

}
