package com.tabithatallent.portfolio.components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Footer as HTMLFooter
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Footer(
    isDarkMode: Boolean,
    onToggleTheme: () -> Unit
) {
    HTMLFooter(attrs = {classes("footer")}) {

        Div( attrs = { classes("footer-left") }) {
            P(attrs = {classes("footer-email") })
            {
                Text("tabithart@outlook.com")
            }
        }

        Div( attrs = { classes("footer-center") }) {
            P(attrs = {classes("copyright") }
            ) { Text("© 2026 Tabitha Tallent. All rights reserved.")}
        }


        Div( attrs = { classes("footer-right") }) {
            A(
                href = "https://www.linkedin.com/in/tabbycat444/",
                attrs = {
                    classes("social-link")
                    target(ATarget.Blank)
                }
            ) {
                Text("LinkedIn")
            }
        }
    }
}