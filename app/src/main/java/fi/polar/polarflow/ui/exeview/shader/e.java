package fi.polar.polarflow.ui.exeview.shader;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.polar.polarflow.ui.custom.PolarGlyphView;
import fi.polar.polarflow.ui.exeview.am;

public class e extends a {
   private static final String e = e.class.getSimpleName();
   private TextView f;
   private TextView g;
   private PolarGlyphView h;
   private PolarGlyphView i;
   private PolarGlyphView j;
   private am k;
   private int l = 0;
   private final fi.polar.polarflow.util.a_package.e m = new i(this);

   public e() {
      super(p.b);
   }

   // $FF: synthetic method
   static int a(e var0) {
      return var0.l;
   }

   private void a(long var1) {
      byte var3 = 0;
      PolarGlyphView var4 = this.i;
      byte var5;
      if ((16L & var1) != 0L) {
         var5 = 0;
      } else {
         var5 = 4;
      }

      var4.setVisibility(var5);
      var4 = this.j;
      if ((32L & var1) != 0L) {
         var5 = var3;
      } else {
         var5 = 4;
      }

      var4.setVisibility(var5);
   }

   private void a(MediaMetadata var1) {
      CharSequence var2 = null;
      CharSequence var4;
      if (var1 != null) {
         CharSequence var3;
         if (var1.containsKey("android.media.metadata.ARTIST")) {
            var3 = var1.getText("android.media.metadata.ARTIST");
         } else {
            var3 = null;
         }

         var4 = var3;
         if (var1.containsKey("android.media.metadata.TITLE")) {
            var2 = var1.getText("android.media.metadata.TITLE");
            var4 = var3;
         }
      } else {
         var4 = null;
      }

      this.f.setText(var4);
      this.g.setText(var2);
      fi.polar.polarflow.util.d.c(e, "onMetadataChanged - Artist: " + var4 + ", title: " + var2);
   }

   private void a(PlaybackState var1) {
      long var2 = 0L;
      if (var1 != null) {
         this.l = var1.getState();
         var2 = var1.getActions();
      } else {
         this.l = 0;
      }

      fi.polar.polarflow.util.d.c(e, "onPlaybackStateChanged(" + this.l + ")");
      switch(this.l) {
      case 1:
         this.h.setGlyph(this.getResources().getString(2131231144));
         this.a(var2);
         break;
      case 2:
         this.h.setGlyph(this.getResources().getString(2131231144));
         this.a(var2);
         break;
      case 3:
         this.h.setGlyph(this.getResources().getString(2131231142));
         this.a(var2);
      }

   }

   // $FF: synthetic method
   static void a(e var0, MediaMetadata var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(e var0, PlaybackState var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static fi.polar.polarflow.util.a_package.b b(e var0) {
      return var0.h();
   }

   private fi.polar.polarflow.util.a_package.b h() {
      return this.k.f();
   }

   void a(int var1) {
      this.h.setVisibility(var1);
   }

   public fi.polar.polarflow.util.a_package.e g() {
      return this.m;
   }

   public void onAttach(Context var1) {
      super.onAttach(var1);
      Activity var2 = this.getActivity();
      if (var2 instanceof am) {
         this.k = (am)var2;
      } else {
         throw new RuntimeException(var2.toString() + " must implement MediaHelperProvider");
      }
   }

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130968708, var2, false);
   }

   public void onDetach() {
      super.onDetach();
      this.k = null;
   }

   public void onResume() {
      super.onResume();
      this.a(this.h().b());
      this.a(this.h().c());
   }

   public void onViewCreated(View var1, Bundle var2) {
      super.onViewCreated(var1, var2);
      this.f = (TextView)var1.findViewById(2131755151);
      this.g = (TextView)var1.findViewById(2131755152);
      this.h = (PolarGlyphView)var1.findViewById(2131755387);
      this.i = (PolarGlyphView)var1.findViewById(2131755386);
      this.j = (PolarGlyphView)var1.findViewById(2131755388);
      this.h.setOnClickListener(new f(this));
      this.i.setOnClickListener(new g(this));
      this.j.setOnClickListener(new h(this));
      this.d();
      this.a((View)this.h);
      this.a((View)this.i);
      this.a((View)this.j);
   }
}
