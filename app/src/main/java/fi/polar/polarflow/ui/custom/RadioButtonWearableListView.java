package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.support.v7.widget.ds;
import android.support.v7.widget.du;
import android.support.wearable.view.bd;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class RadioButtonWearableListView extends BetterWearableListView implements bd {
   private WearableLinearLayoutManager H;
   private t I;
   private int J;
   private boolean K;
   private final du L;

   public RadioButtonWearableListView(Context var1) {
      this(var1, (AttributeSet)null, 0);
   }

   public RadioButtonWearableListView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public RadioButtonWearableListView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.J = -1;
      this.K = true;
      this.L = new x(this);
      this.setOneByOneScrollOnFlingEnabled(false);
      this.H = (WearableLinearLayoutManager)this.getLayoutManager();
      this.H.a(8388611);
      this.H.e(true);
      this.H.c(false);
      this.a(this);
   }

   private void C() {
      int var1 = this.I.d();
      this.a_(var1);
      if (var1 < this.I.a() - 2) {
         this.J = var1;
      }

   }

   private void D() {
      if (this.getChildCount() != 0) {
         int var1 = this.H.S();

         for(int var2 = 0; var2 < this.getChildCount(); ++var2) {
            v var3 = (v)this.q(this.getChildAt(var2));
            if (var2 == var1) {
               var3.n.setAlpha(1.0F);
            } else {
               var3.n.setAlpha(0.5F);
            }
         }
      }

   }

   // $FF: synthetic method
   static boolean a(RadioButtonWearableListView var0) {
      return var0.K;
   }

   // $FF: synthetic method
   static void b(RadioButtonWearableListView var0) {
      var0.C();
   }

   public void A() {
      this.scrollBy(0, this.getChildAt(this.H.S()).getTop());
   }

   public void a(int var1) {
      this.D();
   }

   public void b(boolean var1) {
      this.K = var1;
   }

   public void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (this.J != -1) {
         var2 = this.getChildCount();
         if (var2 == 0) {
            return;
         }

         RadioButton var6 = (RadioButton)this.getChildAt(0);
         var3 = this.J - (Integer)var6.getTag();
         if (var3 >= 0 && var3 < var2) {
            this.scrollBy(0, this.getChildAt(var3).getTop());
            this.J = -1;
         }
      }

      this.D();
   }

   public void setAdapter(ds var1) {
      if (!(var1 instanceof t)) {
         throw new IllegalArgumentException("Only RadioButtonAdapter instances allowed!");
      } else {
         if (this.I != null) {
            this.I.b(this.L);
         }

         this.I = (t)var1;
         super.setAdapter(var1);
         this.I.a((du)this.L);
      }
   }

   public void setLayoutManager(WearableLinearLayoutManager var1) {
      this.H = var1;
   }
}
