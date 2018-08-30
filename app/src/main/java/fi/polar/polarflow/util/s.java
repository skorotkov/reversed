package fi.polar.polarflow.util;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

public class s implements Executor {
   final Queue a = new ArrayDeque();
   final Executor b;
   Runnable c;

   public s(Executor var1) {
      this.b = var1;
   }

   protected void a() {
      // $FF: Couldn't be decompiled
   }

   public void execute(Runnable var1) {
      synchronized(this){}

      try {
         Queue var2 = this.a;
         t var3 = new t(this, var1);
         var2.add(var3);
         if (this.c == null) {
            this.a();
         }
      } finally {
         ;
      }

   }
}
