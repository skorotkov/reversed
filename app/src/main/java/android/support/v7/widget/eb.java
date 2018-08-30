package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

public abstract class eb {
   @Deprecated
   public void a(Canvas var1, dl var2) {
   }

   public void a(Canvas var1, dl var2, ev var3) {
      this.a(var1, var2);
   }

   @Deprecated
   public void a(Rect var1, int var2, dl var3) {
      var1.set(0, 0, 0, 0);
   }

   public void a(Rect var1, View var2, dl var3, ev var4) {
      this.a(var1, ((ef)var2.getLayoutParams()).f(), var3);
   }

   @Deprecated
   public void b(Canvas var1, dl var2) {
   }

   public void b(Canvas var1, dl var2, ev var3) {
      this.b(var1, var2);
   }
}
