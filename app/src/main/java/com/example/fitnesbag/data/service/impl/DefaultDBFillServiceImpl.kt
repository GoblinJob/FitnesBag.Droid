package com.example.fitnesbag.data.service.impl

import com.example.fitnesbag.data.dao.*
import com.example.fitnesbag.data.model.TrainsProgram
import com.example.fitnesbag.data.service.DefaultDBFillService
import kotlinx.coroutines.newFixedThreadPoolContext

class DefaultDBFillServiceImpl(
    val counterTrainExerciseDao: CounterTrainExerciseDao,
    val exerciseDao: CounterTrainExerciseDao,
    val timerTrainExerciseDao: TimerTrainExerciseDao,
    val trainDao: TrainDao,
    val trainExerciseDao: TrainExerciseDao,
    val trainInTrainsProgramDao: TrainInTrainsProgramDao,
    val trainProgramDao: TrainProgramDao
    ) : DefaultDBFillService {
    
    override fun insertDefault() {
        trainProgramDao.insert(TrainsProgram(1, "", "", "", false, false, 0))
    }
}
