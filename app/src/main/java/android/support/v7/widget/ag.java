package android.support.v7.widget;

class ag {
   int a;
   int b;
   Object c;
   int d;

   ag(int var1, int var2, int var3, Object var4) {
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = var4;
   }

   String a() {
      String var1;
      switch(this.a) {
      case 1:
         var1 = "add";
         break;
      case 2:
         var1 = "rm";
         break;
      case 3:
      case 5:
      case 6:
      case 7:
      default:
         var1 = "??";
         break;
      case 4:
         var1 = "up";
         break;
      case 8:
         var1 = "mv";
      }

      return var1;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      boolean var3;
      if (this == var1) {
         var3 = var2;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ag var4 = (ag)var1;
         if (this.a != var4.a) {
            var3 = false;
         } else {
            if (this.a == 8 && Math.abs(this.d - this.b) == 1 && this.d == var4.b) {
               var3 = var2;
               if (this.b == var4.d) {
                  return var3;
               }
            }

            if (this.d != var4.d) {
               var3 = false;
            } else if (this.b != var4.b) {
               var3 = false;
            } else if (this.c != null) {
               var3 = var2;
               if (!this.c.equals(var4.c)) {
                  var3 = false;
               }
            } else {
               var3 = var2;
               if (var4.c != null) {
                  var3 = false;
               }
            }
         }
      } else {
         var3 = false;
      }

      return var3;
   }

   public int hashCode() {
      return (this.a * 31 + this.b) * 31 + this.d;
   }

   public String toString() {
      return Integer.toHexString(System.identityHashCode(this)) + "[" + this.a() + ",s:" + this.b + "c:" + this.d + ",p:" + this.c + "]";
   }
}
