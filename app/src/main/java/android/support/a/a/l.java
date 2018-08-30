package android.support.a.a;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class l extends k {
   static final Mode a;
   private r c;
   private PorterDuffColorFilter d;
   private ColorFilter e;
   private boolean f;
   private boolean g = true;
   private ConstantState h;
   private final float[] i = new float[9];
   private final Matrix j = new Matrix();
   private final Rect k = new Rect();

   static {
      a = Mode.SRC_IN;
   }

   l() {
      this.c = new r();
   }

   l(r var1) {
      this.c = var1;
      this.d = this.a(this.d, var1.c, var1.d);
   }

   static int a(int var0, float var1) {
      return (int)((float)Color.alpha(var0) * var1) << 24 | 16777215 & var0;
   }

   private static Mode a(int var0, Mode var1) {
      Mode var2 = var1;
      switch(var0) {
      case 3:
         var2 = Mode.SRC_OVER;
      case 4:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 13:
         break;
      case 5:
         var2 = Mode.SRC_IN;
         break;
      case 9:
         var2 = Mode.SRC_ATOP;
         break;
      case 14:
         var2 = Mode.MULTIPLY;
         break;
      case 15:
         var2 = Mode.SCREEN;
         break;
      case 16:
         var2 = var1;
         if (VERSION.SDK_INT >= 11) {
            var2 = Mode.ADD;
         }
         break;
      default:
         var2 = var1;
      }

      return var2;
   }

   @SuppressLint({"NewApi"})
   public static l a(Resources param0, int param1, Theme param2) {
      // $FF: Couldn't be decompiled
   }

   @SuppressLint({"NewApi"})
   public static l a(Resources var0, XmlPullParser var1, AttributeSet var2, Theme var3) {
      l var4 = new l();
      var4.inflate(var0, var1, var2, var3);
      return var4;
   }

   private void a(TypedArray var1, XmlPullParser var2) {
      r var3 = this.c;
      q var4 = var3.b;
      var3.d = a(android.support.a.a.j.a(var1, var2, "tintMode", 6, -1), Mode.SRC_IN);
      ColorStateList var5 = var1.getColorStateList(1);
      if (var5 != null) {
         var3.c = var5;
      }

      var3.e = android.support.a.a.j.a(var1, var2, "autoMirrored", 5, var3.e);
      var4.d = android.support.a.a.j.a(var1, var2, "viewportWidth", 7, var4.d);
      var4.e = android.support.a.a.j.a(var1, var2, "viewportHeight", 8, var4.e);
      if (var4.d <= 0.0F) {
         throw new XmlPullParserException(var1.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
      } else if (var4.e <= 0.0F) {
         throw new XmlPullParserException(var1.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
      } else {
         var4.b = var1.getDimension(3, var4.b);
         var4.c = var1.getDimension(2, var4.c);
         if (var4.b <= 0.0F) {
            throw new XmlPullParserException(var1.getPositionDescription() + "<vector> tag requires width > 0");
         } else if (var4.c <= 0.0F) {
            throw new XmlPullParserException(var1.getPositionDescription() + "<vector> tag requires height > 0");
         } else {
            var4.setAlpha(android.support.a.a.j.a(var1, var2, "alpha", 4, var4.getAlpha()));
            String var6 = var1.getString(0);
            if (var6 != null) {
               var4.g = var6;
               var4.h.put(var6, var4);
            }

         }
      }
   }

   @SuppressLint({"NewApi"})
   private boolean a() {
      boolean var1 = true;
      boolean var2 = false;
      if (VERSION.SDK_INT >= 17) {
         if (this.isAutoMirrored() && this.getLayoutDirection() == 1) {
            var2 = var1;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   private void b(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      r var5 = this.c;
      q var6 = var5.b;
      Stack var7 = new Stack();
      var7.push(var6.a);
      int var8 = var2.getEventType();
      int var9 = var2.getDepth();

      boolean var10;
      boolean var18;
      for(var10 = true; var8 != 1 && (var2.getDepth() >= var9 + 1 || var8 != 3); var10 = var18) {
         if (var8 == 2) {
            String var11 = var2.getName();
            o var12 = (o)var7.peek();
            if ("path".equals(var11)) {
               n var15 = new n();
               var15.a(var1, var3, var4, var2);
               var12.a.add(var15);
               if (var15.getPathName() != null) {
                  var6.h.put(var15.getPathName(), var15);
               }

               var10 = false;
               int var13 = var5.a;
               var5.a = var15.o | var13;
            } else if ("clip-path".equals(var11)) {
               m var16 = new m();
               var16.a(var1, var3, var4, var2);
               var12.a.add(var16);
               if (var16.getPathName() != null) {
                  var6.h.put(var16.getPathName(), var16);
               }

               var5.a |= var16.o;
            } else if ("group".equals(var11)) {
               o var17 = new o();
               var17.a(var1, var3, var4, var2);
               var12.a.add(var17);
               var7.push(var17);
               if (var17.getGroupName() != null) {
                  var6.h.put(var17.getGroupName(), var17);
               }

               var5.a |= var17.c;
            }

            var18 = var10;
         } else {
            var18 = var10;
            if (var8 == 3) {
               var18 = var10;
               if ("group".equals(var2.getName())) {
                  var7.pop();
                  var18 = var10;
               }
            }
         }

         var8 = var2.next();
      }

      if (var10) {
         StringBuffer var14 = new StringBuffer();
         if (var14.length() > 0) {
            var14.append(" or ");
         }

         var14.append("path");
         throw new XmlPullParserException("no " + var14 + " defined");
      }
   }

   PorterDuffColorFilter a(PorterDuffColorFilter var1, ColorStateList var2, Mode var3) {
      if (var2 != null && var3 != null) {
         var1 = new PorterDuffColorFilter(var2.getColorForState(this.getState(), 0), var3);
      } else {
         var1 = null;
      }

      return var1;
   }

   Object a(String var1) {
      return this.c.b.h.get(var1);
   }

   void a(boolean var1) {
      this.g = var1;
   }

   public boolean canApplyTheme() {
      if (this.b != null) {
         android.support.v4.d.a.a.d(this.b);
      }

      return false;
   }

   public void draw(Canvas var1) {
      if (this.b != null) {
         this.b.draw(var1);
      } else {
         this.copyBounds(this.k);
         if (this.k.width() > 0 && this.k.height() > 0) {
            Object var2;
            if (this.e == null) {
               var2 = this.d;
            } else {
               var2 = this.e;
            }

            var1.getMatrix(this.j);
            this.j.getValues(this.i);
            float var3 = Math.abs(this.i[0]);
            float var4 = Math.abs(this.i[4]);
            float var5 = Math.abs(this.i[1]);
            float var6 = Math.abs(this.i[3]);
            if (var5 != 0.0F || var6 != 0.0F) {
               var4 = 1.0F;
               var3 = 1.0F;
            }

            int var7 = (int)(var3 * (float)this.k.width());
            int var8 = (int)(var4 * (float)this.k.height());
            var7 = Math.min(2048, var7);
            int var9 = Math.min(2048, var8);
            if (var7 > 0 && var9 > 0) {
               var8 = var1.save();
               var1.translate((float)this.k.left, (float)this.k.top);
               if (this.a()) {
                  var1.translate((float)this.k.width(), 0.0F);
                  var1.scale(-1.0F, 1.0F);
               }

               this.k.offsetTo(0, 0);
               this.c.b(var7, var9);
               if (!this.g) {
                  this.c.a(var7, var9);
               } else if (!this.c.b()) {
                  this.c.a(var7, var9);
                  this.c.c();
               }

               this.c.a(var1, (ColorFilter)var2, this.k);
               var1.restoreToCount(var8);
            }
         }
      }

   }

   public int getAlpha() {
      int var1;
      if (this.b != null) {
         var1 = android.support.v4.d.a.a.c(this.b);
      } else {
         var1 = this.c.b.getRootAlpha();
      }

      return var1;
   }

   public int getChangingConfigurations() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getChangingConfigurations();
      } else {
         var1 = super.getChangingConfigurations() | this.c.getChangingConfigurations();
      }

      return var1;
   }

   public ConstantState getConstantState() {
      Object var1;
      if (this.b != null) {
         var1 = new s(this.b.getConstantState());
      } else {
         this.c.a = this.getChangingConfigurations();
         var1 = this.c;
      }

      return (ConstantState)var1;
   }

   public int getIntrinsicHeight() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getIntrinsicHeight();
      } else {
         var1 = (int)this.c.b.c;
      }

      return var1;
   }

   public int getIntrinsicWidth() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getIntrinsicWidth();
      } else {
         var1 = (int)this.c.b.b;
      }

      return var1;
   }

   public int getOpacity() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getOpacity();
      } else {
         var1 = -3;
      }

      return var1;
   }

   @SuppressLint({"NewApi"})
   public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3) {
      if (this.b != null) {
         this.b.inflate(var1, var2, var3);
      } else {
         this.inflate(var1, var2, var3, (Theme)null);
      }

   }

   public void inflate(Resources var1, XmlPullParser var2, AttributeSet var3, Theme var4) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1, var2, var3, var4);
      } else {
         r var5 = this.c;
         var5.b = new q();
         TypedArray var6 = a(var1, var4, var3, android.support.a.a.a.a);
         this.a(var6, var2);
         var6.recycle();
         var5.a = this.getChangingConfigurations();
         var5.k = true;
         this.b(var1, var2, var3, var4);
         this.d = this.a(this.d, var5.c, var5.d);
      }

   }

   public void invalidateSelf() {
      if (this.b != null) {
         this.b.invalidateSelf();
      } else {
         super.invalidateSelf();
      }

   }

   public boolean isAutoMirrored() {
      boolean var1;
      if (this.b != null) {
         var1 = android.support.v4.d.a.a.b(this.b);
      } else {
         var1 = this.c.e;
      }

      return var1;
   }

   public boolean isStateful() {
      boolean var1;
      if (this.b != null) {
         var1 = this.b.isStateful();
      } else if (!super.isStateful() && (this.c == null || this.c.c == null || !this.c.c.isStateful())) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public Drawable mutate() {
      if (this.b != null) {
         this.b.mutate();
      } else if (!this.f && super.mutate() == this) {
         this.c = new r(this.c);
         this.f = true;
      }

      return this;
   }

   protected void onBoundsChange(Rect var1) {
      if (this.b != null) {
         this.b.setBounds(var1);
      }

   }

   protected boolean onStateChange(int[] var1) {
      boolean var2;
      if (this.b != null) {
         var2 = this.b.setState(var1);
      } else {
         r var3 = this.c;
         if (var3.c != null && var3.d != null) {
            this.d = this.a(this.d, var3.c, var3.d);
            this.invalidateSelf();
            var2 = true;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public void scheduleSelf(Runnable var1, long var2) {
      if (this.b != null) {
         this.b.scheduleSelf(var1, var2);
      } else {
         super.scheduleSelf(var1, var2);
      }

   }

   public void setAlpha(int var1) {
      if (this.b != null) {
         this.b.setAlpha(var1);
      } else if (this.c.b.getRootAlpha() != var1) {
         this.c.b.setRootAlpha(var1);
         this.invalidateSelf();
      }

   }

   public void setAutoMirrored(boolean var1) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1);
      } else {
         this.c.e = var1;
      }

   }

   public void setColorFilter(ColorFilter var1) {
      if (this.b != null) {
         this.b.setColorFilter(var1);
      } else {
         this.e = var1;
         this.invalidateSelf();
      }

   }

   @SuppressLint({"NewApi"})
   public void setTint(int var1) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1);
      } else {
         this.setTintList(ColorStateList.valueOf(var1));
      }

   }

   public void setTintList(ColorStateList var1) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1);
      } else {
         r var2 = this.c;
         if (var2.c != var1) {
            var2.c = var1;
            this.d = this.a(this.d, var1, var2.d);
            this.invalidateSelf();
         }
      }

   }

   public void setTintMode(Mode var1) {
      if (this.b != null) {
         android.support.v4.d.a.a.a(this.b, var1);
      } else {
         r var2 = this.c;
         if (var2.d != var1) {
            var2.d = var1;
            this.d = this.a(this.d, var2.c, var1);
            this.invalidateSelf();
         }
      }

   }

   public boolean setVisible(boolean var1, boolean var2) {
      if (this.b != null) {
         var1 = this.b.setVisible(var1, var2);
      } else {
         var1 = super.setVisible(var1, var2);
      }

      return var1;
   }

   public void unscheduleSelf(Runnable var1) {
      if (this.b != null) {
         this.b.unscheduleSelf(var1);
      } else {
         super.unscheduleSelf(var1);
      }

   }
}
