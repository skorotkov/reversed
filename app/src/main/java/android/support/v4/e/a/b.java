package android.support.v4.e.a;

import android.support.v4.view.bd;
import android.support.v4.view.q;
import android.view.MenuItem;
import android.view.View;

public interface b extends MenuItem {
   b a(bd var1);

   b a(q var1);

   q a();

   boolean collapseActionView();

   boolean expandActionView();

   View getActionView();

   boolean isActionViewExpanded();

   MenuItem setActionView(int var1);

   MenuItem setActionView(View var1);

   void setShowAsAction(int var1);

   MenuItem setShowAsActionFlags(int var1);
}
