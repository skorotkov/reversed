package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build.VERSION;

public class h {
   static final n a;
   public int b = -1;
   private final Object c;

   static {
      if (VERSION.SDK_INT >= 24) {
         a = new l();
      } else if (VERSION.SDK_INT >= 23) {
         a = new k();
      } else if (VERSION.SDK_INT >= 22) {
         a = new j();
      } else if (VERSION.SDK_INT >= 21) {
         a = new i();
      } else if (VERSION.SDK_INT >= 19) {
         a = new r();
      } else if (VERSION.SDK_INT >= 18) {
         a = new q();
      } else if (VERSION.SDK_INT >= 17) {
         a = new p();
      } else if (VERSION.SDK_INT >= 16) {
         a = new o();
      } else if (VERSION.SDK_INT >= 14) {
         a = new m();
      } else {
         a = new s();
      }

   }

   public h(Object var1) {
      this.c = var1;
   }

   private static String b(int var0) {
      String var1;
      switch(var0) {
      case 1:
         var1 = "ACTION_FOCUS";
         break;
      case 2:
         var1 = "ACTION_CLEAR_FOCUS";
         break;
      case 4:
         var1 = "ACTION_SELECT";
         break;
      case 8:
         var1 = "ACTION_CLEAR_SELECTION";
         break;
      case 16:
         var1 = "ACTION_CLICK";
         break;
      case 32:
         var1 = "ACTION_LONG_CLICK";
         break;
      case 64:
         var1 = "ACTION_ACCESSIBILITY_FOCUS";
         break;
      case 128:
         var1 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
         break;
      case 256:
         var1 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
         break;
      case 512:
         var1 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
         break;
      case 1024:
         var1 = "ACTION_NEXT_HTML_ELEMENT";
         break;
      case 2048:
         var1 = "ACTION_PREVIOUS_HTML_ELEMENT";
         break;
      case 4096:
         var1 = "ACTION_SCROLL_FORWARD";
         break;
      case 8192:
         var1 = "ACTION_SCROLL_BACKWARD";
         break;
      case 16384:
         var1 = "ACTION_COPY";
         break;
      case 32768:
         var1 = "ACTION_PASTE";
         break;
      case 65536:
         var1 = "ACTION_CUT";
         break;
      case 131072:
         var1 = "ACTION_SET_SELECTION";
         break;
      default:
         var1 = "ACTION_UNKNOWN";
      }

      return var1;
   }

   public Object a() {
      return this.c;
   }

   public void a(int var1) {
      a.a(this.c, var1);
   }

   public void a(Rect var1) {
      a.a(this.c, var1);
   }

   public void a(CharSequence var1) {
      a.a(this.c, var1);
   }

   public void a(Object var1) {
      a.a(this.c, ((t)var1).a);
   }

   public void a(boolean var1) {
      a.a(this.c, var1);
   }

   public int b() {
      return a.a(this.c);
   }

   public void b(Rect var1) {
      a.b(this.c, var1);
   }

   public void b(Object var1) {
      a.b(this.c, ((u)var1).a);
   }

   public boolean c() {
      return a.f(this.c);
   }

   public boolean d() {
      return a.g(this.c);
   }

   public boolean e() {
      return a.j(this.c);
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 == null) {
            var2 = false;
         } else if (this.getClass() != var1.getClass()) {
            var2 = false;
         } else {
            h var3 = (h)var1;
            if (this.c == null) {
               if (var3.c != null) {
                  var2 = false;
               }
            } else if (!this.c.equals(var3.c)) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public boolean f() {
      return a.k(this.c);
   }

   public boolean g() {
      return a.o(this.c);
   }

   public boolean h() {
      return a.h(this.c);
   }

   public int hashCode() {
      int var1;
      if (this.c == null) {
         var1 = 0;
      } else {
         var1 = this.c.hashCode();
      }

      return var1;
   }

   public boolean i() {
      return a.l(this.c);
   }

   public boolean j() {
      return a.i(this.c);
   }

   public boolean k() {
      return a.m(this.c);
   }

   public boolean l() {
      return a.n(this.c);
   }

   public CharSequence m() {
      return a.d(this.c);
   }

   public CharSequence n() {
      return a.b(this.c);
   }

   public CharSequence o() {
      return a.e(this.c);
   }

   public CharSequence p() {
      return a.c(this.c);
   }

   public String q() {
      return a.p(this.c);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(super.toString());
      Rect var2 = new Rect();
      this.a(var2);
      var1.append("; boundsInParent: " + var2);
      this.b(var2);
      var1.append("; boundsInScreen: " + var2);
      var1.append("; packageName: ").append(this.m());
      var1.append("; className: ").append(this.n());
      var1.append("; text: ").append(this.o());
      var1.append("; contentDescription: ").append(this.p());
      var1.append("; viewId: ").append(this.q());
      var1.append("; checkable: ").append(this.c());
      var1.append("; checked: ").append(this.d());
      var1.append("; focusable: ").append(this.e());
      var1.append("; focused: ").append(this.f());
      var1.append("; selected: ").append(this.g());
      var1.append("; clickable: ").append(this.h());
      var1.append("; longClickable: ").append(this.i());
      var1.append("; enabled: ").append(this.j());
      var1.append("; password: ").append(this.k());
      var1.append("; scrollable: " + this.l());
      var1.append("; [");
      int var3 = this.b();

      while(var3 != 0) {
         int var4 = 1 << Integer.numberOfTrailingZeros(var3);
         int var5 = var3 & ~var4;
         var1.append(b(var4));
         var3 = var5;
         if (var5 != 0) {
            var1.append(", ");
            var3 = var5;
         }
      }

      var1.append("]");
      return var1.toString();
   }
}
