package fi.polar.polarflow.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class u {
   private static final String a = u.class.getSimpleName();
   private static u c = null;
   private SharedPreferences b = null;

   private u(Context var1) {
      this.b = var1.getSharedPreferences("PolarFlowPreferences", 0);
   }

   public static u a() {
      if (c == null) {
         d.f(a, "SharedPreferences are not initialized, use get(context) instead");
      }

      return c;
   }

   public static u a(Context var0) {
      if (c == null) {
         c = new u(var0);
      }

      return c;
   }

   public void a(int var1) {
      Editor var2 = this.b.edit();
      var2.putInt("CompanionApp.KEY_PLAYSTORE_AVAILABILITY", var1);
      var2.apply();
   }

   public void a(int var1, int var2) {
      Editor var3 = this.b.edit();
      var3.putInt("Swimming.KEY_POOL_LENGTH_VALUE", var1);
      var3.putInt("Swimming.KEY_POOL_LENGTH_UNIT", var2);
      var3.apply();
   }

   public void a(long var1) {
      Editor var3 = this.b.edit();
      var3.putLong("SyncJournaling.KEY_LAST_SYNC_TIMESTAMP", var1);
      var3.apply();
   }

   public void a(String var1) {
      Editor var2 = this.b.edit();
      var2.putString("Ble.KEY_BLE_HOST_ADDRESS", var1);
      var2.apply();
   }

   public void a(boolean var1) {
      Editor var2 = this.b.edit();
      var2.putBoolean("Ftu.KEY_INITIALIZED", var1);
      var2.apply();
   }

   public int b() {
      return this.b.getInt("CompanionApp.KEY_PLAYSTORE_AVAILABILITY", 0);
   }

   public void b(int var1) {
      Editor var2 = this.b.edit();
      var2.putInt("Swimming.KEY_POOL_LENGTH_VALUE", var1);
      var2.apply();
   }

   public void b(long var1) {
      Editor var3 = this.b.edit();
      var3.putLong("SportProfile.KEY_LAST_USED", var1);
      var3.apply();
   }

   public void b(boolean var1) {
      Editor var2 = this.b.edit();
      var2.putBoolean("Ftu.KEY_PROVISIONED", var1);
      var2.apply();
   }

   public String c() {
      return this.b.getString("Ble.KEY_BLE_HOST_ADDRESS", (String)null);
   }

   public void c(boolean var1) {
      Editor var2 = this.b.edit();
      var2.putBoolean("Ftu.KEY_USERID_RECEIVED", var1);
      var2.apply();
   }

   public void d(boolean var1) {
      Editor var2 = this.b.edit();
      var2.putBoolean("PlannedTarget.KEY_TARGET_PEEK_DONE", var1);
      var2.apply();
   }

   public boolean d() {
      return this.b.getBoolean("Ftu.KEY_INITIALIZED", false);
   }

   public boolean e() {
      return this.b.getBoolean("Ftu.KEY_PROVISIONED", false);
   }

   public boolean f() {
      return this.b.getBoolean("Ftu.KEY_USERID_RECEIVED", false);
   }

   public long g() {
      return this.b.getLong("SyncJournaling.KEY_LAST_SYNC_TIMESTAMP", -1L);
   }

   public boolean h() {
      return this.b.getBoolean("PlannedTarget.KEY_TARGET_PEEK_DONE", false);
   }

   public long i() {
      return this.b.getLong("SportProfile.KEY_LAST_USED", -1L);
   }

   public int j() {
      return this.b.getInt("Swimming.KEY_POOL_LENGTH_VALUE", 25);
   }

   public int k() {
      return this.b.getInt("Swimming.KEY_POOL_LENGTH_UNIT", 0);
   }
}
