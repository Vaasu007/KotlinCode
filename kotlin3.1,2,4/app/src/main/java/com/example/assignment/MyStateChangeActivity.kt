package com.example.assignment

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MyStateChangeActivity : Activity() {
    // Called at the start of the full lifetime.
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize Activity and inflate the UI.
        Log.d("MyStateChangeActivity", "onCreate() --")
    }

    // Called after onCreate has finished, use to restore UI state
    public override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // Restore UI state from the savedInstanceState.
// This bundle has also been passed to onCreate.
// Will only be called if the Activity has been
// killed by the system since it was last visible.
        Log.d("MyStateChangeActivity", "onRestoreInstanceState")
    }

    // Called before subsequent visible lifetimes
// for an activity process.
    public override fun onRestart() {
        super.onRestart()
        // Load changes knowing that the Activity has already
// been visible within this process.
        Log.d("MyStateChangeActivity", "onRestart")
    }

    // Called at the start of the visible lifetime.
    public override fun onStart() {
        super.onStart()
        // Apply any required UI change now that the Activity is visible.
        Log.d("MyStateChangeActivity", "onStart")
    }

    // Called at the start of the active lifetime.
    public override fun onResume() {
        super.onResume()
        // Resume any paused UI updates, threads, or processes required
// by the Activity but suspended when it was inactive.
        Log.d("MyStateChangeActivity", "onResume")
    }

    // Called to save UI state changes at the
// end of the active lifecycle.
    public override fun onSaveInstanceState(savedInstanceState: Bundle) { // Save UI state changes to the savedInstanceState.
// This bundle will be passed to onCreate and
// onRestoreInstanceState if the process is
// killed and restarted by the run time.
        super.onSaveInstanceState(savedInstanceState)
        Log.d("MyStateChangeActivity", "onSaveInstanceState")
    }

    // Called at the end of the active lifetime.
    public override fun onPause() { // Suspend UI updates, threads, or CPU intensive processes
// that don't need to be updated when the Activity isn't
// the active foreground Activity.
        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }

    // Called at the end of the visible lifetime.
    public override fun onStop() { // Suspend remaining UI updates, threads, or processing
// that aren't required when the Activity isn't visible.
// Persist all edits or state changes
// as after this call the process is likely to be killed.
        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }

    // Sometimes called at the end of the full lifetime.
    public override fun onDestroy() { // Clean up any resources including ending threads,
// closing database connections etc.
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }
}