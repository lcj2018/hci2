package top.juusok.hci2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import top.juusok.hci2.R;

public class StarView extends LinearLayout {
    public StarView(Context context,AttributeSet attrs)
    {
        super(context,attrs);
    }

    public void setListeners(OnClickListener onClickListener){
        findViewById(R.id.starIcon).setOnClickListener(onClickListener);
    }

    public void setListeners2(OnClickListener onClickListener){
        findViewById(R.id.starIcon2).setOnClickListener(onClickListener);
    }
}
