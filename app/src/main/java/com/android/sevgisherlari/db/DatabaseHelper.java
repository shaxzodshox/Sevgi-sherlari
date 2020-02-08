package com.android.sevgisherlari.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.android.sevgisherlari.SherActivity;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "favorite";
    private static final String TABLE_NAME = "favorite_lyrics";
    private static final String COL1 = "ID";
    private static final String COL2 = "TITLE";
    private static final String COL3 = "LYRIC";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + COL1 + " INTEGER PRIMARY KEY, "
                + COL2 + " TEXT, " + COL3 + " TEXT)";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(int id, String title, String lyric){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, id);
        contentValues.put(COL2, title);
        contentValues.put(COL3, lyric);

        long result = db.insert(TABLE_NAME, null, contentValues);

        //if data is inserted incorrectly it returns -1
        if(result == -1){
            return false;
        }
        else{
            return true;
        }
    }

    public Cursor getData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;
        Cursor data = db.rawQuery(query, null);
        return data;
    }

    public void deleteRow(int id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_NAME+ " WHERE "+COL1+"='"+id+"'");
        db.close();
    }

}
