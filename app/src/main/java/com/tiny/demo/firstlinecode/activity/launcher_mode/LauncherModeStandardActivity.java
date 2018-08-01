package com.tiny.demo.firstlinecode.activity.launcher_mode;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.tiny.demo.firstlinecode.base.BaseActivity;
import com.tiny.demo.firstlinecode.R;

public class LauncherModeStandardActivity extends BaseActivity {
    private static final String TAG = "StandardActivity";

    @Override
    protected int setContentLayout() {
        return R.layout.activity_launcher_mode_standard;
    }

    @Override
    protected void buildContentView() {
        Log.e(TAG, "taskid --> " + getTaskId());
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherModeStandardActivity.this,LauncherModeStandardActivity.class));
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherModeStandardActivity.this,LauncherModeSingleTopActivity.class));
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LauncherModeStandardActivity.this,LauncherModeSingleTaskActivity.class));
            }
        });
    }

    @Override
    protected void initViewData() {

    }
}
