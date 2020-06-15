package com.polatechno.kotlinmvvmroomcrud.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.polatechno.kotlinmvvmroomcrud.data.model.Subscriber

@Database(entities = [Subscriber::class], version = 1)
abstract class SubcriberDatabase : RoomDatabase() {
    abstract val subscriberDAO: SubscriberDAO

    companion object {
        @Volatile
        private var INSTANCE: SubcriberDatabase? = null

        fun getInstantce(context: Context): SubcriberDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        SubcriberDatabase::class.java,
                        "subscriber_data_database"
                    ).build()
                }
                return instance
            }
        }
    }
}

