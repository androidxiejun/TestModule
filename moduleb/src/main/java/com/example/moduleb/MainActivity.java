package com.example.moduleb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.baselibrary.Constant;
import com.example.commonlibrary.BaseActivity;
import com.example.modulea.api.Jungle;

@Route(path = Constant.ACTIVITY_ROUTE_MODULEB)
public class MainActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
