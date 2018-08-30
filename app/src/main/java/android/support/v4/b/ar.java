package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class ar implements Parcelable {
   public static final Creator CREATOR = new as();
   at[] a;
   int[] b;
   j[] c;

   public ar() {
   }

   public ar(Parcel var1) {
      this.a = (at[])var1.createTypedArray(at.CREATOR);
      this.b = var1.createIntArray();
      this.c = (j[])var1.createTypedArray(j.CREATOR);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeTypedArray(this.a, var2);
      var1.writeIntArray(this.b);
      var1.writeTypedArray(this.c, var2);
   }
}
