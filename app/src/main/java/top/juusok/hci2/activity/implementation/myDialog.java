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

import top.juusok.hci2.Global;
import top.juusok.hci2.R;
import top.juusok.hci2.activity.CloseControllerListener;
import top.juusok.hci2.controller.CloseController;
import top.juusok.hci2.model.User;
import top.juusok.hci2.view.CloseView;

public class myDialog extends Dialog implements CloseControllerListener {

    private Button b2;
    private Context mcontext;

    public myDialog(Context context) {
        super(context, R.style.dialog);
        setContentView(R.layout.activity_switch);
        mcontext = context;
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


        b2 = (Button) this.findViewById(R.id.user2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Global.theme == 1)
                    Global.theme = 2;
                else if(Global.theme ==2)
                    Global.theme = 1;

                MainActivity activity = (MainActivity)mcontext;
                activity.refresh();
            }
        });
        super.show();
    }
}
