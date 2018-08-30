package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class j implements Parcelable {
   public static final Creator CREATOR = new k();
   final int[] a;
   final int b;
   final int c;
   final String d;
   final int e;
   final int f;
   final CharSequence g;
   final int h;
   final CharSequence i;
   final ArrayList j;
   final ArrayList k;
   final boolean l;

   public j(Parcel var1) {
      this.a = var1.createIntArray();
      this.b = var1.readInt();
      this.c = var1.readInt();
      this.d = var1.readString();
      this.e = var1.readInt();
      this.f = var1.readInt();
      this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
      this.h = var1.readInt();
      this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var1);
      this.j = var1.createStringArrayList();
      this.k = var1.createStringArrayList();
      boolean var2;
      if (var1.readInt() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.l = var2;
   }

   public j(h var1) {
      int var2 = var1.c.size();
      this.a = new int[var2 * 6];
      if (!var1.j) {
         throw new IllegalStateException("Not on back stack");
      } else {
         int var3 = 0;

         for(int var4 = 0; var3 < var2; ++var3) {
            i var5 = (i)var1.c.get(var3);
            int[] var6 = this.a;
            int var7 = var4 + 1;
            var6[var4] = var5.a;
            var6 = this.a;
            int var8 = var7 + 1;
            if (var5.b != null) {
               var4 = var5.b.n;
            } else {
               var4 = -1;
            }

            var6[var7] = var4;
            var6 = this.a;
            var4 = var8 + 1;
            var6[var8] = var5.c;
            var6 = this.a;
            var7 = var4 + 1;
            var6[var4] = var5.d;
            var6 = this.a;
            var8 = var7 + 1;
            var6[var7] = var5.e;
            var6 = this.a;
            var4 = var8 + 1;
            var6[var8] = var5.f;
         }

         this.b = var1.h;
         this.c = var1.i;
         this.d = var1.l;
         this.e = var1.n;
         this.f = var1.o;
         this.g = var1.p;
         this.h = var1.q;
         this.i = var1.r;
         this.j = var1.s;
         this.k = var1.t;
         this.l = var1.u;
      }
   }

   public h a(ah var1) {
      int var2 = 0;
      h var3 = new h(var1);

      for(int var4 = 0; var2 < this.a.length; ++var2) {
         i var5 = new i();
         int[] var6 = this.a;
         int var7 = var2 + 1;
         var5.a = var6[var2];
         if (ah.a) {
            Log.v("FragmentManager", "Instantiate " + var3 + " op #" + var4 + " base fragment #" + this.a[var7]);
         }

         var6 = this.a;
         var2 = var7 + 1;
         var7 = var6[var7];
         if (var7 >= 0) {
            var5.b = (p)var1.e.get(var7);
         } else {
            var5.b = null;
         }

         var6 = this.a;
         var7 = var2 + 1;
         var5.c = var6[var2];
         var6 = this.a;
         int var8 = var7 + 1;
         var5.d = var6[var7];
         var6 = this.a;
         var2 = var8 + 1;
         var5.e = var6[var8];
         var5.f = this.a[var2];
         var3.d = var5.c;
         var3.e = var5.d;
         var3.f = var5.e;
         var3.g = var5.f;
         var3.a(var5);
         ++var4;
      }

      var3.h = this.b;
      var3.i = this.c;
      var3.l = this.d;
      var3.n = this.e;
      var3.j = true;
      var3.o = this.f;
      var3.p = this.g;
      var3.q = this.h;
      var3.r = this.i;
      var3.s = this.j;
      var3.t = this.k;
      var3.u = this.l;
      var3.a(1);
      return var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      byte var3 = 0;
      var1.writeIntArray(this.a);
      var1.writeInt(this.b);
      var1.writeInt(this.c);
      var1.writeString(this.d);
      var1.writeInt(this.e);
      var1.writeInt(this.f);
      TextUtils.writeToParcel(this.g, var1, 0);
      var1.writeInt(this.h);
      TextUtils.writeToParcel(this.i, var1, 0);
      var1.writeStringList(this.j);
      var1.writeStringList(this.k);
      if (this.l) {
         var3 = 1;
      }

      var1.writeInt(var3);
   }
}
