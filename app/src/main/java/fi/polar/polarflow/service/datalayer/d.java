package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import com.google.android.gms.wearable.Channel;

abstract class d extends a {
   private static final String a = d.class.getSimpleName();

   d(Context var1) {
      super(var1);
   }

   void b(Channel param1) {
      // $FF: Couldn't be decompiled
   }

   protected abstract byte[] b(String var1);
}
