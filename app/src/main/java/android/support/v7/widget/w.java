package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class w extends DataSetObservable {
   static final String a = w.class.getSimpleName();
   private static final Object e = new Object();
   private static final Map f = new HashMap();
   final Context b;
   final String c;
   boolean d;
   private final Object g;
   private final List h;
   private final List i;
   private Intent j;
   private y k;
   private int l;
   private boolean m;
   private boolean n;
   private boolean o;
   private aa p;

   private boolean a(z var1) {
      boolean var2 = this.i.add(var1);
      if (var2) {
         this.n = true;
         this.h();
         this.c();
         this.e();
         this.notifyChanged();
      }

      return var2;
   }

   private void c() {
      if (!this.m) {
         throw new IllegalStateException("No preceding call to #readHistoricalData");
      } else {
         if (this.n) {
            this.n = false;
            if (!TextUtils.isEmpty(this.c)) {
               android.support.v4.f.a.a(new ab(this), new ArrayList(this.i), this.c);
            }
         }

      }
   }

   private void d() {
      boolean var1 = this.f();
      boolean var2 = this.g();
      this.h();
      if (var1 | var2) {
         this.e();
         this.notifyChanged();
      }

   }

   private boolean e() {
      boolean var1;
      if (this.k != null && this.j != null && !this.h.isEmpty() && !this.i.isEmpty()) {
         this.k.a(this.j, this.h, Collections.unmodifiableList(this.i));
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean f() {
      boolean var1 = false;
      boolean var2 = var1;
      if (this.o) {
         var2 = var1;
         if (this.j != null) {
            this.o = false;
            this.h.clear();
            List var3 = this.b.getPackageManager().queryIntentActivities(this.j, 0);
            int var4 = var3.size();

            for(int var5 = 0; var5 < var4; ++var5) {
               ResolveInfo var6 = (ResolveInfo)var3.get(var5);
               this.h.add(new x(this, var6));
            }

            var2 = true;
         }
      }

      return var2;
   }

   private boolean g() {
      boolean var1 = true;
      if (this.d && this.n && !TextUtils.isEmpty(this.c)) {
         this.d = false;
         this.m = true;
         this.i();
      } else {
         var1 = false;
      }

      return var1;
   }

   private void h() {
      int var1 = this.i.size() - this.l;
      if (var1 > 0) {
         this.n = true;

         for(int var2 = 0; var2 < var1; ++var2) {
            z var3 = (z)this.i.remove(0);
         }
      }

   }

   private void i() {
      // $FF: Couldn't be decompiled
   }

   public int a() {
      // $FF: Couldn't be decompiled
   }

   public int a(ResolveInfo param1) {
      // $FF: Couldn't be decompiled
   }

   public ResolveInfo a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public Intent b(int param1) {
      // $FF: Couldn't be decompiled
   }

   public ResolveInfo b() {
      // $FF: Couldn't be decompiled
   }

   public void c(int param1) {
      // $FF: Couldn't be decompiled
   }
}
