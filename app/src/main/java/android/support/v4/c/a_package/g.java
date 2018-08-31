package android.support.v4.c.a_package;

import android.annotation.TargetApi;
import android.content.res.Resources;

@TargetApi(13)
class g {
   static int a(Resources var0) {
      return var0.getConfiguration().screenHeightDp;
   }

   static int b(Resources var0) {
      return var0.getConfiguration().screenWidthDp;
   }

   static int c(Resources var0) {
      return var0.getConfiguration().smallestScreenWidthDp;
   }
}
