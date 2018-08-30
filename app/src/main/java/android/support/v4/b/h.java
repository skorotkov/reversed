package android.support.v4.b;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

final class h extends av implements an {
   static final boolean a;
   final ah b;
   ArrayList c = new ArrayList();
   int d;
   int e;
   int f;
   int g;
   int h;
   int i;
   boolean j;
   boolean k = true;
   String l;
   boolean m;
   int n = -1;
   int o;
   CharSequence p;
   int q;
   CharSequence r;
   ArrayList s;
   ArrayList t;
   boolean u = false;

   static {
      boolean var0;
      if (VERSION.SDK_INT >= 21) {
         var0 = true;
      } else {
         var0 = false;
      }

      a = var0;
   }

   public h(ah var1) {
      this.b = var1;
   }

   private void a(int var1, p var2, String var3, int var4) {
      Class var5 = var2.getClass();
      int var6 = var5.getModifiers();
      if (var5.isAnonymousClass() || !Modifier.isPublic(var6) || var5.isMemberClass() && !Modifier.isStatic(var6)) {
         throw new IllegalStateException("Fragment " + var5.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
      } else {
         var2.z = this.b;
         if (var3 != null) {
            if (var2.G != null && !var3.equals(var2.G)) {
               throw new IllegalStateException("Can't change tag of fragment " + var2 + ": was " + var2.G + " now " + var3);
            }

            var2.G = var3;
         }

         if (var1 != 0) {
            if (var1 == -1) {
               throw new IllegalArgumentException("Can't add fragment " + var2 + " with tag " + var3 + " to container view with no id");
            }

            if (var2.E != 0 && var2.E != var1) {
               throw new IllegalStateException("Can't change container ID of fragment " + var2 + ": was " + var2.E + " now " + var1);
            }

            var2.E = var1;
            var2.F = var1;
         }

         i var7 = new i();
         var7.a = var4;
         var7.b = var2;
         this.a(var7);
      }
   }

   private static boolean b(i var0) {
      p var2 = var0.b;
      boolean var1;
      if (var2.t && var2.P != null && !var2.I && !var2.H && var2.t()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int a() {
      return this.a(false);
   }

   int a(boolean var1) {
      if (this.m) {
         throw new IllegalStateException("commit already called");
      } else {
         if (ah.a) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter var2 = new PrintWriter(new android.support.v4.g.g("FragmentManager"));
            this.a("  ", (FileDescriptor)null, var2, (String[])null);
            var2.close();
         }

         this.m = true;
         if (this.j) {
            this.n = this.b.a(this);
         } else {
            this.n = -1;
         }

         this.b.a((an)this, var1);
         return this.n;
      }
   }

   public av a(p var1) {
      i var2 = new i();
      var2.a = 3;
      var2.b = var1;
      this.a(var2);
      return this;
   }

   public av a(p var1, String var2) {
      this.a(0, var1, var2, 1);
      return this;
   }

   void a(int var1) {
      if (this.j) {
         if (ah.a) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + var1);
         }

         int var2 = this.c.size();

         for(int var3 = 0; var3 < var2; ++var3) {
            i var4 = (i)this.c.get(var3);
            if (var4.b != null) {
               p var5 = var4.b;
               var5.y += var1;
               if (ah.a) {
                  Log.v("FragmentManager", "Bump nesting of " + var4.b + " to " + var4.b.y);
               }
            }
         }
      }

   }

   void a(i var1) {
      this.c.add(var1);
      var1.c = this.d;
      var1.d = this.e;
      var1.e = this.f;
      var1.f = this.g;
   }

   void a(u var1) {
      for(int var2 = 0; var2 < this.c.size(); ++var2) {
         i var3 = (i)this.c.get(var2);
         if (b(var3)) {
            var3.b.a(var1);
         }
      }

   }

   public void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      this.a(var1, var3, true);
   }

   public void a(String var1, PrintWriter var2, boolean var3) {
      if (var3) {
         var2.print(var1);
         var2.print("mName=");
         var2.print(this.l);
         var2.print(" mIndex=");
         var2.print(this.n);
         var2.print(" mCommitted=");
         var2.println(this.m);
         if (this.h != 0) {
            var2.print(var1);
            var2.print("mTransition=#");
            var2.print(Integer.toHexString(this.h));
            var2.print(" mTransitionStyle=#");
            var2.println(Integer.toHexString(this.i));
         }

         if (this.d != 0 || this.e != 0) {
            var2.print(var1);
            var2.print("mEnterAnim=#");
            var2.print(Integer.toHexString(this.d));
            var2.print(" mExitAnim=#");
            var2.println(Integer.toHexString(this.e));
         }

         if (this.f != 0 || this.g != 0) {
            var2.print(var1);
            var2.print("mPopEnterAnim=#");
            var2.print(Integer.toHexString(this.f));
            var2.print(" mPopExitAnim=#");
            var2.println(Integer.toHexString(this.g));
         }

         if (this.o != 0 || this.p != null) {
            var2.print(var1);
            var2.print("mBreadCrumbTitleRes=#");
            var2.print(Integer.toHexString(this.o));
            var2.print(" mBreadCrumbTitleText=");
            var2.println(this.p);
         }

         if (this.q != 0 || this.r != null) {
            var2.print(var1);
            var2.print("mBreadCrumbShortTitleRes=#");
            var2.print(Integer.toHexString(this.q));
            var2.print(" mBreadCrumbShortTitleText=");
            var2.println(this.r);
         }
      }

      if (!this.c.isEmpty()) {
         var2.print(var1);
         var2.println("Operations:");
         (new StringBuilder()).append(var1).append("    ").toString();
         int var4 = this.c.size();

         for(int var5 = 0; var5 < var4; ++var5) {
            i var6 = (i)this.c.get(var5);
            String var7;
            switch(var6.a) {
            case 0:
               var7 = "NULL";
               break;
            case 1:
               var7 = "ADD";
               break;
            case 2:
               var7 = "REPLACE";
               break;
            case 3:
               var7 = "REMOVE";
               break;
            case 4:
               var7 = "HIDE";
               break;
            case 5:
               var7 = "SHOW";
               break;
            case 6:
               var7 = "DETACH";
               break;
            case 7:
               var7 = "ATTACH";
               break;
            default:
               var7 = "cmd=" + var6.a;
            }

            var2.print(var1);
            var2.print("  Op #");
            var2.print(var5);
            var2.print(": ");
            var2.print(var7);
            var2.print(" ");
            var2.println(var6.b);
            if (var3) {
               if (var6.c != 0 || var6.d != 0) {
                  var2.print(var1);
                  var2.print("enterAnim=#");
                  var2.print(Integer.toHexString(var6.c));
                  var2.print(" exitAnim=#");
                  var2.println(Integer.toHexString(var6.d));
               }

               if (var6.e != 0 || var6.f != 0) {
                  var2.print(var1);
                  var2.print("popEnterAnim=#");
                  var2.print(Integer.toHexString(var6.e));
                  var2.print(" popExitAnim=#");
                  var2.println(Integer.toHexString(var6.f));
               }
            }
         }
      }

   }

   void a(ArrayList var1) {
      int var4;
      for(int var2 = 0; var2 < this.c.size(); var2 = var4 + 1) {
         i var3 = (i)this.c.get(var2);
         var4 = var2;
         switch(var3.a) {
         case 1:
         case 7:
            var1.add(var3.b);
            var4 = var2;
            break;
         case 2:
            p var5 = var3.b;
            int var6 = var5.F;
            int var7 = var1.size() - 1;

            boolean var12;
            int var13;
            for(var12 = false; var7 >= 0; var7 = var13) {
               p var8 = (p)var1.get(var7);
               boolean var9;
               boolean var11;
               if (var8.F == var6) {
                  if (var8 == var5) {
                     var9 = true;
                     var4 = var2;
                     var11 = var9;
                  } else {
                     i var10 = new i();
                     var10.a = 3;
                     var10.b = var8;
                     var10.c = var3.c;
                     var10.e = var3.e;
                     var10.d = var3.d;
                     var10.f = var3.f;
                     this.c.add(var2, var10);
                     var1.remove(var8);
                     var13 = var2 + 1;
                     var11 = var12;
                     var4 = var13;
                  }
               } else {
                  var9 = var12;
                  var4 = var2;
                  var11 = var9;
               }

               var13 = var7 - 1;
               var7 = var4;
               var12 = var11;
               var2 = var7;
            }

            if (var12) {
               this.c.remove(var2);
               var4 = var2 - 1;
            } else {
               var3.a = 1;
               var1.add(var5);
               var4 = var2;
            }
            break;
         case 3:
         case 6:
            var1.remove(var3.b);
            var4 = var2;
         case 4:
         case 5:
            break;
         default:
            var4 = var2;
         }
      }

   }

   boolean a(ArrayList var1, int var2, int var3) {
      boolean var4;
      if (var3 == var2) {
         var4 = false;
      } else {
         int var5 = this.c.size();
         int var6 = -1;
         int var7 = 0;

         while(true) {
            if (var7 >= var5) {
               var4 = false;
               break;
            }

            int var8 = ((i)this.c.get(var7)).b.F;
            if (var8 != 0 && var8 != var6) {
               var6 = var2;

               while(true) {
                  if (var6 >= var3) {
                     var6 = var8;
                     break;
                  }

                  h var9 = (h)var1.get(var6);
                  int var10 = var9.c.size();

                  for(int var11 = 0; var11 < var10; ++var11) {
                     if (((i)var9.c.get(var11)).b.F == var8) {
                        var4 = true;
                        return var4;
                     }
                  }

                  ++var6;
               }
            }

            ++var7;
         }
      }

      return var4;
   }

   public boolean a(ArrayList var1, ArrayList var2) {
      if (ah.a) {
         Log.v("FragmentManager", "Run: " + this);
      }

      var1.add(this);
      var2.add(false);
      if (this.j) {
         this.b.b(this);
      }

      return true;
   }

   public int b() {
      return this.a(true);
   }

   void b(ArrayList var1) {
      for(int var2 = 0; var2 < this.c.size(); ++var2) {
         i var3 = (i)this.c.get(var2);
         switch(var3.a) {
         case 1:
         case 7:
            var1.remove(var3.b);
         case 2:
         case 4:
         case 5:
         default:
            break;
         case 3:
         case 6:
            var1.add(var3.b);
         }
      }

   }

   void b(boolean var1) {
      for(int var2 = this.c.size() - 1; var2 >= 0; --var2) {
         i var3 = (i)this.c.get(var2);
         p var4 = var3.b;
         var4.a(ah.d(this.h), this.i);
         switch(var3.a) {
         case 1:
            var4.a(var3.f);
            this.b.g(var4);
            break;
         case 2:
         default:
            throw new IllegalArgumentException("Unknown cmd: " + var3.a);
         case 3:
            var4.a(var3.e);
            this.b.a(var4, false);
            break;
         case 4:
            var4.a(var3.e);
            this.b.i(var4);
            break;
         case 5:
            var4.a(var3.f);
            this.b.h(var4);
            break;
         case 6:
            var4.a(var3.e);
            this.b.k(var4);
            break;
         case 7:
            var4.a(var3.f);
            this.b.j(var4);
         }

         if (!this.u && var3.a != 3) {
            this.b.d(var4);
         }
      }

      if (!this.u && var1) {
         this.b.a(this.b.m, true);
      }

   }

   boolean b(int var1) {
      int var2 = this.c.size();
      int var3 = 0;

      boolean var4;
      while(true) {
         if (var3 >= var2) {
            var4 = false;
            break;
         }

         if (((i)this.c.get(var3)).b.F == var1) {
            var4 = true;
            break;
         }

         ++var3;
      }

      return var4;
   }

   void c() {
      int var1 = this.c.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         i var3 = (i)this.c.get(var2);
         p var4 = var3.b;
         var4.a(this.h, this.i);
         switch(var3.a) {
         case 1:
            var4.a(var3.c);
            this.b.a(var4, false);
            break;
         case 2:
         default:
            throw new IllegalArgumentException("Unknown cmd: " + var3.a);
         case 3:
            var4.a(var3.d);
            this.b.g(var4);
            break;
         case 4:
            var4.a(var3.d);
            this.b.h(var4);
            break;
         case 5:
            var4.a(var3.c);
            this.b.i(var4);
            break;
         case 6:
            var4.a(var3.d);
            this.b.j(var4);
            break;
         case 7:
            var4.a(var3.c);
            this.b.k(var4);
         }

         if (!this.u && var3.a != 1) {
            this.b.d(var4);
         }
      }

      if (!this.u) {
         this.b.a(this.b.m, true);
      }

   }

   boolean d() {
      boolean var1 = false;
      int var2 = 0;

      boolean var3;
      while(true) {
         var3 = var1;
         if (var2 >= this.c.size()) {
            break;
         }

         if (b((i)this.c.get(var2))) {
            var3 = true;
            break;
         }

         ++var2;
      }

      return var3;
   }

   public String e() {
      return this.l;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("BackStackEntry{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      if (this.n >= 0) {
         var1.append(" #");
         var1.append(this.n);
      }

      if (this.l != null) {
         var1.append(" ");
         var1.append(this.l);
      }

      var1.append("}");
      return var1.toString();
   }
}
