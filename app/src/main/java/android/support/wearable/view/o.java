package android.support.wearable.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Locale;

@TargetApi(21)
public class o implements OnTouchListener {
   private int a = 0;
   private int b = 1000;
   private r c;
   private String d;
   private View e;
   private Drawable f;
   private boolean g = false;
   private final Handler h = new Handler(Looper.getMainLooper());
   private final Runnable i = new p(this);

   // $FF: synthetic method
   static View a(o var0) {
      return var0.e;
   }

   private void a(Context var1) {
      if (this.e == null) {
         this.e = LayoutInflater.from(var1).inflate(android.support.wearable.f.overlay_confirmation, (ViewGroup)null);
      }

      this.e.setOnTouchListener(this);
      this.e.setLayoutParams(new LayoutParams(-1, -1));
      this.b(var1, this.e);
      this.a(var1, this.e);
   }

   private void a(Context var1, View var2) {
      TextView var6 = (TextView)var2.findViewById(android.support.wearable.e.wearable_support_confirmation_overlay_message);
      if (this.d != null) {
         int var3 = aq.a(var1);
         int var4 = aq.a(var1, var3, android.support.wearable.d.confirmation_overlay_margin_above_text);
         var3 = aq.a(var1, var3, android.support.wearable.d.confirmation_overlay_margin_side);
         MarginLayoutParams var5 = (MarginLayoutParams)var6.getLayoutParams();
         var5.topMargin = var4;
         var5.leftMargin = var3;
         var5.rightMargin = var3;
         var6.setLayoutParams(var5);
         var6.setText(this.d);
         var6.setVisibility(0);
      } else {
         var6.setVisibility(8);
      }

   }

   // $FF: synthetic method
   static boolean a(o var0, boolean var1) {
      var0.g = var1;
      return var1;
   }

   // $FF: synthetic method
   static r b(o var0) {
      return var0.c;
   }

   private void b() {
      if (this.f instanceof Animatable) {
         ((Animatable)this.f).start();
      }

      this.h.postDelayed(this.i, (long)this.b);
   }

   private void b(Context var1, View var2) {
      switch(this.a) {
      case 0:
         this.f = android.support.v4.c.a.a(var1, android.support.wearable.c.generic_confirmation_animation);
         break;
      case 1:
         this.f = android.support.v4.c.a.a(var1, android.support.wearable.c.ic_full_sad);
         break;
      case 2:
         this.f = android.support.v4.c.a.a(var1, android.support.wearable.c.open_on_phone_animation);
         break;
      default:
         throw new IllegalStateException(String.format(Locale.US, "Invalid ConfirmationOverlay type [%d]", this.a));
      }

      ((ImageView)var2.findViewById(android.support.wearable.e.wearable_support_confirmation_overlay_image)).setImageDrawable(this.f);
   }

   public o a(int var1) {
      this.a = var1;
      return this;
   }

   public o a(r var1) {
      this.c = var1;
      return this;
   }

   public o a(String var1) {
      this.d = var1;
      return this;
   }

   public void a() {
      Animation var1 = AnimationUtils.loadAnimation(this.e.getContext(), 17432577);
      var1.setAnimationListener(new q(this));
      this.e.startAnimation(var1);
   }

   public void a(Activity var1) {
      if (!this.g) {
         this.g = true;
         this.a((Context)var1);
         var1.getWindow().addContentView(this.e, this.e.getLayoutParams());
         this.b();
      }

   }

   @SuppressLint({"ClickableViewAccessibility"})
   public boolean onTouch(View var1, MotionEvent var2) {
      return true;
   }
}
