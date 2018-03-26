package com.weizhengzhou.androidtraining.toolbar;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.weizhengzhou.androidtraining.R;

public class ToolBarActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setCollapsible(false);
        toolbar.setContentInsetEndWithActions(100);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setLogoDescription("logo描述");
        toolbar.setTitle("主标题");
        toolbar.setSubtitle("子标题");
        setSupportActionBar(toolbar);
    }
}
