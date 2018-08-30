package fi.polar.polarflow.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation.AnimationListener;
import android.widget.TextView;

public class v extends q {
   private ViewGroup b = null;
   private ViewGroup c = null;
   private ad d;
   private final Handler e;
   private final Runnable f;
   private final AnimationListener g;
   private final AnimationListener h;

   public v() {
      this.d = ad.a;
      this.e = new Handler();
      this.f = new w(this);
      this.g = new x(this);
      this.h = new y(this);
   }

   // $FF: synthetic method
   static ad a(v var0, ad var1) {
      var0.d = var1;
      return var1;
   }

   // $FF: synthetic method
   static void a(v var0) {
      var0.g();
   }

   // $FF: synthetic method
   static Runnable b(v var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static Handler c(v var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static ViewGroup d(v var0) {
      return var0.b;
   }

   private void g() {
      if (this.d == ad.a) {
         this.h();
      } else if (this.d == ad.b || this.d == ad.c) {
         this.i();
      }

   }

   private void h() {
      this.d = ad.b;
      this.b.measure(0, 0);
      float var1 = (float)this.c.getRootView().getBottom();
      ab var2 = new ab(this, (float)(this.c.getRootView().getBottom() - this.b.getMeasuredHeight()), var1);
      var2.setDuration(600L);
      var2.setAnimationListener(this.g);
      this.b.startAnimation(var2);
      this.b.setVisibility(0);
   }

   private void i() {
      this.d = ad.d;
      float var1 = this.b.getY();
      ac var2 = new ac(this, (float)this.c.getHeight(), var1);
      var2.setDuration(600L);
      var2.setAnimationListener(this.h);
      this.b.startAnimation(var2);
   }

   public void dismiss() {
      this.e.removeCallbacks(this.f);
      super.dismiss();
   }

   public void onCancel(DialogInterface var1) {
      super.onCancel(var1);
      this.e.removeCallbacks(this.f);
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = super.onCreateView(var1, var2, var3);
      this.b = (ViewGroup)var4.findViewById(2131755542);
      this.c = (ViewGroup)var4.findViewById(2131755540);
      TextView var5 = (TextView)var4.findViewById(2131755541);
      var5.setMaxLines(10);
      var5.setOnTouchListener(new z(this));
      return var4;
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      var1.getViewTreeObserver().addOnGlobalLayoutListener(new aa(this, var1));
   }
}
