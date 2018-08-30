package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

public class t extends c {
   private static final String a = t.class.getSimpleName();
   private o b;

   public t(Context var1) {
      this(var1, (at)null);
   }

   public t(Context var1, at var2) {
      super(var2);
      this.b = new o(var1);
   }

   private Status a(s var1) {
      Status var2 = new Status(13);
      Status var3 = var2;
      switch(var1.a()) {
      case 0:
         var3 = this.b.a(var1.b(), var1.c());
      case 1:
         break;
      case 2:
         var3 = this.b.a(var1.b(), var1.d());
         break;
      default:
         var3 = var2;
      }

      if (var3.isSuccess()) {
         fi.polar.polarflow.util.d.c(a, "processDataLayerRequest(): OK: " + var1);
      } else {
         fi.polar.polarflow.util.d.b(a, "processDataLayerRequest(): FAIL: " + var3 + ": " + var1);
      }

      return var3;
   }

   protected List a(s... var1) {
      ArrayList var2 = new ArrayList();
      int var3 = var1.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         s var5 = var1[var4];
         if (this.isCancelled()) {
            break;
         }

         var2.add(this.a(var5));
      }

      return var2;
   }

   // $FF: synthetic method
   protected Object doInBackground(Object[] var1) {
      return this.a((s[])var1);
   }
}
