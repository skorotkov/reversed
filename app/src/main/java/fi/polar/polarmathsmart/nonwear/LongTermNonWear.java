package fi.polar.polarmathsmart.nonwear;

import java.util.List;

public class LongTermNonWear {
   private List nonWear;
   private List wearTime3h;
   private List wearTime5h;

   public LongTermNonWear(List var1, List var2, List var3) {
      this.nonWear = var1;
      this.wearTime3h = var2;
      this.wearTime5h = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = false;
      boolean var3;
      if (this == var1) {
         var3 = true;
      } else {
         var3 = var2;
         if (var1 instanceof LongTermNonWear) {
            LongTermNonWear var5 = (LongTermNonWear)var1;
            var3 = var2;
            if (this.getNonWear().size() == var5.getNonWear().size()) {
               var3 = var2;
               if (this.getWearTime3h().size() == var5.getWearTime3h().size()) {
                  var3 = var2;
                  if (this.getWearTime5h().size() == var5.getWearTime5h().size()) {
                     int var4 = 0;

                     while(true) {
                        if (var4 >= this.getNonWear().size()) {
                           for(var4 = 0; var4 < this.getWearTime3h().size(); ++var4) {
                              var3 = var2;
                              if (!((Integer)this.getWearTime3h().get(var4)).equals(var5.getWearTime3h().get(var4))) {
                                 return var3;
                              }
                           }

                           for(var4 = 0; var4 < this.getWearTime5h().size(); ++var4) {
                              var3 = var2;
                              if (!((Integer)this.getWearTime5h().get(var4)).equals(var5.getWearTime5h().get(var4))) {
                                 return var3;
                              }
                           }

                           var3 = true;
                           break;
                        }

                        var3 = var2;
                        if (!((Integer)this.getNonWear().get(var4)).equals(var5.getNonWear().get(var4))) {
                           break;
                        }

                        ++var4;
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   public List getNonWear() {
      return this.nonWear;
   }

   public List getWearTime3h() {
      return this.wearTime3h;
   }

   public List getWearTime5h() {
      return this.wearTime5h;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.nonWear != null) {
         var2 = (Integer)this.nonWear.get(0);
         var2 = (Integer)this.nonWear.get(1) * 32 + 0 + var2 * 31;
      } else {
         var2 = 0;
      }

      int var3;
      for(var3 = 0; var3 < this.wearTime3h.size(); ++var3) {
         var2 += (Integer)this.wearTime3h.get(var3) * (var3 + 33);
      }

      if (this.wearTime3h != null) {
         var3 = this.wearTime3h.size();
      } else {
         var3 = 0;
      }

      while(var1 < this.wearTime5h.size()) {
         var2 += (Integer)this.wearTime5h.get(var1) * (var3 + 33 + var1);
         ++var1;
      }

      return var2;
   }

   public void setNonWear(List var1) {
      this.nonWear = var1;
   }

   public void setWearTime3h(List var1) {
      this.wearTime3h = var1;
   }

   public void setWearTime5h(List var1) {
      this.wearTime5h = var1;
   }
}
