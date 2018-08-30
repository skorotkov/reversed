package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

class fv implements Parcelable {
   public static final Creator CREATOR = new fw();
   int a;
   int b;
   int[] c;
   boolean d;

   public fv() {
   }

   public fv(Parcel var1) {
      boolean var2 = true;
      super();
      this.a = var1.readInt();
      this.b = var1.readInt();
      if (var1.readInt() != 1) {
         var2 = false;
      }

      this.d = var2;
      int var3 = var1.readInt();
      if (var3 > 0) {
         this.c = new int[var3];
         var1.readIntArray(this.c);
      }

   }

   int a(int var1) {
      if (this.c == null) {
         var1 = 0;
      } else {
         var1 = this.c[var1];
      }

      return var1;
   }

   public int describeContents() {
      return 0;
   }

   public String toString() {
      return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      byte var3;
      if (this.d) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      var1.writeInt(var3);
      if (this.c != null && this.c.length > 0) {
         var1.writeInt(this.c.length);
         var1.writeIntArray(this.c);
      } else {
         var1.writeInt(0);
      }

   }
}
