/*
 * Copyright (c) Create by T C L on 2020.12.4.
 *  a custom view
 *  stop onTouch dispatch event to child view
 *
 * 这个自定义view主要是拦截事件，不让事件分发给子view
 */

package com.stock.sync.sync_slide_lib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class ObserverHScrollViewIntercept extends LinearLayout {
    public ObserverHScrollViewIntercept(Context context) {
        this(context, null);
    }

    public ObserverHScrollViewIntercept(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ObserverHScrollViewIntercept(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }
}
