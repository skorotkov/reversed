package fi.polar.polarflow.ui.custom;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SensorToastView extends LinearLayout {
   private AnimatorSet a;
   private TextView b;
   private int c;
   private int d;
   private final AnimatorUpdateListener e = new ad(this);
   private final AnimatorListener f = new ae(this);
   private final AnimatorListener g = new af(this);

   public SensorToastView(Context var1) {
      super(var1);
      this.a(var1, (AttributeSet)null, 0);
   }

   public SensorToastView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var1, var2, 0);
   }

   public SensorToastView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var1, var2, var3);
   }

   private void a(Context var1, AttributeSet var2, int var3) {
      this.a = new AnimatorSet();
      this.a.setInterpolator(new AccelerateDecelerateInterpolator());
      this.c = this.getResources().getDimensionPixelSize(2131361948);
   }

   // $FF: synthetic method
   static void a(SensorToastView var0) {
      var0.b();
   }

   // $FF: synthetic method
   static TextView b(SensorToastView var0) {
      return var0.b;
   }

   private void b() {
      if (!this.a.isStarted()) {
         ValueAnimator var1 = ValueAnimator.ofInt(new int[]{this.c, this.d});
         var1.addListener(this.f);
         var1.addUpdateListener(this.e);
         var1.setDuration(500L);
         ValueAnimator var2 = ValueAnimator.ofInt(new int[]{this.d, this.c});
         var2.addListener(this.g);
         var2.addUpdateListener(this.e);
         var2.setDuration(500L);
         var2.setStartDelay(2000L);
         this.a.playSequentially(new Animator[]{var1, var2});
         this.a.start();
      }

   }

   public void a() {
      this.post(new ac(this));
   }

   public void a(AnimatorListener var1) {
      this.a.addListener(var1);
   }

   protected void onFinishInflate() {
      this.b = (TextView)this.findViewById(2131755487);
      super.onFinishInflate();
   }

   protected void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (this.d == 0) {
         this.d = this.getMeasuredWidth();
         this.b.setVisibility(8);
         super.onMeasure(var1, var2);
      }

   }

   public void setSensorName(String var1) {
      this.b.setText(this.getResources().getString(2131230795, new Object[]{var1}));
      this.invalidate();
      this.requestLayout();
   }
}
