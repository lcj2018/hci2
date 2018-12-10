package top.juusok.hci2.controller;

import android.view.View;
import android.view.View.OnClickListener;
import top.juusok.hci2.view.CloseView;
import top.juusok.hci2.activity.CloseControllerListener;

public class CloseController implements OnClickListener {
    private CloseView closeView;
    private CloseControllerListener listener;


    public CloseController(CloseView closeView, CloseControllerListener listener) {
        this.closeView = closeView;
        this.listener = listener;
    }
    @Override
    public void onClick(View v)
    {
        listener.onCloseSelect();
    }
}
