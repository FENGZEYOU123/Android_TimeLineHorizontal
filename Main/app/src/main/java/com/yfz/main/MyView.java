package com.yfz.main;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

import androidx.annotation.Nullable;

public class MyView extends HorizontalScrollView {
    private Context mContext;
    public MyView(Context context) {
        super(context);
        init(context);
    }
    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    private void init(Context context){
        this.mContext = context;
    }
}
