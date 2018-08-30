package fi.polar.polarflow.service;

import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

class g extends ContentObserver {
   // $FF: synthetic field
   final f a;

   g(f var1, Handler var2) {
      super(var2);
      this.a = var1;
   }

   public void onChange(boolean var1) {
      this.onChange(var1, f.c());
   }

   public void onChange(boolean var1, Uri var2) {
      if (f.c().equals(var2)) {
         int var3 = f.a(f.a(this.a));
         fi.polar.polarflow.util.d.c(f.d(), "onChange(" + f.a(var3) + ")");
         Intent var4 = new Intent();
         var4.setAction("fi.polar.polarflow.service.action.PLAYSTORE_AVAILABILITY_CHANGED");
         var4.putExtra("fi.polar.polarflow.service.extra.PLAYSTORE_AVAILABILITY", var3);
         f.a(this.a).sendBroadcast(var4);
      }

   }
}
