package fi.polar.polarflow.ui.exeview.target.a_package;

import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.ExercisePhase;
import fi.polar.polarflow.ui.exeview.a_package.a_package.ah;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p {
   protected List a;
   protected int b;
   protected Training c;
   private fi.polar.polarflow.ui.exeview.target.h d;

   public p() {
      this.d = fi.polar.polarflow.ui.exeview.target.h.h;
      this.a = null;
      this.b = 0;
      this.c = null;
   }

   private int b(List var1, int var2) {
      ExercisePhase var3 = (ExercisePhase)var1.get(var2);
      int var4 = 1;

      int var6;
      for(int var5 = 0; var5 < var2; var4 = var6) {
         var6 = var4;
         if (var1.get(var5) == var3) {
            var6 = var4 + 1;
         }

         ++var5;
      }

      return var4;
   }

   public n a() {
      n var1 = new n();
      ArrayList var2 = new ArrayList();
      int var4;
      switch(o.a[this.d.ordinal()]) {
      case 1:
         var2.add(new m());
         var2.add(new d());
         var2.add(new q());
         break;
      case 2:
         var2.add(new m());
         var2.add(new c());
         var2.add(new q());
         break;
      case 3:
         var2.add(new m());
         var2.add(new a());
         var2.add(new q());
         break;
      case 4:
         var2.add(new k());
         var2.add(new l());
         var2.add(new f());
         var2.add(new g());
         break;
      case 5:
         var2.add(new k());
         var2.add(new e());
         var2.add(new f());
         var2.add(new g());
         break;
      case 6:
         var2.add(new j());
         break;
      case 7:
         if (this.a != null && this.b > 0 && this.b <= this.a.size()) {
            ExercisePhase var3 = (ExercisePhase)this.a.get(this.b - 1);
            var4 = this.b(this.a, this.b - 1);
            var2.add(new h(var3, this.b, var4));
         }
      }

      var1.a(this.d);
      Iterator var5 = var2.iterator();

      for(var4 = 0; var5.hasNext(); ++var4) {
         ((ah)var5.next()).f(var4);
      }

      if (this.c != null) {
         var5 = var2.iterator();

         while(var5.hasNext()) {
            ((ah)var5.next()).a(this.c);
         }
      }

      var1.a((List)var2);
      return var1;
   }

   public p a(Training var1) {
      this.c = var1;
      return this;
   }

   public p a(fi.polar.polarflow.ui.exeview.target.h var1) {
      this.d = var1;
      return this;
   }

   public p a(List var1, int var2) {
      this.a = var1;
      this.b = var2;
      return this;
   }
}
