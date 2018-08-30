package android.support.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import java.util.ArrayList;

class e extends ConstantState {
   int a;
   l b;
   AnimatorSet c;
   android.support.v4.g.a d;
   private ArrayList e;

   public e(Context var1, e var2, Callback var3, Resources var4) {
      int var5 = 0;
      super();
      if (var2 != null) {
         this.a = var2.a;
         if (var2.b != null) {
            ConstantState var7 = var2.b.getConstantState();
            if (var4 != null) {
               this.b = (l)var7.newDrawable(var4);
            } else {
               this.b = (l)var7.newDrawable();
            }

            this.b = (l)this.b.mutate();
            this.b.setCallback(var3);
            this.b.setBounds(var2.b.getBounds());
            this.b.a(false);
         }

         if (var2.e != null) {
            int var6 = var2.e.size();
            this.e = new ArrayList(var6);

            for(this.d = new android.support.v4.g.a(var6); var5 < var6; ++var5) {
               Animator var9 = (Animator)var2.e.get(var5);
               Animator var8 = var9.clone();
               String var10 = (String)var2.d.get(var9);
               var8.setTarget(this.b.a(var10));
               this.e.add(var8);
               this.d.put(var8, var10);
            }

            this.a();
         }
      }

   }

   // $FF: synthetic method
   static ArrayList a(e var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static ArrayList a(e var0, ArrayList var1) {
      var0.e = var1;
      return var1;
   }

   public void a() {
      if (this.c == null) {
         this.c = new AnimatorSet();
      }

      this.c.playTogether(this.e);
   }

   public int getChangingConfigurations() {
      return this.a;
   }

   public Drawable newDrawable() {
      throw new IllegalStateException("No constant state support for SDK < 24.");
   }

   public Drawable newDrawable(Resources var1) {
      throw new IllegalStateException("No constant state support for SDK < 24.");
   }
}
