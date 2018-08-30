package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class doClass extends a {
   public static final Creator CREATOR = android.support.v4.f.d.a(new dp());
   int b;
   Parcelable c;
   ClassLoader d;

   doClass(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      ClassLoader var3 = var2;
      if (var2 == null) {
         var3 = this.getClass().getClassLoader();
      }

      this.b = var1.readInt();
      this.c = var1.readParcelable(var3);
      this.d = var3;
   }

   public doClass(Parcelable var1) {
      super(var1);
   }

   public String toString() {
      return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.b + "}";
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.b);
      var1.writeParcelable(this.c, var2);
   }
}
