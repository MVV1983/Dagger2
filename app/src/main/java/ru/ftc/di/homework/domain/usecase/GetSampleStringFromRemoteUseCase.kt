package ru.ftc.di.homework.domain.usecase

import ru.ftc.di.homework.data.repository.SampleStringRepositoryImpl
import ru.ftc.di.homework.domain.repository.SampleStringRepository

class GetSampleStringFromRemoteUseCase {

    //TODO: DI
    //TODO: сделать так, чтобы repository не пересоздавался для каждого UseCase
    private val repository: SampleStringRepository = SampleStringRepositoryImpl()

    operator fun invoke(): String =
        "${repository.getFromRemote()}, repo hash = ${repository.hashCode()}"
}