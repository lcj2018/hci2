package top.juusok.hci2.controller;

import android.view.View;
import android.view.View.OnClickListener;

import top.juusok.hci2.activity.NextControllerListener;
import top.juusok.hci2.model.User;
import top.juusok.hci2.view.NextView;

public class NextController implements OnClickListener {
    private NextView nextView;
    private NextControllerListener listener;
    private int th;


    public NextController(NextView nextView, NextControllerListener listener, int th) {
        this.nextView = nextView;
        this.listener = listener;
        this.th = th;
    }
    @Override
    public void onClick(View v)
    {
        User res = User.getInstance();
        String str = Integer.toString(res.getDay(2*this.th));
        listener.onMoonSelect(str);
    }
}
