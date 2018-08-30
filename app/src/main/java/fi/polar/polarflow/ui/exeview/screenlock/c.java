package fi.polar.polarflow.ui.exeview.screenlock;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.ui.exeview.h;
import fi.polar.polarflow.ui.exeview.x;
import fi.polar.polarflow.ui.exeview.shader.ShaderContainerView;
import fi.polar.polarflow.ui.exeview.shader.ShaderGridPager;
import fi.polar.polarflow.ui.exeview.shader.o;
import fi.polar.polarflow.ui.exeview.shader.p;
import fi.polar.polarflow.ui.exeview.shader.q;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class c extends x implements h, a, o {
   private final Handler a = new Handler();
   private ShaderContainerView b;
   private SwipeDownHintView c;
   private float d;
   private final Runnable e = new d(this);

   public static c a(boolean var0) {
      c var1 = new c();
      Bundle var2 = new Bundle();
      var2.putBoolean("polar_button_enabled", true);
      var2.putBoolean("TouchEventAbsorberFragment.SHOW_HINT_AT_START", var0);
      var1.setArguments(var2);
      return var1;
   }

   private static boolean a(float var0) {
      boolean var1;
      if (var0 <= 61.0F) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static boolean b(MotionEvent var0) {
      boolean var1;
      if (var0.getAction() == 0 && a(var0.getRawY())) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void a(p var1, boolean var2) {
      if (var1 == p.c) {
         long var3 = this.b.d();
         if (var2) {
            fi.polar.polarflow.util.d.e("TouchEventAbsorberFragment", "onSettingChanged(SCREEN_LOCK, true)");
         } else {
            this.a.removeCallbacks(this.e);
            this.a.postDelayed(this.e, var3);
         }
      } else {
         fi.polar.polarflow.util.d.f("TouchEventAbsorberFragment", "did not expect onSettingChanged() with fragmentType=" + var1);
      }

   }

   public void a(Collection var1) {
   }

   public boolean a(MotionEvent var1) {
      boolean var2 = true;
      if (var1.getAction() == 0) {
         this.d = var1.getRawY();
      }

      if (this.b.c()) {
         if (this.c.getVisibility() == 0) {
            if (b(var1)) {
               this.c.setVisibility(8);
               var2 = false;
            }
         } else if (var1.getAction() == 0) {
            this.e();
         } else if (a(this.d)) {
            var2 = false;
         }
      } else {
         var2 = false;
      }

      return var2;
   }

   public void a_(Bundle var1) {
      if (!this.b.c()) {
         this.b.d();
      }

   }

   protected boolean c() {
      this.b.d();
      return false;
   }

   public void d_() {
   }

   public void e() {
      this.c.setVisibility(0);
      this.c.a();
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.setStyle(0, 2131427610);
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      FrameLayoutWithTouchIntercept var4 = (FrameLayoutWithTouchIntercept)var1.inflate(2130968798, var2, false);
      var4.setOnInterceptTouchListener(this);
      this.b = (ShaderContainerView)var4.findViewById(2131755193);
      this.b.setShaderAccessLimit(61.0F);
      this.c = (SwipeDownHintView)var4.findViewById(2131755196);
      List var5 = Collections.singletonList(p.c);
      q var6 = new q(this.getChildFragmentManager(), var5);
      ((ShaderGridPager)var4.findViewById(2131755194)).setAdapter(var6);
      if (this.getArguments().getBoolean("TouchEventAbsorberFragment.SHOW_HINT_AT_START")) {
         this.e();
      }

      return var4;
   }

   public void onPause() {
      this.a.removeCallbacks(this.e);
      if (!this.d()) {
         this.dismiss();
      }

      super.onPause();
   }

   public void onStop() {
      this.b.b();
      super.onStop();
   }
}
