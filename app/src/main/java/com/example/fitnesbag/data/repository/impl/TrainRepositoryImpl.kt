package com.example.fitnesbag.data.repository.impl

import com.example.fitnesbag.data.model.Train
import com.example.fitnesbag.data.model.impl.TrainImpl
import com.example.fitnesbag.data.repository.TrainRepository

class TrainRepositoryImpl : TrainRepository {
    override fun getExercise(id: Int): Train {
        TODO("Not yet implemented")
    }

    override fun getExercises(): List<Train> {
        return listOf(
            TrainImpl(
                1,
                "Качаем хер до 30 метров",
                "Я расскажу как накачать хер, без оборудования, накачала с 0 до 30!",
                "",
                10,
                listOf()
            ),
            TrainImpl(
                2,
                "Качаем хер до 40 метров",
                "Я расскажу как накачать хер, без оборудования, накачала с 0 до 40!",
                "",
                10,
                listOf()
            ),
            TrainImpl(
                3,
                "Качаем хер до 50 метров",
                "Я расскажу как накачать хер, без оборудования, накачала с 0 до 50!",
                "",
                10,
                listOf()
            ),
            TrainImpl(
                3,
                "Качаем хер до 60 метров",
                "Я расскажу как накачать хер, без оборудования, накачала с 0 до 60!",
                "",
                10,
                listOf()
            )
        )
    }

    override fun insert(exercise: Train) {
        TODO("Not yet implemented")
    }

    override fun update(id: Int, exercise: Train) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
    }
}