package com.example.demo.app

import javafx.scene.text.FontWeight
import sun.font.FontFamily
import tornadofx.*
import java.awt.Color
import javax.swing.GroupLayout

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
    }

    init {
        label and heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
            maxWidth = infinity
        }
        button {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BLACK
            maxWidth =  infinity
            minWidth = 500.px

            and (hover) {
                backgroundColor += c("#a94442")
            }
        }
    }
}