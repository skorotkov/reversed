package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class gm extends android.support.v7.app.b {
   int b = 0;

   public gm(int var1, int var2) {
      super(var1, var2);
      this.a = 8388627;
   }

   public gm(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public gm(android.support.v7.app.b var1) {
      super(var1);
   }

   public gm(gm var1) {
      super((android.support.v7.app.b)var1);
      this.b = var1.b;
   }

   public gm(LayoutParams var1) {
      super(var1);
   }

   public gm(MarginLayoutParams var1) {
      super((LayoutParams)var1);
      this.a(var1);
   }

   void a(MarginLayoutParams var1) {
      this.leftMargin = var1.leftMargin;
      this.topMargin = var1.topMargin;
      this.rightMargin = var1.rightMargin;
      this.bottomMargin = var1.bottomMargin;
   }
}
