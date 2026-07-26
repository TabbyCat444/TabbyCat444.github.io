import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        // App Container
        Div(attrs = {
            style {
                fontFamily("sans-serif")
                padding(2.cssRem)
                backgroundColor(Color("#f4f4f9"))
                minHeight(100.vh)
            }
        }) {
            // Header Section
            Header {
                H1(attrs = {
                    style { color(Color("#2c3e50")) }
                }) {
                    Text("Hello, I'm a Developer")
                }
                P { Text("Welcome to my scratch-built portfolio site.") }
            }

            Hr()

            // Interactive Project Showcase State Example
            var selectedProject by remember { mutableStateOf("None") }

            Section {
                H2 { Text("Featured Projects") }

                Ul {
                    Li(attrs = { onClick { selectedProject = "Project A" } }) { Text("👉 Project A (Click to view details)") }
                    Li(attrs = { onClick { selectedProject = "Project B" } }) { Text("👉 Project B (Click to view details)") }
                }

                if (selectedProject != "None") {
                    Div(attrs = {
                        style {
                            border(1.px, LineStyle.Solid, Color("#808080"))
                            padding(1.cssRem)
                            marginTop(1.cssRem)
                            backgroundColor(Color("#ffffff"))
                        }
                    }) {
                        H3 { Text("Viewing: $selectedProject") }
                        P { Text("This is a dynamic section showing off details for $selectedProject using Compose State management!") }
                    }
                }
            }
        }
    }
}