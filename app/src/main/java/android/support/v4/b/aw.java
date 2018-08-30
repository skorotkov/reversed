package android.support.v4.b;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class aw {
   private static final int[] a = new int[]{0, 3, 0, 1, 5, 4, 7, 6};

   private static bb a(bb var0, SparseArray var1, int var2) {
      bb var3 = var0;
      if (var0 == null) {
         var3 = new bb();
         var1.put(var2, var3);
      }

      return var3;
   }

   private static android.support.v4.g.a a(int var0, ArrayList var1, ArrayList var2, int var3, int var4) {
      android.support.v4.g.a var5 = new android.support.v4.g.a();
      --var4;

      for(; var4 >= var3; --var4) {
         h var6 = (h)var1.get(var4);
         if (var6.b(var0)) {
            boolean var7 = (Boolean)var2.get(var4);
            if (var6.s != null) {
               int var8 = var6.s.size();
               ArrayList var9;
               ArrayList var10;
               if (var7) {
                  var9 = var6.s;
                  var10 = var6.t;
               } else {
                  var10 = var6.s;
                  var9 = var6.t;
               }

               for(int var11 = 0; var11 < var8; ++var11) {
                  String var12 = (String)var10.get(var11);
                  String var14 = (String)var9.get(var11);
                  String var13 = (String)var5.remove(var14);
                  if (var13 != null) {
                     var5.put(var12, var13);
                  } else {
                     var5.put(var12, var14);
                  }
               }
            }
         }
      }

      return var5;
   }

   // $FF: synthetic method
   static android.support.v4.g.a a(android.support.v4.g.a var0, Object var1, bb var2) {
      return c(var0, var1, var2);
   }

   // $FF: synthetic method
   static View a(android.support.v4.g.a var0, bb var1, Object var2, boolean var3) {
      return b(var0, var1, var2, var3);
   }

   private static Object a(p var0, p var1, boolean var2) {
      Object var3;
      if (var0 != null && var1 != null) {
         if (var2) {
            var3 = var1.getSharedElementReturnTransition();
         } else {
            var3 = var0.getSharedElementEnterTransition();
         }

         var3 = bc.b(bc.a(var3));
      } else {
         var3 = null;
      }

      return var3;
   }

   private static Object a(p var0, boolean var1) {
      Object var2;
      if (var0 == null) {
         var2 = null;
      } else {
         if (var1) {
            var2 = var0.getReenterTransition();
         } else {
            var2 = var0.getEnterTransition();
         }

         var2 = bc.a(var2);
      }

      return var2;
   }

   private static Object a(ViewGroup var0, View var1, android.support.v4.g.a var2, bb var3, ArrayList var4, ArrayList var5, Object var6, Object var7) {
      Object var8 = null;
      Object var9 = null;
      p var10 = var3.a;
      p var11 = var3.d;
      if (var10 != null) {
         var10.getView().setVisibility(0);
      }

      Object var12 = var9;
      if (var10 != null) {
         if (var11 == null) {
            var12 = var9;
         } else {
            boolean var13 = var3.b;
            if (var2.isEmpty()) {
               var12 = null;
            } else {
               var12 = a(var10, var11, var13);
            }

            android.support.v4.g.a var14 = b(var2, var12, var3);
            android.support.v4.g.a var15 = c(var2, var12, var3);
            Object var16;
            if (var2.isEmpty()) {
               if (var14 != null) {
                  var14.clear();
               }

               if (var15 != null) {
                  var15.clear();
                  var16 = null;
               } else {
                  var16 = null;
               }
            } else {
               a((ArrayList)var4, (android.support.v4.g.a)var14, (Collection)var2.keySet());
               a(var5, var15, var2.values());
               var16 = var12;
            }

            if (var6 == null && var7 == null) {
               var12 = var9;
               if (var16 == null) {
                  return var12;
               }
            }

            b(var10, var11, var13, var14, true);
            Rect var17;
            if (var16 != null) {
               var5.add(var1);
               bc.a(var16, var1, var4);
               a(var16, var7, var14, var3.e, var3.f);
               Rect var18 = new Rect();
               View var19 = b(var15, var3, var6, var13);
               var1 = var19;
               var17 = var18;
               if (var19 != null) {
                  bc.a(var6, var18);
                  var17 = var18;
                  var1 = var19;
               }
            } else {
               var17 = null;
               var1 = (View)var8;
            }

            db.a(var0, new az(var10, var11, var13, var15, var1, var17));
            var12 = var16;
         }
      }

      return var12;
   }

   private static Object a(Object var0, Object var1, Object var2, p var3, boolean var4) {
      boolean var5 = true;
      boolean var6 = var5;
      if (var0 != null) {
         var6 = var5;
         if (var1 != null) {
            var6 = var5;
            if (var3 != null) {
               if (var4) {
                  var6 = var3.getAllowReturnTransitionOverlap();
               } else {
                  var6 = var3.getAllowEnterTransitionOverlap();
               }
            }
         }
      }

      if (var6) {
         var0 = bc.a(var1, var0, var2);
      } else {
         var0 = bc.b(var1, var0, var2);
      }

      return var0;
   }

   private static String a(android.support.v4.g.a var0, String var1) {
      int var2 = var0.size();
      int var3 = 0;

      String var4;
      while(true) {
         if (var3 >= var2) {
            var4 = null;
            break;
         }

         if (var1.equals(var0.c(var3))) {
            var4 = (String)var0.b(var3);
            break;
         }

         ++var3;
      }

      return var4;
   }

   // $FF: synthetic method
   static ArrayList a(Object var0, p var1, ArrayList var2, View var3) {
      return b(var0, var1, var2, var3);
   }

   private static void a(ah var0, int var1, bb var2, View var3, android.support.v4.g.a var4) {
      ViewGroup var5 = null;
      if (var0.o.a()) {
         var5 = (ViewGroup)var0.o.a(var1);
      }

      if (var5 != null) {
         p var6 = var2.a;
         p var7 = var2.d;
         boolean var8 = var2.b;
         boolean var9 = var2.e;
         ArrayList var10 = new ArrayList();
         ArrayList var14 = new ArrayList();
         Object var11 = a(var6, var8);
         Object var12 = b(var7, var9);
         Object var15 = a(var5, var3, var4, var2, var14, var10, var11, var12);
         if (var11 != null || var15 != null || var12 != null) {
            ArrayList var13 = b(var12, var7, var14, var3);
            ArrayList var16 = b(var11, var6, var10, var3);
            b(var16, 4);
            Object var17 = a(var11, var12, var15, var6, var8);
            if (var17 != null) {
               a(var12, var7, var13);
               ArrayList var18 = bc.a(var10);
               bc.a(var17, var11, var16, var12, var13, var15, var10);
               bc.a(var5, var17);
               bc.a(var5, var14, var10, var18, var4);
               b(var16, 0);
               bc.a(var15, var14, var10);
            }
         }
      }

   }

   static void a(ah var0, ArrayList var1, ArrayList var2, int var3, int var4, boolean var5) {
      if (var0.m >= 1 && VERSION.SDK_INT >= 21) {
         SparseArray var6 = new SparseArray();

         int var7;
         for(var7 = var3; var7 < var4; ++var7) {
            h var8 = (h)var1.get(var7);
            if ((Boolean)var2.get(var7)) {
               b(var8, var6, var5);
            } else {
               a(var8, var6, var5);
            }
         }

         if (var6.size() != 0) {
            View var13 = new View(var0.n.i());
            int var9 = var6.size();

            for(var7 = 0; var7 < var9; ++var7) {
               int var10 = var6.keyAt(var7);
               android.support.v4.g.a var11 = a(var10, var1, var2, var3, var4);
               bb var12 = (bb)var6.valueAt(var7);
               if (var5) {
                  a(var0, var10, var12, var13, var11);
               } else {
                  b(var0, var10, var12, var13, var11);
               }
            }
         }
      }

   }

   private static void a(h var0, i var1, SparseArray var2, boolean var3, boolean var4) {
      p var5 = var1.b;
      int var6 = var5.F;
      if (var6 != 0) {
         int var7;
         if (var3) {
            var7 = a[var1.a];
         } else {
            var7 = var1.a;
         }

         boolean var8;
         boolean var9;
         boolean var10;
         boolean var12;
         boolean var14;
         switch(var7) {
         case 1:
         case 7:
            if (var4) {
               var10 = var5.X;
            } else if (!var5.t && !var5.H) {
               var10 = true;
            } else {
               var10 = false;
            }

            var14 = true;
            var8 = false;
            var9 = false;
            break;
         case 2:
         default:
            var14 = false;
            var8 = false;
            var9 = false;
            var10 = false;
            break;
         case 3:
         case 6:
            if (var4) {
               if (!var5.t && var5.P != null && var5.P.getVisibility() == 0 && var5.Z >= 0.0F) {
                  var14 = true;
               } else {
                  var14 = false;
               }
            } else if (var5.t && !var5.H) {
               var14 = true;
            } else {
               var14 = false;
            }

            var12 = false;
            var8 = var14;
            var9 = true;
            var10 = false;
            var14 = var12;
            break;
         case 4:
            if (var4) {
               if (var5.Y && var5.t && var5.H) {
                  var14 = true;
               } else {
                  var14 = false;
               }
            } else if (var5.t && !var5.H) {
               var14 = true;
            } else {
               var14 = false;
            }

            var12 = false;
            var8 = var14;
            var9 = true;
            var10 = false;
            var14 = var12;
            break;
         case 5:
            if (var4) {
               if (var5.Y && !var5.H && var5.t) {
                  var10 = true;
               } else {
                  var10 = false;
               }
            } else {
               var10 = var5.H;
            }

            var14 = true;
            var8 = false;
            var9 = false;
         }

         bb var13 = (bb)var2.get(var6);
         if (var10) {
            var13 = a(var13, var2, var6);
            var13.a = var5;
            var13.b = var3;
            var13.c = var0;
         }

         if (!var4 && var14) {
            if (var13 != null && var13.d == var5) {
               var13.d = null;
            }

            ah var11 = var0.b;
            if (var5.k < 1 && var11.m >= 1 && !var0.u) {
               var11.e(var5);
               var11.a(var5, 1, 0, 0, false);
            }
         }

         if (var8 && (var13 == null || var13.d == null)) {
            var13 = a(var13, var2, var6);
            var13.d = var5;
            var13.e = var3;
            var13.f = var0;
         }

         if (!var4 && var9 && var13 != null && var13.a == var5) {
            var13.a = null;
         }
      }

   }

   public static void a(h var0, SparseArray var1, boolean var2) {
      int var3 = var0.c.size();

      for(int var4 = 0; var4 < var3; ++var4) {
         a(var0, (i)var0.c.get(var4), var1, false, var2);
      }

   }

   // $FF: synthetic method
   static void a(p var0, p var1, boolean var2, android.support.v4.g.a var3, boolean var4) {
      b(var0, var1, var2, var3, var4);
   }

   private static void a(android.support.v4.g.a var0, android.support.v4.g.a var1) {
      for(int var2 = var0.size() - 1; var2 >= 0; --var2) {
         if (!var1.containsKey((String)var0.c(var2))) {
            var0.d(var2);
         }
      }

   }

   private static void a(ViewGroup var0, p var1, View var2, ArrayList var3, Object var4, ArrayList var5, Object var6, ArrayList var7) {
      db.a(var0, new ay(var4, var2, var1, var3, var5, var7, var6));
   }

   private static void a(Object var0, p var1, ArrayList var2) {
      if (var1 != null && var0 != null && var1.t && var1.H && var1.Y) {
         var1.d(true);
         bc.b(var0, var1.getView(), var2);
         db.a(var1.O, new ax(var2));
      }

   }

   private static void a(Object var0, Object var1, android.support.v4.g.a var2, boolean var3, h var4) {
      if (var4.s != null && !var4.s.isEmpty()) {
         String var6;
         if (var3) {
            var6 = (String)var4.t.get(0);
         } else {
            var6 = (String)var4.s.get(0);
         }

         View var5 = (View)var2.get(var6);
         bc.a(var0, var5);
         if (var1 != null) {
            bc.a(var1, var5);
         }
      }

   }

   // $FF: synthetic method
   static void a(ArrayList var0, int var1) {
      b(var0, var1);
   }

   private static void a(ArrayList var0, android.support.v4.g.a var1, Collection var2) {
      for(int var3 = var1.size() - 1; var3 >= 0; --var3) {
         View var4 = (View)var1.c(var3);
         if (var2.contains(android.support.v4.view.bz.q(var4))) {
            var0.add(var4);
         }
      }

   }

   private static android.support.v4.g.a b(android.support.v4.g.a var0, Object var1, bb var2) {
      if (!var0.isEmpty() && var1 != null) {
         p var3 = var2.d;
         android.support.v4.g.a var4 = new android.support.v4.g.a();
         bc.a((Map)var4, (View)var3.getView());
         h var6 = var2.f;
         ArrayList var7;
         dn var8;
         if (var2.e) {
            var8 = var3.p();
            var7 = var6.t;
         } else {
            var8 = var3.q();
            var7 = var6.s;
         }

         var4.a(var7);
         if (var8 != null) {
            var8.a(var7, var4);

            for(int var5 = var7.size() - 1; var5 >= 0; --var5) {
               String var9 = (String)var7.get(var5);
               View var10 = (View)var4.get(var9);
               if (var10 == null) {
                  var0.remove(var9);
               } else if (!var9.equals(android.support.v4.view.bz.q(var10))) {
                  var9 = (String)var0.remove(var9);
                  var0.put(android.support.v4.view.bz.q(var10), var9);
               }
            }
         } else {
            var0.a(var4.keySet());
         }

         var0 = var4;
      } else {
         var0.clear();
         var0 = null;
      }

      return var0;
   }

   private static View b(android.support.v4.g.a var0, bb var1, Object var2, boolean var3) {
      h var5 = var1.c;
      View var4;
      if (var2 != null && var0 != null && var5.s != null && !var5.s.isEmpty()) {
         String var6;
         if (var3) {
            var6 = (String)var5.s.get(0);
         } else {
            var6 = (String)var5.t.get(0);
         }

         var4 = (View)var0.get(var6);
      } else {
         var4 = null;
      }

      return var4;
   }

   private static Object b(p var0, boolean var1) {
      Object var2;
      if (var0 == null) {
         var2 = null;
      } else {
         if (var1) {
            var2 = var0.getReturnTransition();
         } else {
            var2 = var0.getExitTransition();
         }

         var2 = bc.a(var2);
      }

      return var2;
   }

   private static Object b(ViewGroup var0, View var1, android.support.v4.g.a var2, bb var3, ArrayList var4, ArrayList var5, Object var6, Object var7) {
      p var8 = var3.a;
      p var9 = var3.d;
      Object var10;
      if (var8 != null && var9 != null) {
         boolean var11 = var3.b;
         if (var2.isEmpty()) {
            var10 = null;
         } else {
            var10 = a(var8, var9, var11);
         }

         android.support.v4.g.a var12 = b(var2, var10, var3);
         if (var2.isEmpty()) {
            var10 = null;
         } else {
            var4.addAll(var12.values());
         }

         if (var6 == null && var7 == null && var10 == null) {
            var10 = null;
         } else {
            b(var8, var9, var11, var12, true);
            Rect var14;
            if (var10 != null) {
               Rect var13 = new Rect();
               bc.a(var10, var1, var4);
               a(var10, var7, var12, var3.e, var3.f);
               var14 = var13;
               if (var6 != null) {
                  bc.a(var6, var13);
                  var14 = var13;
               }
            } else {
               var14 = null;
            }

            db.a(var0, new ba(var2, var10, var3, var5, var1, var8, var9, var11, var4, var6, var14));
         }
      } else {
         var10 = null;
      }

      return var10;
   }

   private static ArrayList b(Object var0, p var1, ArrayList var2, View var3) {
      ArrayList var4 = null;
      if (var0 != null) {
         ArrayList var5 = new ArrayList();
         View var6 = var1.getView();
         if (var6 != null) {
            bc.a(var5, var6);
         }

         if (var2 != null) {
            var5.removeAll(var2);
         }

         var4 = var5;
         if (!var5.isEmpty()) {
            var5.add(var3);
            bc.a(var0, var5);
            var4 = var5;
         }
      }

      return var4;
   }

   private static void b(ah var0, int var1, bb var2, View var3, android.support.v4.g.a var4) {
      ViewGroup var5 = null;
      if (var0.o.a()) {
         var5 = (ViewGroup)var0.o.a(var1);
      }

      if (var5 != null) {
         p var6 = var2.a;
         p var7 = var2.d;
         boolean var8 = var2.b;
         boolean var9 = var2.e;
         Object var10 = a(var6, var8);
         Object var14 = b(var7, var9);
         ArrayList var11 = new ArrayList();
         ArrayList var12 = new ArrayList();
         Object var13 = b(var5, var3, var4, var2, var11, var12, var10, var14);
         if (var10 != null || var13 != null || var14 != null) {
            ArrayList var17 = b(var14, var7, var11, var3);
            if (var17 == null || var17.isEmpty()) {
               var14 = null;
            }

            bc.b(var10, var3);
            Object var15 = a(var10, var14, var13, var6, var2.b);
            if (var15 != null) {
               ArrayList var16 = new ArrayList();
               bc.a(var15, var10, var16, var14, var17, var13, var12);
               a(var5, var6, var3, var12, var10, var16, var14, var17);
               bc.a((View)var5, (ArrayList)var12, (Map)var4);
               bc.a(var5, var15);
               bc.a((ViewGroup)var5, (ArrayList)var12, (Map)var4);
            }
         }
      }

   }

   public static void b(h var0, SparseArray var1, boolean var2) {
      if (var0.b.o.a()) {
         for(int var3 = var0.c.size() - 1; var3 >= 0; --var3) {
            a(var0, (i)var0.c.get(var3), var1, true, var2);
         }
      }

   }

   private static void b(p var0, p var1, boolean var2, android.support.v4.g.a var3, boolean var4) {
      int var5 = 0;
      dn var8;
      if (var2) {
         var8 = var1.p();
      } else {
         var8 = var0.p();
      }

      if (var8 != null) {
         ArrayList var6 = new ArrayList();
         ArrayList var9 = new ArrayList();
         int var7;
         if (var3 == null) {
            var7 = 0;
         } else {
            var7 = var3.size();
         }

         while(var5 < var7) {
            var9.add(var3.b(var5));
            var6.add(var3.c(var5));
            ++var5;
         }

         if (var4) {
            var8.a(var9, var6, (List)null);
         } else {
            var8.b(var9, var6, (List)null);
         }
      }

   }

   private static void b(ArrayList var0, int var1) {
      if (var0 != null) {
         for(int var2 = var0.size() - 1; var2 >= 0; --var2) {
            ((View)var0.get(var2)).setVisibility(var1);
         }
      }

   }

   private static android.support.v4.g.a c(android.support.v4.g.a var0, Object var1, bb var2) {
      p var3 = var2.a;
      View var4 = var3.getView();
      if (!var0.isEmpty() && var1 != null && var4 != null) {
         android.support.v4.g.a var5 = new android.support.v4.g.a();
         bc.a((Map)var5, (View)var4);
         h var7 = var2.c;
         ArrayList var8;
         dn var9;
         if (var2.b) {
            var9 = var3.q();
            var8 = var7.s;
         } else {
            var9 = var3.p();
            var8 = var7.t;
         }

         if (var8 != null) {
            var5.a(var8);
         }

         if (var9 != null) {
            var9.a(var8, var5);

            for(int var6 = var8.size() - 1; var6 >= 0; --var6) {
               String var10 = (String)var8.get(var6);
               View var11 = (View)var5.get(var10);
               if (var11 == null) {
                  String var12 = a(var0, var10);
                  if (var12 != null) {
                     var0.remove(var12);
                  }
               } else if (!var10.equals(android.support.v4.view.bz.q(var11))) {
                  var10 = a(var0, var10);
                  if (var10 != null) {
                     var0.put(var10, android.support.v4.view.bz.q(var11));
                  }
               }
            }
         } else {
            a(var0, var5);
         }

         var0 = var5;
      } else {
         var0.clear();
         var0 = null;
      }

      return var0;
   }
}
