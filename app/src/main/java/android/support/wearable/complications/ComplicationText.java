package android.support.wearable.complications;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

@TargetApi(24)
public class ComplicationText implements Parcelable {
   public static final Creator CREATOR = new j();
   private final CharSequence a;
   private final k b;

   private ComplicationText(Parcel var1) {
      Object var2 = null;
      super();
      Bundle var3 = var1.readBundle(this.getClass().getClassLoader());
      this.a = var3.getCharSequence("surrounding_string");
      if (var3.containsKey("difference_style") && var3.containsKey("difference_period_start") && var3.containsKey("difference_period_end")) {
         this.b = new s(var3.getLong("difference_period_start"), var3.getLong("difference_period_end"), var3.getInt("difference_style"), var3.getBoolean("show_now_text", true), a(var3.getString("minimum_unit")));
      } else if (var3.containsKey("format_format_string") && var3.containsKey("format_style")) {
         TimeZone var4 = (TimeZone)var2;
         if (var3.containsKey("format_time_zone")) {
            var4 = TimeZone.getTimeZone(var3.getString("format_time_zone"));
         }

         this.b = new t(var3.getString("format_format_string"), var3.getInt("format_style"), var4);
      } else {
         this.b = null;
      }

      this.a();
   }

   // $FF: synthetic method
   ComplicationText(Parcel var1, j var2) {
      this(var1);
   }

   private ComplicationText(CharSequence var1, k var2) {
      this.a = var1;
      this.b = var2;
      this.a();
   }

   // $FF: synthetic method
   ComplicationText(CharSequence var1, k var2, j var3) {
      this(var1, var2);
   }

   public static ComplicationText a(CharSequence var0) {
      return new ComplicationText(var0, (k)null);
   }

   private static TimeUnit a(String var0) {
      Object var1 = null;
      TimeUnit var3;
      if (var0 == null) {
         var3 = (TimeUnit)var1;
      } else {
         try {
            var3 = TimeUnit.valueOf(var0);
         } catch (IllegalArgumentException var2) {
            var3 = (TimeUnit)var1;
         }
      }

      return var3;
   }

   private void a() {
      if (this.a == null && this.b == null) {
         throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
      }
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      Bundle var3 = new Bundle();
      var3.putCharSequence("surrounding_string", this.a);
      if (this.b instanceof s) {
         s var4 = (s)this.b;
         var3.putLong("difference_period_start", var4.a());
         var3.putLong("difference_period_end", var4.b());
         var3.putInt("difference_style", var4.c());
         var3.putBoolean("show_now_text", var4.d());
         if (var4.e() != null) {
            var3.putString("minimum_unit", var4.e().name());
         }
      } else if (this.b instanceof t) {
         t var5 = (t)this.b;
         var3.putString("format_format_string", var5.a());
         var3.putInt("format_style", var5.b());
         TimeZone var6 = var5.c();
         if (var6 != null) {
            var3.putString("format_time_zone", var6.getID());
         }
      }

      var1.writeBundle(var3);
   }
}
