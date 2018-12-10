package top.juusok.hci2.controller;

import android.view.View;
import android.view.View.OnClickListener;
import top.juusok.hci2.view.SwitchView;
import top.juusok.hci2.activity.SwitchControllerListener;

public class SwitchController implements OnClickListener {
    private SwitchView switchView;
    private SwitchControllerListener listener;


    public SwitchController(SwitchView switchView, SwitchControllerListener listener) {
        this.switchView = switchView;
        this.listener = listener;
    }

    @Override
    public void onClick(View v)
    {
        listener.onSwitchSelect();
    }


}
