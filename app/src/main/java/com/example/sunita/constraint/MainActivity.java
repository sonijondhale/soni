package com.example.sunita.constraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1= (Button) findViewById(R.id.log);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e1= (EditText) findViewById(R.id.user);
                String user=e1.getText().toString();

                EditText e2= (EditText) findViewById(R.id.pass);
                String pass=e2.getText().toString();

                TextView txt= (TextView) findViewById(R.id.msg);

                if(user.equalsIgnoreCase("sunita") && pass.equalsIgnoreCase("samarth"))
                {
                    txt.setText("sucess");
                }
                else
                {
                    txt.setText("fail");
                }
            }
        });
    }
}
