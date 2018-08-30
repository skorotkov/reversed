package android.support.v4.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class ad extends ab {
   private final Activity a;
   final Context b;
   final int c;
   final ah d;
   private final Handler e;
   private android.support.v4.g.t f;
   private boolean g;
   private bm h;
   private boolean i;
   private boolean j;

   ad(Activity var1, Context var2, Handler var3, int var4) {
      this.d = new ah();
      this.a = var1;
      this.b = var2;
      this.e = var3;
      this.c = var4;
   }

   ad(x var1) {
      this(var1, var1, var1.c, 0);
   }

   bm a(String var1, boolean var2, boolean var3) {
      if (this.f == null) {
         this.f = new android.support.v4.g.t();
      }

      bm var4 = (bm)this.f.get(var1);
      bm var5;
      if (var4 == null && var3) {
         var4 = new bm(var1, this, var2);
         this.f.put(var1, var4);
         var5 = var4;
      } else {
         var5 = var4;
         if (var2) {
            var5 = var4;
            if (var4 != null) {
               var5 = var4;
               if (!var4.e) {
                  var4.b();
                  var5 = var4;
               }
            }
         }
      }

      return var5;
   }

   public View a(int var1) {
      return null;
   }

   public void a(p var1, Intent var2, int var3, Bundle var4) {
      if (var3 != -1) {
         throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
      } else {
         this.b.startActivity(var2);
      }
   }

   public void a(p var1, IntentSender var2, int var3, Intent var4, int var5, int var6, int var7, Bundle var8) {
      if (var3 != -1) {
         throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
      } else {
         android.support.v4.b.a.a(this.a, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   public void a(p var1, String[] var2, int var3) {
   }

   void a(android.support.v4.g.t var1) {
      if (var1 != null) {
         int var2 = var1.size();

         for(int var3 = 0; var3 < var2; ++var3) {
            ((bm)var1.c(var3)).a(this);
         }
      }

      this.f = var1;
   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
   }

   void a(boolean var1) {
      this.g = var1;
      if (this.h != null && this.j) {
         this.j = false;
         if (var1) {
            this.h.d();
         } else {
            this.h.c();
         }
      }

   }

   public boolean a() {
      return true;
   }

   public boolean a(p var1) {
      return true;
   }

   public boolean a(String var1) {
      return false;
   }

   public LayoutInflater b() {
      return (LayoutInflater)this.b.getSystemService("layout_inflater");
   }

   void b(p var1) {
   }

   void b(String var1) {
      if (this.f != null) {
         bm var2 = (bm)this.f.get(var1);
         if (var2 != null && !var2.f) {
            var2.h();
            this.f.remove(var1);
         }
      }

   }

   void b(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mLoadersStarted=");
      var3.println(this.j);
      if (this.h != null) {
         var3.print(var1);
         var3.print("Loader Manager ");
         var3.print(Integer.toHexString(System.identityHashCode(this.h)));
         var3.println(":");
         this.h.a(var1 + "  ", var2, var3, var4);
      }

   }

   public void d() {
   }

   public boolean e() {
      return true;
   }

   public int f() {
      return this.c;
   }

   public abstract Object g();

   Activity h() {
      return this.a;
   }

   Context i() {
      return this.b;
   }

   Handler j() {
      return this.e;
   }

   ah k() {
      return this.d;
   }

   boolean l() {
      return this.g;
   }

   void m() {
      if (!this.j) {
         this.j = true;
         if (this.h != null) {
            this.h.b();
         } else if (!this.i) {
            this.h = this.a("(root)", this.j, false);
            if (this.h != null && !this.h.e) {
               this.h.b();
            }
         }

         this.i = true;
      }

   }

   void n() {
      if (this.h != null) {
         this.h.h();
      }

   }

   void o() {
      if (this.f != null) {
         int var1 = this.f.size();
         bm[] var2 = new bm[var1];

         int var3;
         for(var3 = var1 - 1; var3 >= 0; --var3) {
            var2[var3] = (bm)this.f.c(var3);
         }

         for(var3 = 0; var3 < var1; ++var3) {
            bm var4 = var2[var3];
            var4.e();
            var4.g();
         }
      }

   }

   android.support.v4.g.t p() {
      int var1 = 0;
      boolean var6;
      if (this.f != null) {
         int var2 = this.f.size();
         bm[] var3 = new bm[var2];

         for(int var4 = var2 - 1; var4 >= 0; --var4) {
            var3[var4] = (bm)this.f.c(var4);
         }

         boolean var5 = this.l();
         boolean var9 = false;

         while(true) {
            var6 = var9;
            if (var1 >= var2) {
               break;
            }

            bm var7 = var3[var1];
            if (!var7.f && var5) {
               if (!var7.e) {
                  var7.b();
               }

               var7.d();
            }

            if (var7.f) {
               var9 = true;
            } else {
               var7.h();
               this.f.remove(var7.d);
            }

            ++var1;
         }
      } else {
         var6 = false;
      }

      android.support.v4.g.t var8;
      if (var6) {
         var8 = this.f;
      } else {
         var8 = null;
      }

      return var8;
   }
}
