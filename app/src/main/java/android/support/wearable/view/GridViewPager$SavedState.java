package android.support.wearable.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class GridViewPager$SavedState extends BaseSavedState {
   public static final Creator CREATOR = new al();
   int a;
   int b;

   private GridViewPager$SavedState(Parcel var1) {
      super(var1);
      this.a = var1.readInt();
      this.b = var1.readInt();
   }

   // $FF: synthetic method
   GridViewPager$SavedState(Parcel var1, ae var2) {
      this(var1);
   }

   public GridViewPager$SavedState(Parcelable var1) {
      super(var1);
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
      var1.writeInt(this.b);
   }
}
