package com.example.android.basicnotifications;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyMessageReplyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        int thisConversationId = intent.getIntExtra("conversation_id", -1);
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            CharSequence replyText = ((Bundle) remoteInput).getCharSequence("voice_reply");
            Log.d("BasicNotifications", "Found voice reply [" + replyText + "] from conversationId = " + thisConversationId);

        }
    }
}
