package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources.Theme;
import android.support.v7.a.j;
import android.view.LayoutInflater;

public class c extends ContextWrapper {
   private int a;
   private Theme b;
   private LayoutInflater c;

   public c(Context var1, int var2) {
      super(var1);
      this.a = var2;
   }

   public c(Context var1, Theme var2) {
      super(var1);
      this.b = var2;
   }

   private void a() {
      boolean var1;
      if (this.b == null) {
         var1 = true;
      } else {
         var1 = false;
      }

      if (var1) {
         this.b = this.getResources().newTheme();
         Theme var2 = this.getBaseContext().getTheme();
         if (var2 != null) {
            this.b.setTo(var2);
         }
      }

      this.a(this.b, this.a, var1);
   }

   protected void a(Theme var1, int var2, boolean var3) {
      var1.applyStyle(var2, true);
   }

   public AssetManager getAssets() {
      return this.getResources().getAssets();
   }

   public Object getSystemService(String var1) {
      Object var2;
      if ("layout_inflater".equals(var1)) {
         if (this.c == null) {
            this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
         }

         var2 = this.c;
      } else {
         var2 = this.getBaseContext().getSystemService(var1);
      }

      return var2;
   }

   public Theme getTheme() {
      Theme var1;
      if (this.b != null) {
         var1 = this.b;
      } else {
         if (this.a == 0) {
            this.a = j.Theme_AppCompat_Light;
         }

         this.a();
         var1 = this.b;
      }

      return var1;
   }

   public void setTheme(int var1) {
      if (this.a != var1) {
         this.a = var1;
         this.a();
      }

   }
}
