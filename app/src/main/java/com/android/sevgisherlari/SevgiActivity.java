package com.android.sevgisherlari;

import androidx.appcompat.app.AppCompatActivity;

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

import com.android.sevgisherlari.adapter.CustomAdapter;
import com.android.sevgisherlari.adapter.SearchAdapter;

import java.util.ArrayList;

public class SevgiActivity extends AppCompatActivity {

    private ListView listView;
    String[] sevgi_full;

    private String[] sevgi_title = {
            "Men uchun ham o`zingni asra",
            "Sensizlikka o’rganib qoldim",
            "Senku, sevgim, bo’lajak yorim!!!",
            "Nechun kelmading?",
            "Ashaddiy yurakni ko’rmasang bo’ldi",
            "Kimgadir shodliksan, kim uchun qaygu…",
            "Qalbim malikasi",
            "Yuragim",
            "Ketma baxtimdan",
            "Ishqda kuyib",
            "Ikki marta sevib bo'lmaydi",
            "Begim",
            "Seni sevaman",
            "Ne uchun",
            "Yoningizga qaytgim keladi",
            "Kechirmayman",
            "Sevaveraman",
            "Men sevgan qiz endi kelin",
            "Bizni taqdir birlashtirsin",
            "Yig'lama muhabbat",
            "Seni ilk uchratganimda",
            "Men ko'nikdim",
            "Atirgulim",
            "Yarim yurak",
            "Arzimaysan ko'z yoshlarimga",
            "Yana sevasanmi yoninga qaytsam",
            "Xotira",
            "Aldangan ko'ngil",
            "Suymaganga dil berma",
            "Sensizlik",
            "Ketganingdan beri",
            "Baxtli bo'lgin bevafo",
            "Jufti halolim",
            "Hayol surib hayolimni olgan qiz",
            "Afsuslanasan",
            "Tikon ko'rdim lolamdan",
            "Yig'layapsan ko'zlaringda yosh",
            "Qo'ng'irog'ing kutdim intizor",
            "Seni sevganlarim yodinga tushsin",
            "Kechir,sevishimni aytolmadim..."
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevgi);

        listView = findViewById(R.id.listView);

        getFullLyric();

        final CustomAdapter adapter = new CustomAdapter(this, sevgi_title, R.drawable.heart_2);
        listView.setAdapter(adapter);

        final Intent intent = new Intent(SevgiActivity.this, SherActivity.class);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent.putExtra("title",sevgi_title[0]);
                        intent.putExtra("lyric",sevgi_full[0]);
                        intent.putExtra("id", 0);
                        break;

                    case 1:
                        intent.putExtra("title",sevgi_title[1]);
                        intent.putExtra("lyric",sevgi_full[1]);
                        intent.putExtra("id", 1);
                        break;

                    case 2:
                        intent.putExtra("title",sevgi_title[2]);
                        intent.putExtra("lyric",sevgi_full[2]);
                        intent.putExtra("id", 2);
                        break;

                    case 3:
                        intent.putExtra("title",sevgi_title[3]);
                        intent.putExtra("lyric",sevgi_full[3]);
                        intent.putExtra("id", 3);
                        break;

                    case 4:
                        intent.putExtra("title",sevgi_title[4]);
                        intent.putExtra("lyric",sevgi_full[4]);
                        intent.putExtra("id", 4);
                        break;

                    case 5:
                        intent.putExtra("title",sevgi_title[5]);
                        intent.putExtra("lyric",sevgi_full[5]);
                        intent.putExtra("id", 5);
                        break;

                    case 6:
                        intent.putExtra("title",sevgi_title[6]);
                        intent.putExtra("lyric",sevgi_full[6]);
                        intent.putExtra("id", 6);
                        break;

                    case 7:
                        intent.putExtra("title",sevgi_title[7]);
                        intent.putExtra("lyric",sevgi_full[7]);
                        intent.putExtra("id", 7);
                        break;

                    case 8:
                        intent.putExtra("title",sevgi_title[8]);
                        intent.putExtra("lyric",sevgi_full[8]);
                        intent.putExtra("id", 8);
                        break;

                    case 9:
                        intent.putExtra("title",sevgi_title[9]);
                        intent.putExtra("lyric",sevgi_full[9]);
                        intent.putExtra("id", 9);
                        break;

                    case 10:
                        intent.putExtra("title",sevgi_title[10]);
                        intent.putExtra("lyric",sevgi_full[10]);
                        intent.putExtra("id", 10);
                        break;

                    case 11:
                        intent.putExtra("title",sevgi_title[11]);
                        intent.putExtra("lyric",sevgi_full[11]);
                        intent.putExtra("id", 11);
                        break;

                    case 12:
                        intent.putExtra("title",sevgi_title[12]);
                        intent.putExtra("lyric",sevgi_full[12]);
                        intent.putExtra("id", 12);
                        break;

                    case 13:
                        intent.putExtra("title",sevgi_title[13]);
                        intent.putExtra("lyric",sevgi_full[13]);
                        intent.putExtra("id", 13);
                        break;

                    case 14:
                        intent.putExtra("title",sevgi_title[14]);
                        intent.putExtra("lyric",sevgi_full[14]);
                        intent.putExtra("id", 14);
                        break;

                    case 15:
                        intent.putExtra("title",sevgi_title[15]);
                        intent.putExtra("lyric",sevgi_full[15]);
                        intent.putExtra("id", 15);
                        break;

                    case 16:
                        intent.putExtra("title",sevgi_title[16]);
                        intent.putExtra("lyric",sevgi_full[16]);
                        intent.putExtra("id", 16);
                        break;

                    case 17:
                        intent.putExtra("title",sevgi_title[17]);
                        intent.putExtra("lyric",sevgi_full[17]);
                        intent.putExtra("id", 17);
                        break;
                    case 18:
                        intent.putExtra("title",sevgi_title[18]);
                        intent.putExtra("lyric",sevgi_full[18]);
                        intent.putExtra("id", 18);
                        break;

                    case 19:
                        intent.putExtra("title",sevgi_title[19]);
                        intent.putExtra("lyric",sevgi_full[19]);
                        intent.putExtra("id", 19);
                        break;

                    case 20:
                        intent.putExtra("title",sevgi_title[20]);
                        intent.putExtra("lyric",sevgi_full[20]);
                        intent.putExtra("id", 20);
                        break;

                    case 21:
                        intent.putExtra("title",sevgi_title[21]);
                        intent.putExtra("lyric",sevgi_full[21]);
                        intent.putExtra("id", 21);
                        break;

                    case 22:
                        intent.putExtra("title",sevgi_title[22]);
                        intent.putExtra("lyric",sevgi_full[22]);
                        intent.putExtra("id", 22);
                        break;

                    case 23:
                        intent.putExtra("title",sevgi_title[23]);
                        intent.putExtra("lyric",sevgi_full[23]);
                        intent.putExtra("id", 23);
                        break;

                    case 24:
                        intent.putExtra("title",sevgi_title[24]);
                        intent.putExtra("lyric",sevgi_full[24]);
                        intent.putExtra("id", 24);
                        break;

                    case 25:
                        intent.putExtra("title",sevgi_title[25]);
                        intent.putExtra("lyric",sevgi_full[25]);
                        intent.putExtra("id", 25);
                        break;

                    case 26:
                        intent.putExtra("title",sevgi_title[26]);
                        intent.putExtra("lyric",sevgi_full[26]);
                        intent.putExtra("id", 26);
                        break;

                    case 27:
                        intent.putExtra("title",sevgi_title[27]);
                        intent.putExtra("lyric",sevgi_full[27]);
                        intent.putExtra("id", 27);
                        break;

                    case 28:
                        intent.putExtra("title",sevgi_title[28]);
                        intent.putExtra("lyric",sevgi_full[28]);
                        intent.putExtra("id", 28);
                        break;

                    case 29:
                        intent.putExtra("title",sevgi_title[29]);
                        intent.putExtra("lyric",sevgi_full[29]);
                        intent.putExtra("id", 29);
                        break;

                    case 30:
                        intent.putExtra("title",sevgi_title[30]);
                        intent.putExtra("lyric",sevgi_full[30]);
                        intent.putExtra("id", 30);
                        break;

                    case 31:
                        intent.putExtra("title",sevgi_title[31]);
                        intent.putExtra("lyric",sevgi_full[31]);
                        intent.putExtra("id", 31);
                        break;

                    case 32:
                        intent.putExtra("title",sevgi_title[32]);
                        intent.putExtra("lyric",sevgi_full[32]);
                        intent.putExtra("id", 32);
                        break;
                    case 33:
                        intent.putExtra("title",sevgi_title[33]);
                        intent.putExtra("lyric",sevgi_full[33]);
                        intent.putExtra("id", 33);
                        break;

                    case 34:
                        intent.putExtra("title",sevgi_title[34]);
                        intent.putExtra("lyric",sevgi_full[34]);
                        intent.putExtra("id", 34);
                        break;

                    case 35:
                        intent.putExtra("title",sevgi_title[35]);
                        intent.putExtra("lyric",sevgi_full[35]);
                        intent.putExtra("id", 35);
                        break;

                    case 36:
                        intent.putExtra("title",sevgi_title[36]);
                        intent.putExtra("lyric",sevgi_full[36]);
                        intent.putExtra("id", 36);
                        break;

                    case 37:
                        intent.putExtra("title",sevgi_title[37]);
                        intent.putExtra("lyric",sevgi_full[37]);
                        intent.putExtra("id", 37);
                        break;

                    case 38:
                        intent.putExtra("title",sevgi_title[38]);
                        intent.putExtra("lyric",sevgi_full[38]);
                        intent.putExtra("id", 38);
                        break;

                    case 39:
                        intent.putExtra("title",sevgi_title[39]);
                        intent.putExtra("lyric",sevgi_full[39]);
                        intent.putExtra("id", 39);
                        break;

                    case 40:
                        intent.putExtra("title",sevgi_title[40]);
                        intent.putExtra("lyric",sevgi_full[40]);
                        intent.putExtra("id", 40);
                        break;

                }

                startActivity(intent);
            }
        });

    }
    private void getFullLyric() {
        Resources res = getResources();
        sevgi_full = res.getStringArray(R.array.sevgi_lyrics);
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

                for(int i = 0; i < sevgi_full.length; i++){
                    if(sevgi_title[i].toLowerCase().contains(newText.toLowerCase())){
                        searchList.add(sevgi_title[i]);
                        positions.add(i);
                    }
                }
                final SearchAdapter adapter = new SearchAdapter(SevgiActivity.this, searchList, R.drawable.heart_2);
                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(SevgiActivity.this, SherActivity.class);
                        intent.putExtra("title",searchList.get(position));
                        intent.putExtra("lyric",sevgi_full[positions.get(position)]);
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
