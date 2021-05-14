package ru.ftc.di.homework.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.ftc.di.homework.MainActivity
import ru.ftc.di.homework.di.module.ModuleData
import javax.inject.Singleton

@Singleton
@Component(modules = [ModuleData::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        //With @BindsInstance, the Context passed in will be available in the graph
       fun create(@BindsInstance applicationContext: Context): AppComponent
    }

    fun inject(mainActivity: MainActivity)
}