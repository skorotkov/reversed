package android.support.wearable.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import com.google.android.wearable.input.RotaryEncoderHelper;

@TargetApi(23)
public class a {
   public static float a(Context var0) {
      float var1;
      if (a()) {
         var1 = RotaryEncoderHelper.getScaledScrollFactor(var0);
      } else {
         var1 = 64.0F;
      }

      return var1;
   }

   private static boolean a() {
      boolean var0 = true;
      if (android.support.wearable.b.a.a() < 1) {
         var0 = false;
      }

      return var0;
   }

   public static boolean a(MotionEvent var0) {
      boolean var1;
      if (a() && RotaryEncoderHelper.isFromRotaryEncoder(var0)) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public static float b(MotionEvent var0) {
      float var1;
      if (a()) {
         var1 = RotaryEncoderHelper.getRotaryAxisValue(var0);
      } else {
         var1 = 0.0F;
      }

      return var1;
   }
}
