package fi.polar.polarflow.ui.exeview.shader;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.polar.polarflow.ui.custom.PolarGlyphView;

public abstract class s extends a {
   private final r e;
   private PolarGlyphView f;
   private TextView g;
   private boolean h;

   s(p var1, r var2) {
      super(var1);
      this.e = var2;
   }

   private void c(boolean var1) {
      if (var1) {
         this.g.setText(this.e.a);
         this.f.setTextColor(this.getContext().getColor(this.e.c));
         this.f.setGlyph(this.getResources().getString(this.e.e));
      } else {
         this.g.setText(this.e.b);
         this.f.setTextColor(this.getContext().getColor(this.e.d));
         this.f.setGlyph(this.getResources().getString(this.e.f));
      }

   }

   private void d(boolean var1) {
      Activity var2 = this.getActivity();
      if (var2 != null) {
         if (var2 instanceof o) {
            ((o)var2).a((p)this.a(), var1);
         } else {
            fi.polar.polarflow.util.d.f(this.getClass().getSimpleName(), var2.toString() + " must implement ShaderFragmentListener");
         }
      }

   }

   void a(int var1) {
      this.f.setVisibility(var1);
   }

   public void a(boolean var1) {
      this.c(var1);
   }

   void b(boolean var1) {
      this.a(var1);
      if (this.e()) {
         this.h = true;
      } else {
         this.d(var1);
      }

   }

   protected void f() {
      super.f();
      if (this.h) {
         this.d(this.h());
         this.h = false;
      }

   }

   abstract int g();

   public abstract boolean h();

   public void i() {
      this.c(this.h());
   }

   fi.polar.polarflow.ui.exeview.e j() {
      Activity var1 = this.getActivity();
      fi.polar.polarflow.ui.exeview.e var2;
      if (var1 != null) {
         if (var1 instanceof fi.polar.polarflow.ui.exeview.e) {
            var2 = (fi.polar.polarflow.ui.exeview.e)var1;
            return var2;
         }

         fi.polar.polarflow.util.d.f(this.getClass().getSimpleName(), var1.toString() + " must implement ActivityPrefsProvider");
      } else {
         fi.polar.polarflow.util.d.f(this.getClass().getSimpleName(), "getActivity() returned null");
      }

      var2 = null;
      return var2;
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(this.g(), var2, false);
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      this.g = (TextView)var1.findViewById(2131755152);
      this.f = (PolarGlyphView)var1.findViewById(2131755153);
      this.d();
      this.a(this.f);
      this.f.setOnClickListener(new t(this));
      this.i();
   }
}
