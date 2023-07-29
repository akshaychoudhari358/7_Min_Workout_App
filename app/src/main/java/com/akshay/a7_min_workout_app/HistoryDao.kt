package com.akshay.a7_min_workout_app

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface HistoryDao {

    @Insert
    suspend fun insert(historyEntity: HistoryEntity)

    @Query("Select * from `history-table`")
    fun fetchALlDates() : Flow<List<HistoryEntity>>

}