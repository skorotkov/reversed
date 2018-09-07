package fi.polar.polarflow.ui.myday;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.os.Bundle;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

public class WatchFaceMyDayActivity extends Activity {
   private fi.polar.polarflow.ui.myday.item.c a;
   private final BroadcastReceiver b = new w(this);

   // $FF: synthetic method
   static fi.polar.polarflow.ui.myday.item.c a(WatchFaceMyDayActivity var0) {
      return var0.a;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setContentView(2130968608);
   }

   public void onPause() {
      v_StickyLocalBroadcastManager.a_getInstance().a_unregisterReceiver(this.b);
      super.onPause();
   }

   public void onResume() {
      super.onResume();
      v_StickyLocalBroadcastManager.a_getInstance().a_registerReceiver(this.b, "DailyActivityService.action.DAILY_ACTIVITY_STATUS");
   }

   protected void onStart() {
      super.onStart();
      this.a = new fi.polar.polarflow.ui.myday.item.a_package.e();
      this.a.a(this.findViewById(2131755390));
      this.a.d();
   }

   protected void onStop() {
      this.a.b();
      super.onStop();
   }
}
