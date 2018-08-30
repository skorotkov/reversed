package android.support.v4.d.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

@TargetApi(19)
class s extends q {
   s(Drawable var1) {
      super(var1);
   }

   s(o var1, Resources var2) {
      super(var1, var2);
   }

   o b() {
      return new t(this.b, (Resources)null);
   }

   public boolean isAutoMirrored() {
      return this.c.isAutoMirrored();
   }

   public void setAutoMirrored(boolean var1) {
      this.c.setAutoMirrored(var1);
   }
}
