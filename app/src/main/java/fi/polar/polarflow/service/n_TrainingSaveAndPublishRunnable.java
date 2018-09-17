package fi.polar.polarflow.service;

import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.ExerciseSensors;
import fi.polar.polarflow.data.TrainingDataRefs;
import fi.polar.polarflow.service.datalayer.at;

class n_TrainingSaveAndPublishRunnable implements Runnable {
   private static final String a_TAG = n_TrainingSaveAndPublishRunnable.class.getSimpleName();
   private final Context b_context;
   private o_DataSaver c_dataSaver;
   private final at d_publishCallback;

   n_TrainingSaveAndPublishRunnable(Context var1, TrainingDataRefs var2, at var3) {
      this.b_context = var1.getApplicationContext();
      this.c_dataSaver = new o_DataSaver(var2);
      this.d_publishCallback = var3;
   }

   // $FF: synthetic method
   static String a_getTAG() {
      return a_TAG;
   }

   void a_setExerciseSensors(ExerciseSensors var1) {
      this.c_dataSaver.a_setExerciseSensors(var1);
   }

   void a_setDataSaver(o_DataSaver var1) {
      this.c_dataSaver = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c(a_TAG, "run");
      this.c_dataSaver.b_save();
      this.c_dataSaver.a_mayBePublish(this.b_context, this.d_publishCallback);
      Intent var1 = new Intent("TrainingService.action.TRAINING_SAVED_AND_PUBLISHED");
      var1.putExtra("TrainingService.key.TIMESTAMP", this.c_dataSaver.a());
      android.support.v4.c.g.a(this.b_context).a(var1);
   }
}
