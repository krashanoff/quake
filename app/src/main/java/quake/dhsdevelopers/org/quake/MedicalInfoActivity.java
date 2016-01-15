package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MedicalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_info);
        setTitle("Info");

        TextView medicalInfo = (TextView) findViewById(R.id.medicalInfo);
        MedicalActivity obj = new MedicalActivity();

        if(obj.medicalThing == 1){
            System.out.print("Test");
            medicalInfo.setText("One");
        }else if(obj.medicalThing == 2){
            medicalInfo.setText("Two");
        }else if(obj.medicalThing == 3){
            medicalInfo.setText("Three");
        }
    }


}
