package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.tabithatallent.portfolio.nav.ProjectScreen
import kotlinx.browser.document
import org.jetbrains.compose.web.attributes.ButtonType
import org.jetbrains.compose.web.attributes.type
import org.jetbrains.compose.web.dom.*

@Composable
fun ProjectModal(
    project: ProjectScreen,
    onClose: () -> Unit
) {
    LaunchedEffect(Unit) {
        document.body?.classList?.add("modal-open")
    }

    Div(attrs = {
        classes("modal-backdrop")
    }) {
        Div(
            attrs = {
                classes("modal-overlay")
            }
        ) {
            Button(
                attrs = {
                    classes("modal-close-btn")
                    type(ButtonType.Button)
                    onClick { onClose() }
                }
            ) {
                Text("✕")
            }

            Div(attrs = { classes("modal-content") }) {
                project.render()
            }
        }
    }
}
