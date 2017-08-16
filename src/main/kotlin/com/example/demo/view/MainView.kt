package com.example.demo.view

import com.example.demo.app.Styles
import javafx.collections.FXCollections
import javafx.scene.Parent
import javafx.scene.layout.GridPane
import tornadofx.*

class MainView : View("Hello CarStateApp!") {
    override val root = vbox {
        label(title) {
            addClass(Styles.heading)
        }
        button("Add Entry"){
        }

        button("View List"){
            setOnAction {
                replaceWith(TableListView::class)
            }
        }

        button("click here") {
            addClass(Styles.heading)
            setOnAction {
                replaceWith(CreditsView::class)
            }
        }
    }
}


class CreditsView: View("Credits"){
    override val root = vbox {
        label("Hier könnte Ihre Werbung stehen!"){
            addClass(Styles.heading)
        }
        button("Zurück") {
            addClass(Styles.heading)
            setOnAction {
                replaceWith(MainView::class)
            }

        }
    }
}


class TableListView: View ("List of all Entrys"){
    override val root = GridPane()

    init{
        with(root){
        row {
            vbox{
                val mapTableContent = mapOf(Pair("item 1", 5), Pair("item 2", 10), Pair("item 3", 6))
                tableview(FXCollections.observableArrayList<Map.Entry<String, Int>>(mapTableContent.entries)) {
                    column("Entry Number", Map.Entry<String, Int>::key)
                    column("Date", Map.Entry<String, Int>::value)
                    column("Current KM", Map.Entry<String, Int>::key)
                    column("KM since last refuel", Map.Entry<String, Int>::key)
                    column("Refuel in L", Map.Entry<String, Int>::key)
                    column("Refuel in €", Map.Entry<String, Int>::key)
                    column("Cost of L in €", Map.Entry<String, Int>::key)
                    column("Annotation", Map.Entry<String, Int>::key)

                    resizeColumnsToFitContent() }

                }
            }
        }
        }
    }
