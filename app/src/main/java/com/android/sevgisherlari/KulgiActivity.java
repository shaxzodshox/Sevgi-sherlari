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

public class KulgiActivity extends AppCompatActivity {

    private ListView listView;
    String[] kulgili_full;

    private String[] kulgili_title = {
            "Kollej qizlariga",
            "Kuyov boʼlmay oʼl, bolam!",
            "Ey oʼzbek",
            "Telefon",
            "Dollar haqida",
            "Terma jamoa tarkibi",
            "Kalbosh",
            "Bo'lay desang alkash",
            "Aqilli sarflar bir martta",
            "Boshqa yo'nalish",
            "Aka dollar ko'tarildi",
            "Mazza qilib",
            "Qizlarga",
            "Mensizlikda sensizlik",
            "Yorsiz qolasiz",
            "Maslahat",
            "Avtobusda",
            "Yomon qo'rqdim",
            "O'zbek futboli mundiyalga chiqolmadi",
            "1-Avgust",
            "Kollej talabalari dardi",
            "Mebelsiz xotin",
            "Zato bizlar TALABA",
            "Uchmiydigan bo'libdi",
            "ODNO degan tomonda",
            "O'qishga kirolmaganlar",
            "Yalmog'iz",
            "Sev bittasini",
            "Haftalik hayot",
            "Piyoz to’g’rayapman",
            "Mazam qochadi",
            "Internet mish-mishlari"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyric_list);
        setTitle("Kulgili sherlar");

        listView = findViewById(R.id.listView);
        getFullLyric();

        final CustomAdapter adapter = new CustomAdapter(this, kulgili_title, R.drawable.kulgili_icon);
        listView.setAdapter(adapter);

        final Intent intent = new Intent(KulgiActivity.this, SherActivity.class);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent.putExtra("title", kulgili_title[0]);
                        intent.putExtra("lyric", kulgili_full[0]);
                        intent.putExtra("id", 0);
                        break;

                    case 1:
                        intent.putExtra("title", kulgili_title[1]);
                        intent.putExtra("lyric", kulgili_full[1]);
                        intent.putExtra("id", 1);
                        break;

                    case 2:
                        intent.putExtra("title", kulgili_title[2]);
                        intent.putExtra("lyric", kulgili_full[2]);
                        intent.putExtra("id", 2);
                        break;

                    case 3:
                        intent.putExtra("title", kulgili_title[3]);
                        intent.putExtra("lyric", kulgili_full[3]);
                        intent.putExtra("id", 3);
                        break;

                    case 4:
                        intent.putExtra("title", kulgili_title[4]);
                        intent.putExtra("lyric", kulgili_full[4]);
                        intent.putExtra("id", 4);
                        break;

                    case 5:
                        intent.putExtra("title", kulgili_title[5]);
                        intent.putExtra("lyric", kulgili_full[5]);
                        intent.putExtra("id", 5);
                        break;

                    case 6:
                        intent.putExtra("title", kulgili_title[6]);
                        intent.putExtra("lyric", kulgili_full[6]);
                        intent.putExtra("id", 6);
                        break;

                    case 7:
                        intent.putExtra("title", kulgili_title[7]);
                        intent.putExtra("lyric", kulgili_full[7]);
                        intent.putExtra("id", 7);
                        break;

                    case 8:
                        intent.putExtra("title", kulgili_title[8]);
                        intent.putExtra("lyric", kulgili_full[8]);
                        intent.putExtra("id", 8);
                        break;

                    case 9:
                        intent.putExtra("title", kulgili_title[9]);
                        intent.putExtra("lyric", kulgili_full[9]);
                        intent.putExtra("id", 9);
                        break;

                    case 10:
                        intent.putExtra("title", kulgili_title[10]);
                        intent.putExtra("lyric", kulgili_full[10]);
                        intent.putExtra("id", 10);
                        break;

                    case 11:
                        intent.putExtra("title", kulgili_title[11]);
                        intent.putExtra("lyric", kulgili_full[11]);
                        intent.putExtra("id", 11);
                        break;

                    case 12:
                        intent.putExtra("title", kulgili_title[12]);
                        intent.putExtra("lyric", kulgili_full[12]);
                        intent.putExtra("id", 12);
                        break;

                    case 13:
                        intent.putExtra("title", kulgili_title[13]);
                        intent.putExtra("lyric", kulgili_full[13]);
                        intent.putExtra("id", 13);
                        break;

                    case 14:
                        intent.putExtra("title", kulgili_title[14]);
                        intent.putExtra("lyric", kulgili_full[14]);
                        intent.putExtra("id", 14);
                        break;

                    case 15:
                        intent.putExtra("title", kulgili_title[15]);
                        intent.putExtra("lyric", kulgili_full[15]);
                        intent.putExtra("id", 15);
                        break;

                    case 16:
                        intent.putExtra("title", kulgili_title[16]);
                        intent.putExtra("lyric", kulgili_full[16]);
                        intent.putExtra("id", 16);
                        break;

                    case 17:
                        intent.putExtra("title", kulgili_title[17]);
                        intent.putExtra("lyric", kulgili_full[17]);
                        intent.putExtra("id", 17);
                        break;

                    case 18:
                        intent.putExtra("title", kulgili_title[18]);
                        intent.putExtra("lyric", kulgili_full[18]);
                        intent.putExtra("id", 18);
                        break;

                    case 19:
                        intent.putExtra("title", kulgili_title[19]);
                        intent.putExtra("lyric", kulgili_full[19]);
                        intent.putExtra("id", 19);
                        break;

                    case 20:
                        intent.putExtra("title", kulgili_title[20]);
                        intent.putExtra("lyric", kulgili_full[20]);
                        intent.putExtra("id", 20);
                        break;

                    case 21:
                        intent.putExtra("title", kulgili_title[21]);
                        intent.putExtra("lyric", kulgili_full[21]);
                        intent.putExtra("id", 21);
                        break;

                    case 22:
                        intent.putExtra("title", kulgili_title[22]);
                        intent.putExtra("lyric", kulgili_full[22]);
                        intent.putExtra("id", 22);
                        break;

                    case 23:
                        intent.putExtra("title", kulgili_title[23]);
                        intent.putExtra("lyric", kulgili_full[23]);
                        intent.putExtra("id", 23);
                        break;

                    case 24:
                        intent.putExtra("title", kulgili_title[24]);
                        intent.putExtra("lyric", kulgili_full[24]);
                        intent.putExtra("id", 24);
                        break;

                    case 25:
                        intent.putExtra("title", kulgili_title[25]);
                        intent.putExtra("lyric", kulgili_full[25]);
                        intent.putExtra("id", 25);
                        break;

                    case 26:
                        intent.putExtra("title", kulgili_title[26]);
                        intent.putExtra("lyric", kulgili_full[26]);
                        intent.putExtra("id", 26);
                        break;

                    case 27:
                        intent.putExtra("title", kulgili_title[27]);
                        intent.putExtra("lyric", kulgili_full[27]);
                        intent.putExtra("id", 27);
                        break;

                    case 28:
                        intent.putExtra("title", kulgili_title[28]);
                        intent.putExtra("lyric", kulgili_full[28]);
                        intent.putExtra("id", 28);
                        break;

                    case 29:
                        intent.putExtra("title", kulgili_title[29]);
                        intent.putExtra("lyric", kulgili_full[29]);
                        intent.putExtra("id", 29);
                        break;

                    case 30:
                        intent.putExtra("title", kulgili_title[30]);
                        intent.putExtra("lyric", kulgili_full[30]);
                        intent.putExtra("id", 30);
                        break;

                    case 31:
                        intent.putExtra("title", kulgili_title[31]);
                        intent.putExtra("lyric", kulgili_full[31]);
                        intent.putExtra("id", 31);
                        break;
                }
                startActivity(intent);
            }
        });
    }

    private void getFullLyric() {
        Resources res = getResources();
        kulgili_full = res.getStringArray(R.array.kulgili_lyrics);
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

                for(int i = 0; i < kulgili_full.length; i++){
                    if(kulgili_title[i].toLowerCase().contains(newText.toLowerCase())){
                        searchList.add(kulgili_title[i]);
                        positions.add(i);
                    }
                }
                final SearchAdapter adapter = new SearchAdapter(KulgiActivity.this, searchList,
                        R.drawable.kulgili_icon);
                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(KulgiActivity.this, SherActivity.class);
                        intent.putExtra("title",searchList.get(position));
                        intent.putExtra("lyric", kulgili_full[positions.get(position)]);
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
