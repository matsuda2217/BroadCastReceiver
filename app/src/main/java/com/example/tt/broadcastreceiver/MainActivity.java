package com.example.tt.broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnStart = (Button) findViewById(R.id.btnSend);
       editText = (EditText) findViewById(R.id.edit_text);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendBroadCastMsg();
            }
        });
    }

    public void sendBroadCastMsg() {
        Intent intent = new Intent();
        intent.putExtra("message",(CharSequence)(editText.getText().toString()));
        intent.setAction("com.Thuc");
        sendBroadcast(intent);

    }
}
