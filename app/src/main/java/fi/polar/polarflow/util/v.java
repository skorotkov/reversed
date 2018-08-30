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

public class v {
   private static volatile v c;
   private final android.support.v4.c.g a;
   private final Map b = Collections.synchronizedMap(new HashMap());

   private v(Context var1) {
      this.a = android.support.v4.c.g.a(var1);
   }

   public static v a() {
      if (c == null) {
         d.f("StickyLocalBroadcastManager", "StickyLocalBroadcastManager are not initialized, use get(context) instead");
      }

      return c;
   }

   public static v a(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public Intent a(BroadcastReceiver var1, String var2) {
      IntentFilter var3 = new IntentFilter(var2);
      Intent var4 = (Intent)this.b.get(var2);
      if (var1 != null) {
         this.a.a(var1, var3);
      }

      return var4;
   }

   public void a(BroadcastReceiver var1) {
      this.a.a(var1);
   }

   public void a(BroadcastReceiver var1, IntentFilter var2) {
      this.a.a(var1, var2);
   }

   public void a(String... var1) {
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1[var3];
         this.b.remove(var4);
      }

   }

   public boolean a(Intent var1) {
      return this.a.a(var1);
   }

   public List b(String... var1) {
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

   public boolean b(Intent var1) {
      this.b.put(var1.getAction(), var1);
      return this.a.a(var1);
   }
}
