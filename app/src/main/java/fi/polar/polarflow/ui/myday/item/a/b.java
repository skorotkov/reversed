package fi.polar.polarflow.ui.myday.item.a;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.DailySummary;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import java.util.concurrent.TimeUnit;

class b extends fi.polar.polarflow.ui.myday.item.b {
   private static final SparseIntArray a = new c(3);
   private static final SparseIntArray c = new d(3);
   private final int d;
   private Resources e;
   private TextView f;

   public b(int var1) {
      this.d = var1;
   }

   private long a(DailySummary var1) {
      long var2;
      switch(this.d) {
      case 0:
         var2 = var1.getTimeToGoJog();
         break;
      case 1:
         var2 = var1.getTimeToGoWalk();
         break;
      case 2:
         var2 = var1.getTimeToGoUp();
         break;
      default:
         var2 = -1L;
      }

      return var2;
   }

   private String a(long var1) {
      String var3 = "";
      int var4 = c.get(this.d, -1);
      if (var4 != -1) {
         int var5;
         int var6;
         if (var1 > 0L) {
            var5 = (int)TimeUnit.MILLISECONDS.toHours(var1);
            var6 = (int)(TimeUnit.MILLISECONDS.toMinutes(var1) - TimeUnit.HOURS.toMinutes((long)var5));
         } else {
            var6 = 0;
            var5 = 0;
         }

         var3 = this.e.getString(var4, new Object[]{var5, var6});
      }

      return var3;
   }

   private void b(Intent var1) {
      if (this.c()) {
         long var2 = this.c(var1);
         if (var2 != -1L) {
            this.f.setText(this.a(var2));
         }
      }

   }

   private long c(Intent var1) {
      long var2;
      if (var1 != null && "DailyActivityService.action.DAILY_ACTIVITY_STATUS".equals(var1.getAction())) {
         Parcelable var4 = var1.getParcelableExtra("DailyActivityService.extra.DAILY_SUMMARY");
         if (var4 instanceof DailySummary) {
            var2 = this.a((DailySummary)var4);
            return var2;
         }
      }

      var2 = -1L;
      return var2;
   }

   private CharSequence e() {
      int var1 = a.get(this.d, 2131231009);
      return this.e.getText(var1);
   }

   public int a() {
      return 2130968713;
   }

   public void a(Intent var1) {
      super.a(var1);
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.e = var1.getResources();
      ((PolarGlyphView)var1.findViewById(2131755399)).setText(this.e());
      this.f = (TextView)var1.findViewById(2131755400);
   }

   public void d() {
      super.d();
      this.b(this.a((String)"DailyActivityService.action.DAILY_ACTIVITY_STATUS"));
   }
}
