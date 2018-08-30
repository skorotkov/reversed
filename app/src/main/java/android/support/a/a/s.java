package android.support.a.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.graphics.drawable.Drawable.ConstantState;

class s extends ConstantState {
   private final ConstantState a;

   public s(ConstantState var1) {
      this.a = var1;
   }

   public boolean canApplyTheme() {
      return this.a.canApplyTheme();
   }

   public int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
   }

   public Drawable newDrawable() {
      l var1 = new l();
      var1.b = (VectorDrawable)this.a.newDrawable();
      return var1;
   }

   public Drawable newDrawable(Resources var1) {
      l var2 = new l();
      var2.b = (VectorDrawable)this.a.newDrawable(var1);
      return var2;
   }

   public Drawable newDrawable(Resources var1, Theme var2) {
      l var3 = new l();
      var3.b = (VectorDrawable)this.a.newDrawable(var1, var2);
      return var3;
   }
}
