package android.support.v7.widget;

class br {
   public ey a;
   public ey b;
   public int c;
   public int d;
   public int e;
   public int f;

   private br(ey var1, ey var2) {
      this.a = var1;
      this.b = var2;
   }

   br(ey var1, ey var2, int var3, int var4, int var5, int var6) {
      this(var1, var2);
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var6;
   }

   public String toString() {
      return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
   }
}
