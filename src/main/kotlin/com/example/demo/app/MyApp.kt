package com.example.demo.app

import com.example.demo.view.MainView
import javafx.application.Application
import tornadofx.*

class CarStateApp: App(MainView::class, Styles::class)

fun main(args: Array<String>){
    Application.launch(CarStateApp::class.java, *args)
}