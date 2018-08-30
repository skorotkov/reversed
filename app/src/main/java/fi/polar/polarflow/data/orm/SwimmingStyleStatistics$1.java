package fi.polar.polarflow.data.orm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class SwimmingStyleStatistics$1 implements Creator {
   public SwimmingStyleStatistics createFromParcel(Parcel var1) {
      return new SwimmingStyleStatistics(var1);
   }

   public SwimmingStyleStatistics[] newArray(int var1) {
      return new SwimmingStyleStatistics[var1];
   }
}
