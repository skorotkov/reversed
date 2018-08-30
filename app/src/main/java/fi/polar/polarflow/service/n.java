package fi.polar.polarflow.service;

import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.ExerciseSensors;
import fi.polar.polarflow.data.TrainingDataRefs;
import fi.polar.polarflow.service.datalayer.at;

class n implements Runnable {
   private static final String a = n.class.getSimpleName();
   private final Context b;
   private o c;
   private final at d;

   n(Context var1, TrainingDataRefs var2, at var3) {
      this.b = var1.getApplicationContext();
      this.c = new o(var2);
      this.d = var3;
   }

   // $FF: synthetic method
   static String a() {
      return a;
   }

   void a(ExerciseSensors var1) {
      this.c.a(var1);
   }

   void a(o var1) {
      this.c = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c(a, "run");
      this.c.b();
      this.c.a(this.b, this.d);
      Intent var1 = new Intent("TrainingService.action.TRAINING_SAVED_AND_PUBLISHED");
      var1.putExtra("TrainingService.key.TIMESTAMP", this.c.a());
      android.support.v4.c.g.a(this.b).a(var1);
   }
}
