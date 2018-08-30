package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.bz;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class d implements ab {
   protected Context a;
   protected Context b;
   protected m c;
   protected LayoutInflater d;
   protected LayoutInflater e;
   protected ad f;
   private ac g;
   private int h;
   private int i;

   public d(Context var1, int var2, int var3) {
      this.a = var1;
      this.d = LayoutInflater.from(var1);
      this.h = var2;
      this.i = var3;
   }

   public ac a() {
      return this.g;
   }

   public ae a(ViewGroup var1) {
      return (ae)this.d.inflate(this.i, var1, false);
   }

   public View a(p var1, View var2, ViewGroup var3) {
      ae var4;
      if (var2 instanceof ae) {
         var4 = (ae)var2;
      } else {
         var4 = this.a(var3);
      }

      this.a(var1, var4);
      return (View)var4;
   }

   public void a(Context var1, m var2) {
      this.b = var1;
      this.e = LayoutInflater.from(this.b);
      this.c = var2;
   }

   public void a(ac var1) {
      this.g = var1;
   }

   public void a(m var1, boolean var2) {
      if (this.g != null) {
         this.g.a(var1, var2);
      }

   }

   public abstract void a(p var1, ae var2);

   protected void a(View var1, int var2) {
      ViewGroup var3 = (ViewGroup)var1.getParent();
      if (var3 != null) {
         var3.removeView(var1);
      }

      ((ViewGroup)this.f).addView(var1, var2);
   }

   public boolean a(int var1, p var2) {
      return true;
   }

   public boolean a(ak var1) {
      boolean var2;
      if (this.g != null) {
         var2 = this.g.a(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean a(m var1, p var2) {
      return false;
   }

   protected boolean a(ViewGroup var1, int var2) {
      var1.removeViewAt(var2);
      return true;
   }

   public void b(boolean var1) {
      ViewGroup var2 = (ViewGroup)this.f;
      if (var2 != null) {
         int var7;
         if (this.c != null) {
            this.c.i();
            ArrayList var3 = this.c.h();
            int var4 = var3.size();
            int var5 = 0;
            int var6 = 0;

            while(true) {
               var7 = var6;
               if (var5 >= var4) {
                  break;
               }

               p var8 = (p)var3.get(var5);
               if (this.a(var6, var8)) {
                  View var9 = var2.getChildAt(var6);
                  p var10;
                  if (var9 instanceof ae) {
                     var10 = ((ae)var9).getItemData();
                  } else {
                     var10 = null;
                  }

                  View var11 = this.a(var8, var9, var2);
                  if (var8 != var10) {
                     var11.setPressed(false);
                     bz.t(var11);
                  }

                  if (var11 != var9) {
                     this.a(var11, var6);
                  }

                  ++var6;
               }

               ++var5;
            }
         } else {
            var7 = 0;
         }

         while(var7 < var2.getChildCount()) {
            if (!this.a(var2, var7)) {
               ++var7;
            }
         }
      }

   }

   public boolean b() {
      return false;
   }

   public boolean b(m var1, p var2) {
      return false;
   }
}
