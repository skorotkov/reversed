package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class ef extends MarginLayoutParams {
   ey c;
   final Rect d = new Rect();
   boolean e = true;
   boolean f = false;

   public ef(int var1, int var2) {
      super(var1, var2);
   }

   public ef(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public ef(ef var1) {
      super(var1);
   }

   public ef(LayoutParams var1) {
      super(var1);
   }

   public ef(MarginLayoutParams var1) {
      super(var1);
   }

   public boolean c() {
      return this.c.o();
   }

   public boolean d() {
      return this.c.r();
   }

   public boolean e() {
      return this.c.y();
   }

   public int f() {
      return this.c.e();
   }
}
