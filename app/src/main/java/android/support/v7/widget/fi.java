package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

class fi extends cl implements OnLongClickListener {
   // $FF: synthetic field
   final fe a;
   private final int[] b;
   private android.support.v7.app.c c;
   private TextView d;
   private ImageView e;
   private View f;

   public fi(fe var1, Context var2, android.support.v7.app.c var3, boolean var4) {
      super(var2, (AttributeSet)null, android.support.v7.a.b.actionBarTabStyle);
      this.a = var1;
      this.b = new int[]{16842964};
      this.c = var3;
      gh var5 = gh.a(var2, (AttributeSet)null, this.b, android.support.v7.a.b.actionBarTabStyle, 0);
      if (var5.f(0)) {
         this.setBackgroundDrawable(var5.a(0));
      }

      var5.a();
      if (var4) {
         this.setGravity(8388627);
      }

      this.a();
   }

   public void a() {
      android.support.v7.app.c var1 = this.c;
      View var2 = var1.c();
      if (var2 != null) {
         ViewParent var7 = var2.getParent();
         if (var7 != this) {
            if (var7 != null) {
               ((ViewGroup)var7).removeView(var2);
            }

            this.addView(var2);
         }

         this.f = var2;
         if (this.d != null) {
            this.d.setVisibility(8);
         }

         if (this.e != null) {
            this.e.setVisibility(8);
            this.e.setImageDrawable((Drawable)null);
         }
      } else {
         if (this.f != null) {
            this.removeView(this.f);
            this.f = null;
         }

         Drawable var3 = var1.a();
         CharSequence var8 = var1.b();
         if (var3 != null) {
            if (this.e == null) {
               aq var4 = new aq(this.getContext());
               cm var5 = new cm(-2, -2);
               var5.h = 16;
               var4.setLayoutParams(var5);
               this.addView(var4, 0);
               this.e = var4;
            }

            this.e.setImageDrawable(var3);
            this.e.setVisibility(0);
         } else if (this.e != null) {
            this.e.setVisibility(8);
            this.e.setImageDrawable((Drawable)null);
         }

         boolean var6;
         if (!TextUtils.isEmpty(var8)) {
            var6 = true;
         } else {
            var6 = false;
         }

         if (var6) {
            if (this.d == null) {
               bc var10 = new bc(this.getContext(), (AttributeSet)null, android.support.v7.a.b.actionBarTabTextStyle);
               var10.setEllipsize(TruncateAt.END);
               cm var9 = new cm(-2, -2);
               var9.h = 16;
               var10.setLayoutParams(var9);
               this.addView(var10);
               this.d = var10;
            }

            this.d.setText(var8);
            this.d.setVisibility(0);
         } else if (this.d != null) {
            this.d.setVisibility(8);
            this.d.setText((CharSequence)null);
         }

         if (this.e != null) {
            this.e.setContentDescription(var1.e());
         }

         if (!var6 && !TextUtils.isEmpty(var1.e())) {
            this.setOnLongClickListener(this);
         } else {
            this.setOnLongClickListener((OnLongClickListener)null);
            this.setLongClickable(false);
         }
      }

   }

   public void a(android.support.v7.app.c var1) {
      this.c = var1;
      this.a();
   }

   public android.support.v7.app.c b() {
      return this.c;
   }

   public void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      super.onInitializeAccessibilityEvent(var1);
      var1.setClassName(android.support.v7.app.c.class.getName());
   }

   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      if (VERSION.SDK_INT >= 14) {
         var1.setClassName(android.support.v7.app.c.class.getName());
      }

   }

   public boolean onLongClick(View var1) {
      int[] var6 = new int[2];
      this.getLocationOnScreen(var6);
      Context var2 = this.getContext();
      int var3 = this.getWidth();
      int var4 = this.getHeight();
      int var5 = var2.getResources().getDisplayMetrics().widthPixels;
      Toast var7 = Toast.makeText(var2, this.c.e(), 0);
      var7.setGravity(49, var6[0] + var3 / 2 - var5 / 2, var4);
      var7.show();
      return true;
   }

   public void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (this.a.c > 0 && this.getMeasuredWidth() > this.a.c) {
         super.onMeasure(MeasureSpec.makeMeasureSpec(this.a.c, 1073741824), var2);
      }

   }

   public void setSelected(boolean var1) {
      boolean var2;
      if (this.isSelected() != var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      super.setSelected(var1);
      if (var2 && var1) {
         this.sendAccessibilityEvent(4);
      }

   }
}
