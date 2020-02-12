package com.shlsoft.sevgisherlari.activities;

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

import com.shlsoft.sevgisherlari.R;
import com.shlsoft.sevgisherlari.adapter.CustomAdapter;
import com.shlsoft.sevgisherlari.adapter.SearchAdapter;

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
            "Tilayman",
            "Bugungi ayyomiz muborak bo'lsin!",
            "Tug'ilgan kuningiz bilan ona",
            "Har kuningiz o’tsin bayramday har on!",
            "8-mart tabrik - 1",
            "8-mart tabrik - 2",
            "Bugun tug'ilgan kunim",
            "Xayrli tun jonginam",
            "To'yda aytiladigan sher",
            "Kelinchak uchun tabrik sheri",
            "Robbim sizni asrasin",
            "Tug'ulgan kuningiz bilan aka",
            "8-Mart uchun ajoyib tabrik",
            "Ustozga tilak",
            "Aziz muallim",
            "Hayit muborak - 1",
            "Hayit muborak - 2",
            "Toychog'im mani",
            "Ro'za muborak",
            "O'qigan insonga XAYRLI OQSHOM!",
            "Sizga tilayman shirin bir uyqu",
            "Yangi yil yangi kun",
            "Yangi yil tabrigi",
            "Aziz sinfdoshlarim!",
            "So'nggi qo'ng'iroq",
            "Vatan"
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

                    case 10:
                        intent.putExtra("title", tabrik_title[10]);
                        intent.putExtra("lyric", tabrik_full[10]);
                        intent.putExtra("id", 10);
                        break;

                    case 11:
                        intent.putExtra("title", tabrik_title[11]);
                        intent.putExtra("lyric", tabrik_full[11]);
                        intent.putExtra("id", 11);
                        break;

                    case 12:
                        intent.putExtra("title", tabrik_title[12]);
                        intent.putExtra("lyric", tabrik_full[12]);
                        intent.putExtra("id", 12);
                        break;

                    case 13:
                        intent.putExtra("title", tabrik_title[13]);
                        intent.putExtra("lyric", tabrik_full[13]);
                        intent.putExtra("id", 13);
                        break;

                    case 14:
                        intent.putExtra("title", tabrik_title[14]);
                        intent.putExtra("lyric", tabrik_full[14]);
                        intent.putExtra("id", 14);
                        break;

                    case 15:
                        intent.putExtra("title", tabrik_title[15]);
                        intent.putExtra("lyric", tabrik_full[15]);
                        intent.putExtra("id", 15);
                        break;

                    case 16:
                        intent.putExtra("title", tabrik_title[16]);
                        intent.putExtra("lyric", tabrik_full[16]);
                        intent.putExtra("id", 16);
                        break;

                    case 17:
                        intent.putExtra("title", tabrik_title[17]);
                        intent.putExtra("lyric", tabrik_full[17]);
                        intent.putExtra("id", 17);
                        break;

                    case 18:
                        intent.putExtra("title", tabrik_title[18]);
                        intent.putExtra("lyric", tabrik_full[18]);
                        intent.putExtra("id", 18);
                        break;

                    case 19:
                        intent.putExtra("title", tabrik_title[19]);
                        intent.putExtra("lyric", tabrik_full[19]);
                        intent.putExtra("id", 19);
                        break;

                    case 20:
                        intent.putExtra("title", tabrik_title[20]);
                        intent.putExtra("lyric", tabrik_full[20]);
                        intent.putExtra("id", 20);
                        break;

                    case 21:
                        intent.putExtra("title", tabrik_title[21]);
                        intent.putExtra("lyric", tabrik_full[21]);
                        intent.putExtra("id", 21);
                        break;

                    case 22:
                        intent.putExtra("title", tabrik_title[22]);
                        intent.putExtra("lyric", tabrik_full[22]);
                        intent.putExtra("id", 22);
                        break;

                    case 23:
                        intent.putExtra("title", tabrik_title[23]);
                        intent.putExtra("lyric", tabrik_full[23]);
                        intent.putExtra("id", 23);
                        break;

                    case 24:
                        intent.putExtra("title", tabrik_title[24]);
                        intent.putExtra("lyric", tabrik_full[24]);
                        intent.putExtra("id", 24);
                        break;

                    case 25:
                        intent.putExtra("title", tabrik_title[25]);
                        intent.putExtra("lyric", tabrik_full[25]);
                        intent.putExtra("id", 25);
                        break;

                    case 26:
                        intent.putExtra("title", tabrik_title[26]);
                        intent.putExtra("lyric", tabrik_full[26]);
                        intent.putExtra("id", 26);
                        break;

                    case 27:
                        intent.putExtra("title", tabrik_title[27]);
                        intent.putExtra("lyric", tabrik_full[27]);
                        intent.putExtra("id", 27);
                        break;

                    case 28:
                        intent.putExtra("title", tabrik_title[28]);
                        intent.putExtra("lyric", tabrik_full[28]);
                        intent.putExtra("id", 28);
                        break;

                    case 29:
                        intent.putExtra("title", tabrik_title[29]);
                        intent.putExtra("lyric", tabrik_full[29]);
                        intent.putExtra("id", 29);
                        break;

                    case 30:
                        intent.putExtra("title", tabrik_title[30]);
                        intent.putExtra("lyric", tabrik_full[30]);
                        intent.putExtra("id", 30);
                        break;

                    case 31:
                        intent.putExtra("title", tabrik_title[31]);
                        intent.putExtra("lyric", tabrik_full[31]);
                        intent.putExtra("id", 31);
                        break;

                    case 32:
                        intent.putExtra("title", tabrik_title[32]);
                        intent.putExtra("lyric", tabrik_full[32]);
                        intent.putExtra("id", 32);
                        break;

                    case 33:
                        intent.putExtra("title", tabrik_title[33]);
                        intent.putExtra("lyric", tabrik_full[33]);
                        intent.putExtra("id", 33);
                        break;

                    case 34:
                        intent.putExtra("title", tabrik_title[34]);
                        intent.putExtra("lyric", tabrik_full[34]);
                        intent.putExtra("id", 34);
                        break;

                    case 35:
                        intent.putExtra("title", tabrik_title[35]);
                        intent.putExtra("lyric", tabrik_full[35]);
                        intent.putExtra("id", 35);
                        break;

                    case 36:
                        intent.putExtra("title", tabrik_title[36]);
                        intent.putExtra("lyric", tabrik_full[36]);
                        intent.putExtra("id", 36);
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
