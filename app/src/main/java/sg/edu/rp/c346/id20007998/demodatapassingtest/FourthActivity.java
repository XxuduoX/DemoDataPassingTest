package sg.edu.rp.c346.id20007998.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tv3=findViewById(R.id.textView3);

        Intent DoubleValue=getIntent();
        Double value=DoubleValue.getDoubleExtra("Double",0.0);
        tv3.setText("Double value received is: "+value);
    }
}