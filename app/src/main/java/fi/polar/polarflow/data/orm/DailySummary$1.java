package fi.polar.polarflow.data.orm;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import fi.polar.polarflow.util.d;
import java.io.IOException;

final class DailySummary$1 implements Creator {
   public DailySummary createFromParcel(Parcel var1) {
      DailySummary var2;
      DailySummary var4;
      try {
         var2 = new DailySummary(var1);
      } catch (IOException var3) {
         d.c(DailySummary.access$000(), "", var3);
         var4 = null;
         return var4;
      }

      var4 = var2;
      return var4;
   }

   public DailySummary[] newArray(int var1) {
      return new DailySummary[var1];
   }
}
