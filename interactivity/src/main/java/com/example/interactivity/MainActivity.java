package com.example.interactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final java.lang.String KEYS = "kS";
    public  static final java.lang.String KEYI="kI";
    public static final int RE=123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goLog(View view) {
        String name= ((EditText)findViewById(R.id.uname)).getText().toString();


        String pass= ((EditText) findViewById(R.id.upass)).getText().toString();



        if(name.equalsIgnoreCase("ss")&& pass.equalsIgnoreCase("ss"))
        {
            Intent i = new Intent(MainActivity.this, profileActivity.class);
            Bundle bundle=new Bundle();
            bundle.putString("KEYS",name);
            bundle.putInt("KEYI",1233);
            //startActivity(i);
            startActivityForResult(i,RE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RE)
        {
            if(requestCode==RESULT_OK)
            {
                if(data !=null)
                {
                    Bundle bundle=data.getExtras();
                    String result=bundle.getString(profileActivity.KEYRES);
                    ((EditText) findViewById(R.id.uname)).setText(result);
                }
            }
        }
    }
}



