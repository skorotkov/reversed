package android.support.wearable.view;

import android.annotation.TargetApi;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

@Deprecated
@TargetApi(20)
public abstract class aa {
   public static final Drawable a = new ac((ab)null);
   public static final Point b = new Point(-1, -1);
   public static final Point c = new Point(-2, -2);
   private final DataSetObservable d = new DataSetObservable();
   private ad e;

   public abstract int a();

   public abstract int a(int var1);

   public Point a(Object var1) {
      return b;
   }

   public void a(DataSetObserver var1) {
      this.d.registerObserver(var1);
   }

   public void a(Parcelable var1, ClassLoader var2) {
   }

   void a(ad var1) {
      this.e = var1;
   }

   public void a(ViewGroup var1) {
   }

   public abstract void a(ViewGroup var1, int var2, int var3, Object var4);

   protected void a(Object var1, Point var2) {
   }

   public abstract boolean a(View var1, Object var2);

   public Drawable b(int var1) {
      return a;
   }

   public abstract Object b(ViewGroup var1, int var2, int var3);

   public void b() {
      this.d.notifyChanged();
   }

   public void b(DataSetObserver var1) {
      this.d.unregisterObserver(var1);
   }

   public void b(ViewGroup var1) {
   }

   public Drawable d(int var1, int var2) {
      return a;
   }

   public int e(int var1, int var2) {
      return 0;
   }

   public void f(int var1, int var2) {
   }
}
