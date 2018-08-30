package android.support.v4.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.Resources.NotFoundException;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Animation.AnimationListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class ah extends ae implements android.support.v4.view.as {
   static final Interpolator D;
   static final Interpolator E;
   static final Interpolator F;
   static final Interpolator G;
   static boolean a;
   static final boolean b;
   static Field q;
   SparseArray A = null;
   ArrayList B;
   Runnable C = new ai(this);
   private CopyOnWriteArrayList H;
   ArrayList c;
   boolean d;
   ArrayList e;
   ArrayList f;
   ArrayList g;
   ArrayList h;
   ArrayList i;
   ArrayList j;
   ArrayList k;
   ArrayList l;
   int m = 0;
   ad n;
   ab o;
   p p;
   boolean r;
   boolean s;
   boolean t;
   String u;
   boolean v;
   ArrayList w;
   ArrayList x;
   ArrayList y;
   Bundle z = null;

   static {
      boolean var0 = false;
      a = false;
      if (VERSION.SDK_INT >= 11) {
         var0 = true;
      }

      b = var0;
      q = null;
      D = new DecelerateInterpolator(2.5F);
      E = new DecelerateInterpolator(1.5F);
      F = new AccelerateInterpolator(2.5F);
      G = new AccelerateInterpolator(1.5F);
   }

   private int a(ArrayList var1, ArrayList var2, int var3, int var4, android.support.v4.g.c var5) {
      int var6 = var4 - 1;

      int var7;
      for(var7 = var4; var6 >= var3; --var6) {
         h var8 = (h)var1.get(var6);
         boolean var9 = (Boolean)var2.get(var6);
         boolean var10;
         if (var8.d() && !var8.a(var1, var6 + 1, var4)) {
            var10 = true;
         } else {
            var10 = false;
         }

         if (var10) {
            if (this.B == null) {
               this.B = new ArrayList();
            }

            ap var11 = new ap(var8, var9);
            this.B.add(var11);
            var8.a((u)var11);
            if (var9) {
               var8.c();
            } else {
               var8.b(false);
            }

            --var7;
            if (var6 != var7) {
               var1.remove(var6);
               var1.add(var7, var8);
            }

            this.b(var5);
         }
      }

      return var7;
   }

   static Animation a(Context var0, float var1, float var2) {
      AlphaAnimation var3 = new AlphaAnimation(var1, var2);
      var3.setInterpolator(E);
      var3.setDuration(220L);
      return var3;
   }

   static Animation a(Context var0, float var1, float var2, float var3, float var4) {
      AnimationSet var7 = new AnimationSet(false);
      ScaleAnimation var5 = new ScaleAnimation(var1, var2, var1, var2, 1, 0.5F, 1, 0.5F);
      var5.setInterpolator(D);
      var5.setDuration(220L);
      var7.addAnimation(var5);
      AlphaAnimation var6 = new AlphaAnimation(var3, var4);
      var6.setInterpolator(E);
      var6.setDuration(220L);
      var7.addAnimation(var6);
      return var7;
   }

   // $FF: synthetic method
   static void a(ah var0) {
      var0.v();
   }

   // $FF: synthetic method
   static void a(ah var0, h var1, boolean var2, boolean var3, boolean var4) {
      var0.a(var1, var2, var3, var4);
   }

   private void a(h var1, boolean var2, boolean var3, boolean var4) {
      ArrayList var5 = new ArrayList(1);
      ArrayList var6 = new ArrayList(1);
      var5.add(var1);
      var6.add(var2);
      b(var5, var6, 0, 1);
      if (var3) {
         aw.a(this, var5, var6, 0, 1, true);
      }

      if (var4) {
         this.a(this.m, true);
      }

      if (this.e != null) {
         int var7 = this.e.size();

         for(int var8 = 0; var8 < var7; ++var8) {
            p var9 = (p)this.e.get(var8);
            if (var9 != null && var9.P != null && var9.X && var1.b(var9.F)) {
               if (VERSION.SDK_INT >= 11 && var9.Z > 0.0F) {
                  var9.P.setAlpha(var9.Z);
               }

               if (var4) {
                  var9.Z = 0.0F;
               } else {
                  var9.Z = -1.0F;
                  var9.X = false;
               }
            }
         }
      }

   }

   private void a(android.support.v4.g.c var1) {
      int var2 = var1.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         p var4 = (p)var1.b(var3);
         if (!var4.t) {
            View var5 = var4.getView();
            if (VERSION.SDK_INT < 11) {
               var4.getView().setVisibility(4);
            } else {
               var4.Z = var5.getAlpha();
               var5.setAlpha(0.0F);
            }
         }
      }

   }

   private void a(RuntimeException var1) {
      Log.e("FragmentManager", var1.getMessage());
      Log.e("FragmentManager", "Activity state:");
      PrintWriter var2 = new PrintWriter(new android.support.v4.g.g("FragmentManager"));
      if (this.n != null) {
         try {
            this.n.a("  ", (FileDescriptor)null, var2, new String[0]);
         } catch (Exception var4) {
            Log.e("FragmentManager", "Failed dumping state", var4);
         }
      } else {
         try {
            this.a((String)"  ", (FileDescriptor)null, (PrintWriter)var2, (String[])(new String[0]));
         } catch (Exception var3) {
            Log.e("FragmentManager", "Failed dumping state", var3);
         }
      }

      throw var1;
   }

   private void a(ArrayList var1, ArrayList var2) {
      int var3;
      if (this.B == null) {
         var3 = 0;
      } else {
         var3 = this.B.size();
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         ap var5 = (ap)this.B.get(var4);
         int var6;
         if (var1 != null && !ap.a(var5)) {
            var6 = var1.indexOf(ap.b(var5));
            if (var6 != -1 && (Boolean)var2.get(var6)) {
               var5.e();
               continue;
            }
         }

         int var7;
         label53: {
            if (!var5.c()) {
               var7 = var4;
               var6 = var3;
               if (var1 == null) {
                  break label53;
               }

               var7 = var4;
               var6 = var3;
               if (!ap.b(var5).a(var1, 0, var1.size())) {
                  break label53;
               }
            }

            this.B.remove(var4);
            var7 = var4 - 1;
            var6 = var3 - 1;
            if (var1 != null && !ap.a(var5)) {
               var3 = var1.indexOf(ap.b(var5));
               if (var3 != -1 && (Boolean)var2.get(var3)) {
                  var5.e();
                  var4 = var7;
                  var3 = var6;
                  continue;
               }
            }

            var5.d();
         }

         var4 = var7;
         var3 = var6;
      }

   }

   private void a(ArrayList var1, ArrayList var2, int var3, int var4) {
      boolean var5 = ((h)var1.get(var3)).u;
      if (this.y == null) {
         this.y = new ArrayList();
      } else {
         this.y.clear();
      }

      if (this.f != null) {
         this.y.addAll(this.f);
      }

      int var6 = var3;

      boolean var7;
      h var8;
      for(var7 = false; var6 < var4; ++var6) {
         var8 = (h)var1.get(var6);
         if (!(Boolean)var2.get(var6)) {
            var8.a(this.y);
         } else {
            var8.b(this.y);
         }

         if (!var7 && !var8.j) {
            var7 = false;
         } else {
            var7 = true;
         }
      }

      this.y.clear();
      if (!var5) {
         aw.a(this, var1, var2, var3, var4, false);
      }

      b(var1, var2, var3, var4);
      int var9;
      if (var5) {
         android.support.v4.g.c var10 = new android.support.v4.g.c();
         this.b(var10);
         var9 = this.a(var1, var2, var3, var4, var10);
         this.a(var10);
      } else {
         var9 = var4;
      }

      var6 = var3;
      if (var9 != var3) {
         var6 = var3;
         if (var5) {
            aw.a(this, var1, var2, var3, var9, true);
            this.a(this.m, true);
            var6 = var3;
         }
      }

      for(; var6 < var4; ++var6) {
         var8 = (h)var1.get(var6);
         if ((Boolean)var2.get(var6) && var8.n >= 0) {
            this.c(var8.n);
            var8.n = -1;
         }
      }

      if (var7) {
         this.f();
      }

   }

   static boolean a(View var0, Animation var1) {
      boolean var2;
      if (VERSION.SDK_INT >= 19 && android.support.v4.view.bz.f(var0) == 0 && android.support.v4.view.bz.u(var0) && a(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   static boolean a(Animation var0) {
      boolean var1 = false;
      boolean var2;
      if (var0 instanceof AlphaAnimation) {
         var2 = true;
      } else {
         var2 = var1;
         if (var0 instanceof AnimationSet) {
            List var4 = ((AnimationSet)var0).getAnimations();
            int var3 = 0;

            while(true) {
               var2 = var1;
               if (var3 >= var4.size()) {
                  break;
               }

               if (var4.get(var3) instanceof AlphaAnimation) {
                  var2 = true;
                  break;
               }

               ++var3;
            }
         }
      }

      return var2;
   }

   private boolean a(String var1, int var2, int var3) {
      this.d();
      this.c(true);
      boolean var4 = this.a(this.w, this.x, var1, var2, var3);
      if (var4) {
         this.d = true;

         try {
            this.b(this.w, this.x);
         } finally {
            this.w();
         }
      }

      this.e();
      return var4;
   }

   public static int b(int var0, boolean var1) {
      byte var2 = -1;
      byte var3;
      switch(var0) {
      case 4097:
         if (var1) {
            var3 = 1;
         } else {
            var3 = 2;
         }
         break;
      case 4099:
         if (var1) {
            var3 = 5;
         } else {
            var3 = 6;
         }
         break;
      case 8194:
         if (var1) {
            var3 = 3;
         } else {
            var3 = 4;
         }
         break;
      default:
         var3 = var2;
      }

      return var3;
   }

   private void b(android.support.v4.g.c var1) {
      if (this.m >= 1) {
         int var2 = Math.min(this.m, 4);
         int var3;
         if (this.f == null) {
            var3 = 0;
         } else {
            var3 = this.f.size();
         }

         for(int var4 = 0; var4 < var3; ++var4) {
            p var5 = (p)this.f.get(var4);
            if (var5.k < var2) {
               this.a(var5, var2, var5.m(), var5.n(), false);
               if (var5.P != null && !var5.H && var5.X) {
                  var1.add(var5);
               }
            }
         }
      }

   }

   private void b(View var1, Animation var2) {
      if (var1 != null && var2 != null && a(var1, var2)) {
         AnimationListener var3;
         try {
            if (q == null) {
               q = Animation.class.getDeclaredField("mListener");
               q.setAccessible(true);
            }

            var3 = (AnimationListener)q.get(var2);
         } catch (NoSuchFieldException var4) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", var4);
            var3 = null;
         } catch (IllegalAccessException var5) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", var5);
            var3 = null;
         }

         android.support.v4.view.bz.a(var1, 2, (Paint)null);
         var2.setAnimationListener(new ak(var1, var2, var3));
      }

   }

   private void b(ArrayList var1, ArrayList var2) {
      int var3 = 0;
      if (var1 != null && !var1.isEmpty()) {
         if (var2 == null || var1.size() != var2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
         }

         this.a(var1, var2);
         int var4 = var1.size();

         int var5;
         for(var5 = 0; var3 < var4; ++var3) {
            if (!((h)var1.get(var3)).u) {
               if (var5 != var3) {
                  this.a(var1, var2, var5, var3);
               }

               int var6 = var3 + 1;
               var5 = var6;
               if ((Boolean)var2.get(var3)) {
                  while(true) {
                     var5 = var6;
                     if (var6 >= var4) {
                        break;
                     }

                     var5 = var6;
                     if (!(Boolean)var2.get(var6)) {
                        break;
                     }

                     var5 = var6;
                     if (((h)var1.get(var6)).u) {
                        break;
                     }

                     ++var6;
                  }
               }

               this.a(var1, var2, var3, var5);
               var6 = var5 - 1;
               var5 = var5;
               var3 = var6;
            }
         }

         if (var5 != var4) {
            this.a(var1, var2, var5, var4);
         }
      }

   }

   private static void b(ArrayList var0, ArrayList var1, int var2, int var3) {
      for(; var2 < var3; ++var2) {
         h var4 = (h)var0.get(var2);
         if ((Boolean)var1.get(var2)) {
            var4.a(-1);
            boolean var5;
            if (var2 == var3 - 1) {
               var5 = true;
            } else {
               var5 = false;
            }

            var4.b(var5);
         } else {
            var4.a(1);
            var4.c();
         }
      }

   }

   private void c(boolean var1) {
      if (this.d) {
         throw new IllegalStateException("FragmentManager is already executing transactions");
      } else if (Looper.myLooper() != this.n.j().getLooper()) {
         throw new IllegalStateException("Must be called from main thread of fragment host");
      } else {
         if (!var1) {
            this.u();
         }

         if (this.w == null) {
            this.w = new ArrayList();
            this.x = new ArrayList();
         }

         this.d = true;

         try {
            this.a((ArrayList)null, (ArrayList)null);
         } finally {
            this.d = false;
         }

      }
   }

   private boolean c(ArrayList param1, ArrayList param2) {
      // $FF: Couldn't be decompiled
   }

   public static int d(int var0) {
      byte var1 = 0;
      short var2;
      switch(var0) {
      case 4097:
         var2 = 8194;
         break;
      case 4099:
         var2 = 4099;
         break;
      case 8194:
         var2 = 4097;
         break;
      default:
         var2 = var1;
      }

      return var2;
   }

   private p n(p var1) {
      ViewGroup var2 = var1.O;
      View var3 = var1.P;
      if (var2 != null && var3 != null) {
         int var4 = this.f.indexOf(var1) - 1;

         while(true) {
            if (var4 < 0) {
               var1 = null;
               break;
            }

            p var5 = (p)this.f.get(var4);
            if (var5.O == var2) {
               var1 = var5;
               if (var5.P != null) {
                  break;
               }
            }

            --var4;
         }
      } else {
         var1 = null;
      }

      return var1;
   }

   private void u() {
      if (this.s) {
         throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
      } else if (this.u != null) {
         throw new IllegalStateException("Can not perform this action inside of " + this.u);
      }
   }

   private void v() {
      // $FF: Couldn't be decompiled
   }

   private void w() {
      this.d = false;
      this.x.clear();
      this.w.clear();
   }

   private void x() {
      if (this.B != null) {
         while(!this.B.isEmpty()) {
            ((ap)this.B.remove(0)).d();
         }
      }

   }

   private void y() {
      int var1;
      if (this.e == null) {
         var1 = 0;
      } else {
         var1 = this.e.size();
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         p var3 = (p)this.e.get(var2);
         if (var3 != null && var3.r() != null) {
            int var4 = var3.s();
            View var5 = var3.r();
            var3.a((View)null);
            Animation var6 = var5.getAnimation();
            if (var6 != null) {
               var6.cancel();
            }

            this.a(var3, var4, 0, 0, false);
         }
      }

   }

   public int a(h param1) {
      // $FF: Couldn't be decompiled
   }

   public av a() {
      return new h(this);
   }

   public p a(Bundle var1, String var2) {
      int var3 = var1.getInt(var2, -1);
      p var5;
      if (var3 == -1) {
         var5 = null;
      } else {
         if (var3 >= this.e.size()) {
            this.a((RuntimeException)(new IllegalStateException("Fragment no longer exists for key " + var2 + ": index " + var3)));
         }

         p var4 = (p)this.e.get(var3);
         var5 = var4;
         if (var4 == null) {
            this.a((RuntimeException)(new IllegalStateException("Fragment no longer exists for key " + var2 + ": index " + var3)));
            var5 = var4;
         }
      }

      return var5;
   }

   public p a(String var1) {
      int var2;
      p var3;
      if (this.f != null && var1 != null) {
         for(var2 = this.f.size() - 1; var2 >= 0; --var2) {
            var3 = (p)this.f.get(var2);
            if (var3 != null && var1.equals(var3.G)) {
               return var3;
            }
         }
      }

      if (this.e != null && var1 != null) {
         for(var2 = this.e.size() - 1; var2 >= 0; --var2) {
            p var4 = (p)this.e.get(var2);
            if (var4 != null) {
               var3 = var4;
               if (var1.equals(var4.G)) {
                  return var3;
               }
            }
         }
      }

      var3 = null;
      return var3;
   }

   public View a(View var1, String var2, Context var3, AttributeSet var4) {
      if (!"fragment".equals(var2)) {
         var1 = null;
      } else {
         String var5 = var4.getAttributeValue((String)null, "class");
         TypedArray var11 = var3.obtainStyledAttributes(var4, am.a);
         if (var5 == null) {
            var5 = var11.getString(0);
         }

         int var6 = var11.getResourceId(1, -1);
         String var7 = var11.getString(2);
         var11.recycle();
         if (!android.support.v4.b.p.a(this.n.i(), var5)) {
            var1 = null;
         } else {
            int var8;
            if (var1 != null) {
               var8 = var1.getId();
            } else {
               var8 = 0;
            }

            if (var8 == -1 && var6 == -1 && var7 == null) {
               throw new IllegalArgumentException(var4.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + var5);
            }

            p var12;
            if (var6 != -1) {
               var12 = this.b(var6);
            } else {
               var12 = null;
            }

            p var10 = var12;
            if (var12 == null) {
               var10 = var12;
               if (var7 != null) {
                  var10 = this.a(var7);
               }
            }

            var12 = var10;
            if (var10 == null) {
               var12 = var10;
               if (var8 != -1) {
                  var12 = this.b(var8);
               }
            }

            if (a) {
               Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(var6) + " fname=" + var5 + " existing=" + var12);
            }

            if (var12 == null) {
               var10 = android.support.v4.b.p.instantiate(var3, var5);
               var10.v = true;
               int var9;
               if (var6 != 0) {
                  var9 = var6;
               } else {
                  var9 = var8;
               }

               var10.E = var9;
               var10.F = var8;
               var10.G = var7;
               var10.w = true;
               var10.z = this;
               var10.A = this.n;
               var10.onInflate(this.n.i(), var4, var10.l);
               this.a(var10, true);
            } else {
               if (var12.w) {
                  throw new IllegalArgumentException(var4.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(var6) + ", tag " + var7 + ", or parent id 0x" + Integer.toHexString(var8) + " with another fragment for " + var5);
               }

               var12.w = true;
               var12.A = this.n;
               if (!var12.K) {
                  var12.onInflate(this.n.i(), var4, var12.l);
               }

               var10 = var12;
            }

            if (this.m < 1 && var10.v) {
               this.a(var10, 1, 0, 0, false);
            } else {
               this.b(var10);
            }

            if (var10.P == null) {
               throw new IllegalStateException("Fragment " + var5 + " did not create a view.");
            }

            if (var6 != 0) {
               var10.P.setId(var6);
            }

            if (var10.P.getTag() == null) {
               var10.P.setTag(var7);
            }

            var1 = var10.P;
         }
      }

      return var1;
   }

   Animation a(p var1, int var2, boolean var3, int var4) {
      Animation var5 = var1.onCreateAnimation(var2, var3, var1.m());
      Animation var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         if (var1.m() != 0) {
            var5 = AnimationUtils.loadAnimation(this.n.i(), var1.m());
            var6 = var5;
            if (var5 != null) {
               return var6;
            }
         }

         if (var2 == 0) {
            var6 = null;
         } else {
            var2 = b(var2, var3);
            if (var2 < 0) {
               var6 = null;
            } else {
               switch(var2) {
               case 1:
                  var6 = a(this.n.i(), 1.125F, 1.0F, 0.0F, 1.0F);
                  break;
               case 2:
                  var6 = a(this.n.i(), 1.0F, 0.975F, 1.0F, 0.0F);
                  break;
               case 3:
                  var6 = a(this.n.i(), 0.975F, 1.0F, 0.0F, 1.0F);
                  break;
               case 4:
                  var6 = a(this.n.i(), 1.0F, 1.075F, 1.0F, 0.0F);
                  break;
               case 5:
                  var6 = a(this.n.i(), 0.0F, 1.0F);
                  break;
               case 6:
                  var6 = a(this.n.i(), 1.0F, 0.0F);
                  break;
               default:
                  var2 = var4;
                  if (var4 == 0) {
                     var2 = var4;
                     if (this.n.e()) {
                        var2 = this.n.f();
                     }
                  }

                  if (var2 == 0) {
                     var6 = null;
                  } else {
                     var6 = null;
                  }
               }
            }
         }
      }

      return var6;
   }

   public void a(int var1, int var2) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Bad id: " + var1);
      } else {
         this.a((an)(new ao(this, (String)null, var1, var2)), false);
      }
   }

   public void a(int param1, h param2) {
      // $FF: Couldn't be decompiled
   }

   void a(int var1, boolean var2) {
      if (this.n == null && var1 != 0) {
         throw new IllegalStateException("No activity");
      } else {
         if (var2 || var1 != this.m) {
            this.m = var1;
            if (this.e != null) {
               int var3;
               int var4;
               boolean var5;
               p var6;
               boolean var7;
               if (this.f != null) {
                  var3 = this.f.size();
                  var4 = 0;
                  var7 = false;

                  while(true) {
                     var5 = var7;
                     if (var4 >= var3) {
                        break;
                     }

                     var6 = (p)this.f.get(var4);
                     this.d(var6);
                     if (var6.T != null) {
                        var7 |= var6.T.a();
                     }

                     ++var4;
                  }
               } else {
                  var5 = false;
               }

               var3 = this.e.size();

               for(var4 = 0; var4 < var3; var5 = var7) {
                  label53: {
                     var6 = (p)this.e.get(var4);
                     if (var6 != null && (var6.u || var6.I) && !var6.X) {
                        this.d(var6);
                        if (var6.T != null) {
                           var7 = var6.T.a() | var5;
                           break label53;
                        }
                     }

                     var7 = var5;
                  }

                  ++var4;
               }

               if (!var5) {
                  this.c();
               }

               if (this.r && this.n != null && this.m == 5) {
                  this.n.d();
                  this.r = false;
               }
            }
         }

      }
   }

   public void a(Configuration var1) {
      if (this.f != null) {
         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            p var3 = (p)this.f.get(var2);
            if (var3 != null) {
               var3.a(var1);
            }
         }
      }

   }

   public void a(Bundle var1, String var2, p var3) {
      if (var3.n < 0) {
         this.a((RuntimeException)(new IllegalStateException("Fragment " + var3 + " is not currently in the FragmentManager")));
      }

      var1.putInt(var2, var3.n);
   }

   void a(Parcelable var1, aq var2) {
      if (var1 != null) {
         ar var3 = (ar)var1;
         if (var3.a != null) {
            int var5;
            int var6;
            p var7;
            at var8;
            List var9;
            if (var2 != null) {
               List var4 = var2.a();
               var9 = var2.b();
               if (var4 != null) {
                  var5 = var4.size();
               } else {
                  var5 = 0;
               }

               for(var6 = 0; var6 < var5; ++var6) {
                  var7 = (p)var4.get(var6);
                  if (a) {
                     Log.v("FragmentManager", "restoreAllState: re-attaching retained " + var7);
                  }

                  var8 = var3.a[var7.n];
                  var8.l = var7;
                  var7.m = null;
                  var7.y = 0;
                  var7.w = false;
                  var7.t = false;
                  var7.q = null;
                  if (var8.k != null) {
                     var8.k.setClassLoader(this.n.i().getClassLoader());
                     var7.m = var8.k.getSparseParcelableArray("android:view_state");
                     var7.l = var8.k;
                  }
               }
            } else {
               var9 = null;
            }

            this.e = new ArrayList(var3.a.length);
            if (this.g != null) {
               this.g.clear();
            }

            for(var5 = 0; var5 < var3.a.length; ++var5) {
               var8 = var3.a[var5];
               if (var8 == null) {
                  this.e.add((Object)null);
                  if (this.g == null) {
                     this.g = new ArrayList();
                  }

                  if (a) {
                     Log.v("FragmentManager", "restoreAllState: avail #" + var5);
                  }

                  this.g.add(var5);
               } else {
                  aq var14;
                  if (var9 != null && var5 < var9.size()) {
                     var14 = (aq)var9.get(var5);
                  } else {
                     var14 = null;
                  }

                  var7 = var8.a(this.n, this.p, var14);
                  if (a) {
                     Log.v("FragmentManager", "restoreAllState: active #" + var5 + ": " + var7);
                  }

                  this.e.add(var7);
                  var8.l = null;
               }
            }

            p var11;
            if (var2 != null) {
               List var10 = var2.a();
               if (var10 != null) {
                  var5 = var10.size();
               } else {
                  var5 = 0;
               }

               for(var6 = 0; var6 < var5; ++var6) {
                  var11 = (p)var10.get(var6);
                  if (var11.r >= 0) {
                     if (var11.r < this.e.size()) {
                        var11.q = (p)this.e.get(var11.r);
                     } else {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + var11 + " target no longer exists: " + var11.r);
                        var11.q = null;
                     }
                  }
               }
            }

            if (var3.b != null) {
               this.f = new ArrayList(var3.b.length);

               for(var5 = 0; var5 < var3.b.length; ++var5) {
                  var11 = (p)this.e.get(var3.b[var5]);
                  if (var11 == null) {
                     this.a((RuntimeException)(new IllegalStateException("No instantiated fragment for index #" + var3.b[var5])));
                  }

                  var11.t = true;
                  if (a) {
                     Log.v("FragmentManager", "restoreAllState: added #" + var5 + ": " + var11);
                  }

                  if (this.f.contains(var11)) {
                     throw new IllegalStateException("Already added!");
                  }

                  this.f.add(var11);
               }
            } else {
               this.f = null;
            }

            if (var3.c != null) {
               this.h = new ArrayList(var3.c.length);

               for(var5 = 0; var5 < var3.c.length; ++var5) {
                  h var13 = var3.c[var5].a(this);
                  if (a) {
                     Log.v("FragmentManager", "restoreAllState: back stack #" + var5 + " (index " + var13.n + "): " + var13);
                     PrintWriter var12 = new PrintWriter(new android.support.v4.g.g("FragmentManager"));
                     var13.a("  ", var12, false);
                     var12.close();
                  }

                  this.h.add(var13);
                  if (var13.n >= 0) {
                     this.a(var13.n, var13);
                  }
               }
            } else {
               this.h = null;
            }
         }
      }

   }

   public void a(ad var1, ab var2, p var3) {
      if (this.n != null) {
         throw new IllegalStateException("Already attached");
      } else {
         this.n = var1;
         this.o = var2;
         this.p = var3;
      }
   }

   public void a(an param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(p var1) {
      if (var1.R) {
         if (this.d) {
            this.v = true;
         } else {
            var1.R = false;
            this.a(var1, this.m, 0, 0, false);
         }
      }

   }

   void a(p var1, int var2, int var3, int var4, boolean var5) {
      boolean var6;
      int var7;
      label283: {
         var6 = true;
         if (var1.t) {
            var7 = var2;
            if (!var1.I) {
               break label283;
            }
         }

         var7 = var2;
         if (var2 > 1) {
            var7 = 1;
         }
      }

      int var8 = var7;
      if (var1.u) {
         var8 = var7;
         if (var7 > var1.k) {
            var8 = var1.k;
         }
      }

      var2 = var8;
      if (var1.R) {
         var2 = var8;
         if (var1.k < 4) {
            var2 = var8;
            if (var8 > 3) {
               var2 = 3;
            }
         }
      }

      if (var1.k < var2) {
         label303: {
            if (var1.v && !var1.w) {
               return;
            }

            if (var1.r() != null) {
               var1.a((View)null);
               this.a(var1, var1.s(), 0, 0, true);
            }

            label268: {
               var3 = var2;
               var7 = var2;
               var8 = var2;
               var4 = var2;
               switch(var1.k) {
               case 0:
                  if (a) {
                     Log.v("FragmentManager", "moveto CREATED: " + var1);
                  }

                  var4 = var2;
                  if (var1.l != null) {
                     var1.l.setClassLoader(this.n.i().getClassLoader());
                     var1.m = var1.l.getSparseParcelableArray("android:view_state");
                     var1.q = this.a(var1.l, "android:target_state");
                     if (var1.q != null) {
                        var1.s = var1.l.getInt("android:target_req_state", 0);
                     }

                     var1.S = var1.l.getBoolean("android:user_visible_hint", true);
                     var4 = var2;
                     if (!var1.S) {
                        var1.R = true;
                        var4 = var2;
                        if (var2 > 3) {
                           var4 = 3;
                        }
                     }
                  }

                  var1.A = this.n;
                  var1.D = this.p;
                  ah var9;
                  if (this.p != null) {
                     var9 = this.p.B;
                  } else {
                     var9 = this.n.k();
                  }

                  var1.z = var9;
                  this.a(var1, this.n.i(), false);
                  var1.N = false;
                  var1.onAttach(this.n.i());
                  if (!var1.N) {
                     throw new doException("Fragment " + var1 + " did not call through to super.onAttach()");
                  }

                  if (var1.D == null) {
                     this.n.b(var1);
                  } else {
                     var1.D.onAttachFragment(var1);
                  }

                  this.b(var1, this.n.i(), false);
                  if (!var1.K) {
                     var1.c(var1.l);
                     this.a(var1, var1.l, false);
                  } else {
                     var1.b(var1.l);
                     var1.k = 1;
                  }

                  var1.K = false;
                  var3 = var4;
                  if (var1.v) {
                     var1.P = var1.a(var1.getLayoutInflater(var1.l), (ViewGroup)null, var1.l);
                     if (var1.P != null) {
                        var1.Q = var1.P;
                        if (VERSION.SDK_INT >= 11) {
                           android.support.v4.view.bz.a(var1.P, false);
                        } else {
                           var1.P = bo.a(var1.P);
                        }

                        if (var1.H) {
                           var1.P.setVisibility(8);
                        }

                        var1.onViewCreated(var1.P, var1.l);
                        this.a(var1, var1.P, var1.l, false);
                        var3 = var4;
                     } else {
                        var1.Q = null;
                        var3 = var4;
                     }
                  }
               case 1:
                  var7 = var3;
                  if (var3 > 1) {
                     if (a) {
                        Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + var1);
                     }

                     if (!var1.v) {
                        ViewGroup var12;
                        if (var1.F != 0) {
                           if (var1.F == -1) {
                              this.a((RuntimeException)(new IllegalArgumentException("Cannot create fragment " + var1 + " for a container view with no id")));
                           }

                           ViewGroup var10 = (ViewGroup)this.o.a(var1.F);
                           var12 = var10;
                           if (var10 == null) {
                              var12 = var10;
                              if (!var1.x) {
                                 String var13;
                                 try {
                                    var13 = var1.getResources().getResourceName(var1.F);
                                 } catch (NotFoundException var11) {
                                    var13 = "unknown";
                                 }

                                 this.a((RuntimeException)(new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(var1.F) + " (" + var13 + ") for fragment " + var1)));
                                 var12 = var10;
                              }
                           }
                        } else {
                           var12 = null;
                        }

                        var1.O = var12;
                        var1.P = var1.a(var1.getLayoutInflater(var1.l), var12, var1.l);
                        if (var1.P != null) {
                           var1.Q = var1.P;
                           if (VERSION.SDK_INT >= 11) {
                              android.support.v4.view.bz.a(var1.P, false);
                           } else {
                              var1.P = bo.a(var1.P);
                           }

                           if (var12 != null) {
                              var12.addView(var1.P);
                           }

                           if (var1.H) {
                              var1.P.setVisibility(8);
                           }

                           var1.onViewCreated(var1.P, var1.l);
                           this.a(var1, var1.P, var1.l, false);
                           if (var1.P.getVisibility() == 0 && var1.O != null) {
                              var5 = var6;
                           } else {
                              var5 = false;
                           }

                           var1.X = var5;
                        } else {
                           var1.Q = null;
                        }
                     }

                     var1.d(var1.l);
                     this.b(var1, var1.l, false);
                     if (var1.P != null) {
                        var1.a(var1.l);
                     }

                     var1.l = null;
                     var7 = var3;
                  }
               case 2:
                  var8 = var7;
                  if (var7 > 2) {
                     var1.k = 3;
                     var8 = var7;
                  }
               case 3:
                  break;
               case 4:
                  break label268;
               default:
                  var8 = var2;
                  break label303;
               }

               var4 = var8;
               if (var8 > 3) {
                  if (a) {
                     Log.v("FragmentManager", "moveto STARTED: " + var1);
                  }

                  var1.d();
                  this.b(var1, false);
                  var4 = var8;
               }
            }

            var8 = var4;
            if (var4 > 4) {
               if (a) {
                  Log.v("FragmentManager", "moveto RESUMED: " + var1);
               }

               var1.e();
               this.c(var1, false);
               var1.l = null;
               var1.m = null;
               var8 = var4;
            }
         }
      } else {
         var8 = var2;
         if (var1.k > var2) {
            switch(var1.k) {
            case 5:
               if (var2 < 5) {
                  if (a) {
                     Log.v("FragmentManager", "movefrom RESUMED: " + var1);
                  }

                  var1.g();
                  this.d(var1, false);
               }
            case 4:
               if (var2 < 4) {
                  if (a) {
                     Log.v("FragmentManager", "movefrom STARTED: " + var1);
                  }

                  var1.h();
                  this.e(var1, false);
               }
            case 3:
               if (var2 < 3) {
                  if (a) {
                     Log.v("FragmentManager", "movefrom STOPPED: " + var1);
                  }

                  var1.i();
               }
            case 2:
               if (var2 < 2) {
                  if (a) {
                     Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + var1);
                  }

                  if (var1.P != null && this.n.a(var1) && var1.m == null) {
                     this.l(var1);
                  }

                  var1.j();
                  this.f(var1, false);
                  if (var1.P != null && var1.O != null) {
                     Animation var14;
                     if (this.m > 0 && !this.t && var1.P.getVisibility() == 0 && var1.Z >= 0.0F) {
                        var14 = this.a(var1, var3, false, var4);
                     } else {
                        var14 = null;
                     }

                     var1.Z = 0.0F;
                     if (var14 != null) {
                        var1.a(var1.P);
                        var1.b(var2);
                        var14.setAnimationListener(new aj(this, var1.P, var14, var1));
                        var1.P.startAnimation(var14);
                     }

                     var1.O.removeView(var1.P);
                  }

                  var1.O = null;
                  var1.P = null;
                  var1.Q = null;
               }
            case 1:
               var8 = var2;
               if (var2 < 1) {
                  if (this.t && var1.r() != null) {
                     View var15 = var1.r();
                     var1.a((View)null);
                     var15.clearAnimation();
                  }

                  if (var1.r() != null) {
                     var1.b(var2);
                     var8 = 1;
                  } else {
                     if (a) {
                        Log.v("FragmentManager", "movefrom CREATED: " + var1);
                     }

                     if (!var1.K) {
                        var1.k();
                        this.g(var1, false);
                     } else {
                        var1.k = 0;
                     }

                     var1.l();
                     this.h(var1, false);
                     var8 = var2;
                     if (!var5) {
                        if (!var1.K) {
                           this.f(var1);
                           var8 = var2;
                        } else {
                           var1.A = null;
                           var1.D = null;
                           var1.z = null;
                           var8 = var2;
                        }
                     }
                  }
               }
               break;
            default:
               var8 = var2;
            }
         }
      }

      if (var1.k != var8) {
         Log.w("FragmentManager", "moveToState: Fragment state for " + var1 + " not updated inline; " + "expected state " + var8 + " found " + var1.k);
         var1.k = var8;
      }

   }

   void a(p var1, Context var2, boolean var3) {
      if (this.p != null) {
         ae var4 = this.p.getFragmentManager();
         if (var4 instanceof ah) {
            ((ah)var4).a(var1, var2, true);
         }
      }

      if (this.H != null) {
         Iterator var6 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var5;
            do {
               if (!var6.hasNext()) {
                  return;
               }

               var5 = (android.support.v4.g.p)var6.next();
            } while(var3 && !(Boolean)var5.b);

            ((af)var5.a).a(this, var1, (Context)var2);
         }
      }
   }

   void a(p var1, Bundle var2, boolean var3) {
      if (this.p != null) {
         ae var4 = this.p.getFragmentManager();
         if (var4 instanceof ah) {
            ((ah)var4).a(var1, var2, true);
         }
      }

      if (this.H != null) {
         Iterator var6 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var5;
            do {
               if (!var6.hasNext()) {
                  return;
               }

               var5 = (android.support.v4.g.p)var6.next();
            } while(var3 && !(Boolean)var5.b);

            ((af)var5.a).a(this, var1, (Bundle)var2);
         }
      }
   }

   void a(p var1, View var2, Bundle var3, boolean var4) {
      if (this.p != null) {
         ae var5 = this.p.getFragmentManager();
         if (var5 instanceof ah) {
            ((ah)var5).a(var1, var2, var3, true);
         }
      }

      if (this.H != null) {
         Iterator var6 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var7;
            do {
               if (!var6.hasNext()) {
                  return;
               }

               var7 = (android.support.v4.g.p)var6.next();
            } while(var4 && !(Boolean)var7.b);

            ((af)var7.a).a(this, var1, var2, var3);
         }
      }
   }

   public void a(p var1, boolean var2) {
      if (this.f == null) {
         this.f = new ArrayList();
      }

      if (a) {
         Log.v("FragmentManager", "add: " + var1);
      }

      this.e(var1);
      if (!var1.I) {
         if (this.f.contains(var1)) {
            throw new IllegalStateException("Fragment already added: " + var1);
         }

         this.f.add(var1);
         var1.t = true;
         var1.u = false;
         if (var1.P == null) {
            var1.Y = false;
         }

         if (var1.L && var1.M) {
            this.r = true;
         }

         if (var2) {
            this.b(var1);
         }
      }

   }

   public void a(String param1, FileDescriptor param2, PrintWriter param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   public void a(boolean var1) {
      if (this.f != null) {
         for(int var2 = this.f.size() - 1; var2 >= 0; --var2) {
            p var3 = (p)this.f.get(var2);
            if (var3 != null) {
               var3.b(var1);
            }
         }
      }

   }

   boolean a(int var1) {
      boolean var2;
      if (this.m >= var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean a(Menu var1) {
      boolean var4;
      if (this.f != null) {
         int var2 = 0;
         boolean var3 = false;

         while(true) {
            var4 = var3;
            if (var2 >= this.f.size()) {
               break;
            }

            p var5 = (p)this.f.get(var2);
            var4 = var3;
            if (var5 != null) {
               var4 = var3;
               if (var5.a(var1)) {
                  var4 = true;
               }
            }

            ++var2;
            var3 = var4;
         }
      } else {
         var4 = false;
      }

      return var4;
   }

   public boolean a(Menu var1, MenuInflater var2) {
      byte var3 = 0;
      ArrayList var4 = null;
      ArrayList var5 = null;
      int var6;
      boolean var8;
      if (this.f != null) {
         var6 = 0;
         boolean var7 = false;

         while(true) {
            var4 = var5;
            var8 = var7;
            if (var6 >= this.f.size()) {
               break;
            }

            p var9 = (p)this.f.get(var6);
            var4 = var5;
            var8 = var7;
            if (var9 != null) {
               var4 = var5;
               var8 = var7;
               if (var9.a(var1, var2)) {
                  var8 = true;
                  var4 = var5;
                  if (var5 == null) {
                     var4 = new ArrayList();
                  }

                  var4.add(var9);
               }
            }

            ++var6;
            var7 = var8;
            var5 = var4;
         }
      } else {
         var8 = false;
      }

      if (this.i != null) {
         for(var6 = var3; var6 < this.i.size(); ++var6) {
            p var10 = (p)this.i.get(var6);
            if (var4 == null || !var4.contains(var10)) {
               var10.onDestroyOptionsMenu();
            }
         }
      }

      this.i = var4;
      return var8;
   }

   public boolean a(MenuItem var1) {
      boolean var2 = false;
      boolean var3 = var2;
      if (this.f != null) {
         int var4 = 0;

         while(true) {
            var3 = var2;
            if (var4 >= this.f.size()) {
               break;
            }

            p var5 = (p)this.f.get(var4);
            if (var5 != null && var5.a(var1)) {
               var3 = true;
               break;
            }

            ++var4;
         }
      }

      return var3;
   }

   boolean a(ArrayList var1, ArrayList var2, String var3, int var4, int var5) {
      boolean var6;
      if (this.h == null) {
         var6 = false;
      } else {
         if (var3 == null && var4 < 0 && (var5 & 1) == 0) {
            var4 = this.h.size() - 1;
            if (var4 < 0) {
               var6 = false;
               return var6;
            }

            var1.add(this.h.remove(var4));
            var2.add(true);
         } else {
            int var7 = -1;
            if (var3 != null || var4 >= 0) {
               int var8;
               h var9;
               for(var8 = this.h.size() - 1; var8 >= 0; --var8) {
                  var9 = (h)this.h.get(var8);
                  if (var3 != null && var3.equals(var9.e()) || var4 >= 0 && var4 == var9.n) {
                     break;
                  }
               }

               if (var8 < 0) {
                  var6 = false;
                  return var6;
               }

               var7 = var8;
               if ((var5 & 1) != 0) {
                  var5 = var8 - 1;

                  while(true) {
                     var7 = var5;
                     if (var5 < 0) {
                        break;
                     }

                     var9 = (h)this.h.get(var5);
                     if (var3 == null || !var3.equals(var9.e())) {
                        var7 = var5;
                        if (var4 < 0) {
                           break;
                        }

                        var7 = var5;
                        if (var4 != var9.n) {
                           break;
                        }
                     }

                     --var5;
                  }
               }
            }

            if (var7 == this.h.size() - 1) {
               var6 = false;
               return var6;
            }

            for(var4 = this.h.size() - 1; var4 > var7; --var4) {
               var1.add(this.h.remove(var4));
               var2.add(true);
            }
         }

         var6 = true;
      }

      return var6;
   }

   public p b(int var1) {
      int var2;
      p var3;
      if (this.f != null) {
         for(var2 = this.f.size() - 1; var2 >= 0; --var2) {
            var3 = (p)this.f.get(var2);
            if (var3 != null && var3.E == var1) {
               return var3;
            }
         }
      }

      if (this.e != null) {
         for(var2 = this.e.size() - 1; var2 >= 0; --var2) {
            p var4 = (p)this.e.get(var2);
            if (var4 != null) {
               var3 = var4;
               if (var4.E == var1) {
                  return var3;
               }
            }
         }
      }

      var3 = null;
      return var3;
   }

   public p b(String var1) {
      p var4;
      if (this.e != null && var1 != null) {
         for(int var2 = this.e.size() - 1; var2 >= 0; --var2) {
            p var3 = (p)this.e.get(var2);
            if (var3 != null) {
               var3 = var3.a(var1);
               if (var3 != null) {
                  var4 = var3;
                  return var4;
               }
            }
         }
      }

      var4 = null;
      return var4;
   }

   void b(h var1) {
      if (this.h == null) {
         this.h = new ArrayList();
      }

      this.h.add(var1);
      this.f();
   }

   void b(p var1) {
      this.a(var1, this.m, 0, 0, false);
   }

   void b(p var1, Context var2, boolean var3) {
      if (this.p != null) {
         ae var4 = this.p.getFragmentManager();
         if (var4 instanceof ah) {
            ((ah)var4).b(var1, var2, true);
         }
      }

      if (this.H != null) {
         Iterator var6 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var5;
            do {
               if (!var6.hasNext()) {
                  return;
               }

               var5 = (android.support.v4.g.p)var6.next();
            } while(var3 && !(Boolean)var5.b);

            ((af)var5.a).b(this, var1, (Context)var2);
         }
      }
   }

   void b(p var1, Bundle var2, boolean var3) {
      if (this.p != null) {
         ae var4 = this.p.getFragmentManager();
         if (var4 instanceof ah) {
            ((ah)var4).b(var1, var2, true);
         }
      }

      if (this.H != null) {
         Iterator var5 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var6;
            do {
               if (!var5.hasNext()) {
                  return;
               }

               var6 = (android.support.v4.g.p)var5.next();
            } while(var3 && !(Boolean)var6.b);

            ((af)var6.a).b(this, var1, (Bundle)var2);
         }
      }
   }

   void b(p var1, boolean var2) {
      if (this.p != null) {
         ae var3 = this.p.getFragmentManager();
         if (var3 instanceof ah) {
            ((ah)var3).b(var1, true);
         }
      }

      if (this.H != null) {
         Iterator var4 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var5;
            do {
               if (!var4.hasNext()) {
                  return;
               }

               var5 = (android.support.v4.g.p)var4.next();
            } while(var2 && !(Boolean)var5.b);

            ((af)var5.a).a(this, var1);
         }
      }
   }

   public void b(Menu var1) {
      if (this.f != null) {
         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            p var3 = (p)this.f.get(var2);
            if (var3 != null) {
               var3.b(var1);
            }
         }
      }

   }

   public void b(boolean var1) {
      if (this.f != null) {
         for(int var2 = this.f.size() - 1; var2 >= 0; --var2) {
            p var3 = (p)this.f.get(var2);
            if (var3 != null) {
               var3.c(var1);
            }
         }
      }

   }

   public boolean b() {
      this.u();
      return this.a((String)null, -1, 0);
   }

   public boolean b(MenuItem var1) {
      boolean var2 = false;
      boolean var3 = var2;
      if (this.f != null) {
         int var4 = 0;

         while(true) {
            var3 = var2;
            if (var4 >= this.f.size()) {
               break;
            }

            p var5 = (p)this.f.get(var4);
            if (var5 != null && var5.b(var1)) {
               var3 = true;
               break;
            }

            ++var4;
         }
      }

      return var3;
   }

   void c() {
      if (this.e != null) {
         for(int var1 = 0; var1 < this.e.size(); ++var1) {
            p var2 = (p)this.e.get(var1);
            if (var2 != null) {
               this.a(var2);
            }
         }
      }

   }

   public void c(int param1) {
      // $FF: Couldn't be decompiled
   }

   void c(p var1) {
      if (var1.P != null) {
         int var2 = var1.n();
         boolean var3;
         if (!var1.H) {
            var3 = true;
         } else {
            var3 = false;
         }

         Animation var4 = this.a(var1, var2, var3, var1.o());
         if (var4 != null) {
            this.b(var1.P, var4);
            var1.P.startAnimation(var4);
            this.b(var1.P, var4);
            var4.start();
         }

         byte var5;
         if (var1.H && !var1.u()) {
            var5 = 8;
         } else {
            var5 = 0;
         }

         var1.P.setVisibility(var5);
         if (var1.u()) {
            var1.d(false);
         }
      }

      if (var1.t && var1.L && var1.M) {
         this.r = true;
      }

      var1.Y = false;
      var1.onHiddenChanged(var1.H);
   }

   void c(p var1, Bundle var2, boolean var3) {
      if (this.p != null) {
         ae var4 = this.p.getFragmentManager();
         if (var4 instanceof ah) {
            ((ah)var4).c(var1, var2, true);
         }
      }

      if (this.H != null) {
         Iterator var5 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var6;
            do {
               if (!var5.hasNext()) {
                  return;
               }

               var6 = (android.support.v4.g.p)var5.next();
            } while(var3 && !(Boolean)var6.b);

            ((af)var6.a).c(this, var1, var2);
         }
      }
   }

   void c(p var1, boolean var2) {
      if (this.p != null) {
         ae var3 = this.p.getFragmentManager();
         if (var3 instanceof ah) {
            ((ah)var3).c(var1, true);
         }
      }

      if (this.H != null) {
         Iterator var4 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var5;
            do {
               if (!var4.hasNext()) {
                  return;
               }

               var5 = (android.support.v4.g.p)var4.next();
            } while(var2 && !(Boolean)var5.b);

            ((af)var5.a).b(this, var1);
         }
      }
   }

   void d(p var1) {
      if (var1 != null) {
         int var2 = this.m;
         int var3 = var2;
         if (var1.u) {
            if (var1.a()) {
               var3 = Math.min(var2, 1);
            } else {
               var3 = Math.min(var2, 0);
            }
         }

         this.a(var1, var3, var1.n(), var1.o(), false);
         if (var1.P != null) {
            p var4 = this.n(var1);
            if (var4 != null) {
               View var6 = var4.P;
               ViewGroup var5 = var1.O;
               var2 = var5.indexOfChild(var6);
               var3 = var5.indexOfChild(var1.P);
               if (var3 < var2) {
                  var5.removeViewAt(var3);
                  var5.addView(var1.P, var2);
               }
            }

            if (var1.X && var1.O != null) {
               if (VERSION.SDK_INT < 11) {
                  var1.P.setVisibility(View.VISIBLE);
               } else if (var1.Z > 0.0F) {
                  var1.P.setAlpha(var1.Z);
               }

               var1.Z = 0.0F;
               var1.X = false;
               Animation var7 = this.a(var1, var1.n(), true, var1.o());
               if (var7 != null) {
                  this.b(var1.P, var7);
                  var1.P.startAnimation(var7);
               }
            }
         }

         if (var1.Y) {
            this.c(var1);
         }
      }

   }

   void d(p var1, boolean var2) {
      if (this.p != null) {
         ae var3 = this.p.getFragmentManager();
         if (var3 instanceof ah) {
            ((ah)var3).d(var1, true);
         }
      }

      if (this.H != null) {
         Iterator var5 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var4;
            do {
               if (!var5.hasNext()) {
                  return;
               }

               var4 = (android.support.v4.g.p)var5.next();
            } while(var2 && !(Boolean)var4.b);

            ((af)var4.a).c(this, var1);
         }
      }
   }

   public boolean d() {
      this.c(true);

      boolean var1;
      for(var1 = false; this.c(this.w, this.x); var1 = true) {
         this.d = true;

         try {
            this.b(this.w, this.x);
         } finally {
            this.w();
         }
      }

      this.e();
      return var1;
   }

   void e() {
      if (this.v) {
         int var1 = 0;

         boolean var2;
         boolean var4;
         for(var2 = false; var1 < this.e.size(); var2 = var4) {
            p var3 = (p)this.e.get(var1);
            var4 = var2;
            if (var3 != null) {
               var4 = var2;
               if (var3.T != null) {
                  var4 = var2 | var3.T.a();
               }
            }

            ++var1;
         }

         if (!var2) {
            this.v = false;
            this.c();
         }
      }

   }

   void e(p var1) {
      if (var1.n < 0) {
         if (this.g != null && this.g.size() > 0) {
            var1.a((Integer)this.g.remove(this.g.size() - 1), this.p);
            this.e.set(var1.n, var1);
         } else {
            if (this.e == null) {
               this.e = new ArrayList();
            }

            var1.a(this.e.size(), this.p);
            this.e.add(var1);
         }

         if (a) {
            Log.v("FragmentManager", "Allocated fragment index " + var1);
         }
      }

   }

   void e(p var1, boolean var2) {
      if (this.p != null) {
         ae var3 = this.p.getFragmentManager();
         if (var3 instanceof ah) {
            ((ah)var3).e(var1, true);
         }
      }

      if (this.H != null) {
         Iterator var4 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var5;
            do {
               if (!var4.hasNext()) {
                  return;
               }

               var5 = (android.support.v4.g.p)var4.next();
            } while(var2 && !(Boolean)var5.b);

            ((af)var5.a).d(this, var1);
         }
      }
   }

   void f() {
      if (this.l != null) {
         for(int var1 = 0; var1 < this.l.size(); ++var1) {
            ((ag)this.l.get(var1)).a();
         }
      }

   }

   void f(p var1) {
      if (var1.n >= 0) {
         if (a) {
            Log.v("FragmentManager", "Freeing fragment index " + var1);
         }

         this.e.set(var1.n, (Object)null);
         if (this.g == null) {
            this.g = new ArrayList();
         }

         this.g.add(var1.n);
         this.n.b(var1.o);
         var1.b();
      }

   }

   void f(p var1, boolean var2) {
      if (this.p != null) {
         ae var3 = this.p.getFragmentManager();
         if (var3 instanceof ah) {
            ((ah)var3).f(var1, true);
         }
      }

      if (this.H != null) {
         Iterator var5 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var4;
            do {
               if (!var5.hasNext()) {
                  return;
               }

               var4 = (android.support.v4.g.p)var5.next();
            } while(var2 && !(Boolean)var4.b);

            ((af)var4.a).e(this, var1);
         }
      }
   }

   aq g() {
      Object var1 = null;
      ArrayList var5;
      ArrayList var6;
      if (this.e != null) {
         int var2 = 0;
         ArrayList var3 = null;
         ArrayList var4 = null;

         while(true) {
            var5 = var3;
            var6 = var4;
            if (var2 >= this.e.size()) {
               break;
            }

            p var7 = (p)this.e.get(var2);
            ArrayList var8 = var3;
            var5 = var4;
            if (var7 != null) {
               var6 = var4;
               int var9;
               if (var7.J) {
                  var5 = var4;
                  if (var4 == null) {
                     var5 = new ArrayList();
                  }

                  var5.add(var7);
                  var7.K = true;
                  if (var7.q != null) {
                     var9 = var7.q.n;
                  } else {
                     var9 = -1;
                  }

                  var7.r = var9;
                  var6 = var5;
                  if (a) {
                     Log.v("FragmentManager", "retainNonConfig: keeping retained " + var7);
                     var6 = var5;
                  }
               }

               boolean var12;
               label65: {
                  if (var7.B != null) {
                     aq var11 = var7.B.g();
                     if (var11 != null) {
                        if (var3 == null) {
                           var3 = new ArrayList();
                           var9 = 0;

                           while(true) {
                              var4 = var3;
                              if (var9 >= var2) {
                                 break;
                              }

                              var3.add((Object)null);
                              ++var9;
                           }
                        } else {
                           var4 = var3;
                        }

                        var4.add(var11);
                        var12 = true;
                        var3 = var4;
                        break label65;
                     }
                  }

                  var12 = false;
               }

               var8 = var3;
               var5 = var6;
               if (var3 != null) {
                  var8 = var3;
                  var5 = var6;
                  if (!var12) {
                     var3.add((Object)null);
                     var5 = var6;
                     var8 = var3;
                  }
               }
            }

            ++var2;
            var4 = var5;
            var3 = var8;
         }
      } else {
         var5 = null;
         var6 = null;
      }

      aq var10;
      if (var6 == null && var5 == null) {
         var10 = (aq)var1;
      } else {
         var10 = new aq(var6, var5);
      }

      return var10;
   }

   public void g(p var1) {
      if (a) {
         Log.v("FragmentManager", "remove: " + var1 + " nesting=" + var1.y);
      }

      boolean var2;
      if (!var1.a()) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (!var1.I || var2) {
         if (this.f != null) {
            this.f.remove(var1);
         }

         if (var1.L && var1.M) {
            this.r = true;
         }

         var1.t = false;
         var1.u = true;
      }

   }

   void g(p var1, boolean var2) {
      if (this.p != null) {
         ae var3 = this.p.getFragmentManager();
         if (var3 instanceof ah) {
            ((ah)var3).g(var1, true);
         }
      }

      if (this.H != null) {
         Iterator var4 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var5;
            do {
               if (!var4.hasNext()) {
                  return;
               }

               var5 = (android.support.v4.g.p)var4.next();
            } while(var2 && !(Boolean)var5.b);

            ((af)var5.a).f(this, var1);
         }
      }
   }

   Parcelable h() {
      j[] var1 = null;
      j[] var2 = null;
      this.x();
      this.y();
      this.d();
      if (b) {
         this.s = true;
      }

      ar var3 = var2;
      if (this.e != null) {
         if (this.e.size() <= 0) {
            var3 = var2;
         } else {
            int var4 = this.e.size();
            at[] var5 = new at[var4];
            int var6 = 0;

            boolean var7;
            for(var7 = false; var6 < var4; ++var6) {
               p var11 = (p)this.e.get(var6);
               if (var11 != null) {
                  if (var11.n < 0) {
                     this.a((RuntimeException)(new IllegalStateException("Failure saving state: active " + var11 + " has cleared index: " + var11.n)));
                  }

                  at var8 = new at(var11);
                  var5[var6] = var8;
                  if (var11.k > 0 && var8.k == null) {
                     var8.k = this.m(var11);
                     if (var11.q != null) {
                        if (var11.q.n < 0) {
                           this.a((RuntimeException)(new IllegalStateException("Failure saving state: " + var11 + " has target not in fragment manager: " + var11.q)));
                        }

                        if (var8.k == null) {
                           var8.k = new Bundle();
                        }

                        this.a(var8.k, "android:target_state", var11.q);
                        if (var11.s != 0) {
                           var8.k.putInt("android:target_req_state", var11.s);
                        }
                     }
                  } else {
                     var8.k = var11.l;
                  }

                  if (a) {
                     Log.v("FragmentManager", "Saved state of " + var11 + ": " + var8.k);
                  }

                  var7 = true;
               }
            }

            if (!var7) {
               var3 = var2;
               if (a) {
                  Log.v("FragmentManager", "saveAllState: no fragments!");
                  var3 = var2;
               }
            } else {
               int[] var12;
               int var13;
               label84: {
                  if (this.f != null) {
                     var6 = this.f.size();
                     if (var6 > 0) {
                        int[] var10 = new int[var6];
                        var13 = 0;

                        while(true) {
                           var12 = var10;
                           if (var13 >= var6) {
                              break label84;
                           }

                           var10[var13] = ((p)this.f.get(var13)).n;
                           if (var10[var13] < 0) {
                              this.a((RuntimeException)(new IllegalStateException("Failure saving state: active " + this.f.get(var13) + " has cleared index: " + var10[var13])));
                           }

                           if (a) {
                              Log.v("FragmentManager", "saveAllState: adding fragment #" + var13 + ": " + this.f.get(var13));
                           }

                           ++var13;
                        }
                     }
                  }

                  var12 = null;
               }

               var2 = var1;
               if (this.h != null) {
                  var6 = this.h.size();
                  var2 = var1;
                  if (var6 > 0) {
                     var1 = new j[var6];
                     var13 = 0;

                     while(true) {
                        var2 = var1;
                        if (var13 >= var6) {
                           break;
                        }

                        var1[var13] = new j((h)this.h.get(var13));
                        if (a) {
                           Log.v("FragmentManager", "saveAllState: adding back stack #" + var13 + ": " + this.h.get(var13));
                        }

                        ++var13;
                     }
                  }
               }

               ar var9 = new ar();
               var9.a = var5;
               var9.b = var12;
               var9.c = var2;
               var3 = var9;
            }
         }
      }

      return var3;
   }

   public void h(p var1) {
      boolean var2 = true;
      if (a) {
         Log.v("FragmentManager", "hide: " + var1);
      }

      if (!var1.H) {
         var1.H = true;
         if (var1.Y) {
            var2 = false;
         }

         var1.Y = var2;
      }

   }

   void h(p var1, boolean var2) {
      if (this.p != null) {
         ae var3 = this.p.getFragmentManager();
         if (var3 instanceof ah) {
            ((ah)var3).h(var1, true);
         }
      }

      if (this.H != null) {
         Iterator var4 = this.H.iterator();

         while(true) {
            android.support.v4.g.p var5;
            do {
               if (!var4.hasNext()) {
                  return;
               }

               var5 = (android.support.v4.g.p)var4.next();
            } while(var2 && !(Boolean)var5.b);

            ((af)var5.a).g(this, var1);
         }
      }
   }

   public void i() {
      this.s = false;
   }

   public void i(p var1) {
      boolean var2 = false;
      if (a) {
         Log.v("FragmentManager", "show: " + var1);
      }

      if (var1.H) {
         var1.H = false;
         if (!var1.Y) {
            var2 = true;
         }

         var1.Y = var2;
      }

   }

   public void j() {
      this.s = false;
      this.d = true;
      this.a(1, false);
      this.d = false;
   }

   public void j(p var1) {
      if (a) {
         Log.v("FragmentManager", "detach: " + var1);
      }

      if (!var1.I) {
         var1.I = true;
         if (var1.t) {
            if (this.f != null) {
               if (a) {
                  Log.v("FragmentManager", "remove from detach: " + var1);
               }

               this.f.remove(var1);
            }

            if (var1.L && var1.M) {
               this.r = true;
            }

            var1.t = false;
         }
      }

   }

   public void k() {
      this.s = false;
      this.d = true;
      this.a(2, false);
      this.d = false;
   }

   public void k(p var1) {
      if (a) {
         Log.v("FragmentManager", "attach: " + var1);
      }

      if (var1.I) {
         var1.I = false;
         if (!var1.t) {
            if (this.f == null) {
               this.f = new ArrayList();
            }

            if (this.f.contains(var1)) {
               throw new IllegalStateException("Fragment already added: " + var1);
            }

            if (a) {
               Log.v("FragmentManager", "add from attach: " + var1);
            }

            this.f.add(var1);
            var1.t = true;
            if (var1.L && var1.M) {
               this.r = true;
            }
         }
      }

   }

   public void l() {
      this.s = false;
      this.d = true;
      this.a(4, false);
      this.d = false;
   }

   void l(p var1) {
      if (var1.Q != null) {
         if (this.A == null) {
            this.A = new SparseArray();
         } else {
            this.A.clear();
         }

         var1.Q.saveHierarchyState(this.A);
         if (this.A.size() > 0) {
            var1.m = this.A;
            this.A = null;
         }
      }

   }

   Bundle m(p var1) {
      if (this.z == null) {
         this.z = new Bundle();
      }

      var1.e(this.z);
      this.c(var1, this.z, false);
      Bundle var2;
      if (!this.z.isEmpty()) {
         var2 = this.z;
         this.z = null;
      } else {
         var2 = null;
      }

      if (var1.P != null) {
         this.l(var1);
      }

      Bundle var3 = var2;
      if (var1.m != null) {
         var3 = var2;
         if (var2 == null) {
            var3 = new Bundle();
         }

         var3.putSparseParcelableArray("android:view_state", var1.m);
      }

      var2 = var3;
      if (!var1.S) {
         var2 = var3;
         if (var3 == null) {
            var2 = new Bundle();
         }

         var2.putBoolean("android:user_visible_hint", var1.S);
      }

      return var2;
   }

   public void m() {
      this.s = false;
      this.d = true;
      this.a(5, false);
      this.d = false;
   }

   public void n() {
      this.d = true;
      this.a(4, false);
      this.d = false;
   }

   public void o() {
      this.s = true;
      this.d = true;
      this.a(3, false);
      this.d = false;
   }

   public void p() {
      this.d = true;
      this.a(2, false);
      this.d = false;
   }

   public void q() {
      this.d = true;
      this.a(1, false);
      this.d = false;
   }

   public void r() {
      this.t = true;
      this.d();
      this.d = true;
      this.a(0, false);
      this.d = false;
      this.n = null;
      this.o = null;
      this.p = null;
   }

   public void s() {
      if (this.f != null) {
         for(int var1 = 0; var1 < this.f.size(); ++var1) {
            p var2 = (p)this.f.get(var1);
            if (var2 != null) {
               var2.f();
            }
         }
      }

   }

   android.support.v4.view.as t() {
      return this;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("FragmentManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      if (this.p != null) {
         android.support.v4.g.f.a(this.p, var1);
      } else {
         android.support.v4.g.f.a(this.n, var1);
      }

      var1.append("}}");
      return var1.toString();
   }
}
