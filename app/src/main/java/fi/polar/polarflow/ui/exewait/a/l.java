package fi.polar.polarflow.ui.exewait.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.Pair;
import fi.polar.polarflow.ui.custom.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l extends t {
   private final Context a;

   public l(Context var1, Pair var2, int var3) {
      super(var1);
      this.a = var1;
      this.b(var2, var3);
   }

   public l(Context var1, List var2) {
      super(var1);
      this.a = var1;
      ArrayList var3 = new ArrayList();
      Resources var5 = var1.getResources();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         m var6 = (m)var4.next();
         var3.add(var5.getString(var6.b, new Object[]{var6.a}));
      }

      this.a(var3);
   }

   private void b(Pair var1, int var2) {
      ArrayList var3 = new ArrayList();
      Resources var4 = this.a.getResources();

      for(int var5 = (Integer)var1.first; var5 <= (Integer)var1.second; ++var5) {
         var3.add(var4.getString(var2, new Object[]{var5}));
      }

      this.a(var3);
   }

   public void a(Pair var1, int var2) {
      this.b(var1, var2);
      this.c();
   }
}
