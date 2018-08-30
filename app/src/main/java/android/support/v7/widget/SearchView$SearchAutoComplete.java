package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.InputMethodManager;

public class SearchView$SearchAutoComplete extends ah {
   private int a;
   private SearchView b;

   public SearchView$SearchAutoComplete(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SearchView$SearchAutoComplete(Context var1, AttributeSet var2) {
      this(var1, var2, android.support.v7.a.b.autoCompleteTextViewStyle);
   }

   public SearchView$SearchAutoComplete(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a = this.getThreshold();
   }

   private int getSearchViewTextMinWidthDp() {
      Configuration var1 = this.getResources().getConfiguration();
      int var2 = android.support.v4.c.a.a.b(this.getResources());
      int var3 = android.support.v4.c.a.a.a(this.getResources());
      short var4;
      if (var2 >= 960 && var3 >= 720 && var1.orientation == 2) {
         var4 = 256;
      } else if (var2 < 600 && (var2 < 640 || var3 < 480)) {
         var4 = 160;
      } else {
         var4 = 192;
      }

      return var4;
   }

   public boolean enoughToFilter() {
      boolean var1;
      if (this.a > 0 && !super.enoughToFilter()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      DisplayMetrics var1 = this.getResources().getDisplayMetrics();
      this.setMinWidth((int)TypedValue.applyDimension(1, (float)this.getSearchViewTextMinWidthDp(), var1));
   }

   protected void onFocusChanged(boolean var1, int var2, Rect var3) {
      super.onFocusChanged(var1, var2, var3);
      this.b.h();
   }

   public boolean onKeyPreIme(int var1, KeyEvent var2) {
      boolean var3 = true;
      boolean var5;
      if (var1 == 4) {
         DispatcherState var4;
         if (var2.getAction() == 0 && var2.getRepeatCount() == 0) {
            var4 = this.getKeyDispatcherState();
            var5 = var3;
            if (var4 != null) {
               var4.startTracking(var2, this);
               var5 = var3;
            }

            return var5;
         }

         if (var2.getAction() == 1) {
            var4 = this.getKeyDispatcherState();
            if (var4 != null) {
               var4.handleUpEvent(var2);
            }

            if (var2.isTracking() && !var2.isCanceled()) {
               this.b.clearFocus();
               this.b.setImeVisibility(false);
               var5 = var3;
               return var5;
            }
         }
      }

      var5 = super.onKeyPreIme(var1, var2);
      return var5;
   }

   public void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      if (var1 && this.b.hasFocus() && this.getVisibility() == 0) {
         ((InputMethodManager)this.getContext().getSystemService("input_method")).showSoftInput(this, 0);
         if (SearchView.a(this.getContext())) {
            SearchView.i.a(this, true);
         }
      }

   }

   public void performCompletion() {
   }

   protected void replaceText(CharSequence var1) {
   }

   void setSearchView(SearchView var1) {
      this.b = var1;
   }

   public void setThreshold(int var1) {
      super.setThreshold(var1);
      this.a = var1;
   }
}
