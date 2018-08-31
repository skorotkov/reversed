package android.support.v4.view.a_package;

import android.os.Bundle;
import android.os.Build.VERSION;
import java.util.List;

public class z {
   private static final aa a;
   private final Object b;

   static {
      if (VERSION.SDK_INT >= 19) {
         a = new ad();
      } else if (VERSION.SDK_INT >= 16) {
         a = new ab();
      } else {
         a = new af();
      }

   }

   public z() {
      this.b = a.a(this);
   }

   public z(Object var1) {
      this.b = var1;
   }

   public h a(int var1) {
      return null;
   }

   public Object a() {
      return this.b;
   }

   public List a(String var1, int var2) {
      return null;
   }

   public boolean a(int var1, int var2, Bundle var3) {
      return false;
   }

   public h b(int var1) {
      return null;
   }
}
