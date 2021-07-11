package com.example.fitnesbag.core.services.impl

import android.content.Context
import com.example.fitnesbag.APP_PREFERENCE
import com.example.fitnesbag.APP_PREFERENCE_IS_APP_INIT
import com.example.fitnesbag.App
import com.example.fitnesbag.core.services.AppInitService
import com.example.fitnesbag.data.service.DefaultDBFillService
import javax.inject.Inject

class AppInitServiceImpl @Inject constructor (
    val defaultDBFillService: DefaultDBFillService
    ) : AppInitService {
    
    override fun isAppInit(): Boolean {
        return App.instance.baseContext
            .getSharedPreferences(APP_PREFERENCE, Context.MODE_PRIVATE)
            .getBoolean(APP_PREFERENCE_IS_APP_INIT, false)
    }

    override fun initApp() {
        defaultDBFillService.insertDefault()
        
        setAppIsInit()
    }

    private fun setAppIsInit() {
        val editor = App.instance.baseContext
            .getSharedPreferences(APP_PREFERENCE, Context.MODE_PRIVATE)
            .edit()
        editor.putBoolean(APP_PREFERENCE_IS_APP_INIT, true)
        editor.apply()
    }
}
