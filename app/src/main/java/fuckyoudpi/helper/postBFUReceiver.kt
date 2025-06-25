package fuckyoudpi.helper

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

// One shot operation for FuckYouDPI.
class postBFUReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_USER_UNLOCKED == intent.action) {
            Runtime.getRuntime().exec(arrayOf("su", "-c", "/data/adb/modules/fuckyoudpi/fydpi_metaworker.sh")).waitFor()
        }
    }
}