package top.juusok.hci2.activity.implementation;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import top.juusok.hci2.R;
import top.juusok.hci2.activity.NextControllerListener;
import top.juusok.hci2.activity.PreControllerListener;
import top.juusok.hci2.activity.StarControllerListener;
import top.juusok.hci2.controller.NextController;
import top.juusok.hci2.controller.PreController;
import top.juusok.hci2.controller.StarController;
import top.juusok.hci2.model.User;
import top.juusok.hci2.view.NextView;
import top.juusok.hci2.view.PreView;
import top.juusok.hci2.view.StarView;

public class starDialog extends Dialog implements PreControllerListener, NextControllerListener {
    private int th;

    public starDialog(Context context,int th) {
        super(context);
        this.th = th;

        setContentView(R.layout.activity_star);

        User res = User.getInstance();
        int star = res.getDay(th*2-1);
        String str = Integer.toString(star);
        ((TextView)this.findViewById(R.id.sunstar)).setText(str);
    }

    public void onMoonSelect()
    {
        setContentView(R.layout.activity_moon);

        User res = User.getInstance();
        int star = res.getDay(this.th*2);
        String str = Integer.toString(star);
        ((TextView)this.findViewById(R.id.moonstar)).setText(str);

        PreController preController = new PreController((PreView)this.findViewById(R.id.btnpre),this);
        ((PreView) this.findViewById(R.id.btnpre)).setListeners(preController);
    }
    @Override
    public void onStarSelect()
    {
        setContentView(R.layout.activity_star);

        User res = User.getInstance();
        int star = res.getDay(this.th*2-1);
        String str = Integer.toString(star);
        ((TextView)this.findViewById(R.id.sunstar)).setText(str);

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
