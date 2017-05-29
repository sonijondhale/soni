package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custom();
    }
        public void simple()
    {
        //create list on listview
        List<String> dataset= new ArrayList<>();
        dataset.add("India");
        dataset.add("China");
        dataset.add("Japan");
        dataset.add("England");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dataset);
       ((ListView) findViewById(R.id.countryName)).setAdapter(adapter);

        //when we add on item it display on EditText
        ((ListView) findViewById(R.id.countryName)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArrayAdapter<String> adapterLocal = (ArrayAdapter<String>) parent.getAdapter();
                String country = adapterLocal.getItem(position);
                ((EditText) findViewById(R.id.countryText)).setText(country);
            }
        });
    }
    //when we type text on edittext then click addbutton display item on listview
    public void addCountry(View view) {
        ArrayAdapter<String> adapter = (ArrayAdapter<String>)((ListView) findViewById(R.id.countryName)).getAdapter();
        adapter.add(((EditText) findViewById(R.id.countryText)).getText().toString());
        adapter.notifyDataSetChanged();

    }
    private void custom()
    {
        List<MyItem>dataset=new ArrayList<>();
        dataset.add(new MyItem(R.mipmap.ic_launcher,"Android"));
        dataset.add(new MyItem(R.mipmap.ic_launcher,"Apple"));
        dataset.add(new MyItem(R.mipmap.ic_launcher,"Rim"));
        dataset.add(new MyItem(R.mipmap.ic_launcher,"Mango"));
        MyAdapter adapter=new MyAdapter(this,dataset);
        ((ListView)findViewById(R.id.countryName)).setAdapter(adapter);

    }
}
