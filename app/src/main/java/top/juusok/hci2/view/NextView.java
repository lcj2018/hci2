package top.juusok.hci2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import top.juusok.hci2.R;

public class NextView extends LinearLayout {
    public NextView(Context context, AttributeSet attrs)
    {
        super(context,attrs);
    }

    public void setListeners(OnClickListener onClickListener){
        findViewById(R.id.btnnext).setOnClickListener(onClickListener);
    }
}
