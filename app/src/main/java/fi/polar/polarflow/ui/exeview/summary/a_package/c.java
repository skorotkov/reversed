package fi.polar.polarflow.ui.exeview.summary.a_package;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import fi.polar.polarflow.ui.exeview.a_package.a_package.bj;
import java.util.Collection;

public class c extends ah {
   protected TextView a;
   protected TextView c;

   private static String a(Context var0, long var1) {
      return var0.getResources().getString(2131230814, new Object[]{fi.polar.polarflow.ui.o.b(var0, var1), fi.polar.polarflow.ui.o.a(var0, var1, "HH:mm", "h:mm a")});
   }

   private void a(long var1) {
      this.c.setText(a(this.c.getContext(), var1));
   }

   private void b(String var1) {
      this.a.setText(var1);
   }

   private void e() {
      this.b(this.Q.getSessionName());
   }

   private void f() {
      this.a(this.Q.getStartTime());
   }

   public int a() {
      return 2130968673;
   }

   public void a(Intent var1) {
   }

   public void a(View var1) {
      this.a = (TextView)var1.findViewById(2131755305);
      this.c = (TextView)var1.findViewById(2131755306);
      if (this.P != null) {
         this.b(this.P.getString(p));
         this.a(this.P.getLong(o, -1L));
      } else {
         this.e();
         this.f();
      }

   }

   public void a(Collection var1) {
   }

   public void b() {
   }

   public void d() {
   }

   public bj l() {
      return bj.a;
   }
}
