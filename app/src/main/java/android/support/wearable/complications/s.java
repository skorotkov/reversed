package android.support.wearable.complications;

import android.annotation.TargetApi;
import java.util.concurrent.TimeUnit;

@TargetApi(24)
public class s implements k {
   private final long a;
   private final long b;
   private final int c;
   private final boolean d;
   private final TimeUnit e;

   public s(long var1, long var3, int var5, boolean var6, TimeUnit var7) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var6;
      this.e = var7;
   }

   long a() {
      return this.a;
   }

   long b() {
      return this.b;
   }

   int c() {
      return this.c;
   }

   boolean d() {
      return this.d;
   }

   TimeUnit e() {
      return this.e;
   }
}
