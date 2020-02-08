package com.android.sevgisherlari.ui.favorite;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.android.sevgisherlari.R;
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
        listView = root.findViewById(R.id.listView);
        DatabaseHelper dbHelper = new DatabaseHelper(getActivity());
        data = dbHelper.getData();
        getDataFromDB();

//        galleryViewModel.getText().observe(this, new Observer<String>() {
////            @Override
////            public void onChanged(@Nullable String s) {
////                textView.setText(s);
////            }
////        });

        final FavoriteAdapter adapter = new FavoriteAdapter(getActivity(), fav_title, R.drawable.arrow);
        listView.setAdapter(adapter);
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