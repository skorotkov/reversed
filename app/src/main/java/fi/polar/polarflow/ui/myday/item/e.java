package fi.polar.polarflow.ui.myday.item;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import fi.polar.polarflow.data.orm.Preferences;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.custom.s;
import fi.polar.polarflow.ui.exewait.ExeWaitActivity;
import fi.polar.polarflow.ui.myday.u;

public class e extends c {
   public static final String c;
   private static final String e = e.class.getSimpleName();
   protected Context d;
   private long f = -2L;
   private int g = 0;
   private int h = Integer.MAX_VALUE;
   private long i = -1L;
   private float j = -1.0F;
   private int k = -1;
   private boolean l = false;
   private long m = -1L;
   private String n;
   private int o = -1;

   static {
      c = e + ".extra.USE_TRAINING_TARGET";
   }

   public e(long var1) {
      super(var1);
   }

   private void a(PolarGlyphView var1, int var2) {
      if (this.f == -2L) {
         var1.setGlyph(var1.getResources().getString(var2));
      }

   }

   private void b(View var1) {
      int var2 = Preferences.getUserUnitSystem();
      PolarGlyphView var3 = (PolarGlyphView)var1.findViewById(2131755199);
      LinearLayout var4;
      TextView var6;
      switch(this.h) {
      case 0:
         if (this.i != -1L) {
            var6 = (TextView)var1.findViewById(2131755412);
            var6.setText(fi.polar.polarflow.ui.o.a(this.i));
            var6.setVisibility(0);
            if (!this.l) {
               this.a(var3, 2131231132);
            }
         }
         break;
      case 1:
         if (this.j != -1.0F) {
            var4 = (LinearLayout)var1.findViewById(2131755413);
            TextView var5 = (TextView)var1.findViewById(2131755414);
            var6 = (TextView)var1.findViewById(2131755415);
            if (this.o != -1) {
               fi.polar.polarflow.ui.o.a(18, var5, this.j, this.o);
               fi.polar.polarflow.ui.o.a(var6, this.o);
            } else {
               var5.setText(fi.polar.polarflow.ui.o.a(var2, this.j));
               var6.setText(fi.polar.polarflow.ui.o.c(var2));
            }

            var4.setVisibility(0);
            if (!this.l) {
               this.a(var3, 2131231130);
            }
         }
         break;
      case 2:
         if (this.k != -1) {
            var4 = (LinearLayout)var1.findViewById(2131755416);
            ((TextView)var1.findViewById(2131755417)).setText(fi.polar.polarflow.ui.o.d(this.d, this.k));
            ((TextView)var1.findViewById(2131755418)).setText(fi.polar.polarflow.ui.o.d(var2));
            var4.setVisibility(0);
            if (!this.l) {
               this.a(var3, 2131231126);
            }
         }
         break;
      default:
         fi.polar.polarflow.util.d.b(e, "Volume target type unsupported or not defined!");
      }

   }

   private void d(long var1) {
      Intent var3 = new Intent(this.d, ExeWaitActivity.class);
      String var4 = this.g();
      if (!TextUtils.isEmpty(var4)) {
         var3.putExtra(c, var4);
      }

      var3.putExtra(SportProfile.KEY_SPORT_ID, var1);
      this.d.startActivity(var3);
   }

   public int a() {
      int var1;
      if (this.f != -2L) {
         var1 = 2130968726;
      } else {
         var1 = 2130968725;
      }

      return var1;
   }

   public void a(float var1) {
      this.j = var1;
   }

   public void a(int var1) {
      this.k = var1;
   }

   public void a(long var1) {
      this.f = var1;
   }

   public void a(View var1) {
      super.a(var1);
      this.d = var1.getContext();
      if (this.l) {
         LinearLayout var2 = (LinearLayout)var1.findViewById(2131755198);
         View var3 = var1.findViewById(2131755431);
         int var4 = this.d.getResources().getColor(2131624062, this.d.getTheme());
         if (var3 != null) {
            var3.setBackgroundColor(var4);
         }

         var2.getBackground().setColorFilter(var4, Mode.SRC_ATOP);
      }

      PolarGlyphView var8 = (PolarGlyphView)var1.findViewById(2131755199);
      if (this.f != -2L) {
         var8.setGlyph(s.a(this.f));
         if (this.m != -1L && !this.l) {
            PolarGlyphView var6 = (PolarGlyphView)var1.findViewById(2131755481);
            if (var6 != null) {
               var6.setVisibility(0);
            }
         }
      }

      TextView var7 = (TextView)var1.findViewById(2131755411);
      var7.setText(this.n);
      TextView var5;
      switch(this.g) {
      case 0:
         var7.setMaxLines(var7.getMaxLines() + 1);
         if (this.l) {
            var5 = (TextView)var1.findViewById(2131755412);
            var5.setText(fi.polar.polarflow.ui.o.a(this.i));
            var5.setVisibility(0);
         }
         break;
      case 1:
         this.b(var1);
         break;
      case 2:
         this.a(var8, 2131231143);
         if (this.l) {
            var5 = (TextView)var1.findViewById(2131755412);
            var5.setText(fi.polar.polarflow.ui.o.a(this.i));
            var5.setVisibility(0);
         }
         break;
      default:
         fi.polar.polarflow.util.d.b(e, "Unsupported exercise target type!");
      }

   }

   public void b() {
      this.d = null;
      super.b();
   }

   public void b(int var1) {
      this.g = var1;
   }

   public void b(long var1) {
      this.i = var1;
   }

   public void b(boolean var1) {
      this.l = var1;
   }

   public void c(int var1) {
      this.h = var1;
   }

   public void c(long var1) {
      this.m = var1;
   }

   public void d(int var1) {
      this.o = var1;
   }

   public void d(String var1) {
      this.n = var1;
   }

   public long e() {
      return this.f;
   }

   public void i() {
      if (this.l) {
         u.a(this.d, this.f());
      } else {
         this.d(this.f);
      }

   }
}
