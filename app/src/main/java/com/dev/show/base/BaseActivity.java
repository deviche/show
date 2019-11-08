package com.dev.show.base;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.dev.show.utils.Logutils;
import com.dev.show.utils.ToastUils;

public abstract class BaseActivity extends AppCompatActivity {

    protected Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mContext = this;
        initUtils(mContext = this);
        setContentView(getLayoutId());
        initView();
        initData();
        initOthers();
    }

    protected abstract int getLayoutId();

    protected void initOthers() {
    }

    protected void initData() {
    }

    protected void initView() {
    }

    ;

    private void initUtils(Context context) {

    }

    public void showShort(String msg) {
        ToastUils.showShort(mContext, msg);
    }

    public void showLong(String msg) {
        ToastUils.showLong(mContext, msg);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
