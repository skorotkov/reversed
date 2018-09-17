package fi.polar.polarflow.service;

import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.ExerciseSensors;
import fi.polar.polarflow.data.TrainingDataRefs;
import fi.polar.polarflow.service.datalayer.at;

class n_TrainingSaveAndPublishRunnable implements Runnable {
   private static final String a_TAG = n_TrainingSaveAndPublishRunnable.class.getSimpleName();
   private final Context b_context;
   private o c;
   private final at d_callback;

   n_TrainingSaveAndPublishRunnable(Context var1, TrainingDataRefs var2, at var3) {
      this.b_context = var1.getApplicationContext();
      this.c = new o(var2);
      this.d_callback = var3;
   }

   // $FF: synthetic method
   static String a_getTAG() {
      return a_TAG;
   }

   void a(ExerciseSensors var1) {
      this.c.a(var1);
   }

   void a(o var1) {
      this.c = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c(a_TAG, "run");
      this.c.b_save();
      this.c.a(this.b_context, this.d_callback);
      Intent var1 = new Intent("TrainingService.action.TRAINING_SAVED_AND_PUBLISHED");
      var1.putExtra("TrainingService.key.TIMESTAMP", this.c.a());
      android.support.v4.c.g.a(this.b_context).a(var1);
   }
}
