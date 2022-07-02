package dev.g4chi.todolist

import android.app.Application
import dev.g4chi.todolist.di.appModule
import dev.g4chi.todolist.di.repositoryModule
import dev.g4chi.todolist.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TaskApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@TaskApplication)
            modules(appModule, viewModelModule, repositoryModule)
        }
    }

}