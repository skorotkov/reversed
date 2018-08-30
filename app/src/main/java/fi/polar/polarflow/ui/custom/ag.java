package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public abstract class ag extends PolarGlyphViewInFrame {
   private static final int[] a = new int[]{2131755022, 2131755023, 2131755021, 2131755022};
   private View b;
   private int c;
   private boolean d;

   public ag(Context var1) {
      super(var1);
      this.a((AttributeSet)null, 0, var1);
   }

   public ag(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var2, 0, var1);
   }

   public ag(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var2, var3, var1);
   }

   private void a(AttributeSet var1, int var2, Context var3) {
      this.b = new View(var3);
      this.addView(this.b);
      this.d = false;
      this.c = 0;
      this.setState(2);
   }

   public void a() {
      this.d = true;
      Drawable var1 = this.b.getBackground();
      if (var1 instanceof AnimationDrawable) {
         AnimationDrawable var2 = (AnimationDrawable)var1;
         var2.stop();
         var2.start();
      }

   }

   public void b() {
      this.d = false;
      Drawable var1 = this.b.getBackground();
      if (var1 instanceof AnimationDrawable) {
         ((AnimationDrawable)var1).stop();
      }

   }

   public int getState() {
      return this.c;
   }

   public void setState(int var1) {
      if (var1 != this.c) {
         this.c = var1;
         this.b.setId(a[this.c]);
         switch(this.c) {
         case 0:
            this.b.setBackground(this.getContext().getDrawable(2130837754));
            break;
         case 1:
            AnimationDrawable var2 = (AnimationDrawable)this.getContext().getDrawable(2130837732);
            this.b.setBackground(var2);
            if (var2 != null && this.d) {
               var2.start();
            }
            break;
         case 2:
            this.b.setBackground(this.getContext().getDrawable(2130837755));
            break;
         case 3:
            this.b.setBackground(this.getContext().getDrawable(2130837753));
            break;
         default:
            fi.polar.polarflow.util.d.c("SensorView", "", new IllegalStateException("Unknown state: " + this.c));
         }
      }

   }
}
