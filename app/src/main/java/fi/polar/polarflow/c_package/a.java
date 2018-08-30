package fi.polar.polarflow.c_package;

import android.content.Context;
import fi.polar.polarflow.data.ExerciseSensor;

public abstract class a {
   protected final Context a;
   protected m b;
   protected final n c;
   protected boolean d;
   protected boolean e;
   protected boolean f;

   protected a(Context var1, n var2) {
      this.b = m.b;
      this.d = false;
      this.e = false;
      this.f = false;
      this.a = var1;
      this.c = var2;
   }

   protected abstract void a();

   protected void a(m var1) {
      this.a(var1, false);
   }

   protected void a(m var1, boolean var2) {
      if (var1 != this.b) {
         this.b = var1;
         this.d();
      } else if (var2) {
         this.d();
      }

   }

   public abstract void b();

   public abstract void c();

   protected abstract void d();

   public m e() {
      return this.b;
   }

   public void f() {
      this.f = true;
   }

   public void g() {
      this.f = false;
   }

   public void h() {
      this.a();
      this.e = true;
   }

   public void i() {
      this.e = false;
   }

   public ExerciseSensor j() {
      return null;
   }

   public String toString() {
      return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()) + "[type=" + this.c.name() + ",state=" + this.b.name() + "]";
   }
}
