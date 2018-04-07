package com.mayosenpai.receivebroadcast1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        String action = i.getAction();
        String type = i.getType();

        handleSendText(i);

    }

    void handleSendText(Intent intent)
    {
        //Bundle dataFromSender = getIntent().getExtras();
        String s = intent.getStringExtra("msgFromSendBroadcast");
        TextView receivedMsg = (TextView)findViewById(R.id.receivedMsg);
        receivedMsg.setText(s);
    }
}
