package fi.polar.polarflow.service.activity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.Iterator;

public class at {
   private final Context a;
   private SensorManager b;

   public at(Context var1) {
      this.a = var1;
   }

   private SensorManager a() {
      if (this.b == null) {
         this.b = (SensorManager)this.a.getSystemService("sensor");
      }

      return this.b;
   }

   public au a(int var1, String var2) {
      Iterator var3 = this.a().getSensorList(var1).iterator();

      au var5;
      while(true) {
         if (var3.hasNext()) {
            Sensor var4 = (Sensor)var3.next();
            if (!var2.equals(var4.getStringType())) {
               continue;
            }

            var5 = new au(var4);
            break;
         }

         var5 = null;
         break;
      }

      return var5;
   }

   public void a(SensorEventListener var1, au var2) {
      this.a().unregisterListener(var1, var2.a());
   }

   public boolean a(SensorEventListener var1) {
      return this.a().flush(var1);
   }

   public boolean a(SensorEventListener var1, au var2, int var3, int var4) {
      return this.a().registerListener(var1, var2.a(), var3, var4);
   }
}
