package com.example.MuhamadRafliansyah203040105.persistences

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.MuhamadRafliansyah203040105.model.PendaftaranAwal

@Dao
interface PendaftaranAwalDao {
    @Query("SELECT * FROM PendaftaranAwal")
    fun loadAll(): LiveData<List<PendaftaranAwal>>
    @Query("SELECT * FROM PendaftaranAwal WHERE id = :id")
    fun find(id: String): PendaftaranAwal?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: PendaftaranAwal)
    @Delete
    fun delete(item: PendaftaranAwal)
}