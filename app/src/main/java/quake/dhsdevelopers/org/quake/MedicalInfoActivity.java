package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MedicalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_info);
        TextView medicalText = (TextView)findViewById(R.id.medicalText);
        setTitle("Medical Info");
        if(MedicalActivity.medicalChoice == 1) {
            medicalText.setText(getApplicationContext().getResources().getString(R.string.health_impale));
        }else if(MedicalActivity.medicalChoice == 2){
            medicalText.setText(getApplicationContext().getResources().getString(R.string.filler));
        }
        else if(MedicalActivity.medicalChoice == 3){
            medicalText.setText(getApplicationContext().getResources().getString(R.string.filler));
        }
    }
}
