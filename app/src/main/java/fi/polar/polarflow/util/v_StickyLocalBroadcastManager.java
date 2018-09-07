package fi.polar.polarflow.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class v_StickyLocalBroadcastManager {
   private static volatile v_StickyLocalBroadcastManager c;
   private final android.support.v4.c.g a_localBroadcastManager; // android.support.v4.content.LocalBroadcastManager
   private final Map b = Collections.synchronizedMap(new HashMap());

   private v_StickyLocalBroadcastManager(Context var1) {
      this.a_localBroadcastManager = android.support.v4.c.g.a(var1);
   }

   public static v_StickyLocalBroadcastManager a_getInstance() {
      if (c == null) {
         d.f("StickyLocalBroadcastManager", "StickyLocalBroadcastManager are not initialized, use get(context) instead");
      }

      return c;
   }

   public static v_StickyLocalBroadcastManager a_getInstance(Context param0) {
      // $FF: Couldn't be decompiled
      return null;
   }

   public Intent a_registerReceiver(BroadcastReceiver var1, String var2) {
      IntentFilter var3 = new IntentFilter(var2);
      Intent var4 = (Intent)this.b.get(var2);
      if (var1 != null) {
         this.a_localBroadcastManager.a(var1, var3); // registerReceiver
      }

      return var4;
   }

   public void a_unregisterReceiver(BroadcastReceiver var1) {
      this.a_localBroadcastManager.a(var1); // unregisterReceiver
   }

   public void a_registerReceiver(BroadcastReceiver var1, IntentFilter var2) {
      this.a_localBroadcastManager.a(var1, var2);
   }

   public void a_removeFromMap(String... var1) {
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1[var3];
         this.b.remove(var4);
      }

   }

   public boolean a_sendBroadcast(Intent var1) {
      return this.a_localBroadcastManager.a(var1);
   }

   public List b_getFromMap(String... var1) {
      ArrayList var2 = new ArrayList();
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         String var5 = var1[var4];
         Intent var6 = (Intent)this.b.get(var5);
         if (var6 != null) {
            var2.add(var6);
         }
      }

      return var2;
   }

   public boolean b_sendStickyBroadcast(Intent var1) {
      this.b.put(var1.getAction(), var1);
      return this.a_localBroadcastManager.a(var1);
   }
}
