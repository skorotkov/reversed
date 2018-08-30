package fi.polar.polarflow.service.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class al extends fi.polar.polarflow.service.a {
   private fi.polar.polarflow.util.aa a = new fi.polar.polarflow.util.aa();
   private final Map b = Collections.synchronizedMap(new HashMap());
   private final i c = new i(50);
   private final i d = new i(50);
   private final AtomicInteger e = new AtomicInteger();

   @SuppressLint({"UseSparseArrays"})
   public al(Context var1) {
      super(var1);
   }

   private void j() {
      long var1 = this.k();
      if (var1 != 0L) {
         this.c.b(var1);
         this.d.b(var1);
      }

   }

   private long k() {
      // $FF: Couldn't be decompiled
   }

   public Boolean a(long var1) {
      Object var3 = null;
      Boolean var4;
      if (var1 <= this.d.a()) {
         var4 = this.d.a(var1);
      } else {
         var4 = null;
      }

      Boolean var5 = this.c.a(var1);
      Boolean var7;
      if (var5 != null && var4 != null) {
         boolean var6;
         if (!var5 && !var4) {
            var6 = false;
         } else {
            var6 = true;
         }

         var7 = var6;
      } else if (var5 != null && var5) {
         var7 = true;
      } else {
         var7 = (Boolean)var3;
         if (var5 == null) {
            var7 = (Boolean)var3;
            if (var4 != null) {
               var7 = var4;
            }
         }
      }

      return var7;
   }

   public void a() {
      super.a();
      this.c.b();
      this.d.b();
      this.c.a(this.a.c(), this.d());
   }

   public void a(int var1) {
      if (this.b.remove(var1) == null) {
         fi.polar.polarflow.util.d.f("NonWearCache", "Unknown client id: " + var1);
      }

   }

   public void a(int var1, long var2) {
      if (this.b.containsKey(var1)) {
         this.b.put(var1, var2);
         this.j();
      } else {
         fi.polar.polarflow.util.d.f("NonWearCache", "Unknown client id: " + var1);
      }

   }

   public void a(long var1, boolean var3) {
      this.d.a(var1, var3);
   }

   protected void e() {
      fi.polar.polarflow.util.d.c("NonWearCache", "onBatteryLow()");
      super.e();
   }

   protected void f() {
      fi.polar.polarflow.util.d.c("NonWearCache", "onPlugged()");
      super.f();
      this.c.a(this.a.c(), true);
   }

   protected void g() {
      fi.polar.polarflow.util.d.c("NonWearCache", "onUnPlugged()");
      super.g();
      this.c.a(this.a.c(), false);
   }

   public int h() {
      int var1 = this.e.incrementAndGet();
      this.b.put(var1, 0L);
      return var1;
   }

   public long i() {
      return this.d.a();
   }
}
