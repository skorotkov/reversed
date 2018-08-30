package android.support.v4.view;

import android.annotation.TargetApi;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

@TargetApi(11)
class ap {
   private static Field a;
   private static boolean b;

   static void a(LayoutInflater var0, as var1) {
      aq var3;
      if (var1 != null) {
         var3 = new aq(var1);
      } else {
         var3 = null;
      }

      var0.setFactory2(var3);
      Factory var2 = var0.getFactory();
      if (var2 instanceof Factory2) {
         a(var0, (Factory2)var2);
      } else {
         a(var0, (Factory2)var3);
      }

   }

   static void a(LayoutInflater var0, Factory2 var1) {
      if (!b) {
         try {
            a = LayoutInflater.class.getDeclaredField("mFactory2");
            a.setAccessible(true);
         } catch (NoSuchFieldException var4) {
            Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", var4);
         }

         b = true;
      }

      if (a != null) {
         try {
            a.set(var0, var1);
         } catch (IllegalAccessException var3) {
            Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + var0 + "; inflation may have unexpected results.", var3);
         }
      }

   }
}
