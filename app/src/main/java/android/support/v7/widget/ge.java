package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.util.ArrayList;

public class ge extends ContextWrapper {
   private static final Object a = new Object();
   private static ArrayList b;
   private final Resources c;
   private final Theme d;

   private ge(Context var1) {
      super(var1);
      if (gs.a()) {
         this.c = new gs(this, var1.getResources());
         this.d = this.c.newTheme();
         this.d.setTo(var1.getTheme());
      } else {
         this.c = new gg(this, var1.getResources());
         this.d = null;
      }

   }

   public static Context a(Context param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean b(Context var0) {
      boolean var1 = false;
      boolean var2 = var1;
      if (!(var0 instanceof ge)) {
         var2 = var1;
         if (!(var0.getResources() instanceof gg)) {
            if (var0.getResources() instanceof gs) {
               var2 = var1;
            } else {
               if (VERSION.SDK_INT >= 21) {
                  var2 = var1;
                  if (!gs.a()) {
                     return var2;
                  }
               }

               var2 = true;
            }
         }
      }

      return var2;
   }

   public AssetManager getAssets() {
      return this.c.getAssets();
   }

   public Resources getResources() {
      return this.c;
   }

   public Theme getTheme() {
      Theme var1;
      if (this.d == null) {
         var1 = super.getTheme();
      } else {
         var1 = this.d;
      }

      return var1;
   }

   public void setTheme(int var1) {
      if (this.d == null) {
         super.setTheme(var1);
      } else {
         this.d.applyStyle(var1, true);
      }

   }
}
