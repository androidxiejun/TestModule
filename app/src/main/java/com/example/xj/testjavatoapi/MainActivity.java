package com.example.xj.testjavatoapi;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.baselibrary.Constant;
import com.example.commonlibrary.BaseActivity;

@Route(path = Constant.ACTIVITY_ROUTE_APP)
public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
