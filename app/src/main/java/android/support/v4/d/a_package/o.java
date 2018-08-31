package android.support.v4.d.a_package;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public abstract class o extends ConstantState {
   int a;
   ConstantState b;
   ColorStateList c = null;
   Mode d;

   o(o var1, Resources var2) {
      this.d = n.a;
      if (var1 != null) {
         this.a = var1.a;
         this.b = var1.b;
         this.c = var1.c;
         this.d = var1.d;
      }

   }

   boolean a() {
      boolean var1;
      if (this.b != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int getChangingConfigurations() {
      int var1 = this.a;
      int var2;
      if (this.b != null) {
         var2 = this.b.getChangingConfigurations();
      } else {
         var2 = 0;
      }

      return var2 | var1;
   }

   public Drawable newDrawable() {
      return this.newDrawable((Resources)null);
   }

   public abstract Drawable newDrawable(Resources var1);
}
