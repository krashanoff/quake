package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.widget.Button;
import android.media.MediaPlayer;

public class AfterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after);
        setTitle("What's Next");

        final Button flashlight = (Button) findViewById(R.id.flashlight);

        flashlight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startCamera();
                toggleFlash();
            }
        });

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.noise);
        final Button noise = (Button) findViewById(R.id.noise);

        noise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mp.isPlaying()){
                    mp.setLooping(true);
                    mp.start();
                }else if(mp.isPlaying()){
                    mp.pause();
                }

            }
        });
    }

    public void medical(View v){
        Intent intent = new Intent(this, MedicalActivity.class);
        startActivity(intent);
    }

    public void basics(View v){
        Intent intent = new Intent(this, BasicsActivity.class);
        startActivity(intent);
    }

    private static Camera mCamera;
    private static Camera.Parameters mParameters;
    public static boolean torchOn = false;

    private void startCamera() {
        if (mCamera == null) {
            try {
                mCamera = Camera.open();
                mParameters = mCamera.getParameters();
            } catch (RuntimeException e) {
                System.out.print("There was an error");
            }
        }
    }

    private void toggleFlash() {
        if (!torchOn) {
            if (mCamera == null || mParameters == null) {
                return;
            }


            mParameters = mCamera.getParameters();
            mParameters.setFlashMode(Parameters.FLASH_MODE_TORCH);
            mCamera.setParameters(mParameters);
            mCamera.startPreview();
            torchOn = true;

        }
        else {
            if (mCamera == null || mParameters == null) {
                return;
            }

            mParameters = mCamera.getParameters();
            mParameters.setFlashMode(Parameters.FLASH_MODE_OFF);
            mCamera.setParameters(mParameters);
            mCamera.stopPreview();
            torchOn = false;
        }

    }


}
