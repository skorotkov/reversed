package android.support.v7.widget;

import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ey {
   private static final List o;
   public final View a;
   WeakReference b;
   int c = -1;
   int d = -1;
   long e = -1L;
   int f = -1;
   int g = -1;
   ey h = null;
   ey i = null;
   List j = null;
   List k = null;
   int l = -1;
   dl m;
   private int n;
   private int p = 0;
   private em q = null;
   private boolean r = false;
   private int s = 0;

   static {
      o = Collections.EMPTY_LIST;
   }

   public ey(View var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("itemView may not be null");
      } else {
         this.a = var1;
      }
   }

   private boolean A() {
      boolean var1;
      if ((this.n & 16) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean B() {
      boolean var1;
      if ((this.n & 16) == 0 && android.support.v4.view.bz.b(this.a)) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   // $FF: synthetic method
   static em a(ey var0, em var1) {
      var0.q = var1;
      return var1;
   }

   private void a(dl var1) {
      this.s = android.support.v4.view.bz.d(this.a);
      var1.a((ey)this, 4);
   }

   // $FF: synthetic method
   static void a(ey var0, dl var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static boolean a(ey var0) {
      return var0.B();
   }

   // $FF: synthetic method
   static boolean a(ey var0, boolean var1) {
      var0.r = var1;
      return var1;
   }

   private void b(dl var1) {
      var1.a(this, this.s);
      this.s = 0;
   }

   // $FF: synthetic method
   static void b(ey var0, dl var1) {
      var0.b(var1);
   }

   // $FF: synthetic method
   static boolean b(ey var0) {
      return var0.r;
   }

   // $FF: synthetic method
   static boolean c(ey var0) {
      return var0.A();
   }

   // $FF: synthetic method
   static int d(ey var0) {
      return var0.n;
   }

   private void z() {
      if (this.j == null) {
         this.j = new ArrayList();
         this.k = Collections.unmodifiableList(this.j);
      }

   }

   void a() {
      this.d = -1;
      this.g = -1;
   }

   void a(int var1, int var2) {
      this.n = this.n & ~var2 | var1 & var2;
   }

   void a(int var1, int var2, boolean var3) {
      this.b(8);
      this.a(var2, var3);
      this.c = var1;
   }

   void a(int var1, boolean var2) {
      if (this.d == -1) {
         this.d = this.c;
      }

      if (this.g == -1) {
         this.g = this.c;
      }

      if (var2) {
         this.g += var1;
      }

      this.c += var1;
      if (this.a.getLayoutParams() != null) {
         ((ef)this.a.getLayoutParams()).e = true;
      }

   }

   void a(em var1, boolean var2) {
      this.q = var1;
      this.r = var2;
   }

   void a(Object var1) {
      if (var1 == null) {
         this.b(1024);
      } else if ((this.n & 1024) == 0) {
         this.z();
         this.j.add(var1);
      }

   }

   public final void a(boolean var1) {
      int var2;
      if (var1) {
         var2 = this.p - 1;
      } else {
         var2 = this.p + 1;
      }

      this.p = var2;
      if (this.p < 0) {
         this.p = 0;
         Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
      } else if (!var1 && this.p == 1) {
         this.n |= 16;
      } else if (var1 && this.p == 0) {
         this.n &= -17;
      }

   }

   boolean a(int var1) {
      boolean var2;
      if ((this.n & var1) != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   void b() {
      if (this.d == -1) {
         this.d = this.c;
      }

   }

   void b(int var1) {
      this.n |= var1;
   }

   boolean c() {
      boolean var1;
      if ((this.n & 128) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   @Deprecated
   public final int d() {
      int var1;
      if (this.g == -1) {
         var1 = this.c;
      } else {
         var1 = this.g;
      }

      return var1;
   }

   public final int e() {
      int var1;
      if (this.g == -1) {
         var1 = this.c;
      } else {
         var1 = this.g;
      }

      return var1;
   }

   public final int f() {
      int var1;
      if (this.m == null) {
         var1 = -1;
      } else {
         var1 = this.m.d(this);
      }

      return var1;
   }

   public final int g() {
      return this.d;
   }

   public final long h() {
      return this.e;
   }

   public final int i() {
      return this.f;
   }

   boolean j() {
      boolean var1;
      if (this.q != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   void k() {
      this.q.c(this);
   }

   boolean l() {
      boolean var1;
      if ((this.n & 32) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   void m() {
      this.n &= -33;
   }

   void n() {
      this.n &= -257;
   }

   boolean o() {
      boolean var1;
      if ((this.n & 4) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean p() {
      boolean var1;
      if ((this.n & 2) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean q() {
      boolean var1;
      if ((this.n & 1) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean r() {
      boolean var1;
      if ((this.n & 8) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean s() {
      boolean var1;
      if ((this.n & 256) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean t() {
      boolean var1;
      if ((this.n & 512) == 0 && !this.o()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder("ViewHolder{" + Integer.toHexString(this.hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
      if (this.j()) {
         StringBuilder var2 = var1.append(" scrap ");
         String var3;
         if (this.r) {
            var3 = "[changeScrap]";
         } else {
            var3 = "[attachedScrap]";
         }

         var2.append(var3);
      }

      if (this.o()) {
         var1.append(" invalid");
      }

      if (!this.q()) {
         var1.append(" unbound");
      }

      if (this.p()) {
         var1.append(" update");
      }

      if (this.r()) {
         var1.append(" removed");
      }

      if (this.c()) {
         var1.append(" ignored");
      }

      if (this.s()) {
         var1.append(" tmpDetached");
      }

      if (!this.x()) {
         var1.append(" not recyclable(" + this.p + ")");
      }

      if (this.t()) {
         var1.append(" undefined adapter position");
      }

      if (this.a.getParent() == null) {
         var1.append(" no parent");
      }

      var1.append("}");
      return var1.toString();
   }

   void u() {
      if (this.j != null) {
         this.j.clear();
      }

      this.n &= -1025;
   }

   List v() {
      List var1;
      if ((this.n & 1024) == 0) {
         if (this.j != null && this.j.size() != 0) {
            var1 = this.k;
         } else {
            var1 = o;
         }
      } else {
         var1 = o;
      }

      return var1;
   }

   void w() {
      this.n = 0;
      this.c = -1;
      this.d = -1;
      this.e = -1L;
      this.g = -1;
      this.p = 0;
      this.h = null;
      this.i = null;
      this.u();
      this.s = 0;
      this.l = -1;
      dl.c(this);
   }

   public final boolean x() {
      boolean var1;
      if ((this.n & 16) == 0 && !android.support.v4.view.bz.b(this.a)) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean y() {
      boolean var1;
      if ((this.n & 2) != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
