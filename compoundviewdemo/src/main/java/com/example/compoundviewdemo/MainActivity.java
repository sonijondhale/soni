package com.example.compoundviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

    }

    public void click(View view) {

        FrameLayout frame1= (FrameLayout) findViewById(R.id.frame1);
        frame1.removeAllViews();

        FrameLayout frame2=(FrameLayout)findViewById(R.id.frame2);
        frame2.removeAllViews();

        View viewInflated=inflater.inflate(R.layout.compoundview,frame1,true);
        ((CheckBox)findViewById(R.id.chk)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ((TextView)findViewById(R.id.text)).setText(Boolean.toString(isChecked));
            }
        });
        View viewInflated1=inflater.inflate(R.layout.compoundview,frame1,false);
        frame2.addView(viewInflated1);
    }
}