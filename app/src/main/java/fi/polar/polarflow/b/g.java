package fi.polar.polarflow.b;

public class g extends b {
   static final String[] a = new String[]{"state", "timestamp"};
   public static final String[] b = new String[]{"STATE_IDLE", "STATE_SEARCH_SLEEP_START", "STATE_CONFIRM_SLEEP_START", "STATE_SEARCH_SLEEP_END", "STATE_SEARCH_SLEEP_END_4H", "STATE_READY"};

   public void a(int var1, long var2) {
      super.a(new String[]{b[var1], String.valueOf(var2)});
   }
}
