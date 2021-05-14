package ru.ftc.di.homework

import android.app.Application
import ru.ftc.di.homework.di.AppComponent
import ru.ftc.di.homework.di.DaggerAppComponent


open class MyApp : Application() {
    val appComponent: AppComponent by lazy(){

        DaggerAppComponent.create() }


}