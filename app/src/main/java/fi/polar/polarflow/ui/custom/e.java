package fi.polar.polarflow.ui.custom;

class e implements Runnable {
   // $FF: synthetic field
   final BetterWearableListView a;
   // $FF: synthetic field
   final d b;

   e(d var1, BetterWearableListView var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      d.b(this.b, false);
   }
}
