package fi.polar.polarflow.c.fused.proxy;

import android.content.Intent;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

public class StickyLocalBroadcastManager {
    public static boolean sendStickyBroadcast(Intent intent) {
        return v_StickyLocalBroadcastManager.a_getInstance().b_sendStickyBroadcast(intent);
    }
    public static void removeFromMap(String... var1) {
        v_StickyLocalBroadcastManager.a_getInstance().a_removeFromMap(var1);
    }
}
