package fi.polar.polarflow.ui.custom;

import android.animation.ValueAnimator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;

public class CircularProgressBar extends FrameLayout {
   private static final String a = CircularProgressBar.class.getSimpleName();
   private TextView b;
   private PieView c;
   private ValueAnimator d;
   private j e;
   private boolean f;
   private boolean g;
   private int h = 2000;
   private int i = 1000;
   private final AnimatorUpdateListener j = new h(this);
   private final AnimatorListener k = new i(this);

   public CircularProgressBar(Context var1) {
      super(var1);
      this.a(var1, (AttributeSet)null, 0);
   }

   public CircularProgressBar(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1, var2, 0);
   }

   public CircularProgressBar(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static ValueAnimator a(CircularProgressBar var0) {
      return var0.d;
   }

   private void a(Context var1, AttributeSet var2, int var3) {
      if (this.d == null) {
         this.d = ValueAnimator.ofFloat(new float[]{0.0F, 1.0F});
         this.d.setInterpolator(new LinearInterpolator());
         this.d.setDuration((long)this.h);
         this.d.addUpdateListener(this.j);
      }

   }

   // $FF: synthetic method
   static boolean a(CircularProgressBar var0, boolean var1) {
      var0.f = var1;
      return var1;
   }

   // $FF: synthetic method
   static int b(CircularProgressBar var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static PieView c(CircularProgressBar var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static TextView d(CircularProgressBar var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static String d() {
      return a;
   }

   // $FF: synthetic method
   static j e(CircularProgressBar var0) {
      return var0.e;
   }

   private void e() {
      this.d.addListener(this.k);
   }

   private void f() {
      this.d.removeListener(this.k);
   }

   // $FF: synthetic method
   static boolean f(CircularProgressBar var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static boolean g(CircularProgressBar var0) {
      return var0.f;
   }

   public void a() {
      fi.polar.polarflow.util.d.d(a, "start");
      float var1 = this.d.getAnimatedFraction();
      this.b();
      this.d.setDuration((long)this.h);
      this.e();
      if (var1 > 0.0F && var1 < 1.0F) {
         this.d.setCurrentFraction(var1);
      }

      this.d.start();
   }

   public void b() {
      fi.polar.polarflow.util.d.d(a, "stopProgressAnimation");
      this.f = false;
      this.g = false;
      this.f();
      this.d.cancel();
      this.d.end();
      this.d.setCurrentFraction(0.0F);
   }

   public void c() {
      fi.polar.polarflow.util.d.d(a, "reverseProgressAnimation");
      float var1 = this.d.getAnimatedFraction();
      this.b();
      this.g = true;
      this.e();
      if (var1 > 0.0F && var1 < 1.0F) {
         long var2 = (long)((float)this.i / var1);
         this.d.setDuration(var2);
         this.d.setCurrentFraction(var1);
         this.d.reverse();
      } else {
         this.d.end();
         this.b();
      }

   }

   public long getAnimDurationMillis() {
      return (long)this.h;
   }

   float getAnimatedFractionForTest() {
      return this.d.getAnimatedFraction();
   }

   public long getReverseAnimDurationMillis() {
      return (long)this.i;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.b = (TextView)this.findViewById(2131755352);
      this.c = (PieView)this.findViewById(2131755479);
      this.c.setColor(this.getResources().getColor(2131624075, this.getContext().getTheme()));
   }

   public void setAnimDurationMillis(int var1) {
      fi.polar.polarflow.util.d.d(a, "setAnimDurationMillis");
      this.h = var1;
      this.d.setDuration((long)this.h);
   }

   public void setAnimatorListener(j var1) {
      this.e = var1;
   }

   public void setReverseAnimDurationMillis(int var1) {
      fi.polar.polarflow.util.d.d(a, "setReverseAnimDurationMillis");
      this.i = var1;
   }
}
