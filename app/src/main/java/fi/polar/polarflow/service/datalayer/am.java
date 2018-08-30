package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.DailyActivityGoal;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.Preferences;
import fi.polar.polarflow.data.orm.UserDeviceSettings;
import fi.polar.polarflow.data.orm.UserId;
import fi.polar.polarflow.service.bluetooth.BluetoothSyncReceiver;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class am implements aq {
   private static final String a = am.class.getSimpleName();
   private static boolean d = false;
   private u b = new u();
   private fi.polar.polarflow.ftu.b c = new fi.polar.polarflow.ftu.b();

   private void a(Context var1) {
      fi.polar.polarflow.util.d.c(a, "initializeMessageReceiver signalHost()");
      if (fi.polar.polarflow.util.y.f(var1)) {
         ar var2 = new ar("/MESSAGE/DEVICE_CHANGED_NOTIFICATION", (byte[])null);
         this.b.b(var1).execute(new ar[]{var2});
      } else {
         Intent var3 = new Intent();
         var3.setAction("fi.polar.polarflow.action.TRIGGER_SYNC");
         var3.setClass(var1, BluetoothSyncReceiver.class);
         var1.sendBroadcast(var3);
      }

   }

   // $FF: synthetic method
   static void a(am var0, Context var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static boolean a(boolean var0) {
      d = var0;
      return var0;
   }

   // $FF: synthetic method
   static String b() {
      return a;
   }

   private static PhysData c() {
      List var0 = PhysData.listAll(PhysData.class);
      PhysData var1;
      if (var0.isEmpty()) {
         var1 = new PhysData();
         var1.setGender(1);
         var1.setGenderLastModified(new Date(1L), true);
         var1.setBirthday(fi.polar.polarflow.util.k.a);
         var1.setBirthdayLastModified(new Date(1L), true);
         var1.setLastModified(new Date(1L), true);
         var1.save();
      } else {
         var1 = (PhysData)var0.get(0);
      }

      return var1;
   }

   private static UserDeviceSettings d() {
      List var0 = UserDeviceSettings.listAll(UserDeviceSettings.class);
      UserDeviceSettings var1;
      if (var0.isEmpty()) {
         var1 = new UserDeviceSettings();
         var1.setDeviceLocation(2);
         var1.setLastModified(new Date(1L), true);
         var1.save();
      } else {
         var1 = (UserDeviceSettings)var0.get(0);
      }

      return var1;
   }

   private static DailyActivityGoal e() {
      // $FF: Couldn't be decompiled
   }

   private static Preferences f() {
      List var0 = Preferences.listAll(Preferences.class);
      Preferences var1;
      if (var0.isEmpty()) {
         var1 = new Preferences();
         var1.setLastModified(new Date(1L), true);
         var1.save();
      } else {
         var1 = (Preferences)var0.get(0);
      }

      return var1;
   }

   private static UserId g() {
      UserId var0 = UserId.getUserId();
      UserId var1 = var0;
      if (var0 == null) {
         var1 = new UserId();
         var1.setLastModified(new Date(1L), false);
         var1.save();
      }

      return var1;
   }

   public String a() {
      return "/MESSAGE/INITIALIZE";
   }

   public void a(Context var1, String var2, byte[] var3, String var4) {
      fi.polar.polarflow.util.d.c(a, "onReceive: " + var2);
      if (!fi.polar.polarflow.util.u.a().d() && !d) {
         d = true;
         ArrayList var5 = new ArrayList();
         var5.add(g().createDataLayerRequest());
         var5.add(c().createDataLayerRequest());
         var5.add(d().createDataLayerRequest());
         var5.add(e().createDataLayerRequest());
         var5.add(f().createDataLayerRequest());
         var5.addAll(this.c.a(var1));
         var5.add(fi.polar.polarflow.util.w.a().createDataLayerRequest());
         var5.add(fi.polar.polarflow.util.c.f().createDataLayerRequest());
         Context var6 = var1.getApplicationContext();
         this.b.a(var1, new an(this, var6)).execute(var5.toArray(new s[var5.size()]));
      } else {
         fi.polar.polarflow.util.d.e(a, "Already initialized or initializing");
      }

   }
}
