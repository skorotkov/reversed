package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class w implements Creator {
   public v a(Parcel var1) {
      return new v(var1, (ClassLoader)null);
   }

   public v[] a(int var1) {
      return new v[var1];
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
