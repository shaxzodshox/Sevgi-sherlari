package com.android.sevgisherlari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class SherActivity extends AppCompatActivity {

    private TextView tv_title;
    private TextView tv_lyric;

    private String lyric = "";
    private String title = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sher);

        tv_title = findViewById(R.id.tv_title);
        tv_lyric = findViewById(R.id.tv_lyric);


        title = Objects.requireNonNull(getIntent().getExtras()).getString("title");
        lyric = getIntent().getExtras().getString("lyric");

        tv_title.setText(title);
        tv_lyric.setText(lyric);

    }
}
