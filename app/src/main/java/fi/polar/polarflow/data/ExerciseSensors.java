package fi.polar.polarflow.data;

import android.content.Context;
import fi.polar.polarflow.service.datalayer.at;
import fi.polar.polarflow.service.datalayer.s;
import fi.polar.polarflow.service.datalayer.t;
import fi.polar.polarflow.util.d;
import fi.polar.remote.representation.protobuf.ExerciseSensors$PbExerciseSensors;
import fi.polar.remote.representation.protobuf.ExerciseSensors$PbExerciseSensors$Builder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExerciseSensors implements ProtoPublishable {
   public static final String FILENAME = "SENSORS.BPB";
   private static final String TAG = ExerciseSensor.class.getSimpleName();
   private final Set mSensors = new LinkedHashSet();

   public void add(ExerciseSensor var1) {
      if (var1 != null) {
         this.mSensors.add(var1);
      }

   }

   public void clear() {
      this.mSensors.clear();
   }

   public s createDataLayerRequest() {
      d.c(TAG, "", new UnsupportedOperationException("createDataLayerRequest() without filepath not supported"));
      return null;
   }

   public s createDataLayerRequest(String var1) {
      return new s(0, var1, this.toByteArray());
   }

   public void publish(Context var1) {
      d.c(TAG, "", new UnsupportedOperationException("publish() without filepath not supported"));
   }

   public void publish(Context var1, OnPublishedListener var2) {
      d.c(TAG, "", new UnsupportedOperationException("publish() without filepath not supported"));
   }

   public void publish(Context var1, String var2) {
      this.publish(var1, var2, (OnPublishedListener)null);
   }

   public void publish(Context var1, String var2, OnPublishedListener var3) {
      t var4 = new t(var1);
      if (var3 != null) {
         var4.a((at)(new ExerciseSensors$1(this, var3)));
      }

      var4.execute(new s[]{new s(0, var2, this.toByteArray())});
   }

   public byte[] toByteArray() {
      return this.toPbObject().toByteArray();
   }

   public ExerciseSensors$PbExerciseSensors toPbObject() {
      ExerciseSensors$PbExerciseSensors$Builder var1 = ExerciseSensors$PbExerciseSensors.newBuilder();
      Iterator var2 = this.mSensors.iterator();

      while(var2.hasNext()) {
         var1.addSensors(((ExerciseSensor)var2.next()).toPbObject());
      }

      return var1.build();
   }
}
