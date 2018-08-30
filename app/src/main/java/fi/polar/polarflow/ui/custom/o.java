package fi.polar.polarflow.ui.custom;

class o implements android.support.wearable.view.aj {
   // $FF: synthetic field
   final m a;

   o(m var1) {
      this.a = var1;
   }

   public void a(int var1) {
   }

   public void a(int var1, int var2) {
      al var3 = m.c(this.a).c(var2);
      if (var3 != null) {
         var3.setUserVisibleHint(true);
         if (var3.getView() != null) {
            var3.getView().requestFocus();
         }
      }

      for(var1 = 0; var1 < m.c(this.a).a(0); ++var1) {
         var3 = m.c(this.a).c(var1);
         if (var1 != var2 && var3 != null && var3.getUserVisibleHint()) {
            var3.setUserVisibleHint(false);
         }
      }

   }

   public void a(int var1, int var2, float var3, float var4, int var5, int var6) {
   }
}
