package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ap {
   private final ImageView a;

   public ap(ImageView var1) {
      this.a = var1;
   }

   public void a(int var1) {
      if (var1 != 0) {
         Drawable var2 = android.support.v7.b.a.b.b(this.a.getContext(), var1);
         if (var2 != null) {
            bu.a(var2);
         }

         this.a.setImageDrawable(var2);
      } else {
         this.a.setImageDrawable((Drawable)null);
      }

   }

   public void a(AttributeSet param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   boolean a() {
      Drawable var1 = this.a.getBackground();
      boolean var2;
      if (VERSION.SDK_INT >= 21 && var1 instanceof RippleDrawable) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }
}
