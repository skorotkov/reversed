package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class fx implements Parcelable {
   public static final Creator CREATOR = new fy();
   int a;
   int b;
   int c;
   int[] d;
   int e;
   int[] f;
   List g;
   boolean h;
   boolean i;
   boolean j;

   public fx() {
   }

   fx(Parcel var1) {
      boolean var2 = true;
      super();
      this.a = var1.readInt();
      this.b = var1.readInt();
      this.c = var1.readInt();
      if (this.c > 0) {
         this.d = new int[this.c];
         var1.readIntArray(this.d);
      }

      this.e = var1.readInt();
      if (this.e > 0) {
         this.f = new int[this.e];
         var1.readIntArray(this.f);
      }

      boolean var3;
      if (var1.readInt() == 1) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.h = var3;
      if (var1.readInt() == 1) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.i = var3;
      if (var1.readInt() == 1) {
         var3 = var2;
      } else {
         var3 = false;
      }

      this.j = var3;
      this.g = var1.readArrayList(fv.class.getClassLoader());
   }

   public fx(fx var1) {
      this.c = var1.c;
      this.a = var1.a;
      this.b = var1.b;
      this.d = var1.d;
      this.e = var1.e;
      this.f = var1.f;
      this.h = var1.h;
      this.i = var1.i;
      this.j = var1.j;
      this.g = var1.g;
   }

   void a() {
      this.d = null;
      this.c = 0;
      this.e = 0;
      this.f = null;
      this.g = null;
   }

   void b() {
      this.d = null;
      this.c = 0;
      this.a = -1;
      this.b = -1;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      byte var3 = 1;
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      if (this.c > 0) {
         var1.writeIntArray(this.d);
      }

      var1.writeInt(this.e);
      if (this.e > 0) {
         var1.writeIntArray(this.f);
      }

      byte var4;
      if (this.h) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      if (this.i) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      if (this.j) {
         var4 = var3;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      var1.writeList(this.g);
   }
}
