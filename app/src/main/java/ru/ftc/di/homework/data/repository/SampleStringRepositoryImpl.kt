package ru.ftc.di.homework.data.repository

import ru.ftc.di.homework.data.datasource.SampleStringDataSource
import ru.ftc.di.homework.data.datasource.SampleStringLocalDataSource
import ru.ftc.di.homework.data.datasource.SampleStringRemoteDataSource
import ru.ftc.di.homework.domain.repository.SampleStringRepository

class SampleStringRepositoryImpl : SampleStringRepository {

    //TODO: DI
    private val localDataSource: SampleStringDataSource = SampleStringLocalDataSource()
    private val remoteDataSource: SampleStringDataSource = SampleStringRemoteDataSource()

    override fun getFromRemote(): String =
        remoteDataSource.get()

    override fun getFromLocal(): String =
        localDataSource.get()
}