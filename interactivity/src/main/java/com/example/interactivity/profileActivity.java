package com.example.interactivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
public class profileActivity extends AppCompatActivity {

    public static final java.lang.String KEYRES = "kres";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent resp=getIntent();
        Bundle bundle=resp.getExtras();

        if(bundle !=null)
        {
            String name=bundle.getString(MainActivity.KEYS);
            ((TextView)findViewById(R.id.t1)).setText(name);
        }
    }
    public void goBack(View view)
    {
        Bundle bundle=new Bundle();
        bundle.putString(KEYRES,getDevice());
        Intent i=new Intent();
        i.putExtras(bundle);
        setResult(RESULT_OK,i);
        finish();
    }
    private String getDevice()
    {
        return ((RadioGroup)findViewById(R.id.rgr)).getCheckedRadioButtonId() == R.id.r1 ? "Mob" : "RPi";

    }
}
