package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun ProjectCard(
    projectName: String,
    projectImage: String,
    projectDescription: String,
    imageAlt: String = projectName,
    onClick: (() -> Unit)? = null
) {

    Div(
        attrs = {
            classes("project-card")
            if (onClick != null) {
                attr("role", "button")
                attr("tabindex", "0")
                onClick { onClick() }
                onKeyDown { event ->
                    if (event.key == "Enter" || event.key == "Space") {
                        event.preventDefault()
                        onClick()
                    }
                }
            }
        }
    ) {
        Div(attrs = { classes("project-card-title") }) {
            Text(projectName)
        }

        Div(attrs = { classes("project-card-image") }) {
            Img(src = projectImage, alt = imageAlt)
        }

        Div(attrs = { classes("project-card-description") }) {
            Text(projectDescription)
        }
    }
}
