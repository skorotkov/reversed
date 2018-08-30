package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompletedReceiver extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      fi.polar.polarflow.util.d.c("BootCompletedReceiver", var2.getAction());
   }
}
