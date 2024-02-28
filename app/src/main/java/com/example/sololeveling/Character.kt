package com.example.sololeveling

import android.provider.ContactsContract.Contacts.Photo
import kotlinx.parcelize.Parcelize
import android.os.Parcelable
//Firman Nurcahyo - 50421524 - Universitas Gunadarma - Bangkit - Dicoding
@Parcelize
data class Character(
    val name: String,
    val description: String,
    val photo: Int,
    val detail: String,
    val voice: String
) : Parcelable