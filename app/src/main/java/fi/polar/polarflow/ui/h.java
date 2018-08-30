package fi.polar.polarflow.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

class h implements OnKeyListener {
   // $FF: synthetic field
   final g a;

   h(g var1) {
      this.a = var1;
   }

   public boolean onKey(DialogInterface var1, int var2, KeyEvent var3) {
      boolean var4 = false;
      boolean var5 = var4;
      if (this.a.b()) {
         var5 = var4;
         if (var2 == 265) {
            var5 = var4;
            if (var3.getAction() == 0) {
               var5 = this.a.c();
            }
         }
      }

      if (!var5 && var2 == 265) {
         Activity var6 = this.a.getActivity();
         if (var6 != null) {
            var6.dispatchKeyEvent(var3);
         }
      }

      return var5;
   }
}
