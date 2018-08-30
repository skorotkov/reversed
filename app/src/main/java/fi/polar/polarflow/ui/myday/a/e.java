package fi.polar.polarflow.ui.myday.a;

import android.content.Context;
import android.support.v7.widget.ds;
import android.support.v7.widget.ey;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import java.util.List;

final class e extends ds {
   private final LayoutInflater a;
   private final List b;
   private final OnClickListener c;
   private final int d;

   e(Context var1, List var2, OnClickListener var3, int var4) {
      this.a = LayoutInflater.from(var1);
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   private d e(int var1) {
      return (d)this.b.get(var1 - 1);
   }

   public int a() {
      return this.b.size() + 1;
   }

   public int a(int var1) {
      byte var2;
      if (var1 == 0) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      return var2;
   }

   public ey a(ViewGroup var1, int var2) {
      Object var3;
      if (var2 == 1) {
         var3 = new g(this.a.inflate(2130968782, var1, false));
      } else if (var2 == 0) {
         var3 = new f(this.a.inflate(2130968781, var1, false));
      } else {
         var3 = null;
      }

      return (ey)var3;
   }

   public void a(ey var1, int var2) {
      if (var1 instanceof g) {
         g var3 = (g)var1;
         d var4 = this.e(var2);
         var3.a.setOnClickListener(this.c);
         var3.a.setTag(var4.a);
         g.a(var3).setGlyph(var4.b);
         g.b(var3).setText(var4.c);
         if (var4.a == this.d) {
            var3.a.setSelected(true);
         } else {
            var3.a.setSelected(false);
         }
      }

   }
}
