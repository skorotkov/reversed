package fi.polar.polarflow.ui.a;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.calculators.as;
import fi.polar.polarflow.calculators.bd;
import java.util.Collection;

public abstract class s extends z {
   private TextView a;
   private int c = 0;
   private final v d;
   private ab e;

   public s(v var1) {
      super(var1);
      this.d = var1;
   }

   // $FF: synthetic method
   static int a(s var0) {
      return var0.e();
   }

   // $FF: synthetic method
   static Intent a(Collection var0, String var1) {
      return e(var0, var1);
   }

   // $FF: synthetic method
   static Intent b(Collection var0, String var1) {
      return e(var0, var1);
   }

   // $FF: synthetic method
   static v b(s var0) {
      return var0.d;
   }

   private void c(Intent var1) {
      if (var1 != null && this.d.c.equals(var1.getAction())) {
         this.a(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1) + 1);
      }

   }

   private int e() {
      return this.c;
   }

   public float a(as var1) {
      return -1.0F;
   }

   public float a(bd var1) {
      return -1.0F;
   }

   protected void a(int var1) {
      this.c = var1;
      if (var1 > 0) {
         a(var1, this.a);
      } else if (this.a != null) {
         this.a.setText(2131231103);
      }

   }

   public void a(Intent var1) {
      if (var1 != null) {
         if (this.d.c.equals(var1.getAction())) {
            this.c(var1);
         } else {
            this.e.a(var1);
         }
      }

   }

   public void a(View var1) {
      super.a(var1);
      if (this.d.a) {
         this.a = (TextView)var1.findViewById(2131755244);
         if (this.a != null) {
            this.a.setVisibility(0);
         }
      }

      this.a(1);
      if (this.n()) {
         this.e = new x(this, (t)null);
      } else {
         this.e = new u(this, (t)null);
      }

   }

   public void a(Collection var1) {
      this.c(e(var1, this.d.c));
      this.e.a(var1);
   }

   public void d() {
      this.c(this.a((String)this.d.c));
      this.e.a();
   }
}
