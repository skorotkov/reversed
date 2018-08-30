package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ep extends android.support.v4.view.a {
   public static final Creator CREATOR = android.support.v4.f.d.a(new eq());
   Parcelable b;

   ep(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      if (var2 == null) {
         var2 = ec.class.getClassLoader();
      }

      this.b = var1.readParcelable(var2);
   }

   ep(Parcelable var1) {
      super(var1);
   }

   void a(ep var1) {
      this.b = var1.b;
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeParcelable(this.b, 0);
   }
}
