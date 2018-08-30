package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

class fj {
   private Method a;
   private Method b;
   private Method c;
   private Method d;

   fj() {
      try {
         this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged");
         this.a.setAccessible(true);
      } catch (NoSuchMethodException var5) {
      }

      try {
         this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged");
         this.b.setAccessible(true);
      } catch (NoSuchMethodException var4) {
      }

      try {
         this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
         this.c.setAccessible(true);
      } catch (NoSuchMethodException var3) {
      }

      try {
         this.d = InputMethodManager.class.getMethod("showSoftInputUnchecked", Integer.TYPE, ResultReceiver.class);
         this.d.setAccessible(true);
      } catch (NoSuchMethodException var2) {
      }

   }

   void a(AutoCompleteTextView var1) {
      if (this.a != null) {
         try {
            this.a.invoke(var1);
         } catch (Exception var2) {
         }
      }

   }

   void a(AutoCompleteTextView var1, boolean var2) {
      if (this.c != null) {
         try {
            this.c.invoke(var1, var2);
         } catch (Exception var3) {
         }
      }

   }

   void b(AutoCompleteTextView var1) {
      if (this.b != null) {
         try {
            this.b.invoke(var1);
         } catch (Exception var2) {
         }
      }

   }
}
