package fi.polar.polarflow.ui.exeview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class j extends i {
   protected abstract View a(View var1, i var2);

   public void a(Intent var1) {
      if (this.c()) {
         Iterator var2 = this.e().iterator();

         while(var2.hasNext()) {
            ((i)var2.next()).a(var1);
         }
      }

   }

   public void a(View var1) {
      super.a(var1);

      i var3;
      for(Iterator var2 = this.e().iterator(); var2.hasNext(); var3.a(this.a(var1, var3))) {
         var3 = (i)var2.next();
         if (this.h()) {
            var3.a_((Bundle)null);
         } else if (var3.h()) {
            var3.d_();
         }
      }

   }

   public void a(Collection var1) {
      if (this.c()) {
         Iterator var2 = this.e().iterator();

         while(var2.hasNext()) {
            ((i)var2.next()).a(var1);
         }
      }

   }

   public void a_(Bundle var1) {
      super.a_(var1);
      if (this.c()) {
         Iterator var2 = this.e().iterator();

         while(var2.hasNext()) {
            ((i)var2.next()).a_(var1);
         }
      }

   }

   public void b() {
      super.b();
      Iterator var1 = this.e().iterator();

      while(var1.hasNext()) {
         ((i)var1.next()).b();
      }

   }

   public void d() {
      if (this.c()) {
         Iterator var1 = this.e().iterator();

         while(var1.hasNext()) {
            ((i)var1.next()).d();
         }
      }

   }

   public void d_() {
      super.d_();
      if (this.c()) {
         Iterator var1 = this.e().iterator();

         while(var1.hasNext()) {
            ((i)var1.next()).d_();
         }
      }

   }

   protected abstract List e();
}
