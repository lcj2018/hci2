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

    private Button b1;


    public myDialog(Context context) {
        super(context, R.style.dialog);
        setContentView(R.layout.activity_switch);

        //CloseController closeController = new CloseController((CloseView)this.findViewById(R.id.closeIcon),this);
        //((CloseView) this.findViewById(R.id.closeIcon)).setListeners(closeController);
    }

    @Override
    public void onCloseSelect()
    {

        this.dismiss();
    }

    @Override
    public void show() {
        b1  = (Button) this.findViewById(R.id.closeIcon);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCloseSelect();
            }
        });

        super.show();
     /*   *//**
         * 设置宽度全屏，要设置在show的后面
         *//*
        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.gravity = Gravity.BOTTOM;
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;

        getWindow().getDecorView().setPadding(0, 0, 0, 0);

        getWindow().setAttributes(layoutParams);*/
    }
}
