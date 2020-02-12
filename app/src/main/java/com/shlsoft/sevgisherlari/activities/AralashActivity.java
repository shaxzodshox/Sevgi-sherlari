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

public class AralashActivity extends AppCompatActivity{
    private ListView listView;
    String[] aralash_full;

    private String[] aralash_title = {
            "Robbim asra",
            "Zirapcha",
            "Xudodan qorqinglar singillar",
            "Gaz bermang",
            "G'iybatchilar, hormanglar!",
            "Tush ko'rganga o'xshayman",
            "4 kunlik dunyo",
            "Rashqli bo'ling",
            "Yomg'ir",
            "Bitta",
            "Xudoga soldim",
            "Go'zaldur inson",
            "Sog'ingandurman",
            "Baxtli kunlarimdan soniyam ko'proq",
            "Suymaganga suykalma",
            "Oqibat",
            "Men uchun",
            "Alloh qasosi",
            "Musofirlarim",
            "Yonimda bir go'zal qalam qosh",
            "Unutma erkak",
            "Yo'qsa kofir deya qilurlar e'lon",
            "O'lim...",
            "Talabaning ota-onasiga",
            "Yiqilsang",
            "Kun kelar men sizdan baxtli bo'laman",
            "Chimildiqda aldanma yigit",
            "Qamoqdan nola",
            "Kambag'alni qizin sevsam bo'lar ekan",
            "Uzr so'ray Allohdan",
            "Sabr qiling bari o'tadi",
            "Diydor",
            "Yig'lamang",
            "Yolg'izlik",
            "Yoshlikni sogʻindim onajon",
            "Sevgi bundaymas",
            "Haqiqiy erkak",
            "To'ylar muborak bo'lsin",
            "Yor bo'lasanmi...",
            "Xotinni onadan afzal bilganlar",
            "Sog'inasan",
            "Ayol, ayol bo‘lgani yaxshi",
            "Hayot nima o'zi?",
            "Qismatim",
            "Menman",
            "Qo'rqaman onamdan judo bo'lishdan",
            "Kechagi kuningni unutib qo'yma",
            "Sendan boshqa kimim bor"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyric_list);
        setTitle("Aralash sherlar");

        listView = findViewById(R.id.listView);
        getFullLyric();

        final CustomAdapter adapter = new CustomAdapter(this, aralash_title, R.drawable.book_icon);
        listView.setAdapter(adapter);

        final Intent intent = new Intent(AralashActivity.this, SherActivity.class);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent.putExtra("title", aralash_title[0]);
                        intent.putExtra("lyric", aralash_full[0]);
                        intent.putExtra("id", 0);
                        break;

                    case 1:
                        intent.putExtra("title", aralash_title[1]);
                        intent.putExtra("lyric", aralash_full[1]);
                        intent.putExtra("id", 1);
                        break;

                    case 2:
                        intent.putExtra("title", aralash_title[2]);
                        intent.putExtra("lyric", aralash_full[2]);
                        intent.putExtra("id", 2);
                        break;

                    case 3:
                        intent.putExtra("title", aralash_title[3]);
                        intent.putExtra("lyric", aralash_full[3]);
                        intent.putExtra("id", 3);
                        break;

                    case 4:
                        intent.putExtra("title", aralash_title[4]);
                        intent.putExtra("lyric", aralash_full[4]);
                        intent.putExtra("id", 4);
                        break;

                    case 5:
                        intent.putExtra("title", aralash_title[5]);
                        intent.putExtra("lyric", aralash_full[5]);
                        intent.putExtra("id", 5);
                        break;

                    case 6:
                        intent.putExtra("title", aralash_title[6]);
                        intent.putExtra("lyric", aralash_full[6]);
                        intent.putExtra("id", 6);
                        break;

                    case 7:
                        intent.putExtra("title", aralash_title[7]);
                        intent.putExtra("lyric", aralash_full[7]);
                        intent.putExtra("id", 7);
                        break;

                    case 8:
                        intent.putExtra("title", aralash_title[8]);
                        intent.putExtra("lyric", aralash_full[8]);
                        intent.putExtra("id", 8);
                        break;

                    case 9:
                        intent.putExtra("title", aralash_title[9]);
                        intent.putExtra("lyric", aralash_full[9]);
                        intent.putExtra("id", 9);
                        break;

                    case 10:
                        intent.putExtra("title", aralash_title[10]);
                        intent.putExtra("lyric", aralash_full[10]);
                        intent.putExtra("id", 10);
                        break;

                    case 11:
                        intent.putExtra("title", aralash_title[11]);
                        intent.putExtra("lyric", aralash_full[11]);
                        intent.putExtra("id", 11);
                        break;

                    case 12:
                        intent.putExtra("title", aralash_title[12]);
                        intent.putExtra("lyric", aralash_full[12]);
                        intent.putExtra("id", 12);
                        break;

                    case 13:
                        intent.putExtra("title", aralash_title[13]);
                        intent.putExtra("lyric", aralash_full[13]);
                        intent.putExtra("id", 13);
                        break;

                    case 14:
                        intent.putExtra("title", aralash_title[14]);
                        intent.putExtra("lyric", aralash_full[14]);
                        intent.putExtra("id", 14);
                        break;

                    case 15:
                        intent.putExtra("title", aralash_title[15]);
                        intent.putExtra("lyric", aralash_full[15]);
                        intent.putExtra("id", 15);
                        break;

                    case 16:
                        intent.putExtra("title", aralash_title[16]);
                        intent.putExtra("lyric", aralash_full[16]);
                        intent.putExtra("id", 16);
                        break;

                    case 17:
                        intent.putExtra("title", aralash_title[17]);
                        intent.putExtra("lyric", aralash_full[17]);
                        intent.putExtra("id", 17);
                        break;

                    case 18:
                        intent.putExtra("title", aralash_title[18]);
                        intent.putExtra("lyric", aralash_full[18]);
                        intent.putExtra("id", 18);
                        break;

                    case 19:
                        intent.putExtra("title", aralash_title[19]);
                        intent.putExtra("lyric", aralash_full[19]);
                        intent.putExtra("id", 19);
                        break;

                    case 20:
                        intent.putExtra("title", aralash_title[20]);
                        intent.putExtra("lyric", aralash_full[20]);
                        intent.putExtra("id", 20);
                        break;

                    case 21:
                        intent.putExtra("title", aralash_title[21]);
                        intent.putExtra("lyric", aralash_full[21]);
                        intent.putExtra("id", 21);
                        break;

                    case 22:
                        intent.putExtra("title", aralash_title[22]);
                        intent.putExtra("lyric", aralash_full[22]);
                        intent.putExtra("id", 22);
                        break;

                    case 23:
                        intent.putExtra("title", aralash_title[23]);
                        intent.putExtra("lyric", aralash_full[23]);
                        intent.putExtra("id", 23);
                        break;

                    case 24:
                        intent.putExtra("title", aralash_title[24]);
                        intent.putExtra("lyric", aralash_full[24]);
                        intent.putExtra("id", 24);
                        break;

                    case 25:
                        intent.putExtra("title", aralash_title[25]);
                        intent.putExtra("lyric", aralash_full[25]);
                        intent.putExtra("id", 25);
                        break;

                    case 26:
                        intent.putExtra("title", aralash_title[26]);
                        intent.putExtra("lyric", aralash_full[26]);
                        intent.putExtra("id", 26);
                        break;

                    case 27:
                        intent.putExtra("title", aralash_title[27]);
                        intent.putExtra("lyric", aralash_full[27]);
                        intent.putExtra("id", 27);
                        break;

                    case 28:
                        intent.putExtra("title", aralash_title[28]);
                        intent.putExtra("lyric", aralash_full[28]);
                        intent.putExtra("id", 28);
                        break;

                    case 29:
                        intent.putExtra("title", aralash_title[29]);
                        intent.putExtra("lyric", aralash_full[29]);
                        intent.putExtra("id", 29);
                        break;

                    case 30:
                        intent.putExtra("title", aralash_title[30]);
                        intent.putExtra("lyric", aralash_full[30]);
                        intent.putExtra("id", 30);
                        break;

                    case 31:
                        intent.putExtra("title", aralash_title[31]);
                        intent.putExtra("lyric", aralash_full[31]);
                        intent.putExtra("id", 31);
                        break;

                    case 32:
                        intent.putExtra("title", aralash_title[32]);
                        intent.putExtra("lyric", aralash_full[32]);
                        intent.putExtra("id", 32);
                        break;

                    case 33:
                        intent.putExtra("title", aralash_title[33]);
                        intent.putExtra("lyric", aralash_full[33]);
                        intent.putExtra("id", 33);
                        break;

                    case 34:
                        intent.putExtra("title", aralash_title[34]);
                        intent.putExtra("lyric", aralash_full[34]);
                        intent.putExtra("id", 34);
                        break;

                    case 35:
                        intent.putExtra("title", aralash_title[35]);
                        intent.putExtra("lyric", aralash_full[35]);
                        intent.putExtra("id", 35);
                        break;

                    case 36:
                        intent.putExtra("title", aralash_title[36]);
                        intent.putExtra("lyric", aralash_full[36]);
                        intent.putExtra("id", 36);
                        break;

                    case 37:
                        intent.putExtra("title", aralash_title[37]);
                        intent.putExtra("lyric", aralash_full[37]);
                        intent.putExtra("id", 37);
                        break;

                    case 38:
                        intent.putExtra("title", aralash_title[38]);
                        intent.putExtra("lyric", aralash_full[38]);
                        intent.putExtra("id", 38);
                        break;

                    case 39:
                        intent.putExtra("title", aralash_title[39]);
                        intent.putExtra("lyric", aralash_full[39]);
                        intent.putExtra("id", 39);
                        break;

                    case 40:
                        intent.putExtra("title", aralash_title[40]);
                        intent.putExtra("lyric", aralash_full[40]);
                        intent.putExtra("id", 40);
                        break;

                    case 41:
                        intent.putExtra("title", aralash_title[41]);
                        intent.putExtra("lyric", aralash_full[41]);
                        intent.putExtra("id", 41);
                        break;

                    case 42:
                        intent.putExtra("title", aralash_title[42]);
                        intent.putExtra("lyric", aralash_full[42]);
                        intent.putExtra("id", 42);
                        break;

                    case 43:
                        intent.putExtra("title", aralash_title[43]);
                        intent.putExtra("lyric", aralash_full[43]);
                        intent.putExtra("id", 43);
                        break;

                    case 44:
                        intent.putExtra("title", aralash_title[44]);
                        intent.putExtra("lyric", aralash_full[44]);
                        intent.putExtra("id", 44);
                        break;

                    case 45:
                        intent.putExtra("title", aralash_title[45]);
                        intent.putExtra("lyric", aralash_full[45]);
                        intent.putExtra("id", 45);
                        break;

                    case 46:
                        intent.putExtra("title", aralash_title[46]);
                        intent.putExtra("lyric", aralash_full[46]);
                        intent.putExtra("id", 46);
                        break;

                    case 47:
                        intent.putExtra("title", aralash_title[47]);
                        intent.putExtra("lyric", aralash_full[47]);
                        intent.putExtra("id", 47);
                        break;
                }
                startActivity(intent);
            }
        });
    }

    private void getFullLyric() {
        Resources res = getResources();
        aralash_full = res.getStringArray(R.array.aralash_lyric);
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

                for(int i = 0; i < aralash_full.length; i++){
                    if(aralash_title[i].toLowerCase().contains(newText.toLowerCase())){
                        searchList.add(aralash_title[i]);
                        positions.add(i);
                    }
                }
                final SearchAdapter adapter = new SearchAdapter(AralashActivity.this, searchList,
                        R.drawable.book_icon);
                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(AralashActivity.this, SherActivity.class);
                        intent.putExtra("title",searchList.get(position));
                        intent.putExtra("lyric", aralash_full[positions.get(position)]);
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
