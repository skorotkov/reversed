package android.support.v4.g;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class a extends t implements Map {
   j a;

   public a() {
   }

   public a(int var1) {
      super(var1);
   }

   private j b() {
      if (this.a == null) {
         this.a = new b(this);
      }

      return this.a;
   }

   public boolean a(Collection var1) {
      return j.c(this, var1);
   }

   public Set entrySet() {
      return this.b().d();
   }

   public Set keySet() {
      return this.b().e();
   }

   public void putAll(Map var1) {
      this.a(this.h + var1.size());
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         this.put(var3.getKey(), var3.getValue());
      }

   }

   public Collection values() {
      return this.b().f();
   }
}
