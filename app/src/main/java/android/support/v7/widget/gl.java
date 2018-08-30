package android.support.v7.widget;

import android.content.Context;

class gl implements android.support.v7.view.menu.ab {
   android.support.v7.view.menu.m a;
   android.support.v7.view.menu.p b;
   // $FF: synthetic field
   final Toolbar c;

   gl(Toolbar var1) {
      this.c = var1;
   }

   public void a(Context var1, android.support.v7.view.menu.m var2) {
      if (this.a != null && this.b != null) {
         this.a.d(this.b);
      }

      this.a = var2;
   }

   public void a(android.support.v7.view.menu.ac var1) {
   }

   public void a(android.support.v7.view.menu.m var1, boolean var2) {
   }

   public boolean a(android.support.v7.view.menu.ak var1) {
      return false;
   }

   public boolean a(android.support.v7.view.menu.m var1, android.support.v7.view.menu.p var2) {
      this.c.d();
      if (this.c.a.getParent() != this.c) {
         this.c.addView(this.c.a);
      }

      this.c.b = var2.getActionView();
      this.b = var2;
      if (this.c.b.getParent() != this.c) {
         gm var3 = this.c.e();
         var3.a = 8388611 | this.c.c & 112;
         var3.b = 2;
         this.c.b.setLayoutParams(var3);
         this.c.addView(this.c.b);
      }

      this.c.f();
      this.c.requestLayout();
      var2.e(true);
      if (this.c.b instanceof android.support.v7.view.b) {
         ((android.support.v7.view.b)this.c.b).a();
      }

      return true;
   }

   public void b(boolean var1) {
      boolean var2 = false;
      if (this.b != null) {
         boolean var3 = var2;
         if (this.a != null) {
            int var4 = this.a.size();
            int var5 = 0;

            while(true) {
               var3 = var2;
               if (var5 >= var4) {
                  break;
               }

               if (this.a.getItem(var5) == this.b) {
                  var3 = true;
                  break;
               }

               ++var5;
            }
         }

         if (!var3) {
            this.b(this.a, this.b);
         }
      }

   }

   public boolean b() {
      return false;
   }

   public boolean b(android.support.v7.view.menu.m var1, android.support.v7.view.menu.p var2) {
      if (this.c.b instanceof android.support.v7.view.b) {
         ((android.support.v7.view.b)this.c.b).b();
      }

      this.c.removeView(this.c.b);
      this.c.removeView(this.c.a);
      this.c.b = null;
      this.c.g();
      this.b = null;
      this.c.requestLayout();
      var2.e(false);
      return true;
   }
}
