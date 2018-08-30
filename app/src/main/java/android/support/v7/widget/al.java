package android.support.v7.widget;

import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff.Mode;

class al extends android.support.v4.g.i {
   public al(int var1) {
      super(var1);
   }

   private static int b(int var0, Mode var1) {
      return (var0 + 31) * 31 + var1.hashCode();
   }

   PorterDuffColorFilter a(int var1, Mode var2) {
      return (PorterDuffColorFilter)this.get(b(var1, var2));
   }

   PorterDuffColorFilter a(int var1, Mode var2, PorterDuffColorFilter var3) {
      return (PorterDuffColorFilter)this.put(b(var1, var2), var3);
   }
}
