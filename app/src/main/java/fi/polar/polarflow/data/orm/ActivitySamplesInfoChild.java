package fi.polar.polarflow.data.orm;

import org.joda.time.DateTime;

public interface ActivitySamplesInfoChild extends ActivitySamplesChild {
   DateTime getTimestamp();

   void setTimestamp(DateTime var1);
}
