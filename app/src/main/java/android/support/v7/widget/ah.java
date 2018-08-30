package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class ah extends AutoCompleteTextView implements android.support.v4.view.bt {
   private static final int[] a = new int[]{16843126};
   private ai b;
   private ba c;

   public ah(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ah(Context var1, AttributeSet var2) {
      this(var1, var2, android.support.v7.a.b.autoCompleteTextViewStyle);
   }

   public ah(Context var1, AttributeSet var2, int var3) {
      super(ge.a(var1), var2, var3);
      gh var4 = gh.a(this.getContext(), var2, a, var3, 0);
      if (var4.f(0)) {
         this.setDropDownBackgroundDrawable(var4.a(0));
      }

      var4.a();
      this.b = new ai(this);
      this.b.a(var2, var3);
      this.c = ba.a(this);
      this.c.a(var2, var3);
      this.c.a();
   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      if (this.b != null) {
         this.b.c();
      }

      if (this.c != null) {
         this.c.a();
      }

   }

   public ColorStateList getSupportBackgroundTintList() {
      ColorStateList var1;
      if (this.b != null) {
         var1 = this.b.a();
      } else {
         var1 = null;
      }

      return var1;
   }

   public Mode getSupportBackgroundTintMode() {
      Mode var1;
      if (this.b != null) {
         var1 = this.b.b();
      } else {
         var1 = null;
      }

      return var1;
   }

   public void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      if (this.b != null) {
         this.b.a(var1);
      }

   }

   public void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      if (this.b != null) {
         this.b.a(var1);
      }

   }

   public void setDropDownBackgroundResource(int var1) {
      this.setDropDownBackgroundDrawable(android.support.v7.b.a.b.b(this.getContext(), var1));
   }

   public void setSupportBackgroundTintList(ColorStateList var1) {
      if (this.b != null) {
         this.b.a(var1);
      }

   }

   public void setSupportBackgroundTintMode(Mode var1) {
      if (this.b != null) {
         this.b.a(var1);
      }

   }

   public void setTextAppearance(Context var1, int var2) {
      super.setTextAppearance(var1, var2);
      if (this.c != null) {
         this.c.a(var1, var2);
      }

   }
}
