package fi.polar.polarflow.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class a_BatteryManager {
   private final Context a_context;
   private final Set b_listeners;
   private boolean c_isStarted;
   private boolean d_isBatteryLow;
   private boolean e_isBatterySafeForOperations;
   private final BroadcastReceiver f_batteryChangeBroadcastReceiver = new b_BatteryChangedBroadcastReceiver(this);

   public a_BatteryManager(Context var1) {
      this.a_context = var1;
      this.b_listeners = Collections.synchronizedSet(new HashSet());
   }

   private static boolean a_isBatteryLow(int var0_level, int var1_scale) {
      boolean var2;
      if ((float)var0_level * 100.0F / (float)var1_scale < 5.0F) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   // $FF: synthetic method
   static boolean a_isBatteryLow(Intent var0) {
      return c_isBatteryLow(var0);
   }

   // $FF: synthetic method
   static boolean a_isBatteryLow(a_BatteryManager var0) {
      return var0.d_isBatteryLow;
   }

   // $FF: synthetic method
   static boolean a_setIsBatteryLow(a_BatteryManager var0, boolean var1) {
      var0.d_isBatteryLow = var1;
      return var1;
   }

   // $FF: synthetic method
   static boolean b_isBatterySafeForOperations(Intent var0) {
      return d_isBatterySafeForOperations(var0);
   }

   // $FF: synthetic method
   static boolean b_isBatterySafeForOperations(a_BatteryManager var0) {
      return var0.e_isBatterySafeForOperations;
   }

   // $FF: synthetic method
   static boolean b_setIsBatterySafeForOperations(a_BatteryManager var0, boolean var1) {
      var0.e_isBatterySafeForOperations = var1;
      return var1;
   }

   private static boolean c_isBatteryLow(Intent var0) {
      return a_isBatteryLow(var0.getIntExtra("level", -1), var0.getIntExtra("scale", 100));
   }

   private static boolean d_isBatterySafeForOperations(Intent var0) {
      boolean var1 = false;
      if (var0.getIntExtra("plugged", 0) != 0 /* plugged */|| e_isChargingOrFull(var0)) {
         var1 = true;
      }

      return var1;
   }

   private static boolean e_isChargingOrFull(Intent var0) {
      int var1 = var0.getIntExtra("status", -1);
      boolean var2;
      if (var1 != BatteryManager.BATTERY_STATUS_CHARGING /*2*/ && var1 != BatteryManager.BATTERY_STATUS_FULL /*5*/) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public void a_start() {
      if (!this.c_isStarted) {
         this.c_isStarted = true;
         this.d_isBatteryLow = false;
         this.e_isBatterySafeForOperations = false;
         Intent var1 = this.a_context.registerReceiver(this.f_batteryChangeBroadcastReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
         if (var1 != null) {
            this.d_isBatteryLow = c_isBatteryLow(var1);
            this.e_isBatterySafeForOperations = d_isBatterySafeForOperations(var1);
         }
      }

   }

   public void a_addListener(c_BatteryManagerListener var1) {
      this.b_listeners.add(var1);
   }

   public void b_stop() {
      if (this.c_isStarted) {
         this.c_isStarted = false;
         this.a_context.unregisterReceiver(this.f_batteryChangeBroadcastReceiver);
      }

   }

   public void b_removeListener(c_BatteryManagerListener var1) {
      this.b_listeners.remove(var1);
   }

   public boolean c_isBatteryLow() {
      return this.d_isBatteryLow;
   }

   public boolean d_isBatterySafeForOperations() {
      return this.e_isBatterySafeForOperations;
   }

   protected void e_notifyBatteryLow() {
      // $FF: Couldn't be decompiled
   }

   protected void f_notifyBatterySafeForOperations() {
      // $FF: Couldn't be decompiled
   }

   protected void g_notifyBatteryNotSafeForOperations() {
      // $FF: Couldn't be decompiled
   }
}
