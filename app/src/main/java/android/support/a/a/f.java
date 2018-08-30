package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class f extends ConstantState {
   private final ConstantState a;

   public f(ConstantState var1) {
      this.a = var1;
   }

   public boolean canApplyTheme() {
      return this.a.canApplyTheme();
   }

   public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
   }

   public Drawable newDrawable() {
      c var1 = new c();
      var1.b = this.a.newDrawable();
      var1.b.setCallback(var1.a);
      return var1;
   }

   public Drawable newDrawable(Resources var1) {
      c var2 = new c();
      var2.b = this.a.newDrawable(var1);
      var2.b.setCallback(var2.a);
      return var2;
   }

   public Drawable newDrawable(Resources var1, Theme var2) {
      c var3 = new c();
      var3.b = this.a.newDrawable(var1, var2);
      var3.b.setCallback(var3.a);
      return var3;
   }
}
