package fi.polar.polarflow.ui.exeview;

import android.content.Intent;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;

public abstract class i extends fi.polar.polarflow.ui.a.f implements h {
   private boolean a;

   protected static Intent e(Collection var0, String var1) {
      Iterator var2 = var0.iterator();

      Intent var3;
      do {
         if (!var2.hasNext()) {
            var3 = null;
            break;
         }

         var3 = (Intent)var2.next();
      } while(!var1.equals(var3.getAction()));

      return var3;
   }

   public void a_(Bundle var1) {
      this.a = true;
   }

   public void d_() {
      this.a = false;
   }

   public boolean h() {
      return this.a;
   }
}
