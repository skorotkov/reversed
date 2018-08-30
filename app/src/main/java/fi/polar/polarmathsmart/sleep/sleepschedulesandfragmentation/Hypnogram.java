package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

import java.util.ArrayList;
import java.util.List;

public class Hypnogram {
   private List hypnogramX;
   private List hypnogramY;

   public Hypnogram() {
      this.hypnogramX = new ArrayList();
      this.hypnogramY = new ArrayList();
   }

   public Hypnogram(List var1, List var2) {
      this.hypnogramX = var1;
      this.hypnogramY = var2;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (!(var1 instanceof Hypnogram)) {
            var2 = false;
         } else {
            Hypnogram var3;
            label31: {
               var3 = (Hypnogram)var1;
               if (this.hypnogramX != null) {
                  if (this.hypnogramX.equals(var3.hypnogramX)) {
                     break label31;
                  }
               } else if (var3.hypnogramX == null) {
                  break label31;
               }

               var2 = false;
               return var2;
            }

            if (this.hypnogramY != null) {
               var2 = this.hypnogramY.equals(var3.hypnogramY);
            } else if (var3.hypnogramY != null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public List getHypnogramX() {
      return this.hypnogramX;
   }

   public List getHypnogramY() {
      return this.hypnogramY;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.hypnogramX != null) {
         var2 = this.hypnogramX.hashCode();
      } else {
         var2 = 0;
      }

      if (this.hypnogramY != null) {
         var1 = this.hypnogramY.hashCode();
      }

      return var2 * 31 + var1;
   }

   public void setHypnogramX(List var1) {
      this.hypnogramX = var1;
   }

   public void setHypnogramY(List var1) {
      this.hypnogramY = var1;
   }

   public String toString() {
      return "Hypnogram{hypnogramX=" + this.hypnogramX + ", hypnogramY=" + this.hypnogramY + '}';
   }
}
