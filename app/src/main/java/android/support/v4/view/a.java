package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public abstract class a implements Parcelable {
   public static final Creator CREATOR = android.support.v4.f.d.a(new c());
   public static final a a = new b();
   private final Parcelable b;

   private a() {
      this.b = null;
   }

   protected a(Parcel var1, ClassLoader var2) {
      Object var3 = var1.readParcelable(var2);
      if (var3 == null) {
         var3 = a;
      }

      this.b = (Parcelable)var3;
   }

   protected a(Parcelable var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("superState must not be null");
      } else {
         if (var1 == a) {
            var1 = null;
         }

         this.b = var1;
      }
   }

   // $FF: synthetic method
   a(b var1) {
      this();
   }

   public final Parcelable a() {
      return this.b;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.b, var2);
   }
}
