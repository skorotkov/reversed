package android.support.wearable.activity;

import android.os.Bundle;
import android.util.Log;

class b implements e {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public void a() {
      android.support.wearable.activity.a.a(this.a, false);
      this.a.d();
      if (!android.support.wearable.activity.a.a(this.a)) {
         String var1 = String.valueOf(this.a);
         Log.w("WearableActivity", (new StringBuilder(String.valueOf(var1).length() + 55)).append("Activity ").append(var1).append(" did not call through to super.onExitAmbient()").toString());
      }

   }

   public void a(Bundle var1) {
      android.support.wearable.activity.a.a(this.a, false);
      this.a.a(var1);
      if (!android.support.wearable.activity.a.a(this.a)) {
         String var2 = String.valueOf(this.a);
         Log.w("WearableActivity", (new StringBuilder(String.valueOf(var2).length() + 56)).append("Activity ").append(var2).append(" did not call through to super.onEnterAmbient()").toString());
      }

   }

   public void b() {
      android.support.wearable.activity.a.a(this.a, false);
      this.a.c();
      if (!android.support.wearable.activity.a.a(this.a)) {
         String var1 = String.valueOf(this.a);
         Log.w("WearableActivity", (new StringBuilder(String.valueOf(var1).length() + 57)).append("Activity ").append(var1).append(" did not call through to super.onUpdateAmbient()").toString());
      }

   }
}
