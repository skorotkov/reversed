package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import java.util.WeakHashMap;

public class SearchView extends cl implements android.support.v7.view.b {
   static final fj i = new fj();
   private OnClickListener A;
   private boolean B;
   private boolean C;
   private boolean D;
   private CharSequence E;
   private boolean F;
   private boolean G;
   private int H;
   private boolean I;
   private CharSequence J;
   private boolean K;
   private int L;
   private Bundle M;
   private Runnable N;
   private final Runnable O;
   private Runnable P;
   private final WeakHashMap Q;
   final SearchView$SearchAutoComplete a;
   final ImageView b;
   final ImageView c;
   final ImageView d;
   final ImageView e;
   OnFocusChangeListener f;
   android.support.v4.widget.d g;
   SearchableInfo h;
   private final View j;
   private final View k;
   private fp l;
   private Rect m;
   private Rect n;
   private int[] o;
   private int[] p;
   private final ImageView q;
   private final Drawable r;
   private final int s;
   private final int t;
   private final Intent u;
   private final Intent v;
   private final CharSequence w;
   private fl x;
   private fk y;
   private fm z;

   private Intent a(String var1, Uri var2, String var3, String var4, int var5, String var6) {
      Intent var7 = new Intent(var1);
      var7.addFlags(268435456);
      if (var2 != null) {
         var7.setData(var2);
      }

      var7.putExtra("user_query", this.J);
      if (var4 != null) {
         var7.putExtra("query", var4);
      }

      if (var3 != null) {
         var7.putExtra("intent_extra_data_key", var3);
      }

      if (this.M != null) {
         var7.putExtra("app_data", this.M);
      }

      if (var5 != 0) {
         var7.putExtra("action_key", var5);
         var7.putExtra("action_msg", var6);
      }

      var7.setComponent(this.h.getSearchActivity());
      return var7;
   }

   private void a(View var1, Rect var2) {
      var1.getLocationInWindow(this.o);
      this.getLocationInWindow(this.p);
      int var3 = this.o[1] - this.p[1];
      int var4 = this.o[0] - this.p[0];
      var2.set(var4, var3, var1.getWidth() + var4, var1.getHeight() + var3);
   }

   private void a(boolean var1) {
      boolean var2 = true;
      byte var3 = 8;
      this.C = var1;
      byte var4;
      if (var1) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      boolean var5;
      if (!TextUtils.isEmpty(this.a.getText())) {
         var5 = true;
      } else {
         var5 = false;
      }

      this.b.setVisibility(var4);
      this.b(var5);
      View var6 = this.j;
      if (var1) {
         var4 = 8;
      } else {
         var4 = 0;
      }

      var6.setVisibility(var4);
      var4 = var3;
      if (this.q.getDrawable() != null) {
         if (this.B) {
            var4 = var3;
         } else {
            var4 = 0;
         }
      }

      this.q.setVisibility(var4);
      this.m();
      if (!var5) {
         var1 = var2;
      } else {
         var1 = false;
      }

      this.c(var1);
      this.l();
   }

   static boolean a(Context var0) {
      boolean var1;
      if (var0.getResources().getConfiguration().orientation == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private CharSequence b(CharSequence var1) {
      Object var2 = var1;
      if (this.B) {
         if (this.r == null) {
            var2 = var1;
         } else {
            int var3 = (int)((double)this.a.getTextSize() * 1.25D);
            this.r.setBounds(0, 0, var3, var3);
            var2 = new SpannableStringBuilder("   ");
            ((SpannableStringBuilder)var2).setSpan(new ImageSpan(this.r), 1, 2, 33);
            ((SpannableStringBuilder)var2).append(var1);
         }
      }

      return (CharSequence)var2;
   }

   private void b(boolean var1) {
      byte var2 = 8;
      byte var3 = var2;
      if (this.D) {
         var3 = var2;
         if (this.k()) {
            var3 = var2;
            if (this.hasFocus()) {
               label14: {
                  if (!var1) {
                     var3 = var2;
                     if (this.I) {
                        break label14;
                     }
                  }

                  var3 = 0;
               }
            }
         }
      }

      this.c.setVisibility(var3);
   }

   private void c(boolean var1) {
      byte var2;
      if (this.I && !this.c() && var1) {
         var2 = 0;
         this.c.setVisibility(8);
      } else {
         var2 = 8;
      }

      this.e.setVisibility(var2);
   }

   private int getPreferredHeight() {
      return this.getContext().getResources().getDimensionPixelSize(android.support.v7.a.e.abc_search_view_preferred_height);
   }

   private int getPreferredWidth() {
      return this.getContext().getResources().getDimensionPixelSize(android.support.v7.a.e.abc_search_view_preferred_width);
   }

   private boolean j() {
      boolean var1 = false;
      boolean var2 = var1;
      if (this.h != null) {
         var2 = var1;
         if (this.h.getVoiceSearchEnabled()) {
            Intent var3 = null;
            if (this.h.getVoiceSearchLaunchWebSearch()) {
               var3 = this.u;
            } else if (this.h.getVoiceSearchLaunchRecognizer()) {
               var3 = this.v;
            }

            var2 = var1;
            if (var3 != null) {
               var2 = var1;
               if (this.getContext().getPackageManager().resolveActivity(var3, 65536) != null) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   private boolean k() {
      boolean var1;
      if ((this.D || this.I) && !this.c()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void l() {
      byte var1 = 8;
      byte var2 = var1;
      if (this.k()) {
         label12: {
            if (this.c.getVisibility() != 0) {
               var2 = var1;
               if (this.e.getVisibility() != 0) {
                  break label12;
               }
            }

            var2 = 0;
         }
      }

      this.k.setVisibility(var2);
   }

   private void m() {
      boolean var1 = true;
      byte var2 = 0;
      boolean var3;
      if (!TextUtils.isEmpty(this.a.getText())) {
         var3 = true;
      } else {
         var3 = false;
      }

      boolean var4 = var1;
      if (!var3) {
         if (this.B && !this.K) {
            var4 = var1;
         } else {
            var4 = false;
         }
      }

      ImageView var5 = this.d;
      byte var7;
      if (var4) {
         var7 = var2;
      } else {
         var7 = 8;
      }

      var5.setVisibility(var7);
      Drawable var6 = this.d.getDrawable();
      if (var6 != null) {
         int[] var8;
         if (var3) {
            var8 = ENABLED_STATE_SET;
         } else {
            var8 = EMPTY_STATE_SET;
         }

         var6.setState(var8);
      }

   }

   private void n() {
      this.post(this.O);
   }

   private void o() {
      CharSequence var1 = this.getQueryHint();
      SearchView$SearchAutoComplete var2 = this.a;
      Object var3 = var1;
      if (var1 == null) {
         var3 = "";
      }

      var2.setHint(this.b((CharSequence)var3));
   }

   private void p() {
      byte var1 = 1;
      this.a.setThreshold(this.h.getSuggestThreshold());
      this.a.setImeOptions(this.h.getImeOptions());
      int var2 = this.h.getInputType();
      int var3 = var2;
      if ((var2 & 15) == 1) {
         var2 &= -65537;
         var3 = var2;
         if (this.h.getSuggestAuthority() != null) {
            var3 = var2 | 65536 | 524288;
         }
      }

      this.a.setInputType(var3);
      if (this.g != null) {
         this.g.a((Cursor)null);
      }

      if (this.h.getSuggestAuthority() != null) {
         this.g = new ga(this.getContext(), this, this.h, this.Q);
         this.a.setAdapter(this.g);
         ga var4 = (ga)this.g;
         byte var5 = var1;
         if (this.F) {
            var5 = 2;
         }

         var4.a(var5);
      }

   }

   private void q() {
      this.a.dismissDropDown();
   }

   private void setQuery(CharSequence var1) {
      this.a.setText(var1);
      SearchView$SearchAutoComplete var2 = this.a;
      int var3;
      if (TextUtils.isEmpty(var1)) {
         var3 = 0;
      } else {
         var3 = var1.length();
      }

      var2.setSelection(var3);
   }

   public void a() {
      if (!this.K) {
         this.K = true;
         this.L = this.a.getImeOptions();
         this.a.setImeOptions(this.L | 33554432);
         this.a.setText("");
         this.setIconified(false);
      }

   }

   void a(int var1, String var2, String var3) {
      Intent var4 = this.a("android.intent.action.SEARCH", (Uri)null, (String)null, var3, var1, var2);
      this.getContext().startActivity(var4);
   }

   void a(CharSequence var1) {
      this.setQuery(var1);
   }

   public void a(CharSequence var1, boolean var2) {
      this.a.setText(var1);
      if (var1 != null) {
         this.a.setSelection(this.a.length());
         this.J = var1;
      }

      if (var2 && !TextUtils.isEmpty(var1)) {
         this.d();
      }

   }

   public void b() {
      this.a("", false);
      this.clearFocus();
      this.a(true);
      this.a.setImeOptions(this.L);
      this.K = false;
   }

   public boolean c() {
      return this.C;
   }

   public void clearFocus() {
      this.G = true;
      this.setImeVisibility(false);
      super.clearFocus();
      this.a.clearFocus();
      this.G = false;
   }

   void d() {
      Editable var1 = this.a.getText();
      if (var1 != null && TextUtils.getTrimmedLength(var1) > 0 && (this.x == null || !this.x.a(var1.toString()))) {
         if (this.h != null) {
            this.a(0, (String)null, var1.toString());
         }

         this.setImeVisibility(false);
         this.q();
      }

   }

   void e() {
      if (TextUtils.isEmpty(this.a.getText())) {
         if (this.B && (this.y == null || !this.y.a())) {
            this.clearFocus();
            this.a(true);
         }
      } else {
         this.a.setText("");
         this.a.requestFocus();
         this.setImeVisibility(true);
      }

   }

   void f() {
      this.a(false);
      this.a.requestFocus();
      this.setImeVisibility(true);
      if (this.A != null) {
         this.A.onClick(this);
      }

   }

   public int getImeOptions() {
      return this.a.getImeOptions();
   }

   public int getInputType() {
      return this.a.getInputType();
   }

   public int getMaxWidth() {
      return this.H;
   }

   public CharSequence getQuery() {
      return this.a.getText();
   }

   public CharSequence getQueryHint() {
      CharSequence var1;
      if (this.E != null) {
         var1 = this.E;
      } else if (this.h != null && this.h.getHintId() != 0) {
         var1 = this.getContext().getText(this.h.getHintId());
      } else {
         var1 = this.w;
      }

      return var1;
   }

   int getSuggestionCommitIconResId() {
      return this.t;
   }

   int getSuggestionRowLayout() {
      return this.s;
   }

   public android.support.v4.widget.d getSuggestionsAdapter() {
      return this.g;
   }

   void h() {
      this.a(this.c());
      this.n();
      if (this.a.hasFocus()) {
         this.i();
      }

   }

   void i() {
      i.a(this.a);
      i.b(this.a);
   }

   protected void onDetachedFromWindow() {
      this.removeCallbacks(this.O);
      this.post(this.P);
      super.onDetachedFromWindow();
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      if (var1) {
         this.a(this.a, this.m);
         this.n.set(this.m.left, 0, this.m.right, var5 - var3);
         if (this.l == null) {
            this.l = new fp(this.n, this.m, this.a);
            this.setTouchDelegate(this.l);
         } else {
            this.l.a(this.n, this.m);
         }
      }

   }

   protected void onMeasure(int var1, int var2) {
      if (this.c()) {
         super.onMeasure(var1, var2);
      } else {
         int var3 = MeasureSpec.getMode(var1);
         int var4 = MeasureSpec.getSize(var1);
         switch(var3) {
         case Integer.MIN_VALUE:
            if (this.H > 0) {
               var1 = Math.min(this.H, var4);
            } else {
               var1 = Math.min(this.getPreferredWidth(), var4);
            }
            break;
         case 0:
            if (this.H > 0) {
               var1 = this.H;
            } else {
               var1 = this.getPreferredWidth();
            }
            break;
         case 1073741824:
            var1 = var4;
            if (this.H > 0) {
               var1 = Math.min(this.H, var4);
            }
            break;
         default:
            var1 = var4;
         }

         var4 = MeasureSpec.getMode(var2);
         var2 = MeasureSpec.getSize(var2);
         switch(var4) {
         case Integer.MIN_VALUE:
            var2 = Math.min(this.getPreferredHeight(), var2);
            break;
         case 0:
            var2 = this.getPreferredHeight();
         }

         super.onMeasure(MeasureSpec.makeMeasureSpec(var1, 1073741824), MeasureSpec.makeMeasureSpec(var2, 1073741824));
      }

   }

   protected void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof fn)) {
         super.onRestoreInstanceState(var1);
      } else {
         fn var2 = (fn)var1;
         super.onRestoreInstanceState(var2.a());
         this.a(var2.b);
         this.requestLayout();
      }

   }

   protected Parcelable onSaveInstanceState() {
      fn var1 = new fn(super.onSaveInstanceState());
      var1.b = this.c();
      return var1;
   }

   public void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      this.n();
   }

   public boolean requestFocus(int var1, Rect var2) {
      boolean var3 = false;
      if (!this.G && this.isFocusable()) {
         if (!this.c()) {
            var3 = this.a.requestFocus(var1, var2);
            if (var3) {
               this.a(false);
            }
         } else {
            var3 = super.requestFocus(var1, var2);
         }
      }

      return var3;
   }

   public void setAppSearchData(Bundle var1) {
      this.M = var1;
   }

   public void setIconified(boolean var1) {
      if (var1) {
         this.e();
      } else {
         this.f();
      }

   }

   public void setIconifiedByDefault(boolean var1) {
      if (this.B != var1) {
         this.B = var1;
         this.a(var1);
         this.o();
      }

   }

   public void setImeOptions(int var1) {
      this.a.setImeOptions(var1);
   }

   void setImeVisibility(boolean var1) {
      if (var1) {
         this.post(this.N);
      } else {
         this.removeCallbacks(this.N);
         InputMethodManager var2 = (InputMethodManager)this.getContext().getSystemService("input_method");
         if (var2 != null) {
            var2.hideSoftInputFromWindow(this.getWindowToken(), 0);
         }
      }

   }

   public void setInputType(int var1) {
      this.a.setInputType(var1);
   }

   public void setMaxWidth(int var1) {
      this.H = var1;
      this.requestLayout();
   }

   public void setOnCloseListener(fk var1) {
      this.y = var1;
   }

   public void setOnQueryTextFocusChangeListener(OnFocusChangeListener var1) {
      this.f = var1;
   }

   public void setOnQueryTextListener(fl var1) {
      this.x = var1;
   }

   public void setOnSearchClickListener(OnClickListener var1) {
      this.A = var1;
   }

   public void setOnSuggestionListener(fm var1) {
      this.z = var1;
   }

   public void setQueryHint(CharSequence var1) {
      this.E = var1;
      this.o();
   }

   public void setQueryRefinementEnabled(boolean var1) {
      this.F = var1;
      if (this.g instanceof ga) {
         ga var2 = (ga)this.g;
         byte var3;
         if (var1) {
            var3 = 2;
         } else {
            var3 = 1;
         }

         var2.a(var3);
      }

   }

   public void setSearchableInfo(SearchableInfo var1) {
      this.h = var1;
      if (this.h != null) {
         this.p();
         this.o();
      }

      this.I = this.j();
      if (this.I) {
         this.a.setPrivateImeOptions("nm");
      }

      this.a(this.c());
   }

   public void setSubmitButtonEnabled(boolean var1) {
      this.D = var1;
      this.a(this.c());
   }

   public void setSuggestionsAdapter(android.support.v4.widget.d var1) {
      this.g = var1;
      this.a.setAdapter(this.g);
   }
}
