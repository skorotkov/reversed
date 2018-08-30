package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k implements Creator {
   public j a(Parcel var1) {
      return new j(var1);
   }

   public j[] a(int var1) {
      return new j[var1];
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
