package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.TextView;

public class HrSensorView extends ag {
   private TextView a;
   private TextView b;

   public HrSensorView(Context var1) {
      super(var1);
      this.a((AttributeSet)null, 0, var1);
   }

   public HrSensorView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a(var2, 0, var1);
   }

   public HrSensorView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a(var2, var3, var1);
   }

   private void a(AttributeSet var1, int var2, Context var3) {
      this.a = (TextView)this.findViewById(2131755017);
      this.b = new TextView(var3);
      this.b.setId(2131755014);
      this.b.setVisibility(8);
      this.b.setTextAppearance(2131427616);
      this.b.setGravity(17);
      this.addView(this.b);
   }

   public void a(Intent var1) {
      if ("fi.polar.polarflow.ACTION_HR_DATA".equals(var1.getAction())) {
         int var2 = var1.getIntExtra("fi.polar.polarflow.KEY_SENSOR_HR_MEASUREMENT_VALUE", 0);
         this.b.setText(String.valueOf(var2));
         if (var2 == 0 || this.getState() != 0 && this.getState() != 3) {
            this.b.setVisibility(8);
            this.a.setVisibility(0);
         } else {
            this.a.setVisibility(8);
            this.b.setVisibility(0);
         }
      }

   }

   public void setState(int var1) {
      super.setState(var1);
      if (this.b != null && this.a != null && var1 != 0 && var1 != 3) {
         this.b.setVisibility(8);
         this.a.setVisibility(0);
      }

   }
}
