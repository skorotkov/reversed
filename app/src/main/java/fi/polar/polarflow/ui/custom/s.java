package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public final class s {
   private static volatile Typeface a;

   public static Typeface a(Context param0) {
      // $FF: Couldn't be decompiled
   }

   public static String a(long var0) {
      char var2;
      char var3;
      if (var0 > 143L) {
         var2 = '\ue30f';
         var3 = var2;
      } else {
         var2 = (char)((int)(58111L + var0));
         var3 = var2;
      }

      return Character.toString(var3);
   }

   public static void a(TextView var0, String var1) {
      var0.setTypeface(a(var0.getContext()));
      var0.setText(var1);
   }
}
