package top.juusok.hci2.controller;

import android.view.View;
import android.view.View.OnClickListener;

import top.juusok.hci2.model.User;
import top.juusok.hci2.view.StarView;
import top.juusok.hci2.activity.StarControllerListener;

public class StarController implements OnClickListener {
    private StarView starView;
    private StarControllerListener listener;
    private int th;

    public StarController(StarView starView, StarControllerListener listener, int th) {
        this.starView = starView;
        this.listener = listener;
        this.th = th;
    }

    @Override
    public void onClick(View v)
    {
        User res = User.getInstance();
        String str = Integer.toString(res.getDay(2*this.th-1));
        listener.onStarSelect(th,str);
    }
}
