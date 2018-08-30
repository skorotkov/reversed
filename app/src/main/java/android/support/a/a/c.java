package android.support.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.Animator.AnimatorListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"NewApi"})
public class c extends k implements b {
   final Callback a;
   private e c;
   private Context d;
   private ArgbEvaluator e;
   private AnimatorListener f;
   private ArrayList g;

   c() {
      this((Context)null, (e)null, (Resources)null);
   }

   private c(Context var1) {
      this(var1, (e)null, (Resources)null);
   }

   private c(Context var1, e var2, Resources var3) {
      this.e = null;
      this.f = null;
      this.g = null;
      this.a = new d(this);
      this.d = var1;
      if (var2 != null) {
         this.c = var2;
      } else {
         this.c = new e(var1, var2, this.a, var3);
      }

   }

   public static c a(Context var0, Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      c var5 = new c(var0);
      var5.inflate(var1, var2, var3, var4);
      return var5;
   }

   private void a(Animator var1) {
      if (var1 instanceof AnimatorSet) {
         ArrayList var2 = ((AnimatorSet)var1).getChildAnimations();
         if (var2 != null) {
            for(int var3 = 0; var3 < var2.size(); ++var3) {
               this.a((Animator)var2.get(var3));
            }
         }
      }

      if (var1 instanceof ObjectAnimator) {
         ObjectAnimator var5 = (ObjectAnimator)var1;
         String var4 = var5.getPropertyName();
         if ("fillColor".equals(var4) || "strokeColor".equals(var4)) {
            if (this.e == null) {
               this.e = new ArgbEvaluator();
            }

            var5.setEvaluator(this.e);
         }
      }

   }

   private void a(String var1, Animator var2) {
      var2.setTarget(this.c.b.a(var1));
      if (VERSION.SDK_INT < 21) {
         this.a(var2);
      }

      if (android.support.a.a.e.a(this.c) == null) {
         android.support.a.a.e.a(this.c, new ArrayList());
         this.c.d = new android.support.v4.g.a();
      }

      android.support.a.a.e.a(this.c).add(var2);
      this.c.d.put(var2, var1);
   }

   public void applyTheme(Theme var1) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1);
      }

   }

   public boolean canApplyTheme() {
      boolean var1;
      if (this.b != null) {
         var1 = android.support.v4.d.a.a.d(this.b);
      } else {
         var1 = false;
      }

      return var1;
   }

   public void draw(Canvas var1) {
      if (this.b != null) {
         this.b.draw(var1);
      } else {
         this.c.b.draw(var1);
         if (this.c.c.isStarted()) {
            this.invalidateSelf();
         }
      }

   }

   public int getAlpha() {
      int var1;
      if (this.b != null) {
         var1 = android.support.v4.d.a.a.c(this.b);
      } else {
         var1 = this.c.b.getAlpha();
      }

      return var1;
   }

   public int getChangingConfigurations() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getChangingConfigurations();
      } else {
         var1 = super.getChangingConfigurations() | this.c.a;
      }

      return var1;
   }

   public ConstantState getConstantState() {
      f var1;
      if (this.b != null) {
         var1 = new f(this.b.getConstantState());
      } else {
         var1 = null;
      }

      return var1;
   }

   public int getIntrinsicHeight() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getIntrinsicHeight();
      } else {
         var1 = this.c.b.getIntrinsicHeight();
      }

      return var1;
   }

   public int getIntrinsicWidth() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getIntrinsicWidth();
      } else {
         var1 = this.c.b.getIntrinsicWidth();
      }

      return var1;
   }

   public int getOpacity() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getOpacity();
      } else {
         var1 = this.c.b.getOpacity();
      }

      return var1;
   }

   public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3) {
      this.inflate(var1, var2, var3, (Theme)null);
   }

   public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1, var2, var3, var4);
      } else {
         int var5 = var2.getEventType();

         for(int var6 = var2.getDepth(); var5 != 1 && (var2.getDepth() >= var6 + 1 || var5 != 3); var5 = var2.next()) {
            if (var5 == 2) {
               String var7 = var2.getName();
               if ("animated-vector".equals(var7)) {
                  TypedArray var9 = k.a(var1, var4, var3, android.support.a.a.a.e);
                  var5 = var9.getResourceId(0, 0);
                  if (var5 != 0) {
                     l var8 = l.a(var1, var5, var4);
                     var8.a(false);
                     var8.setCallback(this.a);
                     if (this.c.b != null) {
                        this.c.b.setCallback((Callback)null);
                     }

                     this.c.b = var8;
                  }

                  var9.recycle();
               } else if ("target".equals(var7)) {
                  TypedArray var10 = var1.obtainAttributes(var3, android.support.a.a.a.f);
                  var7 = var10.getString(0);
                  var5 = var10.getResourceId(1, 0);
                  if (var5 != 0) {
                     if (this.d == null) {
                        var10.recycle();
                        throw new IllegalStateException("Context can't be null when inflating animators");
                     }

                     this.a(var7, AnimatorInflater.loadAnimator(this.d, var5));
                  }

                  var10.recycle();
               }
            }
         }

         this.c.a();
      }

   }

   public boolean isAutoMirrored() {
      boolean var1;
      if (this.b != null) {
         var1 = android.support.v4.d.a.a.b(this.b);
      } else {
         var1 = this.c.b.isAutoMirrored();
      }

      return var1;
   }

   public boolean isRunning() {
      boolean var1;
      if (this.b != null) {
         var1 = ((AnimatedVectorDrawable)this.b).isRunning();
      } else {
         var1 = this.c.c.isRunning();
      }

      return var1;
   }

   public boolean isStateful() {
      boolean var1;
      if (this.b != null) {
         var1 = this.b.isStateful();
      } else {
         var1 = this.c.b.isStateful();
      }

      return var1;
   }

   public Drawable mutate() {
      if (this.b != null) {
         this.b.mutate();
      }

      return this;
   }

   protected void onBoundsChange(Rect var1) {
      if (this.b != null) {
         this.b.setBounds(var1);
      } else {
         this.c.b.setBounds(var1);
      }

   }

   protected boolean onLevelChange(int var1) {
      boolean var2;
      if (this.b != null) {
         var2 = this.b.setLevel(var1);
      } else {
         var2 = this.c.b.setLevel(var1);
      }

      return var2;
   }

   protected boolean onStateChange(int[] var1) {
      boolean var2;
      if (this.b != null) {
         var2 = this.b.setState(var1);
      } else {
         var2 = this.c.b.setState(var1);
      }

      return var2;
   }

   public void setAlpha(int var1) {
      if (this.b != null) {
         this.b.setAlpha(var1);
      } else {
         this.c.b.setAlpha(var1);
      }

   }

   public void setAutoMirrored(boolean var1) {
      if (this.b != null) {
         this.b.setAutoMirrored(var1);
      } else {
         this.c.b.setAutoMirrored(var1);
      }

   }

   public void setColorFilter(ColorFilter var1) {
      if (this.b != null) {
         this.b.setColorFilter(var1);
      } else {
         this.c.b.setColorFilter(var1);
      }

   }

   public void setTint(int var1) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1);
      } else {
         this.c.b.setTint(var1);
      }

   }

   public void setTintList(ColorStateList var1) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1);
      } else {
         this.c.b.setTintList(var1);
      }

   }

   public void setTintMode(Mode var1) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1);
      } else {
         this.c.b.setTintMode(var1);
      }

   }

   public boolean setVisible(boolean var1, boolean var2) {
      if (this.b != null) {
         var1 = this.b.setVisible(var1, var2);
      } else {
         this.c.b.setVisible(var1, var2);
         var1 = super.setVisible(var1, var2);
      }

      return var1;
   }

   public void start() {
      if (this.b != null) {
         ((AnimatedVectorDrawable)this.b).start();
      } else if (!this.c.c.isStarted()) {
         this.c.c.start();
         this.invalidateSelf();
      }

   }

   public void stop() {
      if (this.b != null) {
         ((AnimatedVectorDrawable)this.b).stop();
      } else {
         this.c.c.end();
      }

   }
}
