package com.example.tt.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by TT
 */
public class BroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        CharSequence c  =  intent.getCharSequenceExtra("message");
        Toast.makeText(context, "Data receive in BroadCast: "+ c , Toast.LENGTH_LONG).show();
    }
}
