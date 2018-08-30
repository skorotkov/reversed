package android.support.v4.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class at implements Parcelable {
   public static final Creator CREATOR = new au();
   final String a;
   final int b;
   final boolean c;
   final int d;
   final int e;
   final String f;
   final boolean g;
   final boolean h;
   final Bundle i;
   final boolean j;
   Bundle k;
   p l;

   public at(Parcel var1) {
      boolean var2 = true;
      super();
      this.a = var1.readString();
      this.b = var1.readInt();
      boolean var3;
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.c = var3;
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readString();
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.g = var3;
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.h = var3;
      this.i = var1.readBundle();
      if (var1.readInt() != 0) {
         var3 = var2;
      } else {
         var3 = false;
      }

      this.j = var3;
      this.k = var1.readBundle();
   }

   public at(p var1) {
      this.a = var1.getClass().getName();
      this.b = var1.n;
      this.c = var1.v;
      this.d = var1.E;
      this.e = var1.F;
      this.f = var1.G;
      this.g = var1.J;
      this.h = var1.I;
      this.i = var1.p;
      this.j = var1.H;
   }

   public p a(ad var1, p var2, aq var3) {
      if (this.l == null) {
         Context var4 = var1.i();
         if (this.i != null) {
            this.i.setClassLoader(var4.getClassLoader());
         }

         this.l = p.instantiate(var4, this.a, this.i);
         if (this.k != null) {
            this.k.setClassLoader(var4.getClassLoader());
            this.l.l = this.k;
         }

         this.l.a(this.b, var2);
         this.l.v = this.c;
         this.l.x = true;
         this.l.E = this.d;
         this.l.F = this.e;
         this.l.G = this.f;
         this.l.J = this.g;
         this.l.I = this.h;
         this.l.H = this.j;
         this.l.z = var1.d;
         if (ah.a) {
            Log.v("FragmentManager", "Instantiated fragment " + this.l);
         }
      }

      this.l.C = var3;
      return this.l;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      byte var3 = 1;
      var1.writeString(this.a);
      var1.writeInt(this.b);
      byte var4;
      if (this.c) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeString(this.f);
      if (this.g) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      if (this.h) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      var1.writeBundle(this.i);
      if (this.j) {
         var4 = var3;
      } else {
         var4 = 0;
      }

      var1.writeInt(var4);
      var1.writeBundle(this.k);
   }
}
