package android.support.wearable.complications;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class a implements Creator {
   public ComplicationData a(Parcel var1) {
      return new ComplicationData(var1, (a)null);
   }

   public ComplicationData[] a(int var1) {
      return new ComplicationData[var1];
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
