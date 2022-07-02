package dev.g4chi.todolist.di

import dev.g4chi.todolist.data.repository.TaskRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { TaskRepository(get()) }
}