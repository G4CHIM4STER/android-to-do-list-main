package dev.g4chi.todolist.di

import androidx.room.Room
import dev.g4chi.todolist.data.Constants
import dev.g4chi.todolist.data.local.TaskDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    single {
        Room.databaseBuilder(
            androidContext(), TaskDatabase::class.java, Constants.DATABASE_NAME
        ).build().taskDao()
    }
}
