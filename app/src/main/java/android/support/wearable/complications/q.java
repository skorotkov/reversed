package android.support.wearable.complications;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class q extends Binder implements p {
   public q() {
      this.attachInterface(this, "android.support.wearable.complications.IComplicationProvider");
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      boolean var5 = true;
      switch(var1) {
      case 1:
         var2.enforceInterface("android.support.wearable.complications.IComplicationProvider");
         this.a(var2.readInt(), var2.readInt(), var2.readStrongBinder());
         var3.writeNoException();
         break;
      case 2:
         var2.enforceInterface("android.support.wearable.complications.IComplicationProvider");
         this.a(var2.readInt());
         var3.writeNoException();
         break;
      case 3:
         var2.enforceInterface("android.support.wearable.complications.IComplicationProvider");
         this.b(var2.readInt(), var2.readInt(), var2.readStrongBinder());
         var3.writeNoException();
         break;
      case 1598968902:
         var3.writeString("android.support.wearable.complications.IComplicationProvider");
         break;
      default:
         var5 = super.onTransact(var1, var2, var3, var4);
      }

      return var5;
   }
}
