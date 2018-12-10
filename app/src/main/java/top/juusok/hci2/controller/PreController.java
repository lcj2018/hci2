package top.juusok.hci2.controller;

import android.view.View;
import android.view.View.OnClickListener;

import top.juusok.hci2.activity.PreControllerListener;
import top.juusok.hci2.view.PreView;

public class PreController implements OnClickListener {
    private PreView preView;
    private PreControllerListener listener;


    public PreController(PreView preView, PreControllerListener listener) {
        this.preView = preView;
        this.listener = listener;
    }
    @Override
    public void onClick(View v)
    {
        listener.onStarSelect();
    }
}
