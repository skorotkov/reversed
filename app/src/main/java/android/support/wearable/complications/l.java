package android.support.wearable.complications;

import java.util.TimeZone;

public final class l {
   private String a;
   private int b = 1;
   private CharSequence c;
   private TimeZone d;

   public ComplicationText a() {
      if (this.a == null) {
         throw new IllegalStateException("Format must be specified.");
      } else {
         return new ComplicationText(this.c, new t(this.a, this.b, this.d), (j)null);
      }
   }

   public l a(int var1) {
      this.b = var1;
      return this;
   }

   public l a(String var1) {
      this.a = var1;
      return this;
   }
}
