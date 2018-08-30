package fi.polar.polarflow.ftu;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.GridLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GridAnimationLayout extends GridLayout {
   private static final String a = GridAnimationLayout.class.getSimpleName();
   private boolean[] b = null;
   private boolean c = false;
   private boolean d = false;
   private Handler e = null;
   private Runnable f = null;

   public GridAnimationLayout(Context var1) {
      super(var1);
      this.setLayout(var1);
   }

   public GridAnimationLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setLayout(var1);
   }

   public GridAnimationLayout(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.setLayout(var1);
   }

   private static float a(Random var0, float var1) {
      float var2 = (float)var0.nextInt(50) / 100.0F;
      if (var2 + var1 > 0.5F) {
         var1 = var2;
      } else {
         var1 += var2;
      }

      return var1;
   }

   private static int a(float var0, float var1) {
      return (int)(Math.abs(var0 - var1) * 3000.0F);
   }

   // $FF: synthetic method
   static int a(Random var0, int var1) {
      return b(var0, var1);
   }

   private void a(int var1, boolean var2) {
      synchronized(this){}

      try {
         this.b[var1] = var2;
      } finally {
         ;
      }

   }

   private void a(Context var1, GridLayout var2) {
      ArrayList var3 = new ArrayList();
      Random var4 = new Random();
      int var5 = var2.getRowCount();
      int var6 = var2.getColumnCount();
      this.b = new boolean[var5 * var6];

      for(int var7 = 0; var7 < var5; ++var7) {
         for(int var8 = 0; var8 < var6; ++var8) {
            ImageView var9 = new ImageView(var1);
            var9.setImageResource(2131624005);
            var9.setAlpha(a(var4, 0.0F));
            var3.add(var9);
            var2.addView((View)var3.get(var3.size() - 1));
         }
      }

      this.e = new Handler();
      this.f = new h(this, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   static void a(GridLayout var0, List var1) {
      b(var0, var1);
   }

   // $FF: synthetic method
   static void a(GridAnimationLayout var0, int var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(GridAnimationLayout var0, List var1, Random var2, int var3) {
      var0.a(var1, var2, var3);
   }

   private void a(List var1, Random var2, int var3) {
      ImageView var8 = (ImageView)var1.get(var3);
      float var4 = var8.getAlpha();
      float var5;
      if (var4 > 0.25F) {
         var5 = 0.0F;
      } else {
         var5 = a(var2, 0.2F);
      }

      int var6 = a(var4, var5);
      ViewPropertyAnimator var7 = var8.animate().alpha(var5).withLayer();
      var7.setDuration((long)var6);
      var7.setStartDelay((long)var2.nextInt(1000));
      var7.withEndAction(new i(this, var8, var3));
      var7.start();
   }

   private boolean a(int var1) {
      synchronized(this){}

      boolean var2;
      try {
         var2 = this.b[var1];
      } finally {
         ;
      }

      return var2;
   }

   // $FF: synthetic method
   static boolean a(GridAnimationLayout var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static boolean a(GridAnimationLayout var0, int var1) {
      return var0.a(var1);
   }

   // $FF: synthetic method
   static boolean a(GridAnimationLayout var0, boolean var1) {
      var0.c = var1;
      return var1;
   }

   private static int b(Random var0, int var1) {
      return var0.nextInt(var1);
   }

   // $FF: synthetic method
   static Handler b(GridAnimationLayout var0) {
      return var0.e;
   }

   private static void b(GridLayout var0, List var1) {
      if (var1 != null) {
         int var2 = var0.getRowCount();
         int var3 = var0.getColumnCount();
         int var4 = var0.getWidth() / var3;

         for(int var5 = 0; var5 < var2; ++var5) {
            for(int var6 = 0; var6 < var3; ++var6) {
               LayoutParams var7 = (LayoutParams)((ImageView)var1.get(var5 * var3 + var6)).getLayoutParams();
               var7.width = var4 - 2;
               var7.height = var4 - 2;
               if (var5 == var2 - 1) {
                  var7.height = -1;
               }

               var7.setMargins(1, 1, 1, 1);
               ((ImageView)var1.get(var5 * var3 + var6)).setLayoutParams(var7);
            }
         }
      }

   }

   private void setLayout(Context var1) {
      this.a(var1, (GridLayout)((LayoutInflater)var1.getSystemService("layout_inflater")).inflate(2130968641, this, true).findViewById(2131755216));
   }

   public void a(boolean var1) {
      if (var1) {
         if (!this.d) {
            this.d = true;
            fi.polar.polarflow.util.d.c(a, "Start animation");
            this.e.postDelayed(this.f, 50L);
         }
      } else {
         fi.polar.polarflow.util.d.c(a, "Stop animation");
         this.d = false;
         this.e.removeCallbacks(this.f);
      }

   }
}
