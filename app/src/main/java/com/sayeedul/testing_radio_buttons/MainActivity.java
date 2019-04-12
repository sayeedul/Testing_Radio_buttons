package com.sayeedul.testing_radio_buttons;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup; RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radio_group_color);
        relativeLayout = findViewById(R.id.realative_layout);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton r = null;
                switch(i)
                {
                    case R.id.radio_red : r = findViewById(R.id.radio_red); break;
                    case R.id.radio_green : r = findViewById(R.id.radio_green); break;
                    case R.id.radio_blue : r = findViewById(R.id.radio_blue); break;
                    case R.id.radio_yellow : r = findViewById(R.id.radio_yellow); break;
                }
                radioGroup.setBackgroundColor(Color.parseColor(r.getText().toString()));
            }
        });

    }

}
