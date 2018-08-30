package android.support.v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class z {
   public final ComponentName a;
   public final long b;
   public final float c;

   public z(ComponentName var1, long var2, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
   }

   public z(String var1, long var2, float var4) {
      this(ComponentName.unflattenFromString(var1), var2, var4);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 == null) {
            var2 = false;
         } else if (this.getClass() != var1.getClass()) {
            var2 = false;
         } else {
            z var3 = (z)var1;
            if (this.a == null) {
               if (var3.a != null) {
                  var2 = false;
                  return var2;
               }
            } else if (!this.a.equals(var3.a)) {
               var2 = false;
               return var2;
            }

            if (this.b != var3.b) {
               var2 = false;
            } else if (Float.floatToIntBits(this.c) != Float.floatToIntBits(var3.c)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int hashCode() {
      int var1;
      if (this.a == null) {
         var1 = 0;
      } else {
         var1 = this.a.hashCode();
      }

      return ((var1 + 31) * 31 + (int)(this.b ^ this.b >>> 32)) * 31 + Float.floatToIntBits(this.c);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("[");
      var1.append("; activity:").append(this.a);
      var1.append("; time:").append(this.b);
      var1.append("; weight:").append(new BigDecimal((double)this.c));
      var1.append("]");
      return var1.toString();
   }
}
