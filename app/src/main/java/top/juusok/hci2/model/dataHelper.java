package top.juusok.hci2.model;

import android.database.sqlite.SQLiteDatabase;

import top.juusok.hci2.User;
import top.juusok.hci2.model.myDatabaseHelper;

public class dataHelper {
    public void dataHelper(){}

    public User getUser(int id)
    {
//        myDatabaseHelper dbHelper = new myDatabaseHelper(null,"hci2.db",null,1);
//        SQLiteDatabase db = dbHelper.getReadableDatabase();
        User res = new User();
        if(id==1) {
            res.modify(1, "boy", 10, 12, 1);
            res.setDay(1, 3);
            res.setDay(2, 4);
            res.setDay(3, 2);
            res.setDay(4, 3);
        } else {
            res.modify(2,"girl",3,9,2);
            res.setDay(1,1);
            res.setDay(2,2);
            res.setDay(3,3);
            res.setDay(4,3);
        }
        return res;
    }
}