package com.example.fan.butterknife_dome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import Message.MessageEvent;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.tvS)
    TextView tvS;
    @BindView(R.id.tvss)
    TextView tvss;
    @BindView(R.id.bus)
    Button bus;
    @BindView(R.id.buss)
    Button buss;
    @BindView(R.id.busss)
    Button busss;
    @BindView(R.id.bussss)
    Button bussss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //注册事件
         EventBus.getDefault().register(this);


    }

    @OnClick({R.id.bus, R.id.buss, R.id.busss, R.id.bussss})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bus:
                Toast.makeText(this, "跳转EventActivity", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,EventActivity.class));

                break;
            case R.id.buss:
                Toast.makeText(this, "点我2", Toast.LENGTH_LONG).show();
                break;
            case R.id.busss:
                Toast.makeText(this, "点我3", Toast.LENGTH_LONG).show();
                break;
            case R.id.bussss:
                Toast.makeText(this, "点我4", Toast.LENGTH_LONG).show();
                break;
        }
    }

    //订阅事件
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMoonEvent(MessageEvent messageEvent){
        tv.setText(messageEvent.getMessage());
        tvS.setText(messageEvent.getAge());
        tvss.setText(messageEvent.getName());
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 解除注册
        EventBus.getDefault().unregister(this);

    }
}
