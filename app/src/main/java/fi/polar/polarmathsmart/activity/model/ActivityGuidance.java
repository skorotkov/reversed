package fi.polar.polarmathsmart.activity.model;

import java.util.Iterator;
import java.util.List;

public class ActivityGuidance {
   private List guidanceForActivityListLight;
   private List guidanceForActivityListModerate;
   private List guidanceForActivityListVigorous;
   private Integer guidanceLight;
   private Integer guidanceModerate;
   private Integer guidanceVigorous;

   public ActivityGuidance() {
   }

   public ActivityGuidance(Integer var1, Integer var2, Integer var3, List var4, List var5, List var6) {
      this.guidanceLight = var1;
      this.guidanceModerate = var2;
      this.guidanceVigorous = var3;
      this.guidanceForActivityListLight = var4;
      this.guidanceForActivityListModerate = var5;
      this.guidanceForActivityListVigorous = var6;
   }

   private boolean compareIntegerLists(List var1, List var2) {
      boolean var3 = false;
      boolean var4;
      if (var1.size() != var2.size()) {
         var4 = var3;
      } else {
         int var5 = 0;

         while(true) {
            if (var5 >= var2.size()) {
               var4 = true;
               break;
            }

            var4 = var3;
            if (!((Integer)var1.get(var5)).equals(var2.get(var5))) {
               break;
            }

            ++var5;
         }
      }

      return var4;
   }

   private int sumIntList(List var1) {
      int var3;
      if (var1 != null) {
         Iterator var4 = var1.iterator();
         int var2 = 0;

         while(true) {
            var3 = var2;
            if (!var4.hasNext()) {
               break;
            }

            var2 += (Integer)var4.next();
         }
      } else {
         var3 = 0;
      }

      return var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = false;
      boolean var3;
      if (!(var1 instanceof ActivityGuidance)) {
         var3 = var2;
      } else {
         ActivityGuidance var5 = (ActivityGuidance)var1;
         var3 = var2;
         if (this.getGuidanceLight().equals(var5.getGuidanceLight())) {
            var3 = var2;
            if (this.getGuidanceModerate().equals(var5.getGuidanceModerate())) {
               var3 = var2;
               if (this.getGuidanceVigorous().equals(var5.getGuidanceVigorous())) {
                  List var4 = var5.getGuidanceForActivityListLight();
                  var3 = var2;
                  if (this.compareIntegerLists(this.getGuidanceForActivityListLight(), var4)) {
                     var4 = var5.getGuidanceForActivityListModerate();
                     var3 = var2;
                     if (this.compareIntegerLists(this.getGuidanceForActivityListModerate(), var4)) {
                        List var6 = var5.getGuidanceForActivityListVigorous();
                        var3 = var2;
                        if (this.compareIntegerLists(this.getGuidanceForActivityListVigorous(), var6)) {
                           var3 = true;
                        }
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   public List getGuidanceForActivityListLight() {
      return this.guidanceForActivityListLight;
   }

   public List getGuidanceForActivityListModerate() {
      return this.guidanceForActivityListModerate;
   }

   public List getGuidanceForActivityListVigorous() {
      return this.guidanceForActivityListVigorous;
   }

   public Integer getGuidanceLight() {
      return this.guidanceLight;
   }

   public Integer getGuidanceModerate() {
      return this.guidanceModerate;
   }

   public Integer getGuidanceVigorous() {
      return this.guidanceVigorous;
   }

   public int hashCode() {
      int var1 = 0;
      if (this.getGuidanceLight() != null) {
         var1 = 0 + this.getGuidanceLight() * 31;
      }

      int var2 = var1;
      if (this.getGuidanceModerate() != null) {
         var2 = var1 + this.getGuidanceModerate() * 11;
      }

      var1 = var2;
      if (this.getGuidanceVigorous() != null) {
         var1 = var2 + this.getGuidanceVigorous() * 7;
      }

      return var1 + this.sumIntList(this.getGuidanceForActivityListLight()) * 5 + this.sumIntList(this.getGuidanceForActivityListModerate()) * 3 + this.sumIntList(this.getGuidanceForActivityListVigorous()) * 2;
   }

   public void setGuidanceForActivityListLight(List var1) {
      this.guidanceForActivityListLight = var1;
   }

   public void setGuidanceForActivityListModerate(List var1) {
      this.guidanceForActivityListModerate = var1;
   }

   public void setGuidanceForActivityListVigorous(List var1) {
      this.guidanceForActivityListVigorous = var1;
   }

   public void setGuidanceLight(Integer var1) {
      this.guidanceLight = var1;
   }

   public void setGuidanceModerate(Integer var1) {
      this.guidanceModerate = var1;
   }

   public void setGuidanceVigorous(Integer var1) {
      this.guidanceVigorous = var1;
   }
}
