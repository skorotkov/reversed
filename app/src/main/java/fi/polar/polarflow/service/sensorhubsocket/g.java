package fi.polar.polarflow.service.sensorhubsocket;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class g implements Parcelable {
   public static final Creator CREATOR = new h();
   public final c a;
   public final b b;
   public final int c;
   public final int d;
   public final int e;
   public final int f;
   public final int g;
   public final int h;
   public final int i;

   protected g(Parcel var1) {
      this.a = fi.polar.polarflow.service.sensorhubsocket.c.a(var1.readInt());
      this.b = fi.polar.polarflow.service.sensorhubsocket.b.a(var1.readInt());
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readInt();
      this.g = var1.readInt();
      this.h = var1.readInt();
      this.i = var1.readInt();
   }

   public g(c var1, b var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      this.h = var8;
      this.i = var9;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a.a());
      var1.writeInt(this.b.a());
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeInt(this.f);
      var1.writeInt(this.g);
      var1.writeInt(this.h);
      var1.writeInt(this.i);
   }
}
