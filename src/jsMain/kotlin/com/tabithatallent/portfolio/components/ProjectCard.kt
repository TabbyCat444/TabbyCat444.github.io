package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text

@Composable
fun ProjectCard(projectName: String, projectImage: String, projectDescription: String) {

    Div(attrs = { classes("project-card") }) {
        Div(attrs = { classes("project-card-title") }) {
            Text(projectName)
        }

        Div(attrs = { classes("project-card-image") }) {
            Img(src = projectImage, alt = projectName)
        }

        Div(attrs = { classes("project-card-description") }) {
            Text(projectDescription)
        }
    }
}