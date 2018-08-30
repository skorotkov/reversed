package fi.polar.polarflow.ui.exeview;

import android.annotation.SuppressLint;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ParcelCreator"})
public class c extends IntentFilter {
   private final List a = new ArrayList();

   protected c() {
   }

   // $FF: synthetic method
   static boolean a(c var0, String var1) {
      return var0.a(var1);
   }

   private boolean a(String var1) {
      return this.a.contains(var1);
   }

   public final void a(String var1, boolean var2) {
      if (!var2) {
         this.a.add(var1);
      }

      super.addAction(var1);
   }
}
