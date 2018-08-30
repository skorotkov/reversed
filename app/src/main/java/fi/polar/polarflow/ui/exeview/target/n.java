package fi.polar.polarflow.ui.exeview.target;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.polar.polarflow.ui.exeview.x;
import java.util.Collection;

public class n extends x implements fi.polar.polarflow.ui.exeview.h {
   protected final Handler a = new Handler();
   protected final Runnable b = new o(this);
   private View c;

   public static n a(String var0) {
      n var1 = new n();
      Bundle var2 = new Bundle();
      var2.putString("training_name", var0);
      var2.putBoolean("polar_button_enabled", true);
      var1.setArguments(var2);
      return var1;
   }

   // $FF: synthetic method
   static boolean a(n var0) {
      return var0.d();
   }

   public void a(Collection var1) {
   }

   public void a_(Bundle var1) {
      if (this.c != null) {
         this.c.setBackgroundColor(-16777216);
      }

   }

   protected boolean c() {
      this.dismiss();
      return false;
   }

   public void d_() {
      if (this.c != null && this.getContext() != null) {
         this.c.setBackgroundColor(this.getContext().getColor(2131624058));
      }

   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      String var5 = this.getArguments().getString("training_name");
      View var4 = var1.inflate(2130968799, var2);
      ((TextView)var4.findViewById(2131755539)).setText(this.getResources().getString(2131230831, new Object[]{var5}));
      this.c = var4.findViewById(2131755444);
      if (this.getActivity() instanceof android.support.wearable.activity.a && ((android.support.wearable.activity.a)this.getActivity()).b()) {
         this.c.setBackgroundColor(-16777216);
      }

      var4.setOnClickListener(new p(this));
      this.a.postDelayed(this.b, fi.polar.polarflow.util.b.m);
      return var4;
   }

   public void onDismiss(DialogInterface var1) {
      this.a.removeCallbacks(this.b);
      super.onDismiss(var1);
   }

   public void onStart() {
      super.onStart();
      ObjectAnimator var1 = ObjectAnimator.ofInt(this.getDialog().getWindow().getDecorView().findViewById(2131755358), "progress", new int[]{0, 100});
      var1.setDuration(fi.polar.polarflow.util.b.m);
      var1.start();
   }
}
