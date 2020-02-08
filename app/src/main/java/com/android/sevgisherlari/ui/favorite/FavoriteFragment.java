package com.android.sevgisherlari.ui.favorite;

import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import com.android.sevgisherlari.R;
import com.android.sevgisherlari.SherActivity;
import com.android.sevgisherlari.adapter.FavoriteAdapter;
import com.android.sevgisherlari.db.DatabaseHelper;

import java.util.ArrayList;

public class FavoriteFragment extends Fragment {

    private ListView listView;
    private FavoriteViewModel galleryViewModel;

    ArrayList<Integer> fav_id;
    ArrayList<String> fav_title;
    ArrayList<String> fav_lyric;

    Cursor data;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(FavoriteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_favorite, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        final TextView empty_msg_view = root.findViewById(R.id.empty_msg);
        listView = root.findViewById(R.id.listView);
        DatabaseHelper dbHelper = new DatabaseHelper(getActivity());
        data = dbHelper.getData();
        getDataFromDB();

        if(fav_id.size() == 0){
        empty_msg_view.setVisibility(View.VISIBLE);
        }

        final FavoriteAdapter adapter = new FavoriteAdapter(getActivity(), fav_title, R.drawable.star_30px);
        listView.setAdapter(adapter);

        final Intent intent = new Intent(getActivity(), SherActivity.class);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        intent.putExtra("title",fav_title.get(position));
                        intent.putExtra("lyric",fav_lyric.get(position));
                        intent.putExtra("id", fav_id.get(position));
                        startActivity(intent);
            }
        });

        return root;
    }

    public void getDataFromDB(){
        fav_id = new ArrayList<>();
        fav_title = new ArrayList<>();
        fav_lyric = new ArrayList<>();

        while (data.moveToNext()){
            fav_id.add(Integer.valueOf(data.getString(0)));
            fav_title.add(data.getString(1));
            fav_lyric.add(data.getString(2));
        }
    }

}