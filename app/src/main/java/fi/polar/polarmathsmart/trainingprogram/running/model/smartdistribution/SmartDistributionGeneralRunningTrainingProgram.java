package fi.polar.polarmathsmart.trainingprogram.running.model.smartdistribution;

import fi.polar.polarmathsmart.trainingprogram.running.model.EventProgramEnablerGeneralRunningProgram;
import fi.polar.polarmathsmart.trainingprogram.running.model.GeneralRunningTrainingProgram;
import java.util.Date;

public class SmartDistributionGeneralRunningTrainingProgram extends SmartDistributionTrainingTargetTrainingProgram implements EventProgramEnablerGeneralRunningProgram {
   private Date dateWhenProgramShouldBeUpdated;
   private String nameOfEnabled10kmEventRunningProgram;
   private String nameOfEnabled5kmEventRunningProgram;
   private String nameOfEnabledHalfMarathonEventRunningProgram;
   private String nameOfEnabledMarathonEventRunningProgram;
   private String nameOfLessDemandingGeneralRunningProgram;
   private String nameOfMoreDemandingGeneralRunningProgram;

   public SmartDistributionGeneralRunningTrainingProgram() {
   }

   public SmartDistributionGeneralRunningTrainingProgram(GeneralRunningTrainingProgram var1) {
      this.setName(var1.getName());
      this.setNameOfLessDemandingGeneralRunningProgram(var1.getNameOfLessDemandingGeneralRunningProgram());
      this.setNameOfMoreDemandingGeneralRunningProgram(var1.getNameOfMoreDemandingGeneralRunningProgram());
      this.setNameOfEnabled5kmEventRunningProgram(var1.getNameOfEnabled5kmEventRunningProgram());
      this.setNameOfEnabledHalfMarathonEventRunningProgram(var1.getNameOfEnabledHalfMarathonEventRunningProgram());
      this.setNameOfEnabled10kmEventRunningProgram(var1.getNameOfEnabled10kmEventRunningProgram());
      this.setNameOfEnabledMarathonEventRunningProgram(var1.getNameOfEnabledMarathonEventRunningProgram());
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            if (!super.equals(var1)) {
               var2 = false;
            } else {
               label117: {
                  SmartDistributionGeneralRunningTrainingProgram var3 = (SmartDistributionGeneralRunningTrainingProgram)var1;
                  if (this.dateWhenProgramShouldBeUpdated != null) {
                     if (!this.dateWhenProgramShouldBeUpdated.equals(var3.dateWhenProgramShouldBeUpdated)) {
                        break label117;
                     }
                  } else if (var3.dateWhenProgramShouldBeUpdated != null) {
                     break label117;
                  }

                  label118: {
                     if (this.nameOfEnabled5kmEventRunningProgram != null) {
                        if (this.nameOfEnabled5kmEventRunningProgram.equals(var3.nameOfEnabled5kmEventRunningProgram)) {
                           break label118;
                        }
                     } else if (var3.nameOfEnabled5kmEventRunningProgram == null) {
                        break label118;
                     }

                     var2 = false;
                     return var2;
                  }

                  label119: {
                     if (this.nameOfEnabled10kmEventRunningProgram != null) {
                        if (this.nameOfEnabled10kmEventRunningProgram.equals(var3.nameOfEnabled10kmEventRunningProgram)) {
                           break label119;
                        }
                     } else if (var3.nameOfEnabled10kmEventRunningProgram == null) {
                        break label119;
                     }

                     var2 = false;
                     return var2;
                  }

                  label120: {
                     if (this.nameOfEnabledHalfMarathonEventRunningProgram != null) {
                        if (!this.nameOfEnabledHalfMarathonEventRunningProgram.equals(var3.nameOfEnabledHalfMarathonEventRunningProgram)) {
                           break label120;
                        }
                     } else if (var3.nameOfEnabledHalfMarathonEventRunningProgram != null) {
                        break label120;
                     }

                     label121: {
                        if (this.nameOfEnabledMarathonEventRunningProgram != null) {
                           if (this.nameOfEnabledMarathonEventRunningProgram.equals(var3.nameOfEnabledMarathonEventRunningProgram)) {
                              break label121;
                           }
                        } else if (var3.nameOfEnabledMarathonEventRunningProgram == null) {
                           break label121;
                        }

                        var2 = false;
                        return var2;
                     }

                     label122: {
                        if (this.nameOfLessDemandingGeneralRunningProgram != null) {
                           if (this.nameOfLessDemandingGeneralRunningProgram.equals(var3.nameOfLessDemandingGeneralRunningProgram)) {
                              break label122;
                           }
                        } else if (var3.nameOfLessDemandingGeneralRunningProgram == null) {
                           break label122;
                        }

                        var2 = false;
                        return var2;
                     }

                     if (this.nameOfMoreDemandingGeneralRunningProgram != null) {
                        if (this.nameOfMoreDemandingGeneralRunningProgram.equals(var3.nameOfMoreDemandingGeneralRunningProgram)) {
                           return var2;
                        }
                     } else if (var3.nameOfMoreDemandingGeneralRunningProgram == null) {
                        return var2;
                     }

                     var2 = false;
                     return var2;
                  }

                  var2 = false;
                  return var2;
               }

               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public Date getDateWhenProgramShouldBeUpdated() {
      return this.dateWhenProgramShouldBeUpdated;
   }

   public String getNameOfEnabled10kmEventRunningProgram() {
      return this.nameOfEnabled10kmEventRunningProgram;
   }

   public String getNameOfEnabled5kmEventRunningProgram() {
      return this.nameOfEnabled5kmEventRunningProgram;
   }

   public String getNameOfEnabledHalfMarathonEventRunningProgram() {
      return this.nameOfEnabledHalfMarathonEventRunningProgram;
   }

   public String getNameOfEnabledMarathonEventRunningProgram() {
      return this.nameOfEnabledMarathonEventRunningProgram;
   }

   public String getNameOfLessDemandingGeneralRunningProgram() {
      return this.nameOfLessDemandingGeneralRunningProgram;
   }

   public String getNameOfMoreDemandingGeneralRunningProgram() {
      return this.nameOfMoreDemandingGeneralRunningProgram;
   }

   public int hashCode() {
      int var1 = 0;
      int var2 = super.hashCode();
      int var3;
      if (this.nameOfMoreDemandingGeneralRunningProgram != null) {
         var3 = this.nameOfMoreDemandingGeneralRunningProgram.hashCode();
      } else {
         var3 = 0;
      }

      int var4;
      if (this.nameOfLessDemandingGeneralRunningProgram != null) {
         var4 = this.nameOfLessDemandingGeneralRunningProgram.hashCode();
      } else {
         var4 = 0;
      }

      int var5;
      if (this.nameOfEnabled5kmEventRunningProgram != null) {
         var5 = this.nameOfEnabled5kmEventRunningProgram.hashCode();
      } else {
         var5 = 0;
      }

      int var6;
      if (this.nameOfEnabled10kmEventRunningProgram != null) {
         var6 = this.nameOfEnabled10kmEventRunningProgram.hashCode();
      } else {
         var6 = 0;
      }

      int var7;
      if (this.nameOfEnabledHalfMarathonEventRunningProgram != null) {
         var7 = this.nameOfEnabledHalfMarathonEventRunningProgram.hashCode();
      } else {
         var7 = 0;
      }

      int var8;
      if (this.nameOfEnabledMarathonEventRunningProgram != null) {
         var8 = this.nameOfEnabledMarathonEventRunningProgram.hashCode();
      } else {
         var8 = 0;
      }

      if (this.dateWhenProgramShouldBeUpdated != null) {
         var1 = this.dateWhenProgramShouldBeUpdated.hashCode();
      }

      return (var8 + (var7 + (var6 + (var5 + (var4 + (var3 + var2 * 31) * 31) * 31) * 31) * 31) * 31) * 31 + var1;
   }

   public void setDateWhenProgramShouldBeUpdated(Date var1) {
      this.dateWhenProgramShouldBeUpdated = var1;
   }

   public void setNameOfEnabled10kmEventRunningProgram(String var1) {
      this.nameOfEnabled10kmEventRunningProgram = var1;
   }

   public void setNameOfEnabled5kmEventRunningProgram(String var1) {
      this.nameOfEnabled5kmEventRunningProgram = var1;
   }

   public void setNameOfEnabledHalfMarathonEventRunningProgram(String var1) {
      this.nameOfEnabledHalfMarathonEventRunningProgram = var1;
   }

   public void setNameOfEnabledMarathonEventRunningProgram(String var1) {
      this.nameOfEnabledMarathonEventRunningProgram = var1;
   }

   public void setNameOfLessDemandingGeneralRunningProgram(String var1) {
      this.nameOfLessDemandingGeneralRunningProgram = var1;
   }

   public void setNameOfMoreDemandingGeneralRunningProgram(String var1) {
      this.nameOfMoreDemandingGeneralRunningProgram = var1;
   }

   public String toString() {
      return "SmartDistributionGeneralRunningTrainingProgram{nameOfMoreDemandingGeneralRunningProgram='" + this.nameOfMoreDemandingGeneralRunningProgram + '\'' + ", nameOfLessDemandingGeneralRunningProgram='" + this.nameOfLessDemandingGeneralRunningProgram + '\'' + ", nameOfEnabled5kmEventRunningProgram='" + this.nameOfEnabled5kmEventRunningProgram + '\'' + ", nameOfEnabled10kmEventRunningProgram='" + this.nameOfEnabled10kmEventRunningProgram + '\'' + ", nameOfEnabledHalfMarathonEventRunningProgram='" + this.nameOfEnabledHalfMarathonEventRunningProgram + '\'' + ", nameOfEnabledMarathonEventRunningProgram='" + this.nameOfEnabledMarathonEventRunningProgram + '\'' + ", dateWhenProgramShouldBeUpdated=" + this.dateWhenProgramShouldBeUpdated + '}' + super.toString();
   }
}
