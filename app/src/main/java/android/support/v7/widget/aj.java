package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import java.util.WeakHashMap;

public final class aj {
   private static final Mode a;
   private static aj b;
   private static final al c;
   private static final int[] d;
   private static final int[] e;
   private static final int[] f;
   private static final int[] g;
   private static final int[] h;
   private static final int[] i;
   private WeakHashMap j;
   private android.support.v4.g.a k;
   private android.support.v4.g.u l;
   private final Object m = new Object();
   private final WeakHashMap n = new WeakHashMap(0);
   private TypedValue o;
   private boolean p;

   static {
      a = Mode.SRC_IN;
      c = new al(6);
      d = new int[]{android.support.v7.a.f.abc_textfield_search_default_mtrl_alpha, android.support.v7.a.f.abc_textfield_default_mtrl_alpha, android.support.v7.a.f.abc_ab_share_pack_mtrl_alpha};
      e = new int[]{android.support.v7.a.f.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.a.f.abc_seekbar_tick_mark_material, android.support.v7.a.f.abc_ic_menu_share_mtrl_alpha, android.support.v7.a.f.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.a.f.abc_ic_menu_cut_mtrl_alpha, android.support.v7.a.f.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.a.f.abc_ic_menu_paste_mtrl_am_alpha};
      f = new int[]{android.support.v7.a.f.abc_textfield_activated_mtrl_alpha, android.support.v7.a.f.abc_textfield_search_activated_mtrl_alpha, android.support.v7.a.f.abc_cab_background_top_mtrl_alpha, android.support.v7.a.f.abc_text_cursor_material, android.support.v7.a.f.abc_text_select_handle_left_mtrl_dark, android.support.v7.a.f.abc_text_select_handle_middle_mtrl_dark, android.support.v7.a.f.abc_text_select_handle_right_mtrl_dark, android.support.v7.a.f.abc_text_select_handle_left_mtrl_light, android.support.v7.a.f.abc_text_select_handle_middle_mtrl_light, android.support.v7.a.f.abc_text_select_handle_right_mtrl_light};
      g = new int[]{android.support.v7.a.f.abc_popup_background_mtrl_mult, android.support.v7.a.f.abc_cab_background_internal_bg, android.support.v7.a.f.abc_menu_hardkey_panel_mtrl_mult};
      h = new int[]{android.support.v7.a.f.abc_tab_indicator_material, android.support.v7.a.f.abc_textfield_search_material};
      i = new int[]{android.support.v7.a.f.abc_btn_check_material, android.support.v7.a.f.abc_btn_radio_material};
   }

   private static long a(TypedValue var0) {
      return (long)var0.assetCookie << 32 | (long)var0.data;
   }

   private ColorStateList a(Context var1) {
      return this.f(var1, gc.a(var1, android.support.v7.a.b.colorButtonNormal));
   }

   static Mode a(int var0) {
      Mode var1 = null;
      if (var0 == android.support.v7.a.f.abc_switch_thumb_material) {
         var1 = Mode.MULTIPLY;
      }

      return var1;
   }

   public static PorterDuffColorFilter a(int var0, Mode var1) {
      PorterDuffColorFilter var2 = c.a(var0, var1);
      PorterDuffColorFilter var3 = var2;
      if (var2 == null) {
         var3 = new PorterDuffColorFilter(var0, var1);
         c.a(var0, var1, var3);
      }

      return var3;
   }

   private static PorterDuffColorFilter a(ColorStateList var0, Mode var1, int[] var2) {
      PorterDuffColorFilter var3;
      if (var0 != null && var1 != null) {
         var3 = a(var0.getColorForState(var2, 0), var1);
      } else {
         var3 = null;
      }

      return var3;
   }

   private Drawable a(Context var1, int var2, boolean var3, Drawable var4) {
      ColorStateList var5 = this.b(var1, var2);
      Drawable var8;
      if (var5 != null) {
         Drawable var6 = var4;
         if (bu.b(var4)) {
            var6 = var4.mutate();
         }

         var6 = android.support.v4.d.a.a.f(var6);
         android.support.v4.d.a.a.a(var6, var5);
         Mode var7 = a(var2);
         var8 = var6;
         if (var7 != null) {
            android.support.v4.d.a.a.a(var6, var7);
            var8 = var6;
         }
      } else {
         LayerDrawable var9;
         if (var2 == android.support.v7.a.f.abc_seekbar_track_material) {
            var9 = (LayerDrawable)var4;
            a(var9.findDrawableByLayerId(16908288), gc.a(var1, android.support.v7.a.b.colorControlNormal), a);
            a(var9.findDrawableByLayerId(16908303), gc.a(var1, android.support.v7.a.b.colorControlNormal), a);
            a(var9.findDrawableByLayerId(16908301), gc.a(var1, android.support.v7.a.b.colorControlActivated), a);
            var8 = var4;
         } else if (var2 != android.support.v7.a.f.abc_ratingbar_material && var2 != android.support.v7.a.f.abc_ratingbar_indicator_material && var2 != android.support.v7.a.f.abc_ratingbar_small_material) {
            var8 = var4;
            if (!a(var1, var2, var4)) {
               var8 = var4;
               if (var3) {
                  var8 = null;
               }
            }
         } else {
            var9 = (LayerDrawable)var4;
            a(var9.findDrawableByLayerId(16908288), gc.c(var1, android.support.v7.a.b.colorControlNormal), a);
            a(var9.findDrawableByLayerId(16908303), gc.a(var1, android.support.v7.a.b.colorControlActivated), a);
            a(var9.findDrawableByLayerId(16908301), gc.a(var1, android.support.v7.a.b.colorControlActivated), a);
            var8 = var4;
         }
      }

      return var8;
   }

   private Drawable a(Context param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public static aj a() {
      if (b == null) {
         b = new aj();
         a(b);
      }

      return b;
   }

   private void a(Context var1, int var2, ColorStateList var3) {
      if (this.j == null) {
         this.j = new WeakHashMap();
      }

      android.support.v4.g.u var4 = (android.support.v4.g.u)this.j.get(var1);
      android.support.v4.g.u var5 = var4;
      if (var4 == null) {
         var5 = new android.support.v4.g.u();
         this.j.put(var1, var5);
      }

      var5.c(var2, var3);
   }

   private static void a(Drawable var0, int var1, Mode var2) {
      Drawable var3 = var0;
      if (bu.b(var0)) {
         var3 = var0.mutate();
      }

      Mode var4 = var2;
      if (var2 == null) {
         var4 = a;
      }

      var3.setColorFilter(a(var1, var4));
   }

   static void a(Drawable var0, gf var1, int[] var2) {
      if (bu.b(var0) && var0.mutate() != var0) {
         Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
      } else {
         if (!var1.d && !var1.c) {
            var0.clearColorFilter();
         } else {
            ColorStateList var3;
            if (var1.d) {
               var3 = var1.a;
            } else {
               var3 = null;
            }

            Mode var4;
            if (var1.c) {
               var4 = var1.b;
            } else {
               var4 = a;
            }

            var0.setColorFilter(a(var3, var4, var2));
         }

         if (VERSION.SDK_INT <= 23) {
            var0.invalidateSelf();
         }
      }

   }

   private static void a(aj var0) {
      if (VERSION.SDK_INT < 24) {
         var0.a("vector", new an());
         if (VERSION.SDK_INT >= 11) {
            var0.a("animated-vector", new ak());
         }
      }

   }

   private void a(String var1, am var2) {
      if (this.k == null) {
         this.k = new android.support.v4.g.a();
      }

      this.k.put(var1, var2);
   }

   static boolean a(Context var0, int var1, Drawable var2) {
      boolean var3 = true;
      Mode var4 = a;
      int var5;
      boolean var6;
      if (a(d, var1)) {
         var5 = android.support.v7.a.b.colorControlNormal;
         var6 = true;
         var1 = -1;
      } else if (a(f, var1)) {
         var5 = android.support.v7.a.b.colorControlActivated;
         var6 = true;
         var1 = -1;
      } else if (a(g, var1)) {
         var4 = Mode.MULTIPLY;
         var6 = true;
         var5 = 16842801;
         var1 = -1;
      } else if (var1 == android.support.v7.a.f.abc_list_divider_mtrl_alpha) {
         var5 = 16842800;
         var1 = Math.round(40.8F);
         var6 = true;
      } else if (var1 == android.support.v7.a.f.abc_dialog_material_background) {
         var5 = 16842801;
         var6 = true;
         var1 = -1;
      } else {
         var1 = -1;
         var5 = 0;
         var6 = false;
      }

      boolean var8;
      if (var6) {
         Drawable var7 = var2;
         if (bu.b(var2)) {
            var7 = var2.mutate();
         }

         var7.setColorFilter(a(gc.a(var0, var5), var4));
         var8 = var3;
         if (var1 != -1) {
            var7.setAlpha(var1);
            var8 = var3;
         }
      } else {
         var8 = false;
      }

      return var8;
   }

   private boolean a(Context param1, long param2, Drawable param4) {
      // $FF: Couldn't be decompiled
   }

   private static boolean a(Drawable var0) {
      boolean var1;
      if (!(var0 instanceof android.support.a.a.l) && !"android.graphics.drawable.VectorDrawable".equals(var0.getClass().getName())) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   private static boolean a(int[] var0, int var1) {
      boolean var2 = false;
      int var3 = var0.length;
      int var4 = 0;

      boolean var5;
      while(true) {
         var5 = var2;
         if (var4 >= var3) {
            break;
         }

         if (var0[var4] == var1) {
            var5 = true;
            break;
         }

         ++var4;
      }

      return var5;
   }

   private ColorStateList b(Context var1) {
      return this.f(var1, 0);
   }

   private ColorStateList c(Context var1) {
      return this.f(var1, gc.a(var1, android.support.v7.a.b.colorAccent));
   }

   private Drawable c(Context var1, int var2) {
      if (this.o == null) {
         this.o = new TypedValue();
      }

      TypedValue var3 = this.o;
      var1.getResources().getValue(var2, var3, true);
      long var4 = a(var3);
      Object var6 = this.a(var1, var4);
      Object var7;
      if (var6 != null) {
         var7 = var6;
      } else {
         if (var2 == android.support.v7.a.f.abc_cab_background_top_material) {
            var6 = new LayerDrawable(new Drawable[]{this.a(var1, android.support.v7.a.f.abc_cab_background_internal_bg), this.a(var1, android.support.v7.a.f.abc_cab_background_top_mtrl_alpha)});
         }

         var7 = var6;
         if (var6 != null) {
            ((Drawable)var6).setChangingConfigurations(var3.changingConfigurations);
            this.a(var1, var4, (Drawable)var6);
            var7 = var6;
         }
      }

      return (Drawable)var7;
   }

   private Drawable d(Context param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void d(Context var1) {
      if (!this.p) {
         this.p = true;
         Drawable var2 = this.a(var1, android.support.v7.a.f.abc_vector_test);
         if (var2 == null || !a(var2)) {
            this.p = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
         }
      }

   }

   private ColorStateList e(Context var1, int var2) {
      ColorStateList var4;
      if (this.j != null) {
         android.support.v4.g.u var3 = (android.support.v4.g.u)this.j.get(var1);
         if (var3 != null) {
            var4 = (ColorStateList)var3.a(var2);
         } else {
            var4 = null;
         }
      } else {
         var4 = null;
      }

      return var4;
   }

   private ColorStateList f(Context var1, int var2) {
      int var3 = gc.a(var1, android.support.v7.a.b.colorControlHighlight);
      int var4 = gc.c(var1, android.support.v7.a.b.colorButtonNormal);
      int[] var5 = gc.a;
      int[] var8 = gc.d;
      int var6 = android.support.v4.d.a.a(var3, var2);
      int[] var7 = gc.b;
      var3 = android.support.v4.d.a.a(var3, var2);
      return new ColorStateList(new int[][]{var5, var8, var7, gc.h}, new int[]{var4, var6, var3, var2});
   }

   public Drawable a(Context var1, int var2) {
      return this.a(var1, var2, false);
   }

   Drawable a(Context var1, int var2, boolean var3) {
      this.d(var1);
      Drawable var4 = this.d(var1, var2);
      Drawable var5 = var4;
      if (var4 == null) {
         var5 = this.c(var1, var2);
      }

      var4 = var5;
      if (var5 == null) {
         var4 = android.support.v4.c.a.a(var1, var2);
      }

      var5 = var4;
      if (var4 != null) {
         var5 = this.a(var1, var2, var3, var4);
      }

      if (var5 != null) {
         bu.a(var5);
      }

      return var5;
   }

   Drawable a(Context var1, gs var2, int var3) {
      Drawable var4 = this.d(var1, var3);
      Drawable var5 = var4;
      if (var4 == null) {
         var5 = var2.a(var3);
      }

      Drawable var6;
      if (var5 != null) {
         var6 = this.a(var1, var3, false, var5);
      } else {
         var6 = null;
      }

      return var6;
   }

   ColorStateList b(Context var1, int var2) {
      ColorStateList var3 = this.e(var1, var2);
      ColorStateList var4 = var3;
      if (var3 == null) {
         if (var2 == android.support.v7.a.f.abc_edit_text_material) {
            var3 = android.support.v7.b.a.b.a(var1, android.support.v7.a.d.abc_tint_edittext);
         } else if (var2 == android.support.v7.a.f.abc_switch_track_mtrl_alpha) {
            var3 = android.support.v7.b.a.b.a(var1, android.support.v7.a.d.abc_tint_switch_track);
         } else if (var2 == android.support.v7.a.f.abc_switch_thumb_material) {
            var3 = android.support.v7.b.a.b.a(var1, android.support.v7.a.d.abc_tint_switch_thumb);
         } else if (var2 == android.support.v7.a.f.abc_btn_default_mtrl_shape) {
            var3 = this.a(var1);
         } else if (var2 == android.support.v7.a.f.abc_btn_borderless_material) {
            var3 = this.b(var1);
         } else if (var2 == android.support.v7.a.f.abc_btn_colored_material) {
            var3 = this.c(var1);
         } else if (var2 != android.support.v7.a.f.abc_spinner_mtrl_am_alpha && var2 != android.support.v7.a.f.abc_spinner_textfield_background_material) {
            if (a(e, var2)) {
               var3 = gc.b(var1, android.support.v7.a.b.colorControlNormal);
            } else if (a(h, var2)) {
               var3 = android.support.v7.b.a.b.a(var1, android.support.v7.a.d.abc_tint_default);
            } else if (a(i, var2)) {
               var3 = android.support.v7.b.a.b.a(var1, android.support.v7.a.d.abc_tint_btn_checkable);
            } else if (var2 == android.support.v7.a.f.abc_seekbar_thumb_material) {
               var3 = android.support.v7.b.a.b.a(var1, android.support.v7.a.d.abc_tint_seek_thumb);
            }
         } else {
            var3 = android.support.v7.b.a.b.a(var1, android.support.v7.a.d.abc_tint_spinner);
         }

         var4 = var3;
         if (var3 != null) {
            this.a(var1, var2, var3);
            var4 = var3;
         }
      }

      return var4;
   }
}
