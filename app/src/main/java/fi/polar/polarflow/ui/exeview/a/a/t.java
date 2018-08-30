package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import java.util.Collection;

public class t extends ag {
   protected TextView a;
   protected TextView c;

   private void a(int var1) {
      Pair var2 = this.b(var1);
      this.a.setTextSize(0, this.a(this.l(), ((String)var2.first).length()));
      this.a.setText((CharSequence)var2.first);
      if (this.c != null) {
         if (TextUtils.isEmpty((CharSequence)var2.second)) {
            this.c.setVisibility(4);
         } else {
            this.c.setVisibility(0);
         }

         this.c.setText((CharSequence)var2.second);
      }

   }

   private void a(TextView var1) {
      if (this.p() == 2) {
         var1.setText(2131230921);
      } else {
         var1.setText(2131230922);
      }

   }

   private Pair b(int var1) {
      var1 = fi.polar.polarflow.a.a.a(7, var1);
      String var2;
      String var3;
      if (this.l() == bj.a && var1 >= 10000) {
         var2 = String.valueOf(var1 / 10);
         var3 = String.valueOf(var1 % 10);
      } else {
         var2 = fi.polar.polarflow.ui.o.d(this.a.getContext(), var1);
         var3 = "";
      }

      return Pair.create(var2, var3);
   }

   private void b(Intent var1) {
      if (var1 != null && "DailyActivityService.action.TRAINING_LOAD_DATA".equals(var1.getAction())) {
         this.a(var1.getIntExtra("DailyActivityService.extra.TOTAL_CALORIES", -1));
      }

   }

   public int a() {
      int var1;
      switch(fi.polar.polarflow.ui.exeview.a.a.u.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968654;
         break;
      case 2:
         var1 = 2130968653;
         break;
      case 3:
         var1 = 2130968652;
         break;
      default:
         var1 = 0;
      }

      return var1;
   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.a = (TextView)var1.findViewById(2131755257);
      this.c = (TextView)var1.findViewById(2131755261);
      this.a((TextView)var1.findViewById(2131755256));
   }

   public void a(Collection var1) {
      this.b(e(var1, "DailyActivityService.action.TRAINING_LOAD_DATA"));
   }

   public void b() {
   }

   public void d() {
      if (this.P != null) {
         this.a(this.P.getInt(u, -1));
      } else {
         this.b(this.a((String)"DailyActivityService.action.TRAINING_LOAD_DATA"));
      }

   }
}
