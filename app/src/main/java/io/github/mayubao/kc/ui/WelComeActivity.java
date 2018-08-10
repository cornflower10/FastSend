package io.github.mayubao.kc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import io.github.mayubao.kc.common.BaseActivity;
import io.github.mayubao.kuaichuan.R;

public class WelComeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wel_come);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelComeActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }

    @Override
    public void onBackPressed() {
    }
}
