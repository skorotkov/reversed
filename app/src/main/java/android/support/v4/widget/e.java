package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

class e extends ContentObserver {
   // $FF: synthetic field
   final d a;

   e(d var1) {
      super(new Handler());
      this.a = var1;
   }

   public boolean deliverSelfNotifications() {
      return true;
   }

   public void onChange(boolean var1) {
      this.a.b();
   }
}
