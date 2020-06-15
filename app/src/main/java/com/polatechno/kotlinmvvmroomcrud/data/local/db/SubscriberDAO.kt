package com.polatechno.kotlinmvvmroomcrud.data.local.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.polatechno.kotlinmvvmroomcrud.data.model.Subscriber

@Dao
interface SubscriberDAO {

    @Insert
    suspend fun insertSubscriber(subscriber: Subscriber): Long

    @Update
    suspend fun updateSubscriber(subscriber: Subscriber) : Int

    @Delete
    suspend fun deleteSubscriber(subscriber: Subscriber) : Int

    @Query("DELETE FROM subscriber_data_table")
    suspend fun deleteAll() : Int

    @Query("SELECT * FROM subscriber_data_table")
    fun getAllSubcribers():LiveData<List<Subscriber>>


}