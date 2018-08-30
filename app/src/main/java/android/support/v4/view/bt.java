package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public interface bt {
   ColorStateList getSupportBackgroundTintList();

   Mode getSupportBackgroundTintMode();

   void setSupportBackgroundTintList(ColorStateList var1);

   void setSupportBackgroundTintMode(Mode var1);
}
