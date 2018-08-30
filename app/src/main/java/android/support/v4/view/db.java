package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.ViewConfiguration;

@TargetApi(14)
class db {
   static boolean a(ViewConfiguration var0) {
      return var0.hasPermanentMenuKey();
   }
}
