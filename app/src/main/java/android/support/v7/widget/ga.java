package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

class ga extends android.support.v4.widget.ag implements OnClickListener {
   private final SearchManager j;
   private final SearchView k;
   private final SearchableInfo l;
   private final Context m;
   private final WeakHashMap n;
   private final int o;
   private boolean p = false;
   private int q = 1;
   private ColorStateList r;
   private int s = -1;
   private int t = -1;
   private int u = -1;
   private int v = -1;
   private int w = -1;
   private int x = -1;

   public ga(Context var1, SearchView var2, SearchableInfo var3, WeakHashMap var4) {
      super(var1, var2.getSuggestionRowLayout(), (Cursor)null, true);
      this.j = (SearchManager)this.d.getSystemService("search");
      this.k = var2;
      this.l = var3;
      this.o = var2.getSuggestionCommitIconResId();
      this.m = var1;
      this.n = var4;
   }

   private Drawable a(ComponentName var1) {
      Object var2 = null;
      String var3 = var1.flattenToShortString();
      ConstantState var5;
      Drawable var6;
      if (this.n.containsKey(var3)) {
         var5 = (ConstantState)this.n.get(var3);
         if (var5 == null) {
            var6 = null;
         } else {
            var6 = var5.newDrawable(this.m.getResources());
         }
      } else {
         Drawable var4 = this.b(var1);
         if (var4 == null) {
            var5 = (ConstantState)var2;
         } else {
            var5 = var4.getConstantState();
         }

         this.n.put(var3, var5);
         var6 = var4;
      }

      return var6;
   }

   private Drawable a(String param1) {
      // $FF: Couldn't be decompiled
   }

   private static String a(Cursor var0, int var1) {
      Object var2 = null;
      String var4;
      if (var1 == -1) {
         var4 = (String)var2;
      } else {
         try {
            var4 = var0.getString(var1);
         } catch (Exception var3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", var3);
            var4 = (String)var2;
         }
      }

      return var4;
   }

   public static String a(Cursor var0, String var1) {
      return a(var0, var0.getColumnIndex(var1));
   }

   private void a(ImageView var1, Drawable var2, int var3) {
      var1.setImageDrawable(var2);
      if (var2 == null) {
         var1.setVisibility(var3);
      } else {
         var1.setVisibility(0);
         var2.setVisible(false, false);
         var2.setVisible(true, false);
      }

   }

   private void a(TextView var1, CharSequence var2) {
      var1.setText(var2);
      if (TextUtils.isEmpty(var2)) {
         var1.setVisibility(8);
      } else {
         var1.setVisibility(0);
      }

   }

   private void a(String var1, Drawable var2) {
      if (var2 != null) {
         this.n.put(var1, var2.getConstantState());
      }

   }

   private Drawable b(ComponentName var1) {
      Object var2 = null;
      PackageManager var3 = this.d.getPackageManager();

      ActivityInfo var4;
      Drawable var7;
      try {
         var4 = var3.getActivityInfo(var1, 128);
      } catch (NameNotFoundException var6) {
         Log.w("SuggestionsAdapter", var6.toString());
         var7 = (Drawable)var2;
         return var7;
      }

      int var5 = var4.getIconResource();
      if (var5 == 0) {
         var7 = (Drawable)var2;
      } else {
         Drawable var8 = var3.getDrawable(var1.getPackageName(), var5, var4.applicationInfo);
         if (var8 == null) {
            Log.w("SuggestionsAdapter", "Invalid icon resource " + var5 + " for " + var1.flattenToShortString());
            var7 = (Drawable)var2;
         } else {
            var7 = var8;
         }
      }

      return var7;
   }

   private Drawable b(Uri param1) {
      // $FF: Couldn't be decompiled
   }

   private Drawable b(String var1) {
      ConstantState var2 = (ConstantState)this.n.get(var1);
      Drawable var3;
      if (var2 == null) {
         var3 = null;
      } else {
         var3 = var2.newDrawable();
      }

      return var3;
   }

   private CharSequence b(CharSequence var1) {
      if (this.r == null) {
         TypedValue var2 = new TypedValue();
         this.d.getTheme().resolveAttribute(android.support.v7.a.b.textColorSearchUrl, var2, true);
         this.r = this.d.getResources().getColorStateList(var2.resourceId);
      }

      SpannableString var3 = new SpannableString(var1);
      var3.setSpan(new TextAppearanceSpan((String)null, 0, 0, this.r, (ColorStateList)null), 0, var1.length(), 33);
      return var3;
   }

   private void d(Cursor var1) {
      Bundle var2;
      if (var1 != null) {
         var2 = var1.getExtras();
      } else {
         var2 = null;
      }

      if (var2 != null && var2.getBoolean("in_progress")) {
      }

   }

   private Drawable e(Cursor var1) {
      Drawable var2;
      if (this.v == -1) {
         var2 = null;
      } else {
         Drawable var3 = this.a(var1.getString(this.v));
         var2 = var3;
         if (var3 == null) {
            var2 = this.g(var1);
         }
      }

      return var2;
   }

   private Drawable f(Cursor var1) {
      Drawable var2;
      if (this.w == -1) {
         var2 = null;
      } else {
         var2 = this.a(var1.getString(this.w));
      }

      return var2;
   }

   private Drawable g(Cursor var1) {
      Drawable var2 = this.a(this.l.getSearchActivity());
      if (var2 == null) {
         var2 = this.d.getPackageManager().getDefaultActivityIcon();
      }

      return var2;
   }

   Cursor a(SearchableInfo var1, String var2, int var3) {
      Cursor var4 = null;
      if (var1 != null) {
         String var5 = var1.getSuggestAuthority();
         if (var5 != null) {
            Builder var8 = (new Builder()).scheme("content").authority(var5).query("").fragment("");
            var5 = var1.getSuggestPath();
            if (var5 != null) {
               var8.appendEncodedPath(var5);
            }

            var8.appendPath("search_suggest_query");
            var5 = var1.getSuggestSelection();
            String[] var6;
            if (var5 != null) {
               var6 = new String[]{var2};
            } else {
               var8.appendPath(var2);
               var6 = null;
            }

            if (var3 > 0) {
               var8.appendQueryParameter("limit", String.valueOf(var3));
            }

            Uri var7 = var8.build();
            var4 = this.d.getContentResolver().query(var7, (String[])null, var5, var6, (String)null);
         }
      }

      return var4;
   }

   public Cursor a(CharSequence param1) {
      // $FF: Couldn't be decompiled
   }

   Drawable a(Uri var1) {
      String var2 = var1.getAuthority();
      if (TextUtils.isEmpty(var2)) {
         throw new FileNotFoundException("No authority: " + var1);
      } else {
         Resources var3;
         try {
            var3 = this.d.getPackageManager().getResourcesForApplication(var2);
         } catch (NameNotFoundException var7) {
            throw new FileNotFoundException("No package found for authority: " + var1);
         }

         List var4 = var1.getPathSegments();
         if (var4 == null) {
            throw new FileNotFoundException("No path: " + var1);
         } else {
            int var5 = var4.size();
            if (var5 == 1) {
               try {
                  var5 = Integer.parseInt((String)var4.get(0));
               } catch (NumberFormatException var6) {
                  throw new FileNotFoundException("Single path segment is not a resource ID: " + var1);
               }
            } else {
               if (var5 != 2) {
                  throw new FileNotFoundException("More than two path segments: " + var1);
               }

               var5 = var3.getIdentifier((String)var4.get(1), (String)var4.get(0), var2);
            }

            if (var5 == 0) {
               throw new FileNotFoundException("No resource found for: " + var1);
            } else {
               return var3.getDrawable(var5);
            }
         }
      }
   }

   public View a(Context var1, Cursor var2, ViewGroup var3) {
      View var4 = super.a(var1, var2, var3);
      var4.setTag(new gb(var4));
      ((ImageView)var4.findViewById(android.support.v7.a.g.edit_query)).setImageResource(this.o);
      return var4;
   }

   public void a(int var1) {
      this.q = var1;
   }

   public void a(Cursor param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(View var1, Context var2, Cursor var3) {
      gb var7 = (gb)var1.getTag();
      int var4;
      if (this.x != -1) {
         var4 = var3.getInt(this.x);
      } else {
         var4 = 0;
      }

      String var5;
      if (var7.a != null) {
         var5 = a(var3, this.s);
         this.a((TextView)var7.a, (CharSequence)var5);
      }

      if (var7.b != null) {
         var5 = a(var3, this.u);
         Object var6;
         if (var5 != null) {
            var6 = this.b((CharSequence)var5);
         } else {
            var6 = a(var3, this.t);
         }

         if (TextUtils.isEmpty((CharSequence)var6)) {
            if (var7.a != null) {
               var7.a.setSingleLine(false);
               var7.a.setMaxLines(2);
            }
         } else if (var7.a != null) {
            var7.a.setSingleLine(true);
            var7.a.setMaxLines(1);
         }

         this.a((TextView)var7.b, (CharSequence)var6);
      }

      if (var7.c != null) {
         this.a((ImageView)var7.c, (Drawable)this.e(var3), 4);
      }

      if (var7.d != null) {
         this.a((ImageView)var7.d, (Drawable)this.f(var3), 8);
      }

      if (this.q != 2 && (this.q != 1 || (var4 & 1) == 0)) {
         var7.e.setVisibility(8);
      } else {
         var7.e.setVisibility(0);
         var7.e.setTag(var7.a.getText());
         var7.e.setOnClickListener(this);
      }

   }

   public CharSequence c(Cursor var1) {
      Object var2 = null;
      String var3;
      if (var1 == null) {
         var3 = (String)var2;
      } else {
         var3 = a(var1, "suggest_intent_query");
         if (var3 == null) {
            if (this.l.shouldRewriteQueryFromData()) {
               var3 = a(var1, "suggest_intent_data");
               if (var3 != null) {
                  return var3;
               }
            }

            var3 = (String)var2;
            if (this.l.shouldRewriteQueryFromText()) {
               String var4 = a(var1, "suggest_text_1");
               var3 = (String)var2;
               if (var4 != null) {
                  var3 = var4;
               }
            }
         }
      }

      return var3;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      try {
         var2 = super.getView(var1, var2, var3);
      } catch (RuntimeException var5) {
         Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", var5);
         var2 = this.a(this.d, this.c, var3);
         if (var2 != null) {
            ((gb)var2.getTag()).a.setText(var5.toString());
         }
      }

      return var2;
   }

   public boolean hasStableIds() {
      return false;
   }

   public void notifyDataSetChanged() {
      super.notifyDataSetChanged();
      this.d(this.a());
   }

   public void notifyDataSetInvalidated() {
      super.notifyDataSetInvalidated();
      this.d(this.a());
   }

   public void onClick(View var1) {
      Object var2 = var1.getTag();
      if (var2 instanceof CharSequence) {
         this.k.a((CharSequence)var2);
      }

   }
}
