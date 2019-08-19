package com.example.modulea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.baselibrary.Constant;
import com.example.commonlibrary.BaseActivity;
import com.example.moduleb.api.JungleB;

@Route(path = Constant.ACTIVITY_ROUTE_MODULEA)
public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
