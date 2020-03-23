package com.example.firkotasky

interface TaskRowListener {
    fun onTaskChange(objectId: String, isDone: Boolean)
    fun onTaskDelete(objectId: String)
}