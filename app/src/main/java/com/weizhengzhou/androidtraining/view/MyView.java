package com.weizhengzhou.androidtraining.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by 75213 on 2018/3/22.
 */

public class MyView extends View {
    private static final String TAG = MyView.class.getSimpleName();

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getSize(widthMeasureSpec ,100) ,getSize(heightMeasureSpec , 100));
    }

    private int vWidth;
    private int vHeight;
    private int vLenght;

    private float a;
    private float b;
    private float c;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        vHeight = getHeight();
        vWidth = getWidth();
        Log.e(TAG , "宽度：" + vWidth + "高度： " + vHeight);
        // 中心
        vLenght = vWidth / 2;
        // 弧度
        double randian30 = 30 * Math.PI / 180;// Math.PI 圆周长和直径比值
        a = (float) (vLenght * Math.sin(randian30));
        b = (float) (vLenght * Math.cos(randian30));
        c = (vHeight - 2 * b) / 2;

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        Path path = new Path();
        path.moveTo(vWidth, vHeight / 2);
        path.lineTo(vWidth - a, vHeight - c);
        path.lineTo(vWidth - a - vLenght, vHeight - c);
        path.lineTo(0, vHeight / 2);
        path.lineTo(a, c);
        path.lineTo(vWidth - a, c);
        path.close();
        paint.setColor(Color.WHITE);
        canvas.drawPath(path , paint);

    }

    private int getSize(int spec , int defaultSize){
        int size = defaultSize;
        int specMode = MeasureSpec.getMode(spec);
        int specSize = MeasureSpec.getSize(spec);
        Log.e(TAG , "大小为: " + specSize);
        switch (specMode) {
            case MeasureSpec.EXACTLY:
                Log.e(TAG , "模式为 : EXACTLY");
                size = specSize;
                break;
            case MeasureSpec.AT_MOST:
                Log.e(TAG , "模式为 : AT_MOST");
                size = defaultSize;
                break;
            case MeasureSpec.UNSPECIFIED:
                size = defaultSize;
                Log.e(TAG , "模式为 : UNSPECIFIED");
                break;
        }
        return size;
    }
}
