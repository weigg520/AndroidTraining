package com.weizhengzhou.androidtraining.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by 75213 on 2018/3/22.
 */

public class DIYLayout extends ViewGroup {
    public DIYLayout(Context context) {
        super(context);
    }

    public DIYLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        //getChildMeasureSpec()
    }
}
