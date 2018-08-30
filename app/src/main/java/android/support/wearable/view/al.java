package android.support.wearable.view;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class al implements Creator {
   public GridViewPager$SavedState a(Parcel var1) {
      return new GridViewPager$SavedState(var1, (ae)null);
   }

   public GridViewPager$SavedState[] a(int var1) {
      return new GridViewPager$SavedState[var1];
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
