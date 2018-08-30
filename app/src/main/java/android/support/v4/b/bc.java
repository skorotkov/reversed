package android.support.v4.b;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@TargetApi(21)
class bc {
   public static Object a(Object var0) {
      Transition var1 = null;
      if (var0 != null) {
         var1 = ((Transition)var0).clone();
      }

      return var1;
   }

   public static Object a(Object var0, Object var1, Object var2) {
      TransitionSet var3 = new TransitionSet();
      if (var0 != null) {
         var3.addTransition((Transition)var0);
      }

      if (var1 != null) {
         var3.addTransition((Transition)var1);
      }

      if (var2 != null) {
         var3.addTransition((Transition)var2);
      }

      return var3;
   }

   // $FF: synthetic method
   static String a(Map var0, String var1) {
      return b(var0, var1);
   }

   public static ArrayList a(ArrayList var0) {
      ArrayList var1 = new ArrayList();
      int var2 = var0.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         View var4 = (View)var0.get(var3);
         var1.add(var4.getTransitionName());
         var4.setTransitionName((String)null);
      }

      return var1;
   }

   public static void a(View var0, Rect var1) {
      int[] var2 = new int[2];
      var0.getLocationOnScreen(var2);
      var1.set(var2[0], var2[1], var2[0] + var0.getWidth(), var2[1] + var0.getHeight());
   }

   public static void a(View var0, ArrayList var1, ArrayList var2, ArrayList var3, Map var4) {
      int var5 = var2.size();
      ArrayList var6 = new ArrayList();

      for(int var7 = 0; var7 < var5; ++var7) {
         View var8 = (View)var1.get(var7);
         String var9 = var8.getTransitionName();
         var6.add(var9);
         if (var9 != null) {
            var8.setTransitionName((String)null);
            String var11 = (String)var4.get(var9);

            for(int var10 = 0; var10 < var5; ++var10) {
               if (var11.equals(var3.get(var10))) {
                  ((View)var2.get(var10)).setTransitionName(var9);
                  break;
               }
            }
         }
      }

      db.a(var0, new bf(var5, var2, var3, var1, var6));
   }

   public static void a(View var0, ArrayList var1, Map var2) {
      db.a(var0, new bg(var1, var2));
   }

   public static void a(ViewGroup var0, Object var1) {
      TransitionManager.beginDelayedTransition(var0, (Transition)var1);
   }

   public static void a(ViewGroup var0, ArrayList var1, Map var2) {
      db.a(var0, new bj(var1, var2));
   }

   public static void a(Object var0, Rect var1) {
      if (var0 != null) {
         ((Transition)var0).setEpicenterCallback(new bi(var1));
      }

   }

   public static void a(Object var0, View var1) {
      if (var1 != null) {
         Transition var3 = (Transition)var0;
         Rect var2 = new Rect();
         a(var1, var2);
         var3.setEpicenterCallback(new bd(var2));
      }

   }

   public static void a(Object var0, View var1, ArrayList var2) {
      TransitionSet var6 = (TransitionSet)var0;
      List var3 = var6.getTargets();
      var3.clear();
      int var4 = var2.size();

      for(int var5 = 0; var5 < var4; ++var5) {
         a(var3, (View)var2.get(var5));
      }

      var3.add(var1);
      var2.add(var1);
      a((Object)var6, (ArrayList)var2);
   }

   public static void a(Object var0, Object var1, ArrayList var2, Object var3, ArrayList var4, Object var5, ArrayList var6) {
      ((Transition)var0).addListener(new bh(var1, var2, var3, var4, var5, var6));
   }

   public static void a(Object var0, ArrayList var1) {
      int var2 = 0;
      Transition var4 = (Transition)var0;
      if (var4 != null) {
         int var3;
         if (var4 instanceof TransitionSet) {
            TransitionSet var5 = (TransitionSet)var4;

            for(var3 = var5.getTransitionCount(); var2 < var3; ++var2) {
               a((Object)var5.getTransitionAt(var2), (ArrayList)var1);
            }
         } else if (!a(var4) && a(var4.getTargets())) {
            var3 = var1.size();

            for(var2 = 0; var2 < var3; ++var2) {
               var4.addTarget((View)var1.get(var2));
            }
         }
      }

   }

   public static void a(Object var0, ArrayList var1, ArrayList var2) {
      TransitionSet var3 = (TransitionSet)var0;
      if (var3 != null) {
         var3.getTargets().clear();
         var3.getTargets().addAll(var2);
         b(var3, (ArrayList)var1, (ArrayList)var2);
      }

   }

   public static void a(ArrayList var0, View var1) {
      if (var1.getVisibility() == 0) {
         if (var1 instanceof ViewGroup) {
            ViewGroup var4 = (ViewGroup)var1;
            if (var4.isTransitionGroup()) {
               var0.add(var4);
            } else {
               int var2 = var4.getChildCount();

               for(int var3 = 0; var3 < var2; ++var3) {
                  a(var0, var4.getChildAt(var3));
               }
            }
         } else {
            var0.add(var1);
         }
      }

   }

   private static void a(List var0, View var1) {
      int var2 = var0.size();
      if (!a(var0, var1, var2)) {
         var0.add(var1);

         for(int var3 = var2; var3 < var0.size(); ++var3) {
            var1 = (View)var0.get(var3);
            if (var1 instanceof ViewGroup) {
               ViewGroup var7 = (ViewGroup)var1;
               int var4 = var7.getChildCount();

               for(int var5 = 0; var5 < var4; ++var5) {
                  View var6 = var7.getChildAt(var5);
                  if (!a(var0, var6, var2)) {
                     var0.add(var6);
                  }
               }
            }
         }
      }

   }

   public static void a(Map var0, View var1) {
      if (var1.getVisibility() == 0) {
         String var2 = var1.getTransitionName();
         if (var2 != null) {
            var0.put(var2, var1);
         }

         if (var1 instanceof ViewGroup) {
            ViewGroup var5 = (ViewGroup)var1;
            int var3 = var5.getChildCount();

            for(int var4 = 0; var4 < var3; ++var4) {
               a(var0, var5.getChildAt(var4));
            }
         }
      }

   }

   private static boolean a(Transition var0) {
      boolean var1;
      if (a(var0.getTargetIds()) && a(var0.getTargetNames()) && a(var0.getTargetTypes())) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   private static boolean a(List var0) {
      boolean var1;
      if (var0 != null && !var0.isEmpty()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   private static boolean a(List var0, View var1, int var2) {
      boolean var3 = false;
      int var4 = 0;

      boolean var5;
      while(true) {
         var5 = var3;
         if (var4 >= var2) {
            break;
         }

         if (var0.get(var4) == var1) {
            var5 = true;
            break;
         }

         ++var4;
      }

      return var5;
   }

   public static Object b(Object var0) {
      TransitionSet var2;
      if (var0 == null) {
         var2 = null;
      } else {
         TransitionSet var1 = new TransitionSet();
         var1.addTransition((Transition)var0);
         var2 = var1;
      }

      return var2;
   }

   public static Object b(Object var0, Object var1, Object var2) {
      Object var3 = null;
      var0 = (Transition)var0;
      Transition var4 = (Transition)var1;
      Transition var6 = (Transition)var2;
      if (var0 != null && var4 != null) {
         var0 = (new TransitionSet()).addTransition((Transition)var0).addTransition(var4).setOrdering(1);
      } else if (var0 == null) {
         var0 = var3;
         if (var4 != null) {
            var0 = var4;
         }
      }

      if (var6 != null) {
         TransitionSet var5 = new TransitionSet();
         if (var0 != null) {
            var5.addTransition((Transition)var0);
         }

         var5.addTransition(var6);
         var0 = var5;
      }

      return var0;
   }

   private static String b(Map var0, String var1) {
      Iterator var2 = var0.entrySet().iterator();

      String var3;
      while(true) {
         if (var2.hasNext()) {
            Entry var4 = (Entry)var2.next();
            if (!var1.equals(var4.getValue())) {
               continue;
            }

            var3 = (String)var4.getKey();
            break;
         }

         var3 = null;
         break;
      }

      return var3;
   }

   public static void b(Object var0, View var1) {
      if (var0 != null) {
         ((Transition)var0).addTarget(var1);
      }

   }

   public static void b(Object var0, View var1, ArrayList var2) {
      ((Transition)var0).addListener(new be(var1, var2));
   }

   public static void b(Object var0, ArrayList var1, ArrayList var2) {
      int var3 = 0;
      Transition var4 = (Transition)var0;
      int var5;
      if (var4 instanceof TransitionSet) {
         TransitionSet var6 = (TransitionSet)var4;

         for(var5 = var6.getTransitionCount(); var3 < var5; ++var3) {
            b(var6.getTransitionAt(var3), (ArrayList)var1, (ArrayList)var2);
         }
      } else if (!a(var4)) {
         List var7 = var4.getTargets();
         if (var7 != null && var7.size() == var1.size() && var7.containsAll(var1)) {
            if (var2 == null) {
               var3 = 0;
            } else {
               var3 = var2.size();
            }

            for(var5 = 0; var5 < var3; ++var5) {
               var4.addTarget((View)var2.get(var5));
            }

            for(var3 = var1.size() - 1; var3 >= 0; --var3) {
               var4.removeTarget((View)var1.get(var3));
            }
         }
      }

   }

   public static void c(Object var0, View var1) {
      if (var0 != null) {
         ((Transition)var0).removeTarget(var1);
      }

   }
}
