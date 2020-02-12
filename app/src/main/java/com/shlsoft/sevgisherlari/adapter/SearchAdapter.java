package com.shlsoft.sevgisherlari.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shlsoft.sevgisherlari.R;

import java.util.ArrayList;

public class SearchAdapter extends ArrayAdapter {
    private final Activity context;
    private final ArrayList<String> list;
    private int icon;

    public SearchAdapter(Activity context, ArrayList<String> list, int icon) {
        super(context, R.layout.custom_list, list);
        this.context = context;
        this.list = list;
        this.icon = icon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint("ViewHolder")
        View row = inflater.inflate(R.layout.custom_list, null, false);
        TextView title = (TextView) row.findViewById(R.id.title_view);
        ImageView imageView = row.findViewById(R.id.icon_list);

        title.setText(list.get(position));
        imageView.setImageResource(icon);
        return row;
    }
}
