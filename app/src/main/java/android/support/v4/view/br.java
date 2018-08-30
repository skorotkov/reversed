package android.support.v4.view;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class br {
   private DataSetObserver a;

   public float a(int var1) {
      return 1.0F;
   }

   public abstract int a();

   public int a(Object var1) {
      return -1;
   }

   @Deprecated
   public Object a(View var1, int var2) {
      throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
   }

   public Object a(ViewGroup var1, int var2) {
      return this.a((View)var1, var2);
   }

   void a(DataSetObserver param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(Parcelable var1, ClassLoader var2) {
   }

   @Deprecated
   public void a(View var1) {
   }

   @Deprecated
   public void a(View var1, int var2, Object var3) {
      throw new UnsupportedOperationException("Required method destroyItem was not overridden");
   }

   public void a(ViewGroup var1) {
      this.a((View)var1);
   }

   public void a(ViewGroup var1, int var2, Object var3) {
      this.a((View)var1, var2, var3);
   }

   public abstract boolean a(View var1, Object var2);

   public Parcelable b() {
      return null;
   }

   @Deprecated
   public void b(View var1) {
   }

   @Deprecated
   public void b(View var1, int var2, Object var3) {
   }

   public void b(ViewGroup var1) {
      this.b((View)var1);
   }

   public void b(ViewGroup var1, int var2, Object var3) {
      this.b((View)var1, var2, var3);
   }
}
