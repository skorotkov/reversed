package android.support.wearable.complications;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class n extends Binder implements m {
   public static m a(IBinder var0) {
      Object var2;
      if (var0 == null) {
         var2 = null;
      } else {
         IInterface var1 = var0.queryLocalInterface("android.support.wearable.complications.IComplicationManager");
         if (var1 != null && var1 instanceof m) {
            var2 = (m)var1;
         } else {
            var2 = new o(var0);
         }
      }

      return (m)var2;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      boolean var5;
      switch(var1) {
      case 1:
         var2.enforceInterface("android.support.wearable.complications.IComplicationManager");
         var1 = var2.readInt();
         ComplicationData var6;
         if (var2.readInt() != 0) {
            var6 = (ComplicationData)ComplicationData.CREATOR.createFromParcel(var2);
         } else {
            var6 = null;
         }

         this.a(var1, var6);
         var3.writeNoException();
         var5 = true;
         break;
      case 1598968902:
         var3.writeString("android.support.wearable.complications.IComplicationManager");
         var5 = true;
         break;
      default:
         var5 = super.onTransact(var1, var2, var3, var4);
      }

      return var5;
   }
}
