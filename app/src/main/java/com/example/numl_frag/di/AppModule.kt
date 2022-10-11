package com.example.numl_frag.di

import android.content.Context
import androidx.room.Dao
import androidx.room.Room
import com.example.numl_frag.db.AdmissionDB
import com.example.numl_frag.db.AdmissionDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Singleton
    @Provides
    fun provideDB(@ApplicationContext context: Context):AdmissionDB{
        return  Room.databaseBuilder(context,AdmissionDB::class.java,"AdmissionDB").fallbackToDestructiveMigration().build()
    }
    @Singleton
    @Provides
    fun getDao(admissionDB: AdmissionDB): AdmissionDao {
        return admissionDB.admissionDao()
    }
}