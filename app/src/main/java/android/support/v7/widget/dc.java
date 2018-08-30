package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

class dc extends android.support.v7.c.a.a {
   private boolean a = true;

   public dc(Drawable var1) {
      super(var1);
   }

   void a(boolean var1) {
      this.a = var1;
   }

   public void draw(Canvas var1) {
      if (this.a) {
         super.draw(var1);
      }

   }

   public void setHotspot(float var1, float var2) {
      if (this.a) {
         super.setHotspot(var1, var2);
      }

   }

   public void setHotspotBounds(int var1, int var2, int var3, int var4) {
      if (this.a) {
         super.setHotspotBounds(var1, var2, var3, var4);
      }

   }

   public boolean setState(int[] var1) {
      boolean var2;
      if (this.a) {
         var2 = super.setState(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean setVisible(boolean var1, boolean var2) {
      if (this.a) {
         var1 = super.setVisible(var1, var2);
      } else {
         var1 = false;
      }

      return var1;
   }
}
