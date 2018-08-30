package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class ao extends ImageButton implements android.support.v4.view.bt {
   private ai a = new ai(this);
   private ap b;

   public ao(Context var1, AttributeSet var2, int var3) {
      super(ge.a(var1), var2, var3);
      this.a.a(var2, var3);
      this.b = new ap(this);
      this.b.a(var2, var3);
   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      if (this.a != null) {
         this.a.c();
      }

   }

   public ColorStateList getSupportBackgroundTintList() {
      ColorStateList var1;
      if (this.a != null) {
         var1 = this.a.a();
      } else {
         var1 = null;
      }

      return var1;
   }

   public Mode getSupportBackgroundTintMode() {
      Mode var1;
      if (this.a != null) {
         var1 = this.a.b();
      } else {
         var1 = null;
      }

      return var1;
   }

   public boolean hasOverlappingRendering() {
      boolean var1;
      if (this.b.a() && super.hasOverlappingRendering()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public void setImageResource(int var1) {
      this.b.a(var1);
   }

   public void setSupportBackgroundTintList(ColorStateList var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

   }

   public void setSupportBackgroundTintMode(Mode var1) {
      if (this.a != null) {
         this.a.a(var1);
      }

   }
}
