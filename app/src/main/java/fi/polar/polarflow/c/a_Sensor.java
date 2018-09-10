package fi.polar.polarflow.c;

import android.content.Context;
import fi.polar.polarflow.data.ExerciseSensor;

public abstract class a_Sensor {
   protected final Context a_context;
   protected m_SENSOR_STATE b_sensorState;
   protected final n_SENSOR_TYPE c_sensorType;
   protected boolean d_sensorStarted;
   protected boolean e;
   protected boolean f;

   protected a_Sensor(Context var1, n_SENSOR_TYPE var2) {
      this.b_sensorState = m_SENSOR_STATE.b_NOT_READY;
      this.d_sensorStarted = false;
      this.e = false;
      this.f = false;
      this.a_context = var1;
      this.c_sensorType = var2;
   }

   protected abstract void a();

   protected void a_setState(m_SENSOR_STATE var1) {
      this.a_setState(var1, false);
   }

   protected void a_setState(m_SENSOR_STATE var1, boolean var2) {
      if (var1 != this.b_sensorState) {
         this.b_sensorState = var1;
         this.d_broadcastStateChanged();
      } else if (var2) {
         this.d_broadcastStateChanged();
      }

   }

   public abstract void b_start();

   public abstract void c_stop();

   protected abstract void d_broadcastStateChanged();

   public m_SENSOR_STATE e_getState() {
      return this.b_sensorState;
   }

   public void f() {
      this.f = true;
   }

   public void g() {
      this.f = false;
   }

   public void h() {
      this.a();
      this.e = true;
   }

   public void i() {
      this.e = false;
   }

   public ExerciseSensor j() {
      return null;
   }

   public String toString() {
      return this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()) + "[type=" + this.c_sensorType.name() + ",state=" + this.b_sensorState.name() + "]";
   }
}
