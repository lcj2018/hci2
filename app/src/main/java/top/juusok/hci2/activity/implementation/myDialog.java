package top.juusok.hci2.activity.implementation;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import top.juusok.hci2.R;
import top.juusok.hci2.activity.CloseControllerListener;
import top.juusok.hci2.controller.CloseController;
import top.juusok.hci2.view.CloseView;

public class myDialog extends Dialog implements CloseControllerListener {

    public myDialog(Context context) {
        super(context, R.style.dialog);
        setContentView(R.layout.activity_switch);
    }

    @Override
    public void onCloseSelect()
    {
        this.dismiss();
    }

    @Override
    public void show() {
        CloseController closeController = new CloseController((CloseView)this.findViewById(R.id.closeIcon),this);
        ((CloseView) this.findViewById(R.id.closeIcon)).setListeners(closeController);

        super.show();
    }
}
