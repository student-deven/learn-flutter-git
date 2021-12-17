package com.example.learn_flutter_git

import io.flutter.embedding.android.FlutterActivity
import androidx.core.view.WindowCompat  // CUSTOM

class MainActivity: FlutterActivity() {
    // CUSTOM
    override fun onPostResume() {
        super.onPostResume()
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.navigationBarColor = 0 //for transparent nav bar
    }
}
