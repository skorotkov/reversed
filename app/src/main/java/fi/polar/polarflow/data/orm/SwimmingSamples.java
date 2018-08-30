package fi.polar.polarflow.data.orm;

import android.text.TextUtils;
import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.q;
import fi.polar.polarmathsmart.swimming.poolswimming.PoolInformation;
import fi.polar.remote.representation.protobuf.SwimmingSamples$PbSwimmingPoolMetric;
import fi.polar.remote.representation.protobuf.SwimmingSamples$PbSwimmingPoolMetric$Builder;
import fi.polar.remote.representation.protobuf.SwimmingSamples$PbSwimmingSamples;
import fi.polar.remote.representation.protobuf.SwimmingSamples$PbSwimmingSamples$Builder;
import fi.polar.remote.representation.protobuf.Types$PbSwimmingStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class SwimmingSamples extends ProtoPublishableEntity {
   private static final String TAG = "SwimmingSamples";
   private Exercise exercise = null;
   private String poolMetrics = "";
   private long start = -1L;
   private int startTimeZoneOffset = -1;

   public SwimmingSamples() {
      this.path = "";
   }

   private void addPoolMetric(SwimmingSamples$PbSwimmingPoolMetric param1) {
      // $FF: Couldn't be decompiled
   }

   private void updatePath() {
      if (this.exercise == null) {
         d.c("SwimmingSamples", "", new IllegalStateException("No Exercise entity associated or loaded, cannot create path."));
      } else {
         this.path = this.exercise.getPath();
      }

   }

   public void addPoolMetric(PoolInformation var1) {
      SwimmingSamples$PbSwimmingPoolMetric$Builder var2 = SwimmingSamples$PbSwimmingPoolMetric.newBuilder();
      var2.setStartOffset(q.b((long)(var1.getStartOffSet() * (float)TimeUnit.SECONDS.toMillis(1L))));
      var2.setDuration(q.b((long)(var1.getDuration() * (float)TimeUnit.SECONDS.toMillis(1L))));
      var2.setStyle(Types$PbSwimmingStyle.forNumber(var1.getStyle().getValue()));
      var2.setStrokes(var1.getStrokes());
      this.addPoolMetric(var2.build());
   }

   public String getBasename() {
      return "SWIMSAMP";
   }

   public String getPath() {
      if (TextUtils.isEmpty(this.path)) {
         this.updatePath();
      }

      return this.path;
   }

   public List getPoolMetricsList() {
      // $FF: Couldn't be decompiled
   }

   public DateTime getStart() {
      DateTimeZone var1 = DateTimeZone.forOffsetMillis((int)TimeUnit.MINUTES.toMillis((long)this.startTimeZoneOffset));
      return new DateTime(this.start, var1);
   }

   public void setExercise(Exercise var1) {
      this.exercise = var1;
      this.updatePath();
   }

   public void setStart(DateTime var1) {
      this.start = var1.getMillis();
      this.startTimeZoneOffset = ab.d(var1);
   }

   public SwimmingSamples$PbSwimmingSamples toPbObject() {
      SwimmingSamples$PbSwimmingSamples$Builder var1 = SwimmingSamples$PbSwimmingSamples.newBuilder();
      if (this.start != -1L && this.startTimeZoneOffset != -1) {
         var1.setStart(q.a(this.start, this.startTimeZoneOffset));
      }

      var1.addAllPoolMetric(this.getPoolMetricsList());
      return var1.build();
   }
}
