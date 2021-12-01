package com.example.faces;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PicturesAdapter extends BaseAdapter {
    Context con;
    ArrayList<String> data;

    public PicturesAdapter(Context con, ArrayList<String> data){
        this.con = con;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        LayoutInflater layInf = LayoutInflater.from(con);
        View v = layInf.inflate(R.layout.picture_view, null);
        TextView tvnome = v.findViewById(R.id.tvnome);
        tvnome.setText(data.get(pos));

        return v;
    }
}
