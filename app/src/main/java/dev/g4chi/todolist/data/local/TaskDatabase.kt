package dev.g4chi.todolist.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import dev.g4chi.todolist.data.Constants.DATABASE_VERSION
import dev.g4chi.todolist.data.model.TaskEntry

@Database(entities = [TaskEntry::class], version = DATABASE_VERSION, exportSchema = false)
abstract class TaskDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao

}