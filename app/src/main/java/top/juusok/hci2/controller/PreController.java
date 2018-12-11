package top.juusok.hci2.controller;

import android.view.View;
import android.view.View.OnClickListener;

import top.juusok.hci2.activity.PreControllerListener;
import top.juusok.hci2.model.User;
import top.juusok.hci2.view.PreView;

public class PreController implements OnClickListener {
    private PreView preView;
    private PreControllerListener listener;
    private int th;


    public PreController(PreView preView, PreControllerListener listener, int th) {
        this.preView = preView;
        this.listener = listener;
        this.th = th;
    }
    @Override
    public void onClick(View v)
    {
        User res = User.getInstance();
        String str = Integer.toString(res.getDay(2*this.th-1));
        listener.onStarSelect(str);
    }
}
