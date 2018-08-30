package android.support.v4.f;

import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

@TargetApi(13)
class g implements ClassLoaderCreator {
   private final f a;

   public g(f var1) {
      this.a = var1;
   }

   public Object createFromParcel(Parcel var1) {
      return this.a.a(var1, (ClassLoader)null);
   }

   public Object createFromParcel(Parcel var1, ClassLoader var2) {
      return this.a.a(var1, var2);
   }

   public Object[] newArray(int var1) {
      return this.a.a(var1);
   }
}
