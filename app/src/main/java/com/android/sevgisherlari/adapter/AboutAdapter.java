package com.android.sevgisherlari.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.sevgisherlari.R;

public class AboutAdapter extends ArrayAdapter {
    private final Activity context;
    private final String[] list;
    private final String[] desc;
    private int icon[];

    public AboutAdapter(Activity context, String[] list, String[] desc, int[] icon) {
        super(context, R.layout.about_list, list);
        this.context = context;
        this.list = list;
        this.icon = icon;
        this.desc = desc;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        @SuppressLint("ViewHolder")
        View row = inflater.inflate(R.layout.about_list, null, false);
        TextView title = (TextView) row.findViewById(R.id.title_view);
        TextView description = row.findViewById(R.id.description_view);
        ImageView imageView = row.findViewById(R.id.icon_list);

        title.setText(list[position]);
        description.setText(desc[position]);
        imageView.setImageResource(icon[position]);
        return row;
    }
}
