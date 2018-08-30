package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public abstract class br extends ah {
   protected final Handler R = new Handler();
   private final Runnable a;
   private final int c;

   public br(int var1) {
      this.c = var1;
      this.a = new bs(this);
   }

   // $FF: synthetic method
   static Runnable a(br var0) {
      return var0.a;
   }

   public void a(Intent var1) {
      if (var1.getAction().equals("TrainingService.action.TRAINING_STARTED")) {
         this.f();
      } else if (var1.getAction().equals("TrainingService.action.TRAINING_STOPPED")) {
         this.r();
      } else if (var1.getAction().equals("TrainingService.action.TRAINING_RESUMED")) {
         this.f();
      } else if (var1.getAction().equals("TrainingService.action.TRAINING_PAUSED")) {
         this.r();
      }

   }

   public void a_(Bundle var1) {
      super.a_(var1);
      this.r();
   }

   public void b() {
      this.R.removeCallbacks(this.a);
      super.b();
   }

   public void d_() {
      super.d_();
      if (!this.Q.isPaused()) {
         this.f();
      }

   }

   void e(long var1) {
      this.r();
      if (!this.h()) {
         this.R.postAtTime(this.a, var1);
      }

   }

   public void f() {
      this.r();
      if (!this.h()) {
         this.R.post(this.a);
      }

   }

   public abstract void g();

   protected int i() {
      return this.c;
   }

   public void r() {
      this.R.removeCallbacks(this.a);
   }
}
