package com.github.gezimos.inkos

import android.app.Activity
import android.os.Bundle
import com.github.gezimos.common.CrashHandler
import com.github.gezimos.inkos.services.ActionService

class KeyInterceptorActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CrashHandler.logUserAction("KeyInterceptor: SPECAL_KEY_FUNCTION received")

        if (intent?.action == "iflytek.intent.action.SPECIAL_KEY_FUNCTION") {
            ActionService.instance()?.back()
        }

        finish()
    }
}
