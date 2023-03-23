package com.example.MuhamadRafliansyah203040105.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PendaftaranAwal(
    @PrimaryKey val id: String,
    val nik: String,
    val nama: String,
    val tempatLahir: String,
    val tglLahir: String,
    val alamat: String,
    val noHp: String
)
