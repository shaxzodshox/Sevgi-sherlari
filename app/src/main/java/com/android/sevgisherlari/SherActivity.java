package com.android.sevgisherlari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.android.sevgisherlari.db.DatabaseHelper;

import java.util.ArrayList;
import java.util.Objects;

public class SherActivity extends AppCompatActivity {

    private Menu menu;
    private boolean isFavorite = false;
    private DatabaseHelper dbHelper;

    private TextView tv_title;
    private TextView tv_lyric;

    private int id = 0;
    private String lyric = "";
    private String title = "";

    ArrayList<Integer> id_list; //all available id in the database

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_favorite, menu);
        this.menu = menu;
        if(checkFavorite(id)){
            menu.getItem(0).setIcon(ContextCompat.getDrawable(this, R.drawable.star_clicked));
            isFavorite = true;
        }
        else{
            menu.getItem(0).setIcon(ContextCompat.getDrawable(this, R.drawable.star_unclicked));
            isFavorite = false;
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_favorite:
                if(!isFavorite){
                    menu.getItem(0).setIcon(ContextCompat.getDrawable(this, R.drawable.star_clicked));
                    addData(id, title, lyric);
                    Toast.makeText(SherActivity.this,"Sevimlilarga qo'shildi",Toast.LENGTH_SHORT).show();
                    isFavorite = true;
                }else{
                    menu.getItem(0).setIcon(ContextCompat.getDrawable(this, R.drawable.star_unclicked));
                    dbHelper.deleteRow(id);
                    Toast.makeText(SherActivity.this,"Sevimlilardan o'chirildi",Toast.LENGTH_SHORT).show();
                    isFavorite = false;
                }
                break;
            case R.id.action_send_lyric:
                Toast.makeText(SherActivity.this,"Send lyric",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sher);

        tv_title = findViewById(R.id.tv_title);
        tv_lyric = findViewById(R.id.tv_lyric);
        dbHelper = new DatabaseHelper(this);

        title = Objects.requireNonNull(getIntent().getExtras()).getString("title");
        lyric = getIntent().getExtras().getString("lyric");
        id = getIntent().getExtras().getInt("id");
        tv_title.setText(title);
        tv_lyric.setText(lyric);

    }

    public void addData(int id, String title, String lyric){
        boolean insertData = dbHelper.addData(id, title, lyric);
        if(insertData){
           //Toast.makeText(SherActivity.this,"Successfully",Toast.LENGTH_SHORT).show();
        }
        else{
           //Toast.makeText(SherActivity.this,"Unsuccessfully",Toast.LENGTH_SHORT).show();
        }
    }

    public boolean checkFavorite(int id){
        Cursor cursor = dbHelper.getData();
        id_list = new ArrayList<>();
        while (cursor.moveToNext()){
        id_list.add(Integer.valueOf(cursor.getString(0)));
        }
        for(int i = 0; i < id_list.size(); i++){
            if(id_list.get(i) == id){
                return true;
            }
        }
        return false;
    }
}
