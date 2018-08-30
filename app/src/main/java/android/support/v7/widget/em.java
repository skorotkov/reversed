package android.support.v7.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class em {
   final ArrayList a;
   ArrayList b;
   final ArrayList c;
   int d;
   ek e;
   // $FF: synthetic field
   final dl f;
   private final List g;
   private int h;
   private ew i;

   public em(dl var1) {
      this.f = var1;
      this.a = new ArrayList();
      this.b = null;
      this.c = new ArrayList();
      this.g = Collections.unmodifiableList(this.a);
      this.h = 2;
      this.d = 2;
   }

   private void a(ViewGroup var1, boolean var2) {
      int var3;
      for(var3 = var1.getChildCount() - 1; var3 >= 0; --var3) {
         View var4 = var1.getChildAt(var3);
         if (var4 instanceof ViewGroup) {
            this.a((ViewGroup)var4, true);
         }
      }

      if (var2) {
         if (var1.getVisibility() == 4) {
            var1.setVisibility(0);
            var1.setVisibility(4);
         } else {
            var3 = var1.getVisibility();
            var1.setVisibility(4);
            var1.setVisibility(var3);
         }
      }

   }

   private boolean a(ey var1, int var2, int var3, long var4) {
      var1.m = this.f;
      int var6 = var1.i();
      long var7 = this.f.getNanoTime();
      boolean var9;
      if (var4 != Long.MAX_VALUE && !this.e.b(var6, var7, var4)) {
         var9 = false;
      } else {
         this.f.l.b(var1, var2);
         var4 = this.f.getNanoTime();
         this.e.b(var1.i(), var4 - var7);
         this.d(var1.a);
         if (this.f.A.a()) {
            var1.g = var3;
         }

         var9 = true;
      }

      return var9;
   }

   private void d(View var1) {
      if (this.f.n()) {
         if (android.support.v4.view.bz.d(var1) == 0) {
            android.support.v4.view.bz.c(var1, 1);
         }

         if (!android.support.v4.view.bz.a(var1)) {
            android.support.v4.view.bz.a(var1, this.f.E.c());
         }
      }

   }

   private void e(ey var1) {
      if (var1.a instanceof ViewGroup) {
         this.a((ViewGroup)var1.a, false);
      }

   }

   ey a(int var1, boolean var2, long var3) {
      boolean var5 = true;
      if (var1 >= 0 && var1 < this.f.A.e()) {
         ey var6;
         boolean var7;
         boolean var8;
         if (this.f.A.a()) {
            var6 = this.f(var1);
            if (var6 != null) {
               var7 = true;
            } else {
               var7 = false;
            }

            var8 = var7;
         } else {
            var6 = null;
            var8 = false;
         }

         ey var9 = var6;
         var7 = var8;
         if (var6 == null) {
            var6 = this.b(var1, var2);
            var9 = var6;
            var7 = var8;
            if (var6 != null) {
               if (!this.a(var6)) {
                  if (!var2) {
                     var6.b(4);
                     if (var6.j()) {
                        this.f.removeDetachedView(var6.a, false);
                        var6.k();
                     } else if (var6.l()) {
                        var6.m();
                     }

                     this.b(var6);
                  }

                  var9 = null;
                  var7 = var8;
               } else {
                  var7 = true;
                  var9 = var6;
               }
            }
         }

         int var16;
         if (var9 == null) {
            int var10 = this.f.e.b(var1);
            if (var10 < 0 || var10 >= this.f.l.a()) {
               throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + var1 + "(offset:" + var10 + ")." + "state:" + this.f.A.e());
            }

            label137: {
               var16 = this.f.l.a(var10);
               if (this.f.l.b()) {
                  var6 = this.a(this.f.l.b(var10), var16, var2);
                  var9 = var6;
                  if (var6 != null) {
                     var6.c = var10;
                     var7 = true;
                     break label137;
                  }
               }

               var6 = var9;
            }

            var9 = var6;
            if (var6 == null) {
               var9 = var6;
               if (this.i != null) {
                  View var11 = this.i.a(this, var1, var16);
                  var9 = var6;
                  if (var11 != null) {
                     var6 = this.f.b(var11);
                     if (var6 == null) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                     }

                     var9 = var6;
                     if (var6.c()) {
                        throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                     }
                  }
               }
            }

            var6 = var9;
            if (var9 == null) {
               var9 = this.g().a(var16);
               var6 = var9;
               if (var9 != null) {
                  var9.w();
                  var6 = var9;
                  if (dl.a) {
                     this.e(var9);
                     var6 = var9;
                  }
               }
            }

            var9 = var6;
            if (var6 == null) {
               long var12 = this.f.getNanoTime();
               if (var3 != Long.MAX_VALUE && !this.e.a(var16, var12, var3)) {
                  var9 = null;
                  return var9;
               }

               var9 = this.f.l.b((ViewGroup)this.f, var16);
               if (dl.z()) {
                  dl var17 = dl.l(var9.a);
                  if (var17 != null) {
                     var9.b = new WeakReference(var17);
                  }
               }

               long var14 = this.f.getNanoTime();
               this.e.a(var16, var14 - var12);
            }
         }

         if (var7 && !this.f.A.a() && var9.a(8192)) {
            var9.a(0, 8192);
            if (this.f.A.i) {
               var16 = dw.e(var9);
               dz var18 = this.f.w.a(this.f.A, var9, var16 | 4096, var9.v());
               this.f.a(var9, var18);
            }
         }

         if (this.f.A.a() && var9.q()) {
            var9.g = var1;
            var2 = false;
         } else if (var9.q() && !var9.p() && !var9.o()) {
            var2 = false;
         } else {
            var2 = this.a(var9, this.f.e.b(var1), var1, var3);
         }

         LayoutParams var19 = var9.a.getLayoutParams();
         ef var20;
         if (var19 == null) {
            var20 = (ef)this.f.generateDefaultLayoutParams();
            var9.a.setLayoutParams(var20);
         } else if (!this.f.checkLayoutParams(var19)) {
            var20 = (ef)this.f.generateLayoutParams(var19);
            var9.a.setLayoutParams(var20);
         } else {
            var20 = (ef)var19;
         }

         var20.c = var9;
         if (var7 && var2) {
            var2 = var5;
         } else {
            var2 = false;
         }

         var20.f = var2;
         return var9;
      } else {
         throw new IndexOutOfBoundsException("Invalid item position " + var1 + "(" + var1 + "). Item count:" + this.f.A.e());
      }
   }

   ey a(long var1, int var3, boolean var4) {
      int var5 = this.a.size() - 1;

      ey var7;
      while(true) {
         ey var6;
         if (var5 < 0) {
            for(var5 = this.c.size() - 1; var5 >= 0; --var5) {
               var6 = (ey)this.c.get(var5);
               if (var6.h() == var1) {
                  if (var3 == var6.i()) {
                     var7 = var6;
                     if (!var4) {
                        this.c.remove(var5);
                        var7 = var6;
                     }

                     return var7;
                  }

                  if (!var4) {
                     this.d(var5);
                     var7 = null;
                     return var7;
                  }
               }
            }

            var7 = null;
            break;
         }

         var6 = (ey)this.a.get(var5);
         if (var6.h() == var1 && !var6.l()) {
            if (var3 == var6.i()) {
               var6.b(32);
               var7 = var6;
               if (var6.r()) {
                  var7 = var6;
                  if (!this.f.A.a()) {
                     var6.a(2, 14);
                     var7 = var6;
                  }
               }
               break;
            }

            if (!var4) {
               this.a.remove(var5);
               this.f.removeDetachedView(var6.a, false);
               this.b(var6.a);
            }
         }

         --var5;
      }

      return var7;
   }

   View a(int var1, boolean var2) {
      return this.a(var1, var2, Long.MAX_VALUE).a;
   }

   public void a() {
      this.a.clear();
      this.d();
   }

   public void a(int var1) {
      this.h = var1;
      this.b();
   }

   void a(int var1, int var2) {
      byte var3;
      int var4;
      int var5;
      if (var1 < var2) {
         var3 = -1;
         var4 = var2;
         var5 = var1;
      } else {
         var3 = 1;
         var4 = var1;
         var5 = var2;
      }

      int var6 = this.c.size();

      for(int var7 = 0; var7 < var6; ++var7) {
         ey var8 = (ey)this.c.get(var7);
         if (var8 != null && var8.c >= var5 && var8.c <= var4) {
            if (var8.c == var1) {
               var8.a(var2 - var1, false);
            } else {
               var8.a(var3, false);
            }
         }
      }

   }

   void a(int var1, int var2, boolean var3) {
      for(int var4 = this.c.size() - 1; var4 >= 0; --var4) {
         ey var5 = (ey)this.c.get(var4);
         if (var5 != null) {
            if (var5.c >= var1 + var2) {
               var5.a(-var2, var3);
            } else if (var5.c >= var1) {
               var5.b(8);
               this.d(var4);
            }
         }
      }

   }

   void a(ds var1, ds var2, boolean var3) {
      this.a();
      this.g().a(var1, var2, var3);
   }

   void a(ek var1) {
      if (this.e != null) {
         this.e.b();
      }

      this.e = var1;
      if (var1 != null) {
         this.e.a(this.f.getAdapter());
      }

   }

   void a(ew var1) {
      this.i = var1;
   }

   void a(ey var1, boolean var2) {
      dl.c(var1);
      android.support.v4.view.bz.a(var1.a, (android.support.v4.view.d)null);
      if (var2) {
         this.d(var1);
      }

      var1.m = null;
      this.g().a(var1);
   }

   public void a(View var1) {
      ey var2 = dl.e(var1);
      if (var2.s()) {
         this.f.removeDetachedView(var1, false);
      }

      if (var2.j()) {
         var2.k();
      } else if (var2.l()) {
         var2.m();
      }

      this.b(var2);
   }

   boolean a(ey var1) {
      boolean var2 = true;
      boolean var3;
      if (var1.r()) {
         var3 = this.f.A.a();
      } else {
         if (var1.c < 0 || var1.c >= this.f.l.a()) {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + var1);
         }

         if (!this.f.A.a() && this.f.l.a(var1.c) != var1.i()) {
            var3 = false;
         } else {
            var3 = var2;
            if (this.f.l.b()) {
               var3 = var2;
               if (var1.h() != this.f.l.b(var1.c)) {
                  var3 = false;
               }
            }
         }
      }

      return var3;
   }

   public int b(int var1) {
      if (var1 >= 0 && var1 < this.f.A.e()) {
         if (this.f.A.a()) {
            var1 = this.f.e.b(var1);
         }

         return var1;
      } else {
         throw new IndexOutOfBoundsException("invalid position " + var1 + ". State " + "item count is " + this.f.A.e());
      }
   }

   ey b(int var1, boolean var2) {
      byte var3 = 0;
      int var4 = this.a.size();
      int var5 = 0;

      ey var6;
      while(true) {
         if (var5 >= var4) {
            if (!var2) {
               View var7 = this.f.f.c(var1);
               if (var7 != null) {
                  var6 = dl.e(var7);
                  this.f.f.e(var7);
                  var1 = this.f.f.b(var7);
                  if (var1 == -1) {
                     throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + var6);
                  }

                  this.f.f.e(var1);
                  this.c(var7);
                  var6.b(8224);
                  break;
               }
            }

            var4 = this.c.size();

            for(var5 = var3; var5 < var4; ++var5) {
               ey var8 = (ey)this.c.get(var5);
               if (!var8.o() && var8.e() == var1) {
                  var6 = var8;
                  if (!var2) {
                     this.c.remove(var5);
                     var6 = var8;
                  }

                  return var6;
               }
            }

            var6 = null;
            break;
         }

         var6 = (ey)this.a.get(var5);
         if (!var6.l() && var6.e() == var1 && !var6.o() && (this.f.A.f || !var6.r())) {
            var6.b(32);
            break;
         }

         ++var5;
      }

      return var6;
   }

   void b() {
      int var1;
      if (this.f.m != null) {
         var1 = this.f.m.v;
      } else {
         var1 = 0;
      }

      this.d = var1 + this.h;

      for(var1 = this.c.size() - 1; var1 >= 0 && this.c.size() > this.d; --var1) {
         this.d(var1);
      }

   }

   void b(int var1, int var2) {
      int var3 = this.c.size();

      for(int var4 = 0; var4 < var3; ++var4) {
         ey var5 = (ey)this.c.get(var4);
         if (var5 != null && var5.c >= var1) {
            var5.a(var2, true);
         }
      }

   }

   void b(ey var1) {
      boolean var2 = false;
      boolean var4;
      if (!var1.j() && var1.a.getParent() == null) {
         if (var1.s()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + var1);
         } else if (var1.c()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
         } else {
            var4 = ey.a(var1);
            boolean var5;
            if (this.f.l != null && var4 && this.f.l.b(var1)) {
               var5 = true;
            } else {
               var5 = false;
            }

            boolean var8;
            if (!var5 && !var1.x()) {
               var8 = false;
            } else {
               if (this.d > 0 && !var1.a(526)) {
                  int var6 = this.c.size();
                  int var7 = var6;
                  if (var6 >= this.d) {
                     var7 = var6;
                     if (var6 > 0) {
                        this.d(0);
                        var7 = var6 - 1;
                     }
                  }

                  var6 = var7;
                  if (dl.z()) {
                     var6 = var7;
                     if (var7 > 0) {
                        var6 = var7;
                        if (!this.f.z.a(var1.c)) {
                           --var7;

                           while(var7 >= 0) {
                              var6 = ((ey)this.c.get(var7)).c;
                              if (!this.f.z.a(var6)) {
                                 break;
                              }

                              --var7;
                           }

                           var6 = var7 + 1;
                        }
                     }
                  }

                  this.c.add(var6, var1);
                  var5 = true;
               } else {
                  var5 = false;
               }

               var8 = var5;
               if (!var5) {
                  this.a(var1, true);
                  var2 = true;
                  var8 = var5;
               }
            }

            this.f.g.g(var1);
            if (!var8 && !var2 && var4) {
               var1.m = null;
            }

         }
      } else {
         StringBuilder var3 = (new StringBuilder()).append("Scrapped or attached views may not be recycled. isScrap:").append(var1.j()).append(" isAttached:");
         if (var1.a.getParent() != null) {
            var4 = true;
         } else {
            var4 = false;
         }

         throw new IllegalArgumentException(var3.append(var4).toString());
      }
   }

   void b(View var1) {
      ey var2 = dl.e(var1);
      ey.a(var2, (em)null);
      ey.a(var2, false);
      var2.m();
      this.b(var2);
   }

   public View c(int var1) {
      return this.a(var1, false);
   }

   public List c() {
      return this.g;
   }

   void c(int var1, int var2) {
      for(int var3 = this.c.size() - 1; var3 >= 0; --var3) {
         ey var4 = (ey)this.c.get(var3);
         if (var4 != null) {
            int var5 = var4.e();
            if (var5 >= var1 && var5 < var1 + var2) {
               var4.b(2);
               this.d(var3);
            }
         }
      }

   }

   void c(ey var1) {
      if (ey.b(var1)) {
         this.b.remove(var1);
      } else {
         this.a.remove(var1);
      }

      ey.a(var1, (em)null);
      ey.a(var1, false);
      var1.m();
   }

   void c(View var1) {
      ey var2 = dl.e(var1);
      if (!var2.a(12) && var2.y() && !this.f.b(var2)) {
         if (this.b == null) {
            this.b = new ArrayList();
         }

         var2.a(this, true);
         this.b.add(var2);
      } else {
         if (var2.o() && !var2.r() && !this.f.l.b()) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
         }

         var2.a(this, false);
         this.a.add(var2);
      }

   }

   void d() {
      for(int var1 = this.c.size() - 1; var1 >= 0; --var1) {
         this.d(var1);
      }

      this.c.clear();
      if (dl.z()) {
         this.f.z.a();
      }

   }

   void d(int var1) {
      this.a((ey)this.c.get(var1), true);
      this.c.remove(var1);
   }

   void d(ey var1) {
      if (this.f.n != null) {
         this.f.n.a(var1);
      }

      if (this.f.l != null) {
         this.f.l.a(var1);
      }

      if (this.f.A != null) {
         this.f.g.g(var1);
      }

   }

   int e() {
      return this.a.size();
   }

   View e(int var1) {
      return ((ey)this.a.get(var1)).a;
   }

   ey f(int var1) {
      byte var2 = 0;
      ey var4;
      if (this.b != null) {
         int var3 = this.b.size();
         if (var3 != 0) {
            for(int var5 = 0; var5 < var3; ++var5) {
               var4 = (ey)this.b.get(var5);
               if (!var4.l() && var4.e() == var1) {
                  var4.b(32);
                  return var4;
               }
            }

            if (this.f.l.b()) {
               var1 = this.f.e.b(var1);
               if (var1 > 0 && var1 < this.f.l.a()) {
                  long var6 = this.f.l.b(var1);

                  for(var1 = var2; var1 < var3; ++var1) {
                     var4 = (ey)this.b.get(var1);
                     if (!var4.l() && var4.h() == var6) {
                        var4.b(32);
                        return var4;
                     }
                  }
               }
            }

            var4 = null;
            return var4;
         }
      }

      var4 = null;
      return var4;
   }

   void f() {
      this.a.clear();
      if (this.b != null) {
         this.b.clear();
      }

   }

   ek g() {
      if (this.e == null) {
         this.e = new ek();
      }

      return this.e;
   }

   void h() {
      int var1 = this.c.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         ey var3 = (ey)this.c.get(var2);
         if (var3 != null) {
            var3.b(512);
         }
      }

   }

   void i() {
      if (this.f.l != null && this.f.l.b()) {
         int var1 = this.c.size();

         for(int var2 = 0; var2 < var1; ++var2) {
            ey var3 = (ey)this.c.get(var2);
            if (var3 != null) {
               var3.b(6);
               var3.a((Object)null);
            }
         }
      } else {
         this.d();
      }

   }

   void j() {
      byte var1 = 0;
      int var2 = this.c.size();

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         ((ey)this.c.get(var3)).a();
      }

      var2 = this.a.size();

      for(var3 = 0; var3 < var2; ++var3) {
         ((ey)this.a.get(var3)).a();
      }

      if (this.b != null) {
         var2 = this.b.size();

         for(var3 = var1; var3 < var2; ++var3) {
            ((ey)this.b.get(var3)).a();
         }
      }

   }

   void k() {
      int var1 = this.c.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         ef var3 = (ef)((ey)this.c.get(var2)).a.getLayoutParams();
         if (var3 != null) {
            var3.e = true;
         }
      }

   }
}
