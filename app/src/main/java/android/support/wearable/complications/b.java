package android.support.wearable.complications;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;

public final class b {
   private final int a;
   private final Bundle b;

   public b(int var1) {
      this.a = var1;
      this.b = new Bundle();
      if (var1 == 7 || var1 == 4) {
         this.a(1);
      }

   }

   // $FF: synthetic method
   static int a(b var0) {
      return var0.a;
   }

   private void a(String var1, float var2) {
      ComplicationData.a(var1, this.a);
      this.b.putFloat(var1, var2);
   }

   private void a(String var1, int var2) {
      ComplicationData.a(var1, this.a);
      this.b.putInt(var1, var2);
   }

   private void a(String var1, Object var2) {
      ComplicationData.a(var1, this.a);
      if (var2 == null) {
         this.b.remove(var1);
      } else if (var2 instanceof String) {
         this.b.putString(var1, (String)var2);
      } else {
         if (!(var2 instanceof Parcelable)) {
            var1 = String.valueOf(var2.getClass());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(var1).length() + 24)).append("Unexpected object type: ").append(var1).toString());
         }

         this.b.putParcelable(var1, (Parcelable)var2);
      }

   }

   // $FF: synthetic method
   static Bundle b(b var0) {
      return var0.b;
   }

   public ComplicationData a() {
      String[] var1 = ComplicationData.b()[this.a];
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         String var4 = var1[var3];
         if (!this.b.containsKey(var4)) {
            var3 = this.a;
            throw new IllegalStateException((new StringBuilder(String.valueOf(var4).length() + 39)).append("Field ").append(var4).append(" is required for type ").append(var3).toString());
         }

         if (this.b.containsKey("ICON_BURN_IN_PROTECTION") && !this.b.containsKey("ICON")) {
            throw new IllegalStateException("Field ICON must be provided when field ICON_BURN_IN_PROTECTION is provided.");
         }
      }

      return new ComplicationData(this, (a)null);
   }

   public b a(float var1) {
      this.a("VALUE", var1);
      return this;
   }

   public b a(int var1) {
      this.a("IMAGE_STYLE", var1);
      return this;
   }

   public b a(PendingIntent var1) {
      this.a("TAP_ACTION", var1);
      return this;
   }

   public b a(Icon var1) {
      this.a("ICON", var1);
      return this;
   }

   public b a(ComplicationText var1) {
      this.a("LONG_TEXT", var1);
      return this;
   }

   public b b(float var1) {
      this.a("MIN_VALUE", var1);
      return this;
   }

   public b b(ComplicationText var1) {
      this.a("SHORT_TEXT", var1);
      return this;
   }

   public b c(float var1) {
      this.a("MAX_VALUE", var1);
      return this;
   }
}
