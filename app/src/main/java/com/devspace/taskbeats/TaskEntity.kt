package com.devspace.taskbeats

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        androidx.room.ForeignKey(
            entity = CategoryEntity::class,
            parentColumns = ["key"],
            childColumns = ["category"],
        )
    ]
)
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
     val id: Long = 0,
     val category : String,
     val name : String,
)
