package com.example.fitnesbag.data.repository.impl

import com.example.fitnesbag.data.model.Train
import com.example.fitnesbag.data.model.TrainsProgram
import com.example.fitnesbag.data.model.impl.TrainImpl
import com.example.fitnesbag.data.model.impl.TrainsProgramImpl
import com.example.fitnesbag.data.repository.TrainRepository
import com.example.fitnesbag.data.repository.TrainsProgramRepository

class TrainsProgramRepositoryImpl : TrainsProgramRepository {
    override fun getExercise(id: Int): TrainsProgram {
        TODO("Not yet implemented")
    }

    override fun getExercises(): List<TrainsProgram> {
        return listOf(
            TrainsProgramImpl(
                1,
                "Жрем в маке! Топ 10 упражнений с бикмаком и картошкой.",
            "Даггер говно",
                "",
                listOf()
            ),
            TrainsProgramImpl(
                2,
                "Жрем в маке! Топ 20 упражнений с бикмаком и картошкой.",
                "Даггер говно",
                "",
                listOf()
            ),
            TrainsProgramImpl(
                2,
                "Жрем в маке! Топ 30 упражнений с бикмаком и картошкой.",
                "Даггер говно",
                "",
                listOf()
            )
        )
    }

    override fun insert(entity: TrainsProgram) {
        TODO("Not yet implemented")
    }

    override fun update(id: Int, entity: TrainsProgram) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
    }

}