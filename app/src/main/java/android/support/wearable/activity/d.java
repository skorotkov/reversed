package android.support.wearable.activity;

import android.os.Bundle;
import com.google.android.wearable.compat.WearableActivityController.AmbientCallback;

class d extends AmbientCallback {
   // $FF: synthetic field
   final c a;

   d(c var1) {
      this.a = var1;
   }

   public void onEnterAmbient(Bundle var1) {
      c.a(this.a).a(var1);
   }

   public void onExitAmbient() {
      c.a(this.a).a();
   }

   public void onUpdateAmbient() {
      c.a(this.a).b();
   }
}
