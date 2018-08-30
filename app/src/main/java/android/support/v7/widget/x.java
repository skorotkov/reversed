package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class x implements Comparable {
   public final ResolveInfo a;
   public float b;
   // $FF: synthetic field
   final w c;

   public x(w var1, ResolveInfo var2) {
      this.c = var1;
      this.a = var2;
   }

   public int a(x var1) {
      return Float.floatToIntBits(var1.b) - Float.floatToIntBits(this.b);
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((x)var1);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 == null) {
            var2 = false;
         } else if (this.getClass() != var1.getClass()) {
            var2 = false;
         } else {
            x var3 = (x)var1;
            if (Float.floatToIntBits(this.b) != Float.floatToIntBits(var3.b)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public int hashCode() {
      return Float.floatToIntBits(this.b) + 31;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("[");
      var1.append("resolveInfo:").append(this.a.toString());
      var1.append("; weight:").append(new BigDecimal((double)this.b));
      var1.append("]");
      return var1.toString();
   }
}
