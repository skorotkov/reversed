package fi.polar.polarflow.ui.exeview.a.a;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.Sport;

public abstract class ah extends fi.polar.polarflow.ui.exeview.i {
   public static final String A;
   public static final String B;
   public static final String C;
   public static final String D;
   public static final String E;
   public static final String F;
   public static final String G;
   public static final String H;
   public static final String I;
   public static final String J;
   public static final String K;
   public static final String L;
   public static final String M;
   public static final String N;
   public static final String O;
   private static final String a = ah.class.getSimpleName();
   public static final String o;
   public static final String p;
   public static final String q;
   public static final String r;
   public static final String s;
   public static final String t;
   public static final String u;
   public static final String v;
   public static final String w;
   public static final String x;
   public static final String y;
   public static final String z;
   protected Bundle P;
   protected Training Q;
   private bj c;
   private int d;
   private int e;
   private boolean f;
   private int g;

   static {
      o = a + ".START_TIME";
      p = a + ".SESSION_NAME";
      q = a + ".DURATION";
      r = a + ".DISTANCE";
      s = a + ".AVG_CADENCE";
      t = a + ".MAX_CADENCE";
      u = a + ".CALORIES";
      v = a + ".AVG_HR";
      w = a + ".MAX_HR";
      x = a + ".HR_VIEW";
      y = a + ".AVG_SPEED";
      z = a + ".MAX_SPEED";
      A = a + ".SPEED_VIEW";
      B = a + ".SPORT_ID";
      C = a + ".EXERCISE_PATH";
      D = a + ".TRAINING_BENEFIT";
      E = a + ".RUNNING_INDEX";
      F = a + ".FAT_CONSUMPTION";
      G = a + ".TIME_IN_ZONES";
      H = a + ".RECOVERY_TIME";
      I = a + ".ALTITUDE_MAX";
      J = a + ".TOTAL_ASCENT";
      K = a + ".TOTAL_DESCENT";
      L = a + ".SWIMMING_STYLES";
      M = a + ".AVERAGE_SWOLF";
      N = a + ".SWIMMING_STYLE";
      O = a + ".POOL_UNIT";
   }

   public ah() {
      this.c = bj.d;
      this.f = false;
      this.P = null;
      this.Q = Training.getInstance();
   }

   protected static void a(int var0, TextView var1) {
      if (var1 != null) {
         var1.setText(String.valueOf(var0));
      }

   }

   // $FF: synthetic method
   static String q() {
      return a;
   }

   public void a(View var1) {
      super.a(var1);
      this.o();
      this.m();
   }

   public void a(Training var1) {
      this.Q = var1;
   }

   public void a(bj var1) {
      this.c = var1;
   }

   public void a_(Bundle var1) {
      super.a_(var1);
   }

   public void b(Bundle var1) {
      this.P = var1;
   }

   public void d_() {
      super.d_();
   }

   public void e(int var1) {
      this.e = var1;
   }

   public void f(int var1) {
      this.d = var1;
   }

   public int j() {
      return this.e;
   }

   public int k() {
      return this.d;
   }

   public bj l() {
      return this.c;
   }

   protected boolean m() {
      long var1;
      if (this.P != null) {
         var1 = this.P.getLong(B, -1L);
      } else {
         var1 = this.Q.getSportId();
      }

      this.f = Sport.isSwimmingSport(var1);
      return this.f;
   }

   public boolean n() {
      return this.f;
   }

   protected void o() {
      this.g = this.Q.getUserUnitSystem();
   }

   public int p() {
      return this.g;
   }
}
