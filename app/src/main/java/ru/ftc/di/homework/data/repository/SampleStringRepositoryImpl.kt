package ru.ftc.di.homework.data.repository

import ru.ftc.di.homework.data.datasource.SampleStringDataSource
import ru.ftc.di.homework.data.datasource.SampleStringLocalDataSource
import ru.ftc.di.homework.data.datasource.SampleStringRemoteDataSource
import ru.ftc.di.homework.domain.repository.SampleStringRepository
import javax.inject.Inject
import javax.inject.Named

class SampleStringRepositoryImpl @Inject
constructor(
    @Named("local") private val localDataSource: SampleStringDataSource,
    @Named("remote") private val remoteDataSource: SampleStringDataSource
) : SampleStringRepository {

    //TODO: DI

    override fun getFromRemote(): String =
        remoteDataSource.get()

    override fun getFromLocal(): String =
        localDataSource.get()
}