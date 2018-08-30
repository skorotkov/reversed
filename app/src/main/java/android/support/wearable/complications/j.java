package android.support.wearable.complications;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class j implements Creator {
   public ComplicationText a(Parcel var1) {
      return new ComplicationText(var1, (j)null);
   }

   public ComplicationText[] a(int var1) {
      return new ComplicationText[var1];
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
