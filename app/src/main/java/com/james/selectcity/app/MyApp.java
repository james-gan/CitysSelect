package com.james.selectcity.app;

import android.app.Application;

import com.james.selectcity.utils.ScreenUtils;
import com.james.selectcity.utils.ToastUtils;

/**
 * Created by    https://github.com/james-gan
 * Date : 2019/5/16
 *
 * To do :
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        ToastUtils.init(this);
        ScreenUtils.init(this);
    }
}
