package fi.polar.polarflow.ui.exewait;

import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.view.View;
import org.joda.time.DateTime;

class k extends fi.polar.polarflow.ui.myday.item.e {
   private boolean e;

   public k(long var1) {
      super(var1);
   }

   private static String a(Context var0, long var1) {
      DateTime var3 = new DateTime(var1);
      DateTime var4 = (new DateTime()).withTimeAtStartOfDay();
      String var5;
      if (var3.isAfter(var4.minusDays(1)) && var3.isBefore(var4.plusDays(2))) {
         var5 = DateUtils.getRelativeTimeSpanString(var1, (new DateTime()).getMillis(), 86400000L, 0).toString();
      } else {
         var5 = DateUtils.formatDateTime(var0, var1, 131096);
      }

      return var5;
   }

   // $FF: synthetic method
   static void a(k var0) {
      var0.j();
   }

   private void j() {
      if (this.g() != null) {
         Intent var1 = new Intent("ExeWaitActivity.ACTION_ENABLE_TARGET_MODE");
         var1.putExtra(c, this.g());
         android.support.v4.c.g.a(this.d).a(var1);
      }

   }

   public int a() {
      int var1;
      if (this.e() != -2L) {
         var1 = 2130968632;
      } else {
         var1 = 2130968631;
      }

      return var1;
   }

   protected String a(Context var1) {
      String var2;
      if (this.e) {
         var2 = null;
      } else {
         var2 = var1.getResources().getString(2131231115, new Object[]{a(var1, this.f()), super.a(var1)});
      }

      return var2;
   }

   public void a(View var1) {
      super.a(var1);
      if (this.e) {
         this.a.setVisibility(8);
         this.a = null;
      }

      var1.setOnClickListener(new l(this));
   }

   public void a(boolean var1) {
      this.e = var1;
   }
}
