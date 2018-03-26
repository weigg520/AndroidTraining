package com.weizhengzhou.androidtraining.main.bean;

import android.app.Activity;

/**
 * Created by 75213 on 2017/12/6.
 */

public class MainBean {
    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public Class<? extends Activity> getActivityClass() {
        return activityClass;
    }

    public void setActivityClass(Class<? extends Activity> activityClass) {
        this.activityClass = activityClass;
    }

    private String nameItem;
    private Class<? extends Activity> activityClass;
}
