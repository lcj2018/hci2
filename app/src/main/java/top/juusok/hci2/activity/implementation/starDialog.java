package top.juusok.hci2.activity.implementation;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import top.juusok.hci2.R;
import top.juusok.hci2.activity.StarControllerListener;
import top.juusok.hci2.controller.StarController;
import top.juusok.hci2.view.StarView;

public class starDialog extends Dialog implements StarControllerListener{
    private Button b1;
    private Button b2;
    public starDialog(Context context) {
        super(context);
        setContentView(R.layout.activity_star);

/*        StarController starController = new StarController((StarView)this.findViewById(R.id.starIcon),this);
        ((StarView) this.findViewById(R.id.starIcon)).setListeners(starController);*/
    }

    public void onMoonSelect()
    {
        setContentView(R.layout.activity_star);
        b1  = (Button) this.findViewById(R.id.btnnext);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStarSelect();
            } });
    }
    @Override
    public void onStarSelect()
    {
        setContentView(R.layout.activity_moon);
        b2  = (Button) this.findViewById(R.id.btnpre);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onMoonSelect();
            } });

    }

    @Override
    public void show() {

        b1  = (Button) this.findViewById(R.id.btnnext);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStarSelect();
            } });

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
