package android.support.v4.d.a_package;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

@TargetApi(11)
class q extends n {
   q(Drawable var1) {
      super(var1);
   }

   q(o var1, Resources var2) {
      super(var1, var2);
   }

   o b() {
      return new r(this.b, (Resources)null);
   }

   public void jumpToCurrentState() {
      this.c.jumpToCurrentState();
   }
}
