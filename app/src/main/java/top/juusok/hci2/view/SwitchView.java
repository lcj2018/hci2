package top.juusok.hci2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import top.juusok.hci2.R;

public class SwitchView extends LinearLayout {
    public SwitchView(Context context,AttributeSet attrs)
    {
        super(context,attrs);
    }

    public void setListeners(OnClickListener onClickListener){
        findViewById(R.id.headIcon).setOnClickListener(onClickListener);
    }
}
