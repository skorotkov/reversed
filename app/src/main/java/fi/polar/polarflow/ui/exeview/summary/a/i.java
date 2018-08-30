package fi.polar.polarflow.ui.exeview.summary.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.SwimmingStyleStatistics;
import fi.polar.polarflow.ui.exeview.a.a.ah;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class i extends ah {
   private ProgressBar a;
   private Context c;
   private SwimmingStyleStatistics d;
   private int e = -1;
   private List f;
   private int g;
   private OnClickListener h = new j(this);

   // $FF: synthetic method
   static Context a(i var0) {
      return var0.c;
   }

   private void a(FrameLayout var1, int var2) {
      MarginLayoutParams var3 = (MarginLayoutParams)var1.getLayoutParams();
      var3.bottomMargin = var2;
      var1.setLayoutParams(var3);
   }

   // $FF: synthetic method
   static SwimmingStyleStatistics b(i var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static int c(i var0) {
      return var0.g;
   }

   private void e() {
      float var1 = this.P.getFloat(r);
      float var2 = this.d.getDistance();
      if (var1 != 0.0F && var2 != 0.0F) {
         this.a.setProgress(Math.round(var2 / var1 * 100.0F));
         this.a.setOnClickListener(this.h);
         FrameLayout var3 = (FrameLayout)this.a.getParent();
         Resources var4 = this.c.getResources();
         int var5 = var4.getDimensionPixelSize(2131362279);
         if (this.f()) {
            var5 = var4.getDimensionPixelSize(2131362277);
         }

         this.a(var3, var5);
      }

   }

   private boolean f() {
      int var1 = this.f.size() - 1;

      boolean var3;
      while(true) {
         label21: {
            if (var1 >= 0) {
               List var2 = ((d)this.f.get(var1)).f();
               if (var2.size() != 1) {
                  break label21;
               }

               ah var4 = (ah)var2.get(0);
               if (!(var4 instanceof i)) {
                  break label21;
               }

               if (var4 == this) {
                  var3 = true;
                  break;
               }
            }

            var3 = false;
            break;
         }

         --var1;
      }

      return var3;
   }

   public int a() {
      return 2130968687;
   }

   public void a(int var1) {
      this.e = var1;
   }

   public void a(View var1) {
      super.a(var1);
      Iterator var2 = this.P.getParcelableArrayList(L).iterator();

      while(var2.hasNext()) {
         SwimmingStyleStatistics var3 = (SwimmingStyleStatistics)var2.next();
         if (var3.getSwimmingStyle() == this.e) {
            this.d = var3;
            break;
         }
      }

      if (this.d == null) {
         fi.polar.polarflow.util.d.f("SwimmingStyleBar", "Unable to find a SwimmingStyleStatistics that matches wanted swimming style!");
      } else {
         this.g = this.P.getInt(O);
         this.c = var1.getContext();
         ((TextView)var1.findViewById(2131755346)).setText(fi.polar.polarflow.ui.exeview.summary.h.a(this.c, this.e));
         this.a = (ProgressBar)var1.findViewById(2131755345);
         this.e();
      }

   }

   public void a(Collection var1) {
   }

   public void a(List var1) {
      this.f = var1;
   }
}
