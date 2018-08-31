package android.support.v4.view.a_package;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

class ae implements al {
   // $FF: synthetic field
   final z a;
   // $FF: synthetic field
   final ad b;

   ae(ad var1, z var2) {
      this.b = var1;
      this.a = var2;
   }

   public Object a(int var1) {
      h var2 = this.a.a(var1);
      Object var3;
      if (var2 == null) {
         var3 = null;
      } else {
         var3 = var2.a();
      }

      return var3;
   }

   public List a(String var1, int var2) {
      List var3 = this.a.a(var1, var2);
      ArrayList var5;
      if (var3 == null) {
         var5 = null;
      } else {
         var5 = new ArrayList();
         int var4 = var3.size();

         for(var2 = 0; var2 < var4; ++var2) {
            var5.add(((h)var3.get(var2)).a());
         }
      }

      return var5;
   }

   public boolean a(int var1, int var2, Bundle var3) {
      return this.a.a(var1, var2, var3);
   }

   public Object b(int var1) {
      h var2 = this.a.b(var1);
      Object var3;
      if (var2 == null) {
         var3 = null;
      } else {
         var3 = var2.a();
      }

      return var3;
   }
}
