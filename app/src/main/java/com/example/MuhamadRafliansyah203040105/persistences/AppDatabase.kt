package com.example.MuhamadRafliansyah203040105.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.MuhamadRafliansyah203040105.model.PendaftaranAwal

@Database(entities = [PendaftaranAwal::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun pendaftaranAwalDao(): PendaftaranAwalDao
}