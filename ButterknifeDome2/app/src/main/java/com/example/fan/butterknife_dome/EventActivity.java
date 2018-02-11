package com.example.fan.butterknife_dome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import Message.MessageEvent;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EventActivity extends AppCompatActivity {

    @BindView(R.id.event_tv)
    TextView eventTv;
    @BindView(R.id.event_bu)
    Button eventBu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.event_bu)
    public void onViewClicked() {
        EventBus.getDefault().postSticky(new MessageEvent("修身养性","18","卢同志"));
        finish();

    }
}
