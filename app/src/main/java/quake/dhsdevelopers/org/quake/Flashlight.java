package quake.dhsdevelopers.org.quake;

import android.hardware.Camera;
import android.view.View;

/**
 * Created by Duncan Grubbs on 1/5/16.
 */
public class Flashlight {

    //TODO Create flashlight

    private static Camera mCamera;
    private static Camera.Parameters mParameters;
    public static boolean torchOn = false;

    public static void startCamera() {
        if (mCamera == null) {
            mCamera = Camera.open();
            mParameters = mCamera.getParameters();
        }
    }


    public void flashTest(View view) {
        startCamera();
        if (mCamera != null && mParameters != null) {
            flashOn();
        } else if (mCamera != null) {
           flashOff();
        }
    }

    public void flashOn(){
        if (mCamera != null && mParameters != null) {
            if (!mParameters.getFlashMode().equals(Camera.Parameters.FLASH_MODE_TORCH)) {
                mParameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
                mCamera.setParameters(mParameters);
                mCamera.startPreview();
                torchOn = true;
            }
        }
    }

    public void flashOff(){
        if (mCamera != null && mParameters != null) {
            mParameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
            mCamera.setParameters(mParameters);
            mCamera.stopPreview();
            torchOn = false;
        }
    }
}
