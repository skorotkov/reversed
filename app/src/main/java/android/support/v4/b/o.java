package android.support.v4.b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class o extends p implements OnCancelListener, OnDismissListener {
   private static final String SAVED_BACK_STACK_ID = "android:backStackId";
   private static final String SAVED_CANCELABLE = "android:cancelable";
   private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
   private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
   private static final String SAVED_STYLE = "android:style";
   private static final String SAVED_THEME = "android:theme";
   public static final int STYLE_NORMAL = 0;
   public static final int STYLE_NO_FRAME = 2;
   public static final int STYLE_NO_INPUT = 3;
   public static final int STYLE_NO_TITLE = 1;
   int a = 0;
   int b = 0;
   boolean c = true;
   boolean d = true;
   int e = -1;
   Dialog f;
   boolean g;
   boolean h;
   boolean i;

   void a(boolean var1) {
      if (!this.h) {
         this.h = true;
         this.i = false;
         if (this.f != null) {
            this.f.dismiss();
            this.f = null;
         }

         this.g = true;
         if (this.e >= 0) {
            this.getFragmentManager().a(this.e, 1);
            this.e = -1;
         } else {
            av var2 = this.getFragmentManager().a();
            var2.a(this);
            if (var1) {
               var2.b();
            } else {
               var2.a();
            }
         }
      }

   }

   public void dismiss() {
      this.a(false);
   }

   public void dismissAllowingStateLoss() {
      this.a(true);
   }

   public Dialog getDialog() {
      return this.f;
   }

   public LayoutInflater getLayoutInflater(Bundle var1) {
      LayoutInflater var2;
      if (!this.d) {
         var2 = super.getLayoutInflater(var1);
      } else {
         this.f = this.onCreateDialog(var1);
         if (this.f != null) {
            this.setupDialog(this.f, this.a);
            var2 = (LayoutInflater)this.f.getContext().getSystemService("layout_inflater");
         } else {
            var2 = (LayoutInflater)this.A.i().getSystemService("layout_inflater");
         }
      }

      return var2;
   }

   public boolean getShowsDialog() {
      return this.d;
   }

   public int getTheme() {
      return this.b;
   }

   public boolean isCancelable() {
      return this.c;
   }

   public void onActivityCreated(Bundle var1) {
      super.onActivityCreated(var1);
      if (this.d) {
         View var2 = this.getView();
         if (var2 != null) {
            if (var2.getParent() != null) {
               throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }

            this.f.setContentView(var2);
         }

         x var3 = this.getActivity();
         if (var3 != null) {
            this.f.setOwnerActivity(var3);
         }

         this.f.setCancelable(this.c);
         this.f.setOnCancelListener(this);
         this.f.setOnDismissListener(this);
         if (var1 != null) {
            var1 = var1.getBundle("android:savedDialogState");
            if (var1 != null) {
               this.f.onRestoreInstanceState(var1);
            }
         }
      }

   }

   public void onAttach(Context var1) {
      super.onAttach(var1);
      if (!this.i) {
         this.h = false;
      }

   }

   public void onCancel(DialogInterface var1) {
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      boolean var2;
      if (this.F == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.d = var2;
      if (var1 != null) {
         this.a = var1.getInt("android:style", 0);
         this.b = var1.getInt("android:theme", 0);
         this.c = var1.getBoolean("android:cancelable", true);
         this.d = var1.getBoolean("android:showsDialog", this.d);
         this.e = var1.getInt("android:backStackId", -1);
      }

   }

   public Dialog onCreateDialog(Bundle var1) {
      return new Dialog(this.getActivity(), this.getTheme());
   }

   public void onDestroyView() {
      super.onDestroyView();
      if (this.f != null) {
         this.g = true;
         this.f.dismiss();
         this.f = null;
      }

   }

   public void onDetach() {
      super.onDetach();
      if (!this.i && !this.h) {
         this.h = true;
      }

   }

   public void onDismiss(DialogInterface var1) {
      if (!this.g) {
         this.a(true);
      }

   }

   public void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      if (this.f != null) {
         Bundle var2 = this.f.onSaveInstanceState();
         if (var2 != null) {
            var1.putBundle("android:savedDialogState", var2);
         }
      }

      if (this.a != 0) {
         var1.putInt("android:style", this.a);
      }

      if (this.b != 0) {
         var1.putInt("android:theme", this.b);
      }

      if (!this.c) {
         var1.putBoolean("android:cancelable", this.c);
      }

      if (!this.d) {
         var1.putBoolean("android:showsDialog", this.d);
      }

      if (this.e != -1) {
         var1.putInt("android:backStackId", this.e);
      }

   }

   public void onStart() {
      super.onStart();
      if (this.f != null) {
         this.g = false;
         this.f.show();
      }

   }

   public void onStop() {
      super.onStop();
      if (this.f != null) {
         this.f.hide();
      }

   }

   public void setCancelable(boolean var1) {
      this.c = var1;
      if (this.f != null) {
         this.f.setCancelable(var1);
      }

   }

   public void setShowsDialog(boolean var1) {
      this.d = var1;
   }

   public void setStyle(int var1, int var2) {
      this.a = var1;
      if (this.a == 2 || this.a == 3) {
         this.b = 16973913;
      }

      if (var2 != 0) {
         this.b = var2;
      }

   }

   public void setupDialog(Dialog var1, int var2) {
      switch(var2) {
      case 3:
         var1.getWindow().addFlags(24);
      case 1:
      case 2:
         var1.requestWindowFeature(1);
      default:
      }
   }

   public int show(av var1, String var2) {
      this.h = false;
      this.i = true;
      var1.a(this, var2);
      this.g = false;
      this.e = var1.a();
      return this.e;
   }

   public void show(ae var1, String var2) {
      this.h = false;
      this.i = true;
      av var3 = var1.a();
      var3.a(this, var2);
      var3.a();
   }
}
