package com.tiny.demo.firstlinecode.kfysts.chapter01.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tiny.demo.firstlinecode.R;
import com.tinytongtong.tinyutils.LogUtils;

public class ActivityStackDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_d);
        LogUtils.INSTANCE.e("ActivityStackDActivity", "onCreate");
    }
}
