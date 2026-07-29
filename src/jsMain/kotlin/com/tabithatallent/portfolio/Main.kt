package com.tabithatallent.portfolio

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.tabithatallent.portfolio.components.Footer
import com.tabithatallent.portfolio.components.Header
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        var isDarkMode by remember { mutableStateOf(false) }

        Header(
            isDarkMode = isDarkMode,
            onToggleTheme = {
                isDarkMode = !isDarkMode
                // Toggle dark attribute on <html> element
                kotlinx.browser.document.documentElement?.setAttribute(
                    "data-theme",
                    if (isDarkMode) "dark" else "light"
                )
            },
            onNavigateHome = {
                // Scroll back to top when name/logo is clicked
                window.scrollTo(0.0, 0.0)
            }
        )

        Main({
            style {
                paddingTop(20.px)
                minHeight(60.vh)
            }
        }) {
            Div({ style { padding(2.px) } }) {
                H1 { Text("Preview Mode") }
                P { Text("Click the links or scroll down to verify sticky header navigation") }
            }
        }

        Footer(
            isDarkMode = isDarkMode,
            onToggleTheme = {
                isDarkMode = !isDarkMode
                kotlinx.browser.document.documentElement?.setAttribute(
                    "data-theme",
                    if (isDarkMode) "dark" else "light"
                )
            }
        )
    }
}