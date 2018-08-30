package fi.polar.polarflow.data.orm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class SportProfile$1 implements Creator {
   public SportProfile createFromParcel(Parcel var1) {
      return new SportProfile(var1);
   }

   public SportProfile[] newArray(int var1) {
      return new SportProfile[var1];
   }
}
