package com.android.sevgisherlari;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.sevgisherlari.adapter.CustomAdapter;
import com.android.sevgisherlari.adapter.SearchAdapter;

import java.util.ArrayList;

public class TabrikActivity extends AppCompatActivity {

    private ListView listView;
    String[] tabrik_full;

    private String[] tabrik_title = {
            "Umringiz",
            "Sokin tunda bezovta qilib...",
            "Tavallud Muborak",
            "Juma muborak - 1",
            "Juma muborak - 2",
            "Juma muborak - 3",
            "Juma namozidan qolmang",
            "Tug'ilgan kuning bilan o'glim",
            "Singlim",
            "Tilayman"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyric_list);
        setTitle("Tabrik SMS");
        listView = findViewById(R.id.listView);
        getFullLyric();

        final CustomAdapter adapter = new CustomAdapter(this, tabrik_title, R.drawable.tabrik_icon);
        listView.setAdapter(adapter);

        final Intent intent = new Intent(TabrikActivity.this, SherActivity.class);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent.putExtra("title", tabrik_title[0]);
                        intent.putExtra("lyric", tabrik_full[0]);
                        intent.putExtra("id", 0);
                        break;

                    case 1:
                        intent.putExtra("title", tabrik_title[1]);
                        intent.putExtra("lyric", tabrik_full[1]);
                        intent.putExtra("id", 1);
                        break;

                    case 2:
                        intent.putExtra("title", tabrik_title[2]);
                        intent.putExtra("lyric", tabrik_full[2]);
                        intent.putExtra("id", 2);
                        break;

                    case 3:
                        intent.putExtra("title", tabrik_title[3]);
                        intent.putExtra("lyric", tabrik_full[3]);
                        intent.putExtra("id", 3);
                        break;

                    case 4:
                        intent.putExtra("title", tabrik_title[4]);
                        intent.putExtra("lyric", tabrik_full[4]);
                        intent.putExtra("id", 4);
                        break;

                    case 5:
                        intent.putExtra("title", tabrik_title[5]);
                        intent.putExtra("lyric", tabrik_full[5]);
                        intent.putExtra("id", 5);
                        break;

                    case 6:
                        intent.putExtra("title", tabrik_title[6]);
                        intent.putExtra("lyric", tabrik_full[6]);
                        intent.putExtra("id", 6);
                        break;

                    case 7:
                        intent.putExtra("title", tabrik_title[7]);
                        intent.putExtra("lyric", tabrik_full[7]);
                        intent.putExtra("id", 7);
                        break;

                    case 8:
                        intent.putExtra("title", tabrik_title[8]);
                        intent.putExtra("lyric", tabrik_full[8]);
                        intent.putExtra("id", 8);
                        break;

                    case 9:
                        intent.putExtra("title", tabrik_title[9]);
                        intent.putExtra("lyric", tabrik_full[9]);
                        intent.putExtra("id", 9);
                        break;
                }
                startActivity(intent);
            }
        });
    }


    private void getFullLyric() {
        Resources res = getResources();
        tabrik_full = res.getStringArray(R.array.tabrik_lyrics);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setQueryHint("Qidirish...");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                final ArrayList<String> searchList = new ArrayList<>();
                final ArrayList<Integer> positions = new ArrayList<>();

                for(int i = 0; i < tabrik_full.length; i++){
                    if(tabrik_title[i].toLowerCase().contains(newText.toLowerCase())){
                        searchList.add(tabrik_title[i]);
                        positions.add(i);
                    }
                }
                final SearchAdapter adapter = new SearchAdapter(TabrikActivity.this, searchList,
                        R.drawable.tabrik_icon);
                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(TabrikActivity.this, SherActivity.class);
                        intent.putExtra("title",searchList.get(position));
                        intent.putExtra("lyric", tabrik_full[positions.get(position)]);
                        intent.putExtra("id",positions.get(position));

                        startActivity(intent);
                    }
                });

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

}
