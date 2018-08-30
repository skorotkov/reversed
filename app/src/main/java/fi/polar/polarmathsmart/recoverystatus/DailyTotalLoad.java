package fi.polar.polarmathsmart.recoverystatus;

import java.util.List;

public class DailyTotalLoad {
   private List activityCalories;
   private List bmr;
   private double carbohydrateConsumption;
   private List exerciseCalories;
   private double glycoleft;
   private double lastHalfHourAvgMET;
   private double mechanicalStimulus;
   private int numberOfExerciseHalfHours;
   private double proteinConsumption;
   private List recoveryTimes;

   public DailyTotalLoad() {
   }

   public DailyTotalLoad(List var1, List var2, List var3, List var4, double var5, double var7, double var9, double var11, double var13, int var15) {
      this.recoveryTimes = var1;
      this.exerciseCalories = var2;
      this.activityCalories = var3;
      this.bmr = var4;
      this.mechanicalStimulus = var5;
      this.carbohydrateConsumption = var7;
      this.proteinConsumption = var9;
      this.glycoleft = var11;
      this.lastHalfHourAvgMET = var13;
      this.numberOfExerciseHalfHours = var15;
   }

   public boolean equals(Object var1) {
      return true;
   }

   public List getActivityCalories() {
      return this.activityCalories;
   }

   public List getBmr() {
      return this.bmr;
   }

   public double getCarbohydrateConsumption() {
      return this.carbohydrateConsumption;
   }

   public List getExerciseCalories() {
      return this.exerciseCalories;
   }

   public double getGlycoleft() {
      return this.glycoleft;
   }

   public double getLastHalfHourAvgMET() {
      return this.lastHalfHourAvgMET;
   }

   public double getMechanicalStimulus() {
      return this.mechanicalStimulus;
   }

   public int getNumberOfExerciseHalfHours() {
      return this.numberOfExerciseHalfHours;
   }

   public double getProteinConsumption() {
      return this.proteinConsumption;
   }

   public List getRecoveryTimes() {
      return this.recoveryTimes;
   }

   public void setActivityCalories(List var1) {
      this.activityCalories = var1;
   }

   public void setBmr(List var1) {
      this.bmr = var1;
   }

   public void setCarbohydrateConsumption(double var1) {
      this.carbohydrateConsumption = var1;
   }

   public void setExerciseCalories(List var1) {
      this.exerciseCalories = var1;
   }

   public void setGlycoleft(double var1) {
      this.glycoleft = var1;
   }

   public void setLastHalfHourAvgMET(double var1) {
      this.lastHalfHourAvgMET = var1;
   }

   public void setMechanicalStimulus(double var1) {
      this.mechanicalStimulus = var1;
   }

   public void setNumberOfExerciseHalfHours(int var1) {
      this.numberOfExerciseHalfHours = var1;
   }

   public void setProteinConsumption(double var1) {
      this.proteinConsumption = var1;
   }

   public void setRecoveryTimes(List var1) {
      this.recoveryTimes = var1;
   }
}
