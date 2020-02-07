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
            "Sizni qattiq sevgan yurak sizniki!",
            "Men seni sevardim, sevaman hamon",
            "Sensizlikka o’rganib qoldim",
            "Senku, sevgim, bo’lajak yorim!!!",
            "SMS yozsangu, yozmasa yomon",
            "Nechun kelmading…???",
            "Ashaddiy yurakni ko’rmasang bo’ldi",
            "Kimgadir shodliksan, kim uchun qaygu…",
            "Sizni qattiq sevgan yurak sizniki!"
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
