package fi.polar.polarflow.ui.exeview.shader;

import android.content.Context;
import android.support.wearable.view.DotsPageIndicator;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

public class ShaderContainerView extends FrameLayout {
   private DotsPageIndicator a;
   private ShaderGridPager b;
   private float c = -1.0F;
   private int d = 0;
   private boolean e = true;
   private float f = 20.0F;

   public ShaderContainerView(Context var1) {
      super(var1);
   }

   public ShaderContainerView(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public ShaderContainerView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   // $FF: synthetic method
   static float a(ShaderContainerView var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static float a(ShaderContainerView var0, float var1) {
      var0.c = var1;
      return var1;
   }

   // $FF: synthetic method
   static int a(ShaderContainerView var0, int var1) {
      var0.d = var1;
      return var1;
   }

   private long a(float var1) {
      long var2 = 0L;
      if (this.getY() != var1) {
         this.animate().cancel();
         ViewPropertyAnimator var4 = this.animate().y(var1);
         if (var1 == -240.0F) {
            var4.withEndAction(new k(this));
         }

         var2 = var4.getDuration();
         var4.start();
      }

      return var2;
   }

   // $FF: synthetic method
   static int b(ShaderContainerView var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static long b(ShaderContainerView var0, float var1) {
      return var0.a(var1);
   }

   public void a() {
      this.setBackgroundColor(-12303292);
      this.a.setVisibility(0);
      this.b.setFragmentsVisibility(0);
      this.e = false;
   }

   public void b() {
      this.animate().cancel();
      this.setBackgroundColor(0);
      this.a.setVisibility(4);
      this.b.setFragmentsVisibility(4);
      this.setY(-240.0F + this.f);
      this.e = true;
   }

   public boolean c() {
      return this.e;
   }

   public long d() {
      long var1 = this.a(-240.0F);
      this.d = 0;
      this.c = -1.0F;
      return var1;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.b = (ShaderGridPager)this.findViewById(2131755194);
      this.b.setOnTouchListener(new l(this, (k)null));
      this.a = (DotsPageIndicator)this.findViewById(2131755195);
      this.setY(-240.0F + this.f);
   }

   public void setShaderAccessLimit(float var1) {
      this.f = var1;
      if (this.e) {
         this.setY(-240.0F + this.f);
      }

   }
}
