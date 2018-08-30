package android.support.v7.widget;

import android.view.View;

public class dz {
   public int a;
   public int b;
   public int c;
   public int d;

   public dz a(ey var1) {
      return this.a(var1, 0);
   }

   public dz a(ey var1, int var2) {
      View var3 = var1.a;
      this.a = var3.getLeft();
      this.b = var3.getTop();
      this.c = var3.getRight();
      this.d = var3.getBottom();
      return this;
   }
}
