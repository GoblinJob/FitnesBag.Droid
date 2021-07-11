package com.example.fitnesbag.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.fitnesbag.App
import com.example.fitnesbag.R
import com.example.fitnesbag.core.services.AppInitService
import com.example.fitnesbag.core.services.impl.AppInitServiceImpl
import com.example.fitnesbag.data.dao.TrainProgramDao
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var trainProgramDao: AppInitServiceImpl
    
    override fun onCreate(savedInstanceState: Bundle?) {
        App.instance.appComponent.inject(this)
        
        if(!trainProgramDao.isAppInit())
            trainProgramDao.initApp()
        
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
