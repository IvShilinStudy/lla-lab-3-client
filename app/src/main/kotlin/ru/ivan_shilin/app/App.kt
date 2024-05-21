package ru.ivan_shilin.app

import org.koin.core.context.startKoin

internal object App {

    @JvmStatic
    fun main(args: Array<String>) {
        initKoin()

        println("Hello world!")
    }

    private fun initKoin(){
        startKoin {
            printLogger()
            modules()
        }
    }
}