package quake.dhsdevelopers.org.quake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BasicsInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basics_info);
        TextView basicTv = (TextView)findViewById(R.id.basics_tv);
        TextView basic = (TextView)findViewById(R.id.basics);


        if(BasicsActivity.basicInfoDisplay == 1){
            setTitle("Home");
            basic.setText("At Home");
            basicTv.setText(getApplicationContext().getResources().getString(R.string.basic_home));
        } else if(BasicsActivity.basicInfoDisplay == 2){
            setTitle("Car");
            basic.setText("In the Car");
            basicTv.setText(getApplicationContext().getResources().getString(R.string.basic_car));
        } else{

        }
    }
}
