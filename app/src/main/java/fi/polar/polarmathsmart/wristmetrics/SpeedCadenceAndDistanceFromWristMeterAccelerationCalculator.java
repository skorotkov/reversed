package fi.polar.polarmathsmart.wristmetrics;

import fi.polar.polarmathsmart.types.MovingType;

public interface SpeedCadenceAndDistanceFromWristMeterAccelerationCalculator {
   short filterCadence(short var1);

   short getCadence(boolean var1);

   float getDistance();

   MovingType getMovingType();

   float getSpeed(boolean var1);

   void update(short[] var1, short[] var2, short[] var3);

   void updateSettings(double var1, float var3, float var4);
}
