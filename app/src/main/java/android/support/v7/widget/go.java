package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class go extends android.support.v4.view.a {
   public static final Creator CREATOR = android.support.v4.f.d.a(new gp());
   int b;
   boolean c;

   public go(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      this.b = var1.readInt();
      boolean var3;
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.c = var3;
   }

   public go(Parcelable var1) {
      super(var1);
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.b);
      byte var3;
      if (this.c) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      var1.writeInt(var3);
   }
}
