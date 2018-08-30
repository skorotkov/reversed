package android.support.v4.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class v implements Parcelable {
   public static final Creator CREATOR = new w();
   final Bundle a;

   v(Parcel var1, ClassLoader var2) {
      this.a = var1.readBundle();
      if (var2 != null && this.a != null) {
         this.a.setClassLoader(var2);
      }

   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeBundle(this.a);
   }
}
