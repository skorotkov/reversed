package fi.polar.polarflow.ui;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class q extends g {
   protected u a;

   private void a(View var1) {
      var1.findViewById(2131755543).setOnClickListener(new r(this));
      var1.findViewById(2131755544).setOnClickListener(new s(this));
   }

   public void a(u var1) {
      this.a = var1;
   }

   protected boolean c() {
      if (this.a != null) {
         this.a.d(this);
      }

      return true;
   }

   protected void d() {
      if (this.a != null) {
         this.a.b(this);
      }

      this.dismiss();
   }

   protected void e() {
      if (this.a != null) {
         this.a.a(this);
      }

      this.dismiss();
   }

   void f() {
      if (this.getDialog() != null && this.getDialog().getWindow() != null) {
         this.getDialog().getWindow().addFlags(128);
      }

   }

   public void onCancel(DialogInterface var1) {
      super.onCancel(var1);
      if (this.a != null) {
         this.a.c(this);
      }

   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(2130968801, var2, false);
      TextView var5 = (TextView)var4.findViewById(2131755541);
      var5.setText(this.getArguments().getString("message"));
      TextView var6 = (TextView)var4.findViewById(2131755025);
      String var7 = this.getArguments().getString("title");
      if (TextUtils.isEmpty(var7)) {
         var6.setVisibility(8);
         var5.setMaxLines(var5.getMaxLines() + 1);
         var5.setTypeface(Typeface.create("sans-serif-condensed", 0));
         ((LinearLayout)var4.findViewById(2131755540)).setGravity(17);
      } else {
         var6.setText(var7);
      }

      if (this.getArguments().getBoolean("keepScreenOn", false)) {
         this.f();
      }

      this.a(var4);
      return var4;
   }
}
