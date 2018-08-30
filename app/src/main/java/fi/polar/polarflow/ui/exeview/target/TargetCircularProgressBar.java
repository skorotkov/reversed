package fi.polar.polarflow.ui.exeview.target;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import fi.polar.polarflow.ui.custom.PolarGlyphView;

public class TargetCircularProgressBar extends RelativeLayout {
   private PolarGlyphView a;
   private ProgressBar b;
   private TextView c;
   private TextView d;

   public TargetCircularProgressBar(Context var1) {
      super(var1);
   }

   public TargetCircularProgressBar(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   public TargetCircularProgressBar(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
   }

   private String a(int var1) {
      return String.valueOf(var1);
   }

   public int getProgress() {
      int var1;
      if (this.b != null) {
         var1 = this.b.getProgress();
      } else {
         var1 = 0;
      }

      return var1;
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      this.c = (TextView)this.findViewById(2131755356);
      this.d = (TextView)this.findViewById(2131755357);
      this.a = (PolarGlyphView)this.findViewById(2131755199);
      this.b = (ProgressBar)this.findViewById(2131755358);
      this.d.setText("%");
   }

   public void setGlyphByVolumeTarget(int var1) {
      switch(var1) {
      case 0:
         this.a.setGlyph(this.getResources().getString(2131231132));
         break;
      case 1:
         this.a.setGlyph(this.getResources().getString(2131231130));
         break;
      case 2:
         this.a.setGlyph(this.getResources().getString(2131231126));
      }

   }

   public void setProgress(int var1) {
      this.c.setText(this.a(var1));
      this.b.setProgress(var1);
      this.b.setSecondaryProgress(var1 + 1);
   }
}
