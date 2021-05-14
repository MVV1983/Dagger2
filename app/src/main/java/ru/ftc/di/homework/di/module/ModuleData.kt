package ru.ftc.di.homework.di.module

import dagger.Module
import dagger.Provides
import ru.ftc.di.homework.data.datasource.SampleStringDataSource
import ru.ftc.di.homework.data.datasource.SampleStringLocalDataSource
import ru.ftc.di.homework.data.datasource.SampleStringRemoteDataSource
import javax.inject.Named

@Module
class ModuleData {

    @Named("local")
    @Provides
    fun pidalimLocalData(): SampleStringDataSource {
        return SampleStringLocalDataSource()
    }

    @Named("remote")
    @Provides
    fun pidalimRemoteData(): SampleStringDataSource {
        return SampleStringRemoteDataSource()
    }
}