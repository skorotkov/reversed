package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class fn extends android.support.v4.view.a {
   public static final Creator CREATOR = android.support.v4.f.d.a(new fo());
   boolean b;

   public fn(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      this.b = (Boolean)var1.readValue((ClassLoader)null);
   }

   fn(Parcelable var1) {
      super(var1);
   }

   public String toString() {
      return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.b + "}";
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeValue(this.b);
   }
}
