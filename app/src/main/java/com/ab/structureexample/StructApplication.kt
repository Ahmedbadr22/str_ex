package com.ab.structureexample

import android.app.Application
import org.koin.core.context.startKoin

class StructApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                listOf(

                )
            )
        }
    }
}