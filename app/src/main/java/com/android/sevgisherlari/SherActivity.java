package com.android.sevgisherlari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.android.sevgisherlari.db.DatabaseHelper;
import com.muddzdev.styleabletoast.StyleableToast;

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
                    StyleableToast.makeText(SherActivity.this, "Sevimlilarga qo'shildi", R.style.favoriteToast).show();
                    isFavorite = true;
                }else{
                    menu.getItem(0).setIcon(ContextCompat.getDrawable(this, R.drawable.star_unclicked));
                    dbHelper.deleteRow(id);
                    StyleableToast.makeText(SherActivity.this, "Sevimlilardan o'chirildi", R.style.favoriteToast).show();
                    isFavorite = false;
                }
                break;
            case R.id.action_send_lyric:
                shareText();
                break;

            case R.id.action_copy_lyric:
                copyLyric();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void copyLyric() {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        String copy_text = lyric;
        assert clipboard != null;
        clipboard.setText(copy_text);
      StyleableToast.makeText(this, "Nusxa olindi...", R.style.copyToast).show();
    }

    private void shareText() {
        String shareTxt = lyric;
            Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_TEXT,shareTxt);
            shareIntent.setType("text/plain");
            startActivity(shareIntent);}


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
