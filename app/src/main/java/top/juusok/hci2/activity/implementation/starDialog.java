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
import top.juusok.hci2.activity.NextControllerListener;
import top.juusok.hci2.activity.PreControllerListener;
import top.juusok.hci2.activity.StarControllerListener;
import top.juusok.hci2.controller.NextController;
import top.juusok.hci2.controller.PreController;
import top.juusok.hci2.controller.StarController;
import top.juusok.hci2.view.NextView;
import top.juusok.hci2.view.PreView;
import top.juusok.hci2.view.StarView;

public class starDialog extends Dialog implements PreControllerListener, NextControllerListener {

    public starDialog(Context context) {
        super(context);
        setContentView(R.layout.activity_star);
    }

    public void onMoonSelect()
    {
        setContentView(R.layout.activity_moon);

        PreController preController = new PreController((PreView)this.findViewById(R.id.btnpre),this);
        ((PreView) this.findViewById(R.id.btnpre)).setListeners(preController);
    }
    @Override
    public void onStarSelect()
    {
        setContentView(R.layout.activity_star);

        NextController nextController = new NextController((NextView)this.findViewById(R.id.btnnext),this);
        ((NextView) this.findViewById(R.id.btnnext)).setListeners(nextController);
    }

    @Override
    public void show() {

        NextController nextController = new NextController((NextView)this.findViewById(R.id.btnnext),this);
        ((NextView) this.findViewById(R.id.btnnext)).setListeners(nextController);

        getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        super.show();
    }
}
