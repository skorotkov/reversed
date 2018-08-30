package fi.polar.polarflow.util.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class a implements Parcelable {
   public static final Creator CREATOR = new b();
   public final DateTime a;
   public final DateTime b;
   public final DateTime c;
   public final int d;
   public final int e;
   public final int f;
   public final int g;
   public final int h;
   public final double i;
   public final double j;
   public final int k;
   public final int l;
   public final List m;
   public final int n;

   protected a(Parcel var1) {
      this.a = new DateTime(var1.readLong());
      this.b = new DateTime(var1.readLong());
      this.c = new DateTime(var1.readLong());
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readInt();
      this.g = var1.readInt();
      this.h = var1.readInt();
      this.i = var1.readDouble();
      this.j = var1.readDouble();
      this.k = var1.readInt();
      this.l = var1.readInt();
      this.n = var1.readInt();
      this.m = new ArrayList();
   }

   private a(c var1) {
      this.a = fi.polar.polarflow.util.b.c.a(var1);
      this.b = fi.polar.polarflow.util.b.c.b(var1);
      this.c = fi.polar.polarflow.util.b.c.c(var1);
      this.d = fi.polar.polarflow.util.b.c.d(var1);
      this.e = fi.polar.polarflow.util.b.c.e(var1);
      this.f = fi.polar.polarflow.util.b.c.f(var1);
      this.g = fi.polar.polarflow.util.b.c.g(var1);
      this.h = fi.polar.polarflow.util.b.c.h(var1);
      this.i = fi.polar.polarflow.util.b.c.i(var1);
      this.j = fi.polar.polarflow.util.b.c.j(var1);
      this.k = fi.polar.polarflow.util.b.c.k(var1);
      this.l = fi.polar.polarflow.util.b.c.l(var1);
      this.m = fi.polar.polarflow.util.b.c.m(var1);
      this.n = fi.polar.polarflow.util.b.c.n(var1);
   }

   // $FF: synthetic method
   a(c var1, b var2) {
      this(var1);
   }

   public long a() {
      long var1 = this.a.getMillis();
      long var3 = this.b.getMillis();
      if (var3 > var1) {
         var3 -= var1;
      } else {
         var3 = 0L;
      }

      return var3;
   }

   public a a(int var1, DateTime var2) {
      return (new c(this)).g(var1).c(var2).a();
   }

   public LocalDate b() {
      return SleepAnalysisResult.getRecordingDate(this.b);
   }

   public String c() {
      return SleepAnalysisResult.generatePath(this.b);
   }

   public int describeContents() {
      return 0;
   }

   public String toString() {
      return "SleepAnalysis@" + Integer.toHexString(this.hashCode()) + "[sleepStart=" + this.a + ", sleepEnd=" + this.b + ", lastModified=" + this.c + ", totalDurationSec=" + this.d + ", actualSleepDurationSec=" + this.e + ", interruptionsDurationSec=" + this.f + ", sleepGoalMin=" + this.g + ", sleepFeedback=" + this.h + ", efficiency=" + this.i + ", continuityIndex=" + this.j + ", continuityClass=" + this.k + ", userSleepRating=" + this.l + ", batteryRanOut=" + this.n + ']';
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeLong(this.a.getMillis());
      var1.writeLong(this.b.getMillis());
      var1.writeLong(this.c.getMillis());
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeInt(this.f);
      var1.writeInt(this.g);
      var1.writeInt(this.h);
      var1.writeDouble(this.i);
      var1.writeDouble(this.j);
      var1.writeInt(this.k);
      var1.writeInt(this.l);
      var1.writeInt(this.n);
   }
}
