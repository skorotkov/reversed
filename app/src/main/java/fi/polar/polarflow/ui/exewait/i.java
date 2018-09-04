package fi.polar.polarflow.ui.exewait;

import android.content.Context;
import android.support.v7.widget.ey;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import fi.polar.polarflow.data.orm.SportProfile;
import java.util.List;

final class i extends fi.polar.polarflow.ui.custom.c {
   private List a;
   private final LayoutInflater b;

   i(Context var1, List var2) {
      this.b = LayoutInflater.from(var1);
      this.a = var2;
   }

   public int a() {
      return this.a.size();
   }

   // $FF: synthetic method
   public ey a(ViewGroup var1, int var2) {
      return this.c(var1, var2);
   }

   public void a(ey var, int var2) {
      j var1 = (j)var;
      SportProfile var3 = (SportProfile)this.a.get(var2);
      j.a(var1).setGlyph(var3.getSport().getGlyph());
      j.a(var1).setTag(var3.getSport().getSportId());
   }

   void a(List var1) {
      this.a = var1;
      this.c();
   }

   public j c(ViewGroup var1, int var2) {
      return new j(this.b.inflate(2130968633, var1, false));
   }
}
