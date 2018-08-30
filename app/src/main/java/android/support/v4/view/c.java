package android.support.v4.view;

import android.os.Parcel;

final class c implements android.support.v4.f.f {
   // $FF: synthetic method
   public Object a(Parcel var1, ClassLoader var2) {
      return this.b(var1, var2);
   }

   // $FF: synthetic method
   public Object[] a(int var1) {
      return this.b(var1);
   }

   public a b(Parcel var1, ClassLoader var2) {
      if (var1.readParcelable(var2) != null) {
         throw new IllegalStateException("superState must be null");
      } else {
         return a.a;
      }
   }

   public a[] b(int var1) {
      return new a[var1];
   }
}
