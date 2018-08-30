package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.support.wearable.view.GridViewPager;
import android.util.AttributeSet;
import android.view.View.OnLayoutChangeListener;

public abstract class m extends GridViewPager {
   private p a;
   private Enum b;
   private final OnLayoutChangeListener c = new n(this);
   private final android.support.wearable.view.aj d = new o(this);

   public m(Context var1) {
      super(var1);
      this.addOnLayoutChangeListener(this.c);
   }

   public m(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.addOnLayoutChangeListener(this.c);
   }

   public m(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.addOnLayoutChangeListener(this.c);
   }

   // $FF: synthetic method
   static Enum a(m var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static OnLayoutChangeListener b(m var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static p c(m var0) {
      return var0.a;
   }

   protected abstract p a(android.support.wearable.view.aa var1);

   public void a(Enum var1, boolean var2) {
      int var3 = this.a.c(var1);
      if (var3 >= 0) {
         this.b = var1;
         super.a(0, var3, var2);
      } else {
         fi.polar.polarflow.util.d.f(this.getClass().getSimpleName(), "type not found from adapter: " + var1);
      }

   }

   public android.support.wearable.view.aj getOnPageChangeListener() {
      return this.d;
   }

   public void setAdapter(android.support.wearable.view.aa var1) {
      super.setAdapter(var1);
      this.a = this.a(var1);
   }

   public void setCurrentItem(Enum var1) {
      this.a(var1, true);
   }
}
