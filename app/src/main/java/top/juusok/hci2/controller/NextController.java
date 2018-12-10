package top.juusok.hci2.controller;

import android.view.View;
import android.view.View.OnClickListener;

import top.juusok.hci2.activity.NextControllerListener;
import top.juusok.hci2.view.NextView;

public class NextController implements OnClickListener {
    private NextView nextView;
    private NextControllerListener listener;


    public NextController(NextView nextView, NextControllerListener listener) {
        this.nextView = nextView;
        this.listener = listener;
    }
    @Override
    public void onClick(View v)
    {
        listener.onMoonSelect();
    }
}
