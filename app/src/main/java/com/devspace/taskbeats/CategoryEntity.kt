package com.devspace.taskbeats

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CategoryEntity(
    @PrimaryKey
    @ColumnInfo("key")
    val nome: String,
    @ColumnInfo("is_selected")
    val isSelected: Boolean
)
