package android.support.v4.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

public final class g {
   private static final Object f = new Object();
   private static g g;
   private final Context a;
   private final HashMap b = new HashMap();
   private final HashMap c = new HashMap();
   private final ArrayList d = new ArrayList();
   private final Handler e;

   private g(Context var1) {
      this.a = var1;
      this.e = new h(this, var1.getMainLooper());
   }

   public static g a(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private void a() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void a(g var0) {
      var0.a();
   }

   public void a(BroadcastReceiver param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(BroadcastReceiver param1, IntentFilter param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(Intent param1) {
      // $FF: Couldn't be decompiled
   }

   public void b(Intent var1) {
      if (this.a(var1)) {
         this.a();
      }

   }
}
