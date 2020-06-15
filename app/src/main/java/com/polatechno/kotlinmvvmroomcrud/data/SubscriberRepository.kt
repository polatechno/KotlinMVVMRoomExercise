package com.polatechno.kotlinmvvmroomcrud.data

import com.polatechno.kotlinmvvmroomcrud.data.model.Subscriber
import com.polatechno.kotlinmvvmroomcrud.data.local.db.SubscriberDAO

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