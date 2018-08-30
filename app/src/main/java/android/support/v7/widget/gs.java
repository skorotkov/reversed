package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

public class gs extends Resources {
   private final WeakReference a;

   public gs(Context var1, Resources var2) {
      super(var2.getAssets(), var2.getDisplayMetrics(), var2.getConfiguration());
      this.a = new WeakReference(var1);
   }

   public static boolean a() {
      boolean var0;
      if (android.support.v7.app.d.a() && VERSION.SDK_INT <= 20) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   final Drawable a(int var1) {
      return super.getDrawable(var1);
   }

   public Drawable getDrawable(int var1) {
      Context var2 = (Context)this.a.get();
      Drawable var3;
      if (var2 != null) {
         var3 = aj.a().a(var2, this, var1);
      } else {
         var3 = super.getDrawable(var1);
      }

      return var3;
   }
}
