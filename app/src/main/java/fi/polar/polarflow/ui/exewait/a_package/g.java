package fi.polar.polarflow.ui.exewait.a_package;

import android.app.Fragment;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fi.polar.polarflow.ui.custom.RadioButtonWearableListView;
import fi.polar.polarflow.util.u;
import java.util.ArrayList;

public class g extends Fragment {
   private static final SparseArray b = new h();
   l a;

   public View onCreateView(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var6 = var1.inflate(2130968756, var2, false);
      RadioButtonWearableListView var7 = (RadioButtonWearableListView)var6.findViewById(2131755482);
      ArrayList var8 = new ArrayList();
      var8.add(new m(50, 2131230941));
      var8.add(new m(25, 2131230941));
      var8.add(new m(25, 2131230942));
      var8.add(new m(0, 2131230940));
      this.a = new l(this.getContext(), var8);
      var7.setAdapter(this.a);
      this.a.a(new k(this, var7, var8));
      int var4 = u.a().k();
      int var5 = u.a().j();
      this.a.a(((SparseIntArray)b.get(var4)).get(var5, 3), false);
      return var6;
   }
}
