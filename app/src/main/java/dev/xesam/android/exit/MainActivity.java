package dev.xesam.android.exit;

import android.content.Intent;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onBtnClick() {
        startActivity(new Intent(this, Sub1Activity.class));
    }
}
