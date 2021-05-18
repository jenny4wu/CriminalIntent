package com.jenny.android.criminalintent.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jenny.android.criminalintent.Crime

@Database(entities = [ Crime::class ], version = 1)
abstract class CrimeDatabase : RoomDatabase() {

}