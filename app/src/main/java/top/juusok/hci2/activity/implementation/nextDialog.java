package top.juusok.hci2.activity.implementation;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;

import top.juusok.hci2.R;

public class nextDialog extends Dialog {
    private Button b2;
    public nextDialog(Context context) {
        super(context);
        setContentView(R.layout.activity_moon);
    }

    public void onNextSelect()
    {
        setContentView(R.layout.activity_star);
    }
    @Override
    public void show() {
        b2  = (Button) this.findViewById(R.id.btnpre);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onNextSelect();
            }
        });
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        super.show();
        /*        *//**
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
