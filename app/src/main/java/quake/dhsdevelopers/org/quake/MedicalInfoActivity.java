package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MedicalInfoActivity extends AppCompatActivity {

    public TextView medicalInfo = (TextView) findViewById(R.id.medicalInfo);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_info);

        assignText();
    }

    public void assignText(){
        if(1==1){

        }
    }
}
