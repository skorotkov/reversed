package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.support.v7.widget.ey;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import java.util.ArrayList;
import java.util.List;

public class t extends c {
   private final LayoutInflater a;
   private List b;
   private int c = -1;
   private w d;
   private OnClickListener e = new u(this);

   public t(Context var1) {
      this.a = LayoutInflater.from(var1);
   }

   public int a() {
      int var1;
      if (this.b == null) {
         var1 = 0;
      } else {
         var1 = this.b.size();
      }

      return var1;
   }

   // $FF: synthetic method
   public ey a(ViewGroup var1, int var2) {
      return this.c(var1, var2);
   }

   public void a(int var1, boolean var2) {
      this.c = var1;
      if (var2 && this.d != null) {
         this.d.a(this.c);
      }

      this.c();
   }

   public void a(v var1, int var2) {
      var1.n.setText((CharSequence)this.b.get(var2));
      var1.n.setAlpha(0.5F);
      if (this.c == var2) {
         var1.n.setChecked(true);
      } else {
         var1.n.setChecked(false);
      }

      var1.n.setTag(var2);
      var1.n.setOnClickListener(this.e);
   }

   public void a(w var1) {
      this.d = var1;
   }

   public void a(List var1) {
      this.b = new ArrayList(var1);
      this.c();
   }

   public v c(ViewGroup var1, int var2) {
      return new v(this.a.inflate(2130968757, var1, false));
   }

   public int d() {
      return this.c;
   }
}
