package android.support.wearable.complications;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@TargetApi(24)
public class ComplicationData implements Parcelable {
   public static final Creator CREATOR;
   private static final String[][] a;
   private static final String[][] b;
   private final int c;
   private final Bundle d;

   static {
      String[] var0 = new String[0];
      String[] var1 = new String[]{"SMALL_IMAGE", "IMAGE_STYLE"};
      a = new String[][]{null, var0, new String[0], {"SHORT_TEXT"}, {"LONG_TEXT"}, {"VALUE", "MIN_VALUE", "MAX_VALUE"}, {"ICON"}, var1, {"LARGE_IMAGE"}, new String[0], new String[0]};
      b = new String[][]{null, new String[0], new String[0], {"SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION"}, {"LONG_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "SMALL_IMAGE", "IMAGE_STYLE", "TAP_ACTION"}, {"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION"}, {"TAP_ACTION", "ICON_BURN_IN_PROTECTION"}, {"TAP_ACTION"}, {"TAP_ACTION"}, {"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION"}, new String[0]};
      CREATOR = new a();
   }

   private ComplicationData(Parcel var1) {
      this.c = var1.readInt();
      this.d = var1.readBundle(this.getClass().getClassLoader());
   }

   // $FF: synthetic method
   ComplicationData(Parcel var1, a var2) {
      this(var1);
   }

   private ComplicationData(b var1) {
      this.c = android.support.wearable.complications.b.a(var1);
      this.d = android.support.wearable.complications.b.b(var1);
   }

   // $FF: synthetic method
   ComplicationData(b var1, a var2) {
      this(var1);
   }

   // $FF: synthetic method
   static void a(String var0, int var1) {
      c(var0, var1);
   }

   private static boolean a(int var0) {
      boolean var1 = true;
      if (1 > var0 || var0 > a.length) {
         var1 = false;
      }

      return var1;
   }

   private static boolean b(String var0, int var1) {
      boolean var2 = true;
      String[] var3 = a[var1];
      int var4 = var3.length;
      int var5 = 0;

      boolean var6;
      while(true) {
         if (var5 >= var4) {
            var3 = b[var1];
            var5 = var3.length;

            for(var1 = 0; var1 < var5; ++var1) {
               var6 = var2;
               if (var3[var1].equals(var0)) {
                  return var6;
               }
            }

            var6 = false;
            break;
         }

         if (var3[var5].equals(var0)) {
            var6 = var2;
            break;
         }

         ++var5;
      }

      return var6;
   }

   // $FF: synthetic method
   static String[][] b() {
      return a;
   }

   private static void c(String var0, int var1) {
      if (!a(var1)) {
         throw new IllegalStateException((new StringBuilder(38)).append("Type ").append(var1).append(" can not be recognized").toString());
      } else if (!b(var0, var1)) {
         throw new IllegalStateException((new StringBuilder(String.valueOf(var0).length() + 44)).append("Field ").append(var0).append(" is not supported for type ").append(var1).toString());
      }
   }

   public int a() {
      return this.c;
   }

   public int describeContents() {
      return 0;
   }

   public String toString() {
      int var1 = this.c;
      String var2 = String.valueOf(this.d);
      return (new StringBuilder(String.valueOf(var2).length() + 45)).append("ComplicationData{mType=").append(var1).append(", mFields=").append(var2).append("}").toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.c);
      var1.writeBundle(this.d);
   }
}
