package com.tabithatallent.portfolio

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.tabithatallent.portfolio.components.Footer
import com.tabithatallent.portfolio.components.Header
import com.tabithatallent.portfolio.components.ProjectModal
import com.tabithatallent.portfolio.nav.ProjectScreen
import com.tabithatallent.portfolio.views.homeView
import kotlinx.browser.window
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        var isDarkMode by remember { mutableStateOf(false) }
        var selectedProject by remember { mutableStateOf<ProjectScreen?>(null) }

        Header(
            isDarkMode = isDarkMode,
            onToggleTheme = {
                isDarkMode = !isDarkMode
                kotlinx.browser.document.documentElement?.setAttribute(
                    "data-theme",
                    if (isDarkMode) "dark" else "light"
                )
            },
            onNavigateHome = {
                window.scrollTo(0.0, 0.0)
            }
        )

        Main({
            style {
                paddingTop(20.px)
                paddingBottom(20.px)
                marginBottom(100.px)
            }
        }) {
            if (selectedProject == null) {
                Div({ style { padding(2.px) } }) {
                    homeView(onProjectClick = { selectedProject = it })
                }
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

        // Modal overlay (rendered outside Main, on top of everything)
        selectedProject?.let { project ->
            ProjectModal(project = project, onClose = { selectedProject = null })
        }
    }
}
