package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;

public class t extends cm {
   @ExportedProperty
   public boolean a;
   @ExportedProperty
   public int b;
   @ExportedProperty
   public int c;
   @ExportedProperty
   public boolean d;
   @ExportedProperty
   public boolean e;
   boolean f;

   public t(int var1, int var2) {
      super(var1, var2);
      this.a = false;
   }

   public t(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public t(t var1) {
      super(var1);
      this.a = var1.a;
   }

   public t(LayoutParams var1) {
      super(var1);
   }
}
