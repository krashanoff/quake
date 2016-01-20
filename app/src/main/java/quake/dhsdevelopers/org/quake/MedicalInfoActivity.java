package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MedicalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_info);

        TextView medicalText = (TextView)findViewById(R.id.medicalText);
        TextView medicalInfo = (TextView) findViewById(R.id.medicalInfo);

        if(MedicalActivity.medicalChoice == 1) {
            setTitle("Broken Bones");
            medicalInfo.setText("Bones");
            medicalText.setText(getApplicationContext().getResources().getString(R.string.filler));

        }else if(MedicalActivity.medicalChoice == 2){
            setTitle("Cuts");
            medicalInfo.setText("Cuts");
            medicalText.setText(getApplicationContext().getResources().getString(R.string.health_impale));
        }

        else if(MedicalActivity.medicalChoice == 3){
            setTitle("Neck/Spine Injuries");
            medicalInfo.setText("Neck/Spine");
            medicalText.setText(getApplicationContext().getResources().getString(R.string.filler));
        }
    }
}
