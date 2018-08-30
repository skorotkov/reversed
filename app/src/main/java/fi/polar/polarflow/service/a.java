package fi.polar.polarflow.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class a {
   private final Context a;
   private final Set b;
   private boolean c;
   private boolean d;
   private boolean e;
   private final BroadcastReceiver f = new b(this);

   public a(Context var1) {
      this.a = var1;
      this.b = Collections.synchronizedSet(new HashSet());
   }

   private static boolean a(int var0, int var1) {
      boolean var2;
      if ((float)var0 * 100.0F / (float)var1 < 5.0F) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   // $FF: synthetic method
   static boolean a(Intent var0) {
      return c(var0);
   }

   // $FF: synthetic method
   static boolean a(a var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static boolean a(a var0, boolean var1) {
      var0.d = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b(Intent var0) {
      return d(var0);
   }

   // $FF: synthetic method
   static boolean b(a var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static boolean b(a var0, boolean var1) {
      var0.e = var1;
      return var1;
   }

   private static boolean c(Intent var0) {
      return a(var0.getIntExtra("level", -1), var0.getIntExtra("scale", 100));
   }

   private static boolean d(Intent var0) {
      boolean var1 = false;
      if (var0.getIntExtra("plugged", 0) != 0 || e(var0)) {
         var1 = true;
      }

      return var1;
   }

   private static boolean e(Intent var0) {
      int var1 = var0.getIntExtra("status", -1);
      boolean var2;
      if (var1 != 2 && var1 != 5) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public void a() {
      if (!this.c) {
         this.c = true;
         this.d = false;
         this.e = false;
         Intent var1 = this.a.registerReceiver(this.f, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
         if (var1 != null) {
            this.d = c(var1);
            this.e = d(var1);
         }
      }

   }

   public void a(c var1) {
      this.b.add(var1);
   }

   public void b() {
      if (this.c) {
         this.c = false;
         this.a.unregisterReceiver(this.f);
      }

   }

   public void b(c var1) {
      this.b.remove(var1);
   }

   public boolean c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   protected void e() {
      // $FF: Couldn't be decompiled
   }

   protected void f() {
      // $FF: Couldn't be decompiled
   }

   protected void g() {
      // $FF: Couldn't be decompiled
   }
}
