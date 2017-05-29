package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sunita on 5/29/2017.
 */

public class MyAdapter extends BaseAdapter {
    private final Context context;
    private final List<MyItem> dataset;
    private LayoutInflater inflater;
    public MyAdapter(Context context, List<MyItem> dataset)
    {
        this.context=context;
        this.dataset=dataset;
    }
    @Override
    public int getCount() {
        return dataset.size();
    }

    @Override
    public Object getItem(int position) {
        return dataset.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position * 15;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View imageroot=inflater.inflate(R.layout.myview,parent,false);
        ((ImageView)imageroot.findViewById(R.id.image1)).setImageResource(dataset.get(position).imgId);
        ((TextView)imageroot.findViewById(R.id.text1)).setText(dataset.get(position).text);
        return imageroot;
    }

}
