package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bz;
import android.support.v7.widget.gh;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements ae {
   private p a;
   private ImageView b;
   private RadioButton c;
   private TextView d;
   private CheckBox e;
   private TextView f;
   private ImageView g;
   private Drawable h;
   private int i;
   private Context j;
   private boolean k;
   private Drawable l;
   private int m;
   private LayoutInflater n;
   private boolean o;

   public ListMenuItemView(Context var1, AttributeSet var2) {
      this(var1, var2, android.support.v7.a.b.listMenuViewStyle);
   }

   public ListMenuItemView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2);
      gh var4 = gh.a(this.getContext(), var2, android.support.v7.a.k.MenuView, var3, 0);
      this.h = var4.a(android.support.v7.a.k.MenuView_android_itemBackground);
      this.i = var4.g(android.support.v7.a.k.MenuView_android_itemTextAppearance, -1);
      this.k = var4.a(android.support.v7.a.k.MenuView_preserveIconSpacing, false);
      this.j = var1;
      this.l = var4.a(android.support.v7.a.k.MenuView_subMenuArrow);
      var4.a();
   }

   private void b() {
      this.b = (ImageView)this.getInflater().inflate(android.support.v7.a.h.abc_list_menu_item_icon, this, false);
      this.addView(this.b, 0);
   }

   private void c() {
      this.c = (RadioButton)this.getInflater().inflate(android.support.v7.a.h.abc_list_menu_item_radio, this, false);
      this.addView(this.c);
   }

   private void d() {
      this.e = (CheckBox)this.getInflater().inflate(android.support.v7.a.h.abc_list_menu_item_checkbox, this, false);
      this.addView(this.e);
   }

   private LayoutInflater getInflater() {
      if (this.n == null) {
         this.n = LayoutInflater.from(this.getContext());
      }

      return this.n;
   }

   private void setSubMenuArrowVisible(boolean var1) {
      if (this.g != null) {
         ImageView var2 = this.g;
         byte var3;
         if (var1) {
            var3 = 0;
         } else {
            var3 = 8;
         }

         var2.setVisibility(var3);
      }

   }

   public void a(p var1, int var2) {
      this.a = var1;
      this.m = var2;
      byte var3;
      if (var1.isVisible()) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      this.setVisibility(var3);
      this.setTitle(var1.a((ae)this));
      this.setCheckable(var1.isCheckable());
      this.a(var1.f(), var1.d());
      this.setIcon(var1.getIcon());
      this.setEnabled(var1.isEnabled());
      this.setSubMenuArrowVisible(var1.hasSubMenu());
   }

   public void a(boolean var1, char var2) {
      byte var3;
      if (var1 && this.a.f()) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      if (var3 == 0) {
         this.f.setText(this.a.e());
      }

      if (this.f.getVisibility() != var3) {
         this.f.setVisibility(var3);
      }

   }

   public boolean a() {
      return false;
   }

   public p getItemData() {
      return this.a;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      bz.a(this, (Drawable)this.h);
      this.d = (TextView)this.findViewById(android.support.v7.a.g.title);
      if (this.i != -1) {
         this.d.setTextAppearance(this.j, this.i);
      }

      this.f = (TextView)this.findViewById(android.support.v7.a.g.shortcut);
      this.g = (ImageView)this.findViewById(android.support.v7.a.g.submenuarrow);
      if (this.g != null) {
         this.g.setImageDrawable(this.l);
      }

   }

   protected void onMeasure(int var1, int var2) {
      if (this.b != null && this.k) {
         LayoutParams var3 = this.getLayoutParams();
         android.widget.LinearLayout.LayoutParams var4 = (android.widget.LinearLayout.LayoutParams)this.b.getLayoutParams();
         if (var3.height > 0 && var4.width <= 0) {
            var4.width = var3.height;
         }
      }

      super.onMeasure(var1, var2);
   }

   public void setCheckable(boolean var1) {
      if (var1 || this.c != null || this.e != null) {
         CheckBox var3;
         Object var4;
         Object var6;
         if (this.a.g()) {
            if (this.c == null) {
               this.c();
            }

            RadioButton var2 = this.c;
            var3 = this.e;
            var4 = var2;
            var6 = var3;
         } else {
            if (this.e == null) {
               this.d();
            }

            var3 = this.e;
            var6 = this.c;
            var4 = var3;
         }

         if (var1) {
            ((CompoundButton)var4).setChecked(this.a.isChecked());
            byte var5;
            if (var1) {
               var5 = 0;
            } else {
               var5 = 8;
            }

            if (((CompoundButton)var4).getVisibility() != var5) {
               ((CompoundButton)var4).setVisibility(var5);
            }

            if (var6 != null && ((CompoundButton)var6).getVisibility() != 8) {
               ((CompoundButton)var6).setVisibility(8);
            }
         } else {
            if (this.e != null) {
               this.e.setVisibility(8);
            }

            if (this.c != null) {
               this.c.setVisibility(8);
            }
         }
      }

   }

   public void setChecked(boolean var1) {
      Object var2;
      if (this.a.g()) {
         if (this.c == null) {
            this.c();
         }

         var2 = this.c;
      } else {
         if (this.e == null) {
            this.d();
         }

         var2 = this.e;
      }

      ((CompoundButton)var2).setChecked(var1);
   }

   public void setForceShowIcon(boolean var1) {
      this.o = var1;
      this.k = var1;
   }

   public void setIcon(Drawable var1) {
      boolean var2;
      if (!this.a.i() && !this.o) {
         var2 = false;
      } else {
         var2 = true;
      }

      if ((var2 || this.k) && (this.b != null || var1 != null || this.k)) {
         if (this.b == null) {
            this.b();
         }

         if (var1 == null && !this.k) {
            this.b.setVisibility(8);
         } else {
            ImageView var3 = this.b;
            if (!var2) {
               var1 = null;
            }

            var3.setImageDrawable(var1);
            if (this.b.getVisibility() != 0) {
               this.b.setVisibility(0);
            }
         }
      }

   }

   public void setTitle(CharSequence var1) {
      if (var1 != null) {
         this.d.setText(var1);
         if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
         }
      } else if (this.d.getVisibility() != 8) {
         this.d.setVisibility(8);
      }

   }
}
