package android.support.v7.widget;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

class ad implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
   // $FF: synthetic field
   final ActivityChooserView a;

   private void a() {
      if (this.a.f != null) {
         this.a.f.onDismiss();
      }

   }

   public void onClick(View var1) {
      if (var1 == this.a.c) {
         this.a.b();
         ResolveInfo var3 = this.a.a.b();
         int var2 = this.a.a.d().a(var3);
         Intent var4 = this.a.a.d().b(var2);
         if (var4 != null) {
            var4.addFlags(524288);
            this.a.getContext().startActivity(var4);
         }
      } else {
         if (var1 != this.a.b) {
            throw new IllegalArgumentException();
         }

         this.a.g = false;
         this.a.a(this.a.h);
      }

   }

   public void onDismiss() {
      this.a();
      if (this.a.d != null) {
         this.a.d.a(false);
      }

   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      switch(((ac)var1.getAdapter()).getItemViewType(var3)) {
      case 0:
         this.a.b();
         if (this.a.g) {
            if (var3 > 0) {
               this.a.a.d().c(var3);
            }
         } else {
            if (!this.a.a.e()) {
               ++var3;
            }

            Intent var6 = this.a.a.d().b(var3);
            if (var6 != null) {
               var6.addFlags(524288);
               this.a.getContext().startActivity(var6);
            }
         }
         break;
      case 1:
         this.a.a(Integer.MAX_VALUE);
         break;
      default:
         throw new IllegalArgumentException();
      }

   }

   public boolean onLongClick(View var1) {
      if (var1 == this.a.c) {
         if (this.a.a.getCount() > 0) {
            this.a.g = true;
            this.a.a(this.a.h);
         }

         return true;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
