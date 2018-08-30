package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class v extends BaseSavedState {
   public static final Creator CREATOR = new w();
   public int a;

   v(Parcel var1) {
      super(var1);
      this.a = var1.readInt();
   }

   v(Parcelable var1) {
      super(var1);
   }

   public String toString() {
      return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.a);
   }
}
