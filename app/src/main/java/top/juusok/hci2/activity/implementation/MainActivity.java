package top.juusok.hci2.activity.implementation;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.widget.Button;
import android.view.View;
import android.view.WindowManager;
import android.widget.Switch;

import top.juusok.hci2.R;
import top.juusok.hci2.activity.CloseControllerListener;
import top.juusok.hci2.activity.StarControllerListener;
import top.juusok.hci2.activity.SwitchControllerListener;
import top.juusok.hci2.controller.SwitchController;
import top.juusok.hci2.controller.CloseController;
import top.juusok.hci2.controller.StarController;
import top.juusok.hci2.view.SwitchView;
import top.juusok.hci2.view.CloseView;
import top.juusok.hci2.view.StarView;
import top.juusok.hci2.activity.implementation.myDialog;

public class MainActivity extends AppCompatActivity implements SwitchControllerListener,StarControllerListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchController switchController = new SwitchController((SwitchView)this.findViewById(R.id.headIcon),this);
        ((SwitchView) this.findViewById(R.id.headIcon)).setListeners(switchController);

       StarController starController = new StarController((StarView)this.findViewById(R.id.starIcon),this);
        ((StarView) this.findViewById(R.id.starIcon)).setListeners(starController);

        StarController starController2 = new StarController((StarView)this.findViewById(R.id.starIcon2),this);
        ((StarView) this.findViewById(R.id.starIcon2)).setListeners2(starController2);

    }


    @Override
    public void onStarSelect()
    {
        starDialog dialog = new starDialog(this);

        dialog.setContentView(R.layout.activity_star);
        dialog.show();
        Window win = dialog.getWindow();
        win.setGravity(Gravity.CENTER);

    }




    @Override
    public void onSwitchSelect()
    {
        myDialog dialog = new myDialog(this);

        dialog.setContentView(R.layout.activity_switch);
        dialog.show();
        Window win = dialog.getWindow();
        win.setGravity(Gravity.LEFT | Gravity.TOP);
        win.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams params = win.getAttributes();
        //设置窗口宽度为充满全屏
        params.width = WindowManager.LayoutParams.FILL_PARENT;//如果不设置,可能部分机型出现左右有空隙,也就是产生margin的感觉
        //设置窗口高度为包裹内容
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
        //将设置好的属性set回去
        win.setAttributes(params);
    }




}
