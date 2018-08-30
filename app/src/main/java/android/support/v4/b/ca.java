package android.support.v4.b;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;

public final class ca {
   private final CharSequence a;
   private final long b;
   private final CharSequence c;
   private String d;
   private Uri e;

   static Bundle[] a(List var0) {
      Bundle[] var1 = new Bundle[var0.size()];
      int var2 = var0.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3] = ((ca)var0.get(var3)).f();
      }

      return var1;
   }

   private Bundle f() {
      Bundle var1 = new Bundle();
      if (this.a != null) {
         var1.putCharSequence("text", this.a);
      }

      var1.putLong("time", this.b);
      if (this.c != null) {
         var1.putCharSequence("sender", this.c);
      }

      if (this.d != null) {
         var1.putString("type", this.d);
      }

      if (this.e != null) {
         var1.putParcelable("uri", this.e);
      }

      return var1;
   }

   public CharSequence a() {
      return this.a;
   }

   public long b() {
      return this.b;
   }

   public CharSequence c() {
      return this.c;
   }

   public String d() {
      return this.d;
   }

   public Uri e() {
      return this.e;
   }
}
