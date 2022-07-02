package dev.g4chi.todolist.di

import dev.g4chi.todolist.ui.viewmodel.TaskViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { TaskViewModel(get()) }
}