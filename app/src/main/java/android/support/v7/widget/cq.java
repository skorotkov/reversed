package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class cq implements Parcelable {
   public static final Creator CREATOR = new cr();
   int a;
   int b;
   boolean c;

   public cq() {
   }

   cq(Parcel var1) {
      boolean var2 = true;
      super();
      this.a = var1.readInt();
      this.b = var1.readInt();
      if (var1.readInt() != 1) {
         var2 = false;
      }

      this.c = var2;
   }

   public cq(cq var1) {
      this.a = var1.a;
      this.b = var1.b;
      this.c = var1.c;
   }

   boolean a() {
      boolean var1;
      if (this.a >= 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   void b() {
      this.a = -1;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
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
