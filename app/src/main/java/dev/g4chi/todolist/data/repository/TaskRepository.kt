package dev.g4chi.todolist.data.repository

import dev.g4chi.todolist.data.local.TaskDao
import dev.g4chi.todolist.data.model.TaskEntry
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class TaskRepository(private val taskDao: TaskDao) {

    suspend fun insert(taskEntry: TaskEntry) {
        withContext(Dispatchers.IO) {
            taskDao.insert(taskEntry)
        }
    }

    suspend fun update(taskEntry: TaskEntry) {
        withContext(Dispatchers.IO) {
            taskDao.update(taskEntry)
        }
    }

    suspend fun delete(taskEntry: TaskEntry) {
        withContext(Dispatchers.IO) {
            taskDao.delete(taskEntry)
        }
    }

    suspend fun deleteAllTasks() {
        withContext(Dispatchers.IO) {
            taskDao.deleteAllTasks()
        }
    }

    suspend fun deleteCompletedTasks() {
        withContext(Dispatchers.IO) {
            taskDao.deleteCompletedTasks()
        }
    }

    fun getAllTasks() = taskDao.getAllTasks()

    fun getAllTasksCount() = taskDao.getAllTasksCount()

}