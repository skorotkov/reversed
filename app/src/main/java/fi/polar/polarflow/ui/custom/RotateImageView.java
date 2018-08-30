package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class RotateImageView extends ImageView {
   private Animation a;
   private boolean b;

   public RotateImageView(Context var1) {
      super(var1);
   }

   public RotateImageView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setAnimation(var2);
   }

   public RotateImageView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.setAnimation(var2);
   }

   private void a(int var1, int var2) {
      this.a = AnimationUtils.loadAnimation(this.getContext(), 2131034122);
      this.a.setDuration((long)var2);
      this.a.setInterpolator(new y(this, var1));
   }

   private void setAnimation(AttributeSet var1) {
      this.b = false;
      TypedArray var4 = this.getContext().obtainStyledAttributes(var1, fi.polar.polarflow.i.RotateImageView);
      int var2 = var4.getInt(0, 12);
      int var3 = var4.getInt(1, 1000);
      var4.recycle();
      this.a(var2, var3);
   }

   public void a() {
      if (!this.b) {
         this.b = true;
         this.startAnimation(this.a);
      }

   }

   public void b() {
      if (this.b) {
         this.b = false;
         this.clearAnimation();
      }

   }
}
