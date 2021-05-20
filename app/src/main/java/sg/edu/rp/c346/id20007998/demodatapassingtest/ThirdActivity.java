package sg.edu.rp.c346.id20007998.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv2=findViewById(R.id.textView2);

        Intent charReceived =getIntent();
        char Character=charReceived.getCharExtra("Char",'n');
        tv2.setText("Character value received is: "+Character);

    }
}