package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.*

@Composable
fun Header(
    isDarkMode: Boolean,
    onToggleTheme: () -> Unit,
    onNavigateHome: () -> Unit
) {
    Header(attrs = { classes("nav-header") }) {

        Div(attrs = { classes("header-left") }) {
            A(
                href = "#",
                attrs = {
                    classes("logo-link")
                    onClick { onNavigateHome() }
                }
            ) {
                if (isDarkMode) {
                    Img(
                        src = "images/my-logo-dark.png",
                        alt = "Tabitha Tallent Logo",
                        attrs = { classes("header-logo-img") }
                    )
                }
                else
                    Img(
                    src = "images/my-logo.png",
                    alt = "Tabitha Tallent Logo",
                    attrs = { classes("header-logo-img") }
                )
            }
        }

        Div(attrs = { classes("header-center") }) {
            A(
                href = "#",
                attrs = {
                    classes("nav-brand")
                    onClick { onNavigateHome() }
                }
            ) {
                Text("Tabitha ")
                Span(attrs = { classes("accent-text") }) {
                    Text("Tallent")
                }
            }

            Nav(attrs = { classes("subnav-links") }) {
                A(href = "#about", attrs = { classes("subnav-link") }) { Text("About") }
                A(href = "#projects", attrs = { classes("subnav-link") }) { Text("Projects") }
                A(href = "#contact", attrs = { classes("subnav-link") }) { Text("Contact") }
            }
        }

        Div(attrs = { classes("header-right") }) {
            A(
                href = "https://github.com/TabbyCat444",
                attrs = {
                    classes("social-link")
                    target(ATarget.Blank)
                }
            ) {
                Text("GitHub")
            }

            Button(
                attrs = {
                    classes("theme-toggle-btn")
                    onClick { onToggleTheme() }
                }
            ) {
                Text(if (isDarkMode) "☀️" else "🌙")
            }
        }
    }
}