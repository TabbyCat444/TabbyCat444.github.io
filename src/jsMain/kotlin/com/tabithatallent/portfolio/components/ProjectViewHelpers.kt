package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text


@Composable
fun TechChip(label: String, value: String) {
    Div(attrs = { classes("tech-chip") }) {
        Span(attrs = { classes("tech-chip-label") }) {
            Text(label)
        }
        Div(attrs = { classes("tech-chip-value") }) {
            Text(value)
        }
    }
}

@Composable
fun FeaturesList(vararg items: String) {
    items.forEach { item ->
        P(attrs = { classes("feature-item") }) {
            Span(attrs = { classes("feature-bullet") }) {
                Text("• ")
            }
            Text(item)
        }
    }
}

@Composable
fun ResourceItem(name: String, count: String) {
    Div(attrs = { classes("resource-item") }) {
        Span(attrs = { classes("resource-number") }) {
            Text(count)
        }
        Span(attrs = { classes("resource-name") }) {
            Text(name)
        }
    }
}
