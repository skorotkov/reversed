package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

public class bc extends TextView implements android.support.v4.view.bt {
   private ai a;
   private ba b;

   public bc(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public bc(Context var1, AttributeSet var2) {
      this(var1, var2, 16842884);
   }

   public bc(Context var1, AttributeSet var2, int var3) {
      super(ge.a(var1), var2, var3);
      this.a = new ai(this);
      this.a.a(var2, var3);
      this.b = ba.a(this);
      this.b.a(var2, var3);
      this.b.a();
   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      if (this.a != null) {
         this.a.c();
      }

      if (this.b != null) {
         this.b.a();
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

   public void setTextAppearance(Context var1, int var2) {
      super.setTextAppearance(var1, var2);
      if (this.b != null) {
         this.b.a(var1, var2);
      }

   }
}
