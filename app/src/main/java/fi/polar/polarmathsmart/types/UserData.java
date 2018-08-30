package fi.polar.polarmathsmart.types;

public class UserData {
   private ActivityLevel activityLevel;
   private Short aerobicThreshold;
   private Integer age;
   private Short anaerobicThreshold;
   private Gender gender;
   private Double height;
   private Short hrMax;
   private Short hrRest;
   private Short hrSit;
   private Short vo2max;
   private Double weight;

   public UserData() {
   }

   public UserData(Integer var1, Gender var2, Double var3, Double var4, Short var5, Short var6, Short var7, Short var8, ActivityLevel var9, Short var10, Short var11) {
      this.age = var1;
      this.gender = var2;
      this.height = var3;
      this.weight = var4;
      this.hrMax = var5;
      this.hrSit = var6;
      this.hrRest = var7;
      this.vo2max = var8;
      this.activityLevel = var9;
      this.aerobicThreshold = var10;
      this.anaerobicThreshold = var11;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            UserData var3 = (UserData)var1;
            if (this.activityLevel != var3.activityLevel) {
               var2 = false;
            } else {
               label150: {
                  if (this.aerobicThreshold != null) {
                     if (this.aerobicThreshold.equals(var3.aerobicThreshold)) {
                        break label150;
                     }
                  } else if (var3.aerobicThreshold == null) {
                     break label150;
                  }

                  var2 = false;
                  return var2;
               }

               label151: {
                  if (this.age != null) {
                     if (this.age.equals(var3.age)) {
                        break label151;
                     }
                  } else if (var3.age == null) {
                     break label151;
                  }

                  var2 = false;
                  return var2;
               }

               label152: {
                  if (this.anaerobicThreshold != null) {
                     if (!this.anaerobicThreshold.equals(var3.anaerobicThreshold)) {
                        break label152;
                     }
                  } else if (var3.anaerobicThreshold != null) {
                     break label152;
                  }

                  if (this.gender != var3.gender) {
                     var2 = false;
                  } else {
                     label153: {
                        if (this.height != null) {
                           if (this.height.equals(var3.height)) {
                              break label153;
                           }
                        } else if (var3.height == null) {
                           break label153;
                        }

                        var2 = false;
                        return var2;
                     }

                     label154: {
                        if (this.hrMax != null) {
                           if (this.hrMax.equals(var3.hrMax)) {
                              break label154;
                           }
                        } else if (var3.hrMax == null) {
                           break label154;
                        }

                        var2 = false;
                        return var2;
                     }

                     label155: {
                        if (this.hrRest != null) {
                           if (!this.hrRest.equals(var3.hrRest)) {
                              break label155;
                           }
                        } else if (var3.hrRest != null) {
                           break label155;
                        }

                        label156: {
                           if (this.hrSit != null) {
                              if (!this.hrSit.equals(var3.hrSit)) {
                                 break label156;
                              }
                           } else if (var3.hrSit != null) {
                              break label156;
                           }

                           label157: {
                              if (this.vo2max != null) {
                                 if (this.vo2max.equals(var3.vo2max)) {
                                    break label157;
                                 }
                              } else if (var3.vo2max == null) {
                                 break label157;
                              }

                              var2 = false;
                              return var2;
                           }

                           if (this.weight != null) {
                              if (this.weight.equals(var3.weight)) {
                                 return var2;
                              }
                           } else if (var3.weight == null) {
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

   public ActivityLevel getActivityLevel() {
      return this.activityLevel;
   }

   public Short getAerobicThreshold() {
      return this.aerobicThreshold;
   }

   public Integer getAge() {
      return this.age;
   }

   public Short getAnaerobicThreshold() {
      return this.anaerobicThreshold;
   }

   public Gender getGender() {
      return this.gender;
   }

   public Double getHeight() {
      return this.height;
   }

   public Short getHrMax() {
      return this.hrMax;
   }

   public Short getHrRest() {
      return this.hrRest;
   }

   public Short getHrSit() {
      return this.hrSit;
   }

   public Short getVo2max() {
      return this.vo2max;
   }

   public Double getWeight() {
      return this.weight;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.age != null) {
         var2 = this.age.hashCode();
      } else {
         var2 = 0;
      }

      int var3;
      if (this.gender != null) {
         var3 = this.gender.hashCode();
      } else {
         var3 = 0;
      }

      int var4;
      if (this.height != null) {
         var4 = this.height.hashCode();
      } else {
         var4 = 0;
      }

      int var5;
      if (this.weight != null) {
         var5 = this.weight.hashCode();
      } else {
         var5 = 0;
      }

      int var6;
      if (this.hrMax != null) {
         var6 = this.hrMax.hashCode();
      } else {
         var6 = 0;
      }

      int var7;
      if (this.hrSit != null) {
         var7 = this.hrSit.hashCode();
      } else {
         var7 = 0;
      }

      int var8;
      if (this.hrRest != null) {
         var8 = this.hrRest.hashCode();
      } else {
         var8 = 0;
      }

      int var9;
      if (this.vo2max != null) {
         var9 = this.vo2max.hashCode();
      } else {
         var9 = 0;
      }

      int var10;
      if (this.activityLevel != null) {
         var10 = this.activityLevel.hashCode();
      } else {
         var10 = 0;
      }

      int var11;
      if (this.aerobicThreshold != null) {
         var11 = this.aerobicThreshold.hashCode();
      } else {
         var11 = 0;
      }

      if (this.anaerobicThreshold != null) {
         var1 = this.anaerobicThreshold.hashCode();
      }

      return (var11 + (var10 + (var9 + (var8 + (var7 + (var6 + (var5 + (var4 + (var3 + var2 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + var1;
   }

   public void setActivityLevel(ActivityLevel var1) {
      this.activityLevel = var1;
   }

   public void setAerobicThreshold(Short var1) {
      this.aerobicThreshold = var1;
   }

   public void setAge(Integer var1) {
      this.age = var1;
   }

   public void setAnaerobicThreshold(Short var1) {
      this.anaerobicThreshold = var1;
   }

   public void setGender(Gender var1) {
      this.gender = var1;
   }

   public void setHeight(Double var1) {
      this.height = var1;
   }

   public void setHrMax(Short var1) {
      this.hrMax = var1;
   }

   public void setHrRest(Short var1) {
      this.hrRest = var1;
   }

   public void setHrSit(Short var1) {
      this.hrSit = var1;
   }

   public void setVo2max(Short var1) {
      this.vo2max = var1;
   }

   public void setWeight(Double var1) {
      this.weight = var1;
   }

   public String toString() {
      return "UserData{age=" + this.age + ", gender=" + this.gender + ", height=" + this.height + ", weight=" + this.weight + ", hrMax=" + this.hrMax + ", hrSit=" + this.hrSit + ", hrRest=" + this.hrRest + ", vo2max=" + this.vo2max + ", activityLevel=" + this.activityLevel + ", aerobicThreshold=" + this.aerobicThreshold + ", anaerobicThreshold=" + this.anaerobicThreshold + '}';
   }
}
