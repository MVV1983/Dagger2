package ru.ftc.di.homework.data.datasource

class SampleStringLocalDataSource : SampleStringDataSource {

    private val mockedCache = "String from local data source"

    override fun get(): String = mockedCache
}