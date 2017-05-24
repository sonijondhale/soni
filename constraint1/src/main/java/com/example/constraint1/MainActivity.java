package com.example.constraint1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goImage1(View view) {
        populateImage(R.drawable.ic_airline_seat_recline_extra_black_24dp);
    }

    public void goImage2(View view) {
        populateImage(R.drawable.ic_android_black_24dp);
    }

    public void goImage3(View view) {
        populateImage(R.drawable.ic_directions_run_black_24dp);
    }
    private void populateImage(int image) {
        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageResource(image);
    }

}
