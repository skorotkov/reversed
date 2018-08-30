package fi.polar.polarflow.service.activity;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

class aa implements fi.polar.polarflow.service.datalayer.at {
   // $FF: synthetic field
   final boolean a;
   // $FF: synthetic field
   final Context b;
   // $FF: synthetic field
   final z c;

   aa(z var1, boolean var2, Context var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void onFinished(List var1) {
      Iterator var5 = var1.iterator();
      boolean var2 = true;

      int var3;
      int var8;
      for(var3 = 0; var5.hasNext(); var3 = var8) {
         boolean var4;
         int var6;
         boolean var7;
         if (((Status)var5.next()).isSuccess()) {
            var4 = var2;
            var6 = var3 + 1;
            var7 = var4;
         } else if (var2) {
            var4 = false;
            var6 = var3;
            var7 = var4;
         } else {
            var8 = var3;
            var7 = var2;
            var6 = var8;
         }

         var8 = var6;
         var2 = var7;
      }

      var5 = z.a(this.c).iterator();

      while(var5.hasNext()) {
         ((ab)var5.next()).a(var3);
      }

      if (this.a && var2) {
         fi.polar.polarflow.util.y.a(this.b);
      }

   }
}
