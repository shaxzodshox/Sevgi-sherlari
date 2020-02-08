package com.android.sevgisherlari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.sevgisherlari.adapter.CustomAdapter;

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
            "Yoningizga qaytgim keladi",
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
                        break;

                    case 1:
                        intent.putExtra("title",sevgi_title[1]);
                        intent.putExtra("lyric",sevgi_full[1]);
                        break;

                    case 2:
                        intent.putExtra("title",sevgi_title[2]);
                        intent.putExtra("lyric",sevgi_full[2]);
                        break;

                    case 3:
                        intent.putExtra("title",sevgi_title[3]);
                        intent.putExtra("lyric",sevgi_full[3]);
                        break;

                    case 4:
                        intent.putExtra("title",sevgi_title[4]);
                        intent.putExtra("lyric",sevgi_full[4]);
                        break;

                    case 5:
                        intent.putExtra("title",sevgi_title[5]);
                        intent.putExtra("lyric",sevgi_full[5]);
                        break;

                    case 6:
                        intent.putExtra("title",sevgi_title[6]);
                        intent.putExtra("lyric",sevgi_full[6]);
                        break;

                    case 7:
                        intent.putExtra("title",sevgi_title[7]);
                        intent.putExtra("lyric",sevgi_full[7]);
                        break;

                    case 8:
                        intent.putExtra("title",sevgi_title[8]);
                        intent.putExtra("lyric",sevgi_full[8]);
                        break;

                    case 9:
                        intent.putExtra("title",sevgi_title[9]);
                        intent.putExtra("lyric",sevgi_full[9]);
                        break;

                    case 10:
                        intent.putExtra("title",sevgi_title[10]);
                        intent.putExtra("lyric",sevgi_full[10]);
                        break;

                    case 11:
                        intent.putExtra("title",sevgi_title[11]);
                        intent.putExtra("lyric",sevgi_full[11]);
                        break;

                    case 12:
                        intent.putExtra("title",sevgi_title[12]);
                        intent.putExtra("lyric",sevgi_full[12]);
                        break;

                    case 13:
                        intent.putExtra("title",sevgi_title[13]);
                        intent.putExtra("lyric",sevgi_full[13]);
                        break;

                    case 14:
                        intent.putExtra("title",sevgi_title[14]);
                        intent.putExtra("lyric",sevgi_full[14]);
                        break;

                    case 15:
                        intent.putExtra("title",sevgi_title[15]);
                        intent.putExtra("lyric",sevgi_full[15]);
                        break;

                    case 16:
                        intent.putExtra("title",sevgi_title[16]);
                        intent.putExtra("lyric",sevgi_full[16]);
                        break;

                    case 17:
                        intent.putExtra("title",sevgi_title[17]);
                        intent.putExtra("lyric",sevgi_full[17]);
                        break;
                    case 18:
                        intent.putExtra("title",sevgi_title[18]);
                        intent.putExtra("lyric",sevgi_full[18]);
                        break;

                    case 19:
                        intent.putExtra("title",sevgi_title[19]);
                        intent.putExtra("lyric",sevgi_full[19]);
                        break;

                    case 20:
                        intent.putExtra("title",sevgi_title[20]);
                        intent.putExtra("lyric",sevgi_full[20]);
                        break;

                    case 21:
                        intent.putExtra("title",sevgi_title[21]);
                        intent.putExtra("lyric",sevgi_full[21]);
                        break;

                    case 22:
                        intent.putExtra("title",sevgi_title[22]);
                        intent.putExtra("lyric",sevgi_full[22]);
                        break;

                    case 23:
                        intent.putExtra("title",sevgi_title[23]);
                        intent.putExtra("lyric",sevgi_full[23]);
                        break;

                    case 24:
                        intent.putExtra("title",sevgi_title[24]);
                        intent.putExtra("lyric",sevgi_full[24]);
                        break;

                    case 25:
                        intent.putExtra("title",sevgi_title[25]);
                        intent.putExtra("lyric",sevgi_full[25]);
                        break;

                    case 26:
                        intent.putExtra("title",sevgi_title[26]);
                        intent.putExtra("lyric",sevgi_full[26]);
                        break;

                    case 27:
                        intent.putExtra("title",sevgi_title[27]);
                        intent.putExtra("lyric",sevgi_full[27]);
                        break;

                    case 28:
                        intent.putExtra("title",sevgi_title[28]);
                        intent.putExtra("lyric",sevgi_full[28]);
                        break;

                    case 29:
                        intent.putExtra("title",sevgi_title[29]);
                        intent.putExtra("lyric",sevgi_full[29]);
                        break;

                    case 30:
                        intent.putExtra("title",sevgi_title[30]);
                        intent.putExtra("lyric",sevgi_full[30]);
                        break;

                    case 31:
                        intent.putExtra("title",sevgi_title[31]);
                        intent.putExtra("lyric",sevgi_full[31]);
                        break;

                    case 32:
                        intent.putExtra("title",sevgi_title[32]);
                        intent.putExtra("lyric",sevgi_full[32]);
                        break;
                    case 33:
                        intent.putExtra("title",sevgi_title[33]);
                        intent.putExtra("lyric",sevgi_full[33]);
                        break;

                    case 34:
                        intent.putExtra("title",sevgi_title[34]);
                        intent.putExtra("lyric",sevgi_full[34]);
                        break;

                    case 35:
                        intent.putExtra("title",sevgi_title[35]);
                        intent.putExtra("lyric",sevgi_full[35]);
                        break;

                    case 36:
                        intent.putExtra("title",sevgi_title[36]);
                        intent.putExtra("lyric",sevgi_full[36]);
                        break;

                    case 37:
                        intent.putExtra("title",sevgi_title[37]);
                        intent.putExtra("lyric",sevgi_full[37]);
                        break;

                    case 38:
                        intent.putExtra("title",sevgi_title[38]);
                        intent.putExtra("lyric",sevgi_full[38]);
                        break;

                    case 39:
                        intent.putExtra("title",sevgi_title[39]);
                        intent.putExtra("lyric",sevgi_full[39]);
                        break;

                    case 40:
                        intent.putExtra("title",sevgi_title[40]);
                        intent.putExtra("lyric",sevgi_full[40]);
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
}
