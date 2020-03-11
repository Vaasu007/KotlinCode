package com.example.android

import android.app.Activity
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log

class MyActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public override fun onPause() {
        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }

    public override fun onStop() {
        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }

    public override fun onDestroy() {
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }

    /**
     * Listing 3-6: Handling configuration changes in code
     */
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "onConfigurationChanged")
        // [ ... Update any UI based on resource values ... ]
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) { // [ ... React to different orientation ... ]\
            Log.d(TAG, "Orientation Landscape")
        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) { // [ ... React to different orientation ... ]\
            Log.d(TAG, "Orientation Landscape")
        }
        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO) { // [ ... React to changed keyboard visibility ... ]
            Log.d(TAG, "Keyboard Hidden No")
        }
    }

    companion object {
        /**
         * Called when the activity is first created.
         */
        private const val TAG = "com.example.MyActivity"
    }
}