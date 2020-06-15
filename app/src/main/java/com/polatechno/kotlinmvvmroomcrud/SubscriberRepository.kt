package com.polatechno.kotlinmvvmroomcrud

import android.support.v4.app.INotificationSideChannel
import com.polatechno.kotlinmvvmroomcrud.db.Subscriber
import com.polatechno.kotlinmvvmroomcrud.db.SubscriberDAO

class SubscriberRepository(private val dao: SubscriberDAO) {

    val subsribers = dao.getAllSubcribers()

    suspend fun insert(subscriber: Subscriber): Long {
        return dao.insertSubscriber(subscriber)
    }

    suspend fun update(subscriber: Subscriber): Int {
        return dao.updateSubscriber(subscriber)
    }

    suspend fun delete(subscriber: Subscriber): Int {
        return dao.deleteSubscriber(subscriber)
    }

    suspend fun deleteAll(): Int {
        return dao.deleteAll()
    }


}