package fi.polar.polarflow.c_package;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Handler.Callback;
import fi.polar.polarflow.calculators.am;
import fi.polar.polarflow.data.ExerciseSensors;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class r extends HandlerThread implements Callback {
   private static final int[] a = new int[]{1, 4, 8, 16};
   private final Context b;
   private final Set c;
   private am d;
   private final Map e;
   private int f;
   private boolean g;
   private Handler h;
   private k i;

   r(Context var1) {
      super("SessionSensorsThread");
      fi.polar.polarflow.util.d.c("SessionSensorsThread", "new SessionSensorsThread()");
      this.b = var1;
      this.c = new LinkedHashSet();
      this.e = new HashMap();
   }

   private void b() {
      int[] var1 = a;
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1[var3];
         if (this.c(var4) && this.e.get(var4) == null) {
            Object var5 = null;
            switch(var4) {
            case 1:
               var5 = new fi.polar.polarflow.c_package.c_package.j(this.b);
               break;
            case 4:
               var5 = new fi.polar.polarflow.c_package.d_package.b(this.b);
               break;
            case 8:
               var5 = new fi.polar.polarflow.c_package.a_package.e(this.b);
               break;
            case 16:
               var5 = new fi.polar.polarflow.c_package.a_package.a(this.b);
            }

            if (var5 != null) {
               this.e.put(var4, var5);
               ((a)var5).b();
            }
         }
      }

   }

   private void b(m var1) {
      if (this.g && var1 == m.d) {
         this.c();
      }

   }

   private void c() {
      // $FF: Couldn't be decompiled
   }

   private boolean c(int var1) {
      boolean var2;
      if ((this.f & var1) == var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private a d(int var1) {
      a var2;
      if (this.c(var1)) {
         var2 = (a)this.e.get(var1);
      } else {
         var2 = null;
      }

      return var2;
   }

   private void d() {
      Iterator var1 = this.e.entrySet().iterator();

      while(var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         a var3 = (a)var2.getValue();
         if (this.c((Integer)var2.getKey())) {
            var3.h();
         } else {
            var3.c();
         }
      }

   }

   private void e() {
      if (this.e.isEmpty()) {
         this.f = 5;
         this.b();
      } else {
         Iterator var1 = this.e.values().iterator();

         while(var1.hasNext()) {
            ((a)var1.next()).b();
         }
      }

   }

   private void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   private void g() {
      if (this.g) {
         this.d.b();
         Iterator var1 = this.e.entrySet().iterator();

         while(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            a var3 = (a)var2.getValue();
            if (this.c((Integer)var2.getKey())) {
               var3.f();
            }
         }
      }

   }

   private void h() {
      if (this.g) {
         Iterator var1 = this.e.entrySet().iterator();

         while(var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            a var3 = (a)var2.getValue();
            if (this.c((Integer)var2.getKey())) {
               var3.g();
            }
         }

         this.d.c();
      }

   }

   private void i() {
      fi.polar.polarflow.util.d.c("SessionSensorsThread", "onKill() id: " + this.getId());
      this.h = null;
      this.quit();
   }

   ExerciseSensors a() {
      // $FF: Couldn't be decompiled
      return null;
   }

   void a(int var1) {
      if (this.h != null) {
         this.h.sendMessage(this.h.obtainMessage(6, var1, 0));
      }

   }

   public void a(k var1) {
      this.i = var1;
   }

   void a(m var1) {
      if (this.h != null) {
         this.h.sendMessage(this.h.obtainMessage(5, var1));
      }

   }

   boolean b(int var1) {
      boolean var2;
      if (this.h == null) {
         var2 = false;
      } else {
         this.h.removeMessages(var1);
         var2 = this.h.sendEmptyMessage(var1);
      }

      return var2;
   }

   public boolean handleMessage(Message var1) {
      boolean var2;
      switch(var1.what) {
      case 1:
         this.e();
         break;
      case 2:
         this.f();
         break;
      case 3:
         this.g();
         break;
      case 4:
         this.h();
         break;
      case 5:
         this.b((m)var1.obj);
         break;
      case 6:
         this.e(var1.arg1);
         break;
      case 7:
         this.i();
         break;
      default:
         var2 = false;
         return var2;
      }

      var2 = true;
      return var2;
   }

   public void start() {
      fi.polar.polarflow.util.d.c("SessionSensorsThread", "start() id: " + this.getId());
      super.start();
      this.h = new Handler(this.getLooper(), this);
   }
}
