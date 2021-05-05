package ru.ftc.di.homework.data.datasource

class SampleStringRemoteDataSource : SampleStringDataSource {

    private val mockedAnswer = "String from remote data source"

    override fun get(): String = mockedAnswer
}