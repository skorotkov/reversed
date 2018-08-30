package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public class gq implements bh {
   Toolbar a;
   CharSequence b;
   Callback c;
   boolean d;
   private int e;
   private View f;
   private Drawable g;
   private Drawable h;
   private Drawable i;
   private boolean j;
   private CharSequence k;
   private CharSequence l;
   private int m;
   private int n;
   private Drawable o;

   public gq(Toolbar var1, boolean var2) {
      this(var1, var2, android.support.v7.a.i.abc_action_bar_up_description, android.support.v7.a.f.abc_ic_ab_back_material);
   }

   public gq(Toolbar var1, boolean var2, int var3, int var4) {
      this.m = 0;
      this.n = 0;
      this.a = var1;
      this.b = var1.getTitle();
      this.k = var1.getSubtitle();
      boolean var5;
      if (this.b != null) {
         var5 = true;
      } else {
         var5 = false;
      }

      this.j = var5;
      this.i = var1.getNavigationIcon();
      gh var8 = gh.a(var1.getContext(), (AttributeSet)null, android.support.v7.a.k.ActionBar, android.support.v7.a.b.actionBarStyle, 0);
      this.o = var8.a(android.support.v7.a.k.ActionBar_homeAsUpIndicator);
      if (var2) {
         CharSequence var6 = var8.b(android.support.v7.a.k.ActionBar_title);
         if (!TextUtils.isEmpty(var6)) {
            this.b(var6);
         }

         var6 = var8.b(android.support.v7.a.k.ActionBar_subtitle);
         if (!TextUtils.isEmpty(var6)) {
            this.c(var6);
         }

         Drawable var9 = var8.a(android.support.v7.a.k.ActionBar_logo);
         if (var9 != null) {
            this.b(var9);
         }

         var9 = var8.a(android.support.v7.a.k.ActionBar_icon);
         if (var9 != null) {
            this.a(var9);
         }

         if (this.i == null && this.o != null) {
            this.c(this.o);
         }

         this.d(var8.a(android.support.v7.a.k.ActionBar_displayOptions, 0));
         var4 = var8.g(android.support.v7.a.k.ActionBar_customNavigationLayout, 0);
         if (var4 != 0) {
            this.a(LayoutInflater.from(this.a.getContext()).inflate(var4, this.a, false));
            this.d(this.e | 16);
         }

         var4 = var8.f(android.support.v7.a.k.ActionBar_height, 0);
         if (var4 > 0) {
            LayoutParams var10 = this.a.getLayoutParams();
            var10.height = var4;
            this.a.setLayoutParams(var10);
         }

         var4 = var8.d(android.support.v7.a.k.ActionBar_contentInsetStart, -1);
         int var7 = var8.d(android.support.v7.a.k.ActionBar_contentInsetEnd, -1);
         if (var4 >= 0 || var7 >= 0) {
            this.a.a(Math.max(var4, 0), Math.max(var7, 0));
         }

         var4 = var8.g(android.support.v7.a.k.ActionBar_titleTextStyle, 0);
         if (var4 != 0) {
            this.a.a(this.a.getContext(), var4);
         }

         var4 = var8.g(android.support.v7.a.k.ActionBar_subtitleTextStyle, 0);
         if (var4 != 0) {
            this.a.b(this.a.getContext(), var4);
         }

         var4 = var8.g(android.support.v7.a.k.ActionBar_popupTheme, 0);
         if (var4 != 0) {
            this.a.setPopupTheme(var4);
         }
      } else {
         this.e = this.c();
      }

      var8.a();
      this.c(var3);
      this.l = this.a.getNavigationContentDescription();
      this.a.setNavigationOnClickListener(new gr(this));
   }

   private int c() {
      byte var1 = 11;
      if (this.a.getNavigationIcon() != null) {
         var1 = 15;
         this.o = this.a.getNavigationIcon();
      }

      return var1;
   }

   private void d() {
      Drawable var1 = null;
      if ((this.e & 2) != 0) {
         if ((this.e & 1) != 0) {
            if (this.h != null) {
               var1 = this.h;
            } else {
               var1 = this.g;
            }
         } else {
            var1 = this.g;
         }
      }

      this.a.setLogo(var1);
   }

   private void e() {
      if ((this.e & 4) != 0) {
         Toolbar var1 = this.a;
         Drawable var2;
         if (this.i != null) {
            var2 = this.i;
         } else {
            var2 = this.o;
         }

         var1.setNavigationIcon(var2);
      } else {
         this.a.setNavigationIcon((Drawable)null);
      }

   }

   private void e(CharSequence var1) {
      this.b = var1;
      if ((this.e & 8) != 0) {
         this.a.setTitle(var1);
      }

   }

   private void f() {
      if ((this.e & 4) != 0) {
         if (TextUtils.isEmpty(this.l)) {
            this.a.setNavigationContentDescription(this.n);
         } else {
            this.a.setNavigationContentDescription(this.l);
         }
      }

   }

   public CharSequence a() {
      return this.a.getTitle();
   }

   public void a(int var1) {
      Drawable var2;
      if (var1 != 0) {
         var2 = android.support.v7.b.a.b.b(this.b(), var1);
      } else {
         var2 = null;
      }

      this.a(var2);
   }

   public void a(Drawable var1) {
      this.g = var1;
      this.d();
   }

   public void a(View var1) {
      if (this.f != null && (this.e & 16) != 0) {
         this.a.removeView(this.f);
      }

      this.f = var1;
      if (var1 != null && (this.e & 16) != 0) {
         this.a.addView(this.f);
      }

   }

   public void a(Callback var1) {
      this.c = var1;
   }

   public void a(CharSequence var1) {
      if (!this.j) {
         this.e(var1);
      }

   }

   public Context b() {
      return this.a.getContext();
   }

   public void b(int var1) {
      Drawable var2;
      if (var1 != 0) {
         var2 = android.support.v7.b.a.b.b(this.b(), var1);
      } else {
         var2 = null;
      }

      this.b(var2);
   }

   public void b(Drawable var1) {
      this.h = var1;
      this.d();
   }

   public void b(CharSequence var1) {
      this.j = true;
      this.e(var1);
   }

   public void c(int var1) {
      if (var1 != this.n) {
         this.n = var1;
         if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            this.e(this.n);
         }
      }

   }

   public void c(Drawable var1) {
      this.i = var1;
      this.e();
   }

   public void c(CharSequence var1) {
      this.k = var1;
      if ((this.e & 8) != 0) {
         this.a.setSubtitle(var1);
      }

   }

   public void d(int var1) {
      int var2 = this.e ^ var1;
      this.e = var1;
      if (var2 != 0) {
         if ((var2 & 4) != 0) {
            if ((var1 & 4) != 0) {
               this.f();
            }

            this.e();
         }

         if ((var2 & 3) != 0) {
            this.d();
         }

         if ((var2 & 8) != 0) {
            if ((var1 & 8) != 0) {
               this.a.setTitle(this.b);
               this.a.setSubtitle(this.k);
            } else {
               this.a.setTitle((CharSequence)null);
               this.a.setSubtitle((CharSequence)null);
            }
         }

         if ((var2 & 16) != 0 && this.f != null) {
            if ((var1 & 16) != 0) {
               this.a.addView(this.f);
            } else {
               this.a.removeView(this.f);
            }
         }
      }

   }

   public void d(CharSequence var1) {
      this.l = var1;
      this.f();
   }

   public void e(int var1) {
      String var2;
      if (var1 == 0) {
         var2 = null;
      } else {
         var2 = this.b().getString(var1);
      }

      this.d(var2);
   }
}
