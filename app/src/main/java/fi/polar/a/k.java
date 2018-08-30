package fi.polar.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import java.util.UUID;

public class k {
   private static final String a = k.class.getSimpleName();
   private BluetoothGatt b;

   public BluetoothGattService a(UUID var1) {
      BluetoothGattService var2;
      if (this.b != null) {
         var2 = this.b.getService(var1);
      } else {
         var2 = null;
      }

      return var2;
   }

   public void a(BluetoothDevice var1, Context var2, boolean var3, BluetoothGattCallback var4) {
      this.b = var1.connectGatt(var2, var3, var4);
   }

   @TargetApi(23)
   public void a(BluetoothDevice var1, Context var2, boolean var3, BluetoothGattCallback var4, int var5) {
      this.b = var1.connectGatt(var2, var3, var4, var5);
   }

   public void a(BluetoothGatt var1) {
      this.b = var1;
   }

   public boolean a() {
      boolean var1;
      if (this.b != null) {
         var1 = this.b.connect();
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean a(BluetoothGattCharacteristic var1) {
      boolean var2;
      if (this.b != null) {
         var2 = this.b.readCharacteristic(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean a(BluetoothGattCharacteristic var1, boolean var2) {
      if (this.b != null) {
         var2 = this.b.setCharacteristicNotification(var1, var2);
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean a(BluetoothGattDescriptor var1) {
      boolean var2;
      if (this.b != null) {
         var2 = this.b.writeDescriptor(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   public void b() {
      if (this.b != null) {
         this.b.disconnect();
      }

   }

   public boolean b(BluetoothGattCharacteristic var1) {
      boolean var2;
      if (this.b != null) {
         var2 = this.b.writeCharacteristic(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   public void c() {
      if (this.b != null) {
         this.b.close();
         this.b = null;
      }

   }

   public boolean d() {
      boolean var1;
      if (this.b != null) {
         var1 = this.b.discoverServices();
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean e() {
      // $FF: Couldn't be decompiled
   }
}
