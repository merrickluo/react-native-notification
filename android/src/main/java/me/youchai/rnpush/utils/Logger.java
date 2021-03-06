
package me.youchai.rnpush.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Logger {

  public static boolean SHUTDOWNLOG;
  public static boolean SHUTDOWNTOAST;

  public static void i(String msg) {
    if (!SHUTDOWNLOG) {
      Log.i("RNPush", msg);
    }
  }

  public static void d(String msg) {
    if (!SHUTDOWNLOG) {
      Log.d("RNPush", msg);
    }
  }

  public static void toast(Context context, String msg) {
    if (!SHUTDOWNTOAST) {
      Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
  }
}
