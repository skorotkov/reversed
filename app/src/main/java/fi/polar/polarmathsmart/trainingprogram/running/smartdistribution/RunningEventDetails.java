package fi.polar.polarmathsmart.trainingprogram.running.smartdistribution;

import java.util.Date;

public class RunningEventDetails {
   private Date eventDate;
   private RunningEventType eventType;
   private Date trainingStartDate;

   public RunningEventDetails() {
   }

   public RunningEventDetails(RunningEventType var1, Date var2, Date var3) {
      this.eventType = var1;
      this.eventDate = var2;
      this.trainingStartDate = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            label45: {
               RunningEventDetails var3 = (RunningEventDetails)var1;
               if (this.eventDate != null) {
                  if (!this.eventDate.equals(var3.eventDate)) {
                     break label45;
                  }
               } else if (var3.eventDate != null) {
                  break label45;
               }

               if (this.eventType != var3.eventType) {
                  var2 = false;
               } else {
                  if (this.trainingStartDate != null) {
                     if (this.trainingStartDate.equals(var3.trainingStartDate)) {
                        return var2;
                     }
                  } else if (var3.trainingStartDate == null) {
                     return var2;
                  }

                  var2 = false;
               }

               return var2;
            }

            var2 = false;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public Date getEventDate() {
      return this.eventDate;
   }

   public RunningEventType getEventType() {
      return this.eventType;
   }

   public Date getTrainingStartDate() {
      return this.trainingStartDate;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.eventType != null) {
         var2 = this.eventType.hashCode();
      } else {
         var2 = 0;
      }

      int var3;
      if (this.eventDate != null) {
         var3 = this.eventDate.hashCode();
      } else {
         var3 = 0;
      }

      if (this.trainingStartDate != null) {
         var1 = this.trainingStartDate.hashCode();
      }

      return (var3 + var2 * 31) * 31 + var1;
   }

   public void setEventDate(Date var1) {
      this.eventDate = var1;
   }

   public void setEventType(RunningEventType var1) {
      this.eventType = var1;
   }

   public void setTrainingStartDate(Date var1) {
      this.trainingStartDate = var1;
   }

   public String toString() {
      return "RunningEventDetails{eventType=" + this.eventType + ", eventDate=" + this.eventDate + ", trainingStartDate=" + this.trainingStartDate + '}';
   }
}
