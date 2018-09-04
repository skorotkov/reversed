package fi.polar.polarflow.util.b_package;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b implements Creator {
   public a a(Parcel var1) {
      return new a(var1);
   }

   public a[] a(int var1) {
      return new a[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.a(var1);
   }
}
