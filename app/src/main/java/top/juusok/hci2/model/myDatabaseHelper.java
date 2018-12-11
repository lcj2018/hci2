package top.juusok.hci2.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_USERS = "create table users("
            + "id integer primary key,"
            + "name text,"
            + "coins integer,"
            + "stars integer,"
            + "sex integer)";
    public static final String CREATE_CALENDAR = "create table calendar("
            + "id integer,"
            + "date integer,"
            + "time integer,"
            + "cnt integer,"
            + "primary key(id,date,time))";
    private Context mContext;

    public myDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    public void insertUser(int id, String name, int coins, int stars, int sex)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("id",id);
        values.put("name", name);
        values.put("coins", coins);
        values.put("stars", stars);
        values.put("sex", sex);
        db.insert("users",null,values);
    }

    public void insertDay(int id, int date, int time, int cnt)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("id",id);
        values.put("date",date);
        values.put("time",time);
        values.put("cnt",cnt);
        db.insert("calendar",null,values);
    }

    public void initData() {
        insertUser(1,"boy",10,12,1);
        insertDay(1,1,1,3);
        insertDay(1,1,2,4);
        insertDay(1,2,1,2);
        insertDay(1,2,2,3);
        ////////////////////////////////////////////////////////////////////for boy
        insertUser(2,"girl",3,9,2);
        insertDay(2,1,1,1);
        insertDay(1,1,2,2);
        insertDay(2,2,1,3);
        insertDay(2,2,2,3);
        //for girl
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USERS);
        db.execSQL(CREATE_CALENDAR);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("drop table if exists users");
        db.execSQL("drop table if exists calendar");
        onCreate(db);
    }
}