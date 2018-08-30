package fi.polar.polarflow.data;

import android.text.TextUtils;
import fi.polar.polarflow.util.q;
import fi.polar.remote.representation.protobuf.ExerciseSensors$PbExerciseSensor;
import fi.polar.remote.representation.protobuf.ExerciseSensors$PbExerciseSensor$Builder;
import fi.polar.remote.representation.protobuf.Structures$PbBleDeviceName;
import fi.polar.remote.representation.protobuf.Structures$PbDeviceId;
import java.util.Locale;

public class ExerciseSensor {
   private String mDeviceName;
   private String mMac;
   private int mMacType = Integer.MAX_VALUE;
   private String mPolarDeviceId;

   public ExerciseSensor(String var1, int var2, String var3, String var4) {
      if (var1 != null) {
         var1 = var1.toUpperCase(Locale.US);
      } else {
         var1 = null;
      }

      this.mMac = var1;
      this.mMacType = var2;
      this.mPolarDeviceId = var4;
      this.mDeviceName = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      boolean var3 = false;
      boolean var4;
      if (this == var1) {
         var4 = true;
      } else {
         var4 = var3;
         if (var1 != null) {
            var4 = var3;
            if (this.getClass() == var1.getClass()) {
               ExerciseSensor var5 = (ExerciseSensor)var1;
               var4 = var3;
               if (this.mMacType == var5.mMacType) {
                  if (this.mMac != null) {
                     var4 = var3;
                     if (!this.mMac.equals(var5.mMac)) {
                        return var4;
                     }
                  } else if (var5.mMac != null) {
                     var4 = var3;
                     return var4;
                  }

                  if (this.mPolarDeviceId != null) {
                     var4 = this.mPolarDeviceId.equals(var5.mPolarDeviceId);
                  } else {
                     var4 = var2;
                     if (var5.mPolarDeviceId != null) {
                        var4 = false;
                     }
                  }
               }
            }
         }
      }

      return var4;
   }

   public int hashCode() {
      int var1 = 0;
      int var2 = this.mMacType;
      int var3;
      if (this.mMac == null) {
         var3 = 0;
      } else {
         var3 = this.mMac.hashCode();
      }

      if (this.mPolarDeviceId != null) {
         var1 = this.mPolarDeviceId.hashCode();
      }

      return (var3 + (var2 + 217) * 31) * 31 + var1;
   }

   public ExerciseSensors$PbExerciseSensor toPbObject() {
      ExerciseSensors$PbExerciseSensor$Builder var1 = ExerciseSensors$PbExerciseSensor.newBuilder();
      if (!TextUtils.isEmpty(this.mMac)) {
         var1.setMac(q.a(this.mMac, this.mMacType));
      }

      if (!TextUtils.isEmpty(this.mDeviceName)) {
         var1.setDeviceName(Structures$PbBleDeviceName.newBuilder().setName(this.mDeviceName));
      }

      if (!TextUtils.isEmpty(this.mPolarDeviceId)) {
         var1.setDeviceId(Structures$PbDeviceId.newBuilder().setDeviceId(this.mPolarDeviceId));
      }

      return var1.build();
   }
}
