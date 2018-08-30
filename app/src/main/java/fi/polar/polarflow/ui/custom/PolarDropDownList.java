package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ds;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

public class PolarDropDownList extends RelativeLayout {
   private RelativeLayout a;
   private TextView b;
   private ImageView c;
   private RadioButtonWearableListView d;
   private int e;

   public PolarDropDownList(Context var1) {
      this(var1, (AttributeSet)null, 0);
   }

   public PolarDropDownList(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public PolarDropDownList(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      Resources var6 = this.getResources();
      this.e = var6.getDimensionPixelSize(2131361938);
      this.b = new TextView(var1);
      this.b.setId(2131755025);
      this.b.setHeight(var6.getDimensionPixelSize(2131361943));
      this.b.setTextSize(0, (float)var6.getDimensionPixelSize(2131361946));
      this.b.setGravity(17);
      LayoutParams var4 = new LayoutParams(228, 36);
      var4.setMargins(var6.getDimensionPixelOffset(2131361944), var6.getDimensionPixelOffset(2131361945), 0, 0);
      this.b.setLayoutParams(var4);
      this.b.setMaxLines(1);
      this.b.setEllipsize(TruncateAt.END);
      this.c = new ImageView(var1);
      this.c.setId(2131755012);
      this.c.setImageDrawable(var1.getResources().getDrawable(2130837766, var1.getTheme()));
      var4 = new LayoutParams(-2, -2);
      var4.setMargins(var6.getDimensionPixelOffset(2131361941), var6.getDimensionPixelOffset(2131361942), 0, 0);
      this.c.setLayoutParams(var4);
      this.a = new RelativeLayout(var1);
      this.a.setId(2131755026);
      this.a.setBackgroundColor(var6.getColor(2131624000, var1.getTheme()));
      this.a.addView(this.b);
      this.a.addView(this.c);
      var4 = new LayoutParams(-1, var6.getDimensionPixelSize(2131361947));
      this.a.setLayoutParams(var4);
      this.d = new RadioButtonWearableListView(var1);
      this.d.b(false);
      this.d.setId(2131755016);
      this.d.setBackgroundColor(var6.getColor(2131624072, var1.getTheme()));
      this.d.setVisibility(8);
      LayoutParams var5 = new LayoutParams(-1, -1);
      this.d.setLayoutParams(var5);
      this.addView(this.d);
      this.addView(this.a);
   }

   // $FF: synthetic method
   static RadioButtonWearableListView a(PolarDropDownList var0) {
      return var0.d;
   }

   public void a() {
      this.d.animate().translationY((float)(-this.e + this.a.getHeight())).setDuration(300L).withEndAction(new r(this)).start();
      this.c.setRotationX(0.0F);
   }

   public void b() {
      this.d.setTranslationY((float)(-this.e + this.a.getHeight()));
      this.d.setVisibility(0);
      this.d.animate().translationY((float)this.a.getHeight()).setDuration(300L).start();
      this.c.setRotationX(180.0F);
   }

   public boolean onTouchEvent(MotionEvent var1) {
      if (var1.getAction() == 1) {
         if (this.d.getVisibility() == 8) {
            this.b();
         } else {
            this.a();
         }
      }

      return true;
   }

   public void setAdapter(ds var1) {
      this.d.setAdapter(var1);
   }

   public void setTitle(String var1) {
      this.b.setText(var1);
   }
}
