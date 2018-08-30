package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import org.xmlpull.v1.XmlPullParser;

public class d extends MenuInflater {
   static final Class[] a = new Class[]{Context.class};
   static final Class[] b;
   final Object[] c;
   final Object[] d;
   Context e;
   private Object f;

   static {
      b = a;
   }

   public d(Context var1) {
      super(var1);
      this.e = var1;
      this.c = new Object[]{var1};
      this.d = this.c;
   }

   private Object a(Object var1) {
      Object var2;
      if (var1 instanceof Activity) {
         var2 = var1;
      } else {
         var2 = var1;
         if (var1 instanceof ContextWrapper) {
            var2 = this.a(((ContextWrapper)var1).getBaseContext());
         }
      }

      return var2;
   }

   private void a(XmlPullParser var1, AttributeSet var2, Menu var3) {
      f var4 = new f(this, var3);
      int var5 = var1.getEventType();

      int var6;
      String var10;
      do {
         if (var5 == 2) {
            var10 = var1.getName();
            if (!var10.equals("menu")) {
               throw new RuntimeException("Expecting menu, got " + var10);
            }

            var6 = var1.next();
            break;
         }

         var6 = var1.next();
         var5 = var6;
      } while(var6 != 1);

      var10 = null;
      boolean var7 = false;
      int var8 = var6;
      boolean var11 = false;

      for(boolean var12 = var7; !var11; var8 = var1.next()) {
         String var9;
         switch(var8) {
         case 1:
            throw new RuntimeException("Unexpected end of document");
         case 2:
            if (!var12) {
               var9 = var1.getName();
               if (var9.equals("group")) {
                  var4.a(var2);
               } else if (var9.equals("item")) {
                  var4.b(var2);
               } else if (var9.equals("menu")) {
                  this.a(var1, var2, var4.c());
               } else {
                  var10 = var9;
                  var12 = true;
               }
            }
            break;
         case 3:
            var9 = var1.getName();
            if (var12 && var9.equals(var10)) {
               var10 = null;
               var12 = false;
            } else if (var9.equals("group")) {
               var4.a();
            } else if (var9.equals("item")) {
               if (!var4.d()) {
                  if (var4.a != null && var4.a.e()) {
                     var4.c();
                  } else {
                     var4.b();
                  }
               }
            } else if (var9.equals("menu")) {
               var11 = true;
            }
         }
      }

   }

   Object a() {
      if (this.f == null) {
         this.f = this.a(this.e);
      }

      return this.f;
   }

   public void inflate(int param1, Menu param2) {
      // $FF: Couldn't be decompiled
   }
}
