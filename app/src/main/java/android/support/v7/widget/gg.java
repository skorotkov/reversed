package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class gg extends fb {
   private final WeakReference a;

   public gg(Context var1, Resources var2) {
      super(var2);
      this.a = new WeakReference(var1);
   }

   public Drawable getDrawable(int var1) {
      Drawable var2 = super.getDrawable(var1);
      Context var3 = (Context)this.a.get();
      if (var2 != null && var3 != null) {
         aj.a();
         aj.a(var3, var1, var2);
      }

      return var2;
   }
}
