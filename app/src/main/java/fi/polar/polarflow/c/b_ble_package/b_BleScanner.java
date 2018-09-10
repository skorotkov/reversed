package fi.polar.polarflow.c.b_ble_package;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import fi.polar.polarflow.data.orm.BleDevice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class b_BleScanner {
   private fi.polar.polarflow.service.bluetooth.i a;
   private fi.polar.polarflow.service.bluetooth.k b;
   private final Map c;
   private final HashSet d;
   private final HashSet e;
   private h f;
   private UUID g;
   private int h;
   private int i;
   private int j;
   private final Context k;
   private final e l;
   private volatile boolean m;
   private final Handler n = new Handler();
   private final Runnable o = new c(this);

   public b_BleScanner(Context var1) {
      this.k = var1;
      this.a = (new fi.polar.polarflow.service.bluetooth.l(var1)).a();
      this.c = new HashMap();
      this.d = new HashSet();
      this.e = new HashSet();
      this.h = 0;
      this.i = -55;
      this.j = -55;
      this.l = new e(this);
   }

   // $FF: synthetic method
   static Map a(b_BleScanner var0) {
      return var0.c;
   }

   private void a(a var1) {
      if (this.b() && this.f != null) {
         this.n.post(new g(this, var1));
      }

   }

   // $FF: synthetic method
   static void a(b_BleScanner var0, int var1) {
      var0.b(var1);
   }

   // $FF: synthetic method
   static void a(b_BleScanner var0, a var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static boolean a(b_BleScanner var0, String var1, String var2, boolean var3) {
      return var0.a(var1, var2, var3);
   }

   private boolean a(String var1, String var2, boolean var3) {
      boolean var4 = false;
      if (var3) {
         var4 = this.e.contains(var1);
      }

      var3 = var4;
      if (!var4) {
         var3 = this.d.contains(var2);
      }

      return var3;
   }

   // $FF: synthetic method
   static h b(b_BleScanner var0) {
      return var0.f;
   }

   private void b(int var1) {
      synchronized(this){}

      try {
         StringBuilder var2 = new StringBuilder();
         fi.polar.polarflow.util.d.b("BleScanner", var2.append("onScanFailed(").append(var1).append(")").toString());
         this.b = null;
         this.m = false;
      } finally {
         ;
      }

   }

   private void b(a var1) {
      if (this.b() && this.f != null) {
         this.n.post(new f(this, var1));
      }

   }

   // $FF: synthetic method
   static void b(b_BleScanner var0, a var1) {
      var0.b(var1);
   }

   private boolean b(long param1, h param3) {
      // $FF: Couldn't be decompiled
      return true;
   }

   private void d() {
      this.c.clear();
   }

   private void e() {
      this.d.clear();
      this.e.clear();
      Iterator var1 = BleDevice.listAll(BleDevice.class).iterator();

      while(var1.hasNext()) {
         BleDevice var2 = (BleDevice)var1.next();
         String var3 = var2.getMac();
         if (!TextUtils.isEmpty(var3)) {
            this.d.add(var3);
         }

         var3 = var2.getDeviceId();
         if (!TextUtils.isEmpty(var3)) {
            this.e.add(var3);
         }
      }

   }

   public void a() {
      synchronized(this){}

      try {
         fi.polar.polarflow.util.d.c("BleScanner", "stopScan()");
         this.n.removeCallbacks(this.o);
         if (this.m) {
            this.m = false;
            if (this.a.a() && this.b != null) {
               this.b.a(this.l);
            }

            this.b = null;
         }

         this.f = null;
         this.n.removeCallbacksAndMessages((Object)null);
      } finally {
         ;
      }

   }

   public void a(int var1) {
      this.h = var1;
   }

   public void a(int var1, int var2) {
      this.i = var1;
      this.j = var2;
   }

   public void a(UUID var1) {
      this.g = var1;
   }

   public boolean a(int var1, boolean var2) {
      boolean var3 = true;
      if (var2) {
         if (var1 > this.i) {
            var2 = var3;
         } else {
            var2 = false;
         }
      } else {
         var2 = var3;
         if (var1 <= this.j) {
            var2 = false;
         }
      }

      return var2;
   }

   public boolean a(long var1, h var3) {
      return this.b(var1, var3);
   }

   public boolean a(h var1) {
      return this.b(0L, var1);
   }

   public boolean b() {
      return this.m;
   }

   public List c() {
      ArrayList var1 = new ArrayList(this.c.values());
      Collections.sort(var1, new d(this));
      return var1;
   }
}
