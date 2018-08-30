package android.support.v4.b;

import android.os.Bundle;
import android.os.Build.VERSION;

public final class dc extends dk {
   public static final dl a;
   private static final de g;
   private final String b;
   private final CharSequence c;
   private final CharSequence[] d;
   private final boolean e;
   private final Bundle f;

   static {
      if (VERSION.SDK_INT >= 20) {
         g = new df();
      } else if (VERSION.SDK_INT >= 16) {
         g = new dh();
      } else {
         g = new dg();
      }

      a = new dd();
   }

   public String a() {
      return this.b;
   }

   public CharSequence b() {
      return this.c;
   }

   public CharSequence[] c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public Bundle e() {
      return this.f;
   }
}
