package fi.polar.polarflow.ui.myday.item;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

public abstract class c extends b implements Comparable {
   protected TextView a;
   private final long c;
   private final int d;
   private final boolean e;
   private String f;

   protected c(long var1) {
      this(var1, 0, true);
   }

   protected c(long var1, int var3, String var4, boolean var5) {
      this.c = var1;
      this.d = var3;
      this.f = var4;
      this.e = var5;
   }

   protected c(long var1, int var3, boolean var4) {
      this(var1, var3, (String)null, var4);
   }

   public int a(c var1) {
      long var2 = System.currentTimeMillis();
      long var4;
      if (this.c == Long.MAX_VALUE) {
         var4 = var2;
      } else {
         var4 = this.c;
      }

      if (var1.c != Long.MAX_VALUE) {
         var2 = var1.c;
      }

      int var6 = Long.compare(var4, var2);
      int var7 = var6;
      if (var6 == 0) {
         var7 = Integer.compare(this.d, var1.d);
      }

      return var7;
   }

   protected String a(Context var1) {
      String var2;
      if (this.c == Long.MAX_VALUE) {
         var2 = var1.getString(2131231011);
      } else {
         if (DateFormat.is24HourFormat(var1)) {
            var2 = "HH:mm";
         } else {
            var2 = "h:mm a";
         }

         var2 = DateFormat.format(var2, this.c).toString();
      }

      return var2;
   }

   public void a(View var1) {
      super.a(var1);
      this.a = (TextView)var1.findViewById(2131755201);
      this.c(this.a(var1.getContext()));
      var1.setOnClickListener(new d(this));
   }

   public void b(String var1) {
      this.f = var1;
   }

   public void c(String var1) {
      if (this.a != null) {
         this.a.setText(var1);
      }

   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.a((c)var1);
   }

   public long f() {
      return this.c;
   }

   public String g() {
      return this.f;
   }

   public boolean h() {
      return this.e;
   }

   public void i() {
   }
}
