package android.support.v4.f;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class e implements Creator {
   final f a;

   public e(f var1) {
      this.a = var1;
   }

   public Object createFromParcel(Parcel var1) {
      return this.a.a(var1, (ClassLoader)null);
   }

   public Object[] newArray(int var1) {
      return this.a.a(var1);
   }
}
