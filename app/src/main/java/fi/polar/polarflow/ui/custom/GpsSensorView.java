package fi.polar.polarflow.ui.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class GpsSensorView extends ag {
   private l a;
   private fi.polar.polarflow.util.n b;
   private Toast c;
   private OnClickListener d;

   public GpsSensorView(Context var1) {
      this(var1, (AttributeSet)null, 0);
   }

   public GpsSensorView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public GpsSensorView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.d = new k(this);
      this.b = new fi.polar.polarflow.util.n(var1);
      this.setOnClickListener(this.d);
   }

   // $FF: synthetic method
   static l a(GpsSensorView var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.util.n b(GpsSensorView var0) {
      return var0.b;
   }

   @SuppressLint({"ShowToast"})
   Toast a(Context var1) {
      Toast var2;
      if (this.c != null) {
         var2 = this.c;
      } else {
         var2 = Toast.makeText(var1, var1.getResources().getString(2131230794), 0);
      }

      return var2;
   }

   public void setOnClickListener(l var1) {
      this.a = var1;
   }

   void setPowerManagerWrapper(fi.polar.polarflow.util.n var1) {
      this.b = var1;
   }

   void setToast(Toast var1) {
      this.c = var1;
   }
}
