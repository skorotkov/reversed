package android.support.wearable.b_package;

public final class a {
   public static int a() {
      b();
      return c.a;
   }

   public static void b() {
      if (!b.a) {
         throw new IllegalStateException("Could not find wearable shared library classes. Please add <uses-library android:name=\"com.google.android.wearable\" android:required=\"false\" /> to the application manifest");
      }
   }
}
