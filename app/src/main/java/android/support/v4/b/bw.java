package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public class bw {
   int A = 0;
   Notification B;
   RemoteViews C;
   RemoteViews D;
   RemoteViews E;
   public Notification F = new Notification();
   public ArrayList G;
   public Context a;
   public CharSequence b;
   public CharSequence c;
   PendingIntent d;
   PendingIntent e;
   RemoteViews f;
   public Bitmap g;
   public CharSequence h;
   public int i;
   int j;
   boolean k = true;
   public boolean l;
   public ck m;
   public CharSequence n;
   public CharSequence[] o;
   int p;
   int q;
   boolean r;
   String s;
   boolean t;
   String u;
   public ArrayList v = new ArrayList();
   boolean w = false;
   String x;
   Bundle y;
   int z = 0;

   public bw(Context var1) {
      this.a = var1;
      this.F.when = System.currentTimeMillis();
      this.F.audioStreamType = -1;
      this.j = 0;
      this.G = new ArrayList();
   }

   private void a(int var1, boolean var2) {
      Notification var3;
      if (var2) {
         var3 = this.F;
         var3.flags |= var1;
      } else {
         var3 = this.F;
         var3.flags &= ~var1;
      }

   }

   protected static CharSequence d(CharSequence var0) {
      CharSequence var1;
      if (var0 == null) {
         var1 = var0;
      } else {
         var1 = var0;
         if (var0.length() > 5120) {
            var1 = var0.subSequence(0, 5120);
         }
      }

      return var1;
   }

   public Notification a() {
      return br.a.a(this, this.b());
   }

   public bw a(int var1) {
      this.F.icon = var1;
      return this;
   }

   public bw a(long var1) {
      this.F.when = var1;
      return this;
   }

   public bw a(PendingIntent var1) {
      this.d = var1;
      return this;
   }

   public bw a(ck var1) {
      if (this.m != var1) {
         this.m = var1;
         if (this.m != null) {
            this.m.a(this);
         }
      }

      return this;
   }

   public bw a(CharSequence var1) {
      this.b = d(var1);
      return this;
   }

   public bw a(boolean var1) {
      this.a(16, var1);
      return this;
   }

   public bw b(CharSequence var1) {
      this.c = d(var1);
      return this;
   }

   public bw b(boolean var1) {
      this.w = var1;
      return this;
   }

   protected bx b() {
      return new bx();
   }

   public bw c(CharSequence var1) {
      this.F.tickerText = d(var1);
      return this;
   }

   protected CharSequence c() {
      return this.c;
   }

   protected CharSequence d() {
      return this.b;
   }
}
